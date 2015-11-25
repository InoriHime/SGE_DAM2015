package Modelo;

import Hibernate.Articulo;
import Hibernate.ArticuloPedido;
import Hibernate.ArticuloPedidoId;
import Hibernate.Cliente;
import Hibernate.Cobro;
import Hibernate.Documento;
import Hibernate.Proveedor;
import Vistas.Vista_Principal;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.hibernate.engine.spi.SessionFactoryImplementor;

/**
 *
 * @author Noneking, Inno, MrDrulix
 */
public class Modelo extends Conexion {
    
    Connection c;
    ResultSet rs;
    DatabaseMetaData dbmd;
    
    Iterator it;
    Transaction tx;
    
    SessionFactoryImplementor sfi;
    ConnectionProvider cp;
    
    Vista_Principal v;
    
    double sumaPresupuesto=0;
    /**
    - Si en alguna parte de la vista se hace una inserccion temporal habría
    que crear sus respectivos metodos de insertar y eliminar. Por ejemplo:
    
         Base de Datos:
         * Tablas: Alumno, Asignatura, AlumnoAsignatura(Relacional)
         
         Una vista que permita habiendo ya asignaturas en la BD, insertar un
         alumno y las respectivas asignaturas asociadas al mismo.
    
    - Tambien falta por crear los metodos de consulta
    */
    
    public Modelo()
    {
        try 
        {
            tx=getSession().beginTransaction();
            sfi=(SessionFactoryImplementor) getSession().getSessionFactory();
            cp=sfi.getConnectionProvider();
            c=cp.getConnection();
            dbmd=c.getMetaData();
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
/**
 * ---Cliente Operations---
 */
    
    public Cliente getClienteByDni(String dni)
    {
        return (Cliente) getSession().get(Cliente.class, dni);
    }
    
    public ArrayList<Cliente> getClientesByQuestion(String question)
    {
        Query query=getSession().createQuery("from Cliente c where c.dni like :consulta OR c.nombre like :consulta OR c.apellidos like :consulta OR c.domicilio like :consulta OR c.correo like :consulta OR c.telefono like :consulta");
        ArrayList<Cliente> list=(ArrayList<Cliente>) query.setParameter("consulta", "%"+question+"%").list();
        return list;
    }
    
    public ArrayList<Cliente> getClientes()
    {
        return (ArrayList<Cliente>) getSession().createQuery("from Cliente").list();
    }
    
    public void insertCliente(String dni, String nombre, String apellidos, String domicilio, String correo, String telefono)
    {
        Cliente c=new Cliente(dni, nombre, apellidos, domicilio, correo, telefono);
        
        getSession().save(c);
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
        JOptionPane.showMessageDialog(null, "Cliente Introducido");
    }
    
    public void modifyCliente(String dniAntiguio, String nombre, String apellidos, String domicilio, String correo, String telefono)
    {
        Cliente c=getClienteByDni(dniAntiguio);
        
        c.setNombre(nombre);
        c.setApellidos(apellidos);
        c.setDomicilio(domicilio);
        c.setCorreo(correo);
        c.setTelefono(telefono);
        
        getSession().update(c);
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
        JOptionPane.showMessageDialog(null, "Se ha modificado: "+dniAntiguio+". Satisfactoriamente.");
    }
    
    public void deleteCliente(String dni)
    {
        Cliente c=getClienteByDni(dni);
        
        getSession().delete(c);
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
        JOptionPane.showMessageDialog(null, "Se ha eliminado "+dni+" satisfactoriamente.");
    }
    
    public void deleteClientes()
    {
        it=getClientes().iterator();
        while(it.hasNext())
        {
            Cliente c=(Cliente) it.next();
            getSession().delete(c);
        }
        
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
    }
    
    public void deleteClientes(ArrayList<Cliente> clientes)
    {
        it=clientes.iterator();
        while(it.hasNext())
        {
            Cliente c=(Cliente) it.next();
            getSession().delete(c);
        }
        
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
    }
    
/**
 * ---Proveedor Operations---
 */
    
    public Proveedor getProveedorByCif(String cif)
    {
        return (Proveedor) getSession().get(Proveedor.class, cif);
    }
    
    public ArrayList<Proveedor> getProveedoresByQuestion(String question)
    {
        Query query=getSession().createQuery("from Proveedor p where p.cif like :consulta OR p.denominacionsocial like :consulta OR p.telefono like :consulta OR p.correo like :consulta");
        ArrayList<Proveedor> list=(ArrayList<Proveedor>) query.setParameter("consulta", "%"+question+"%").list();
        return list;
    }
    
    public ArrayList<Proveedor> getProveedores()
    {
        return (ArrayList<Proveedor>) getSession().createQuery("from Proveedor").list();
    }
    
    public void insertProveedor(String cif, String denominacion_social, String telefono, String correo)
    {
        Proveedor p=new Proveedor(cif, denominacion_social, telefono, correo);
        
        getSession().save(p);
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
        JOptionPane.showMessageDialog(null, "Se ha introducido el Proveedor: "+cif);
    }
    
    public void modifyProveedor(String cifAntiguo, String denominacion_social, String telefono, String correo)
    {
        Proveedor p=getProveedorByCif(cifAntiguo);
        
        p.setDenominacionSocial(denominacion_social);
        p.setTelefono(telefono);
        p.setCorreo(correo);
        
        getSession().update(p);
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
        JOptionPane.showMessageDialog(null, "Se ha modificado: "+cifAntiguo+". Satisfactoriamente.");
    }
    
    public void deleteProveedor(String cif)
    {
        Proveedor p=getProveedorByCif(cif);
        
        getSession().delete(p);
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
        JOptionPane.showMessageDialog(null, "Se ha eliminado el Proveedor: "+cif);
    }
    
    public void deleteProveedores()
    {
        it=getProveedores().iterator();
        while(it.hasNext())
        {
            Proveedor p=(Proveedor) it.next();
            getSession().delete(p);
        }
        
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
    }
    
    public void deleteProveedores(ArrayList<Proveedor> proveedores)
    {
        it=proveedores.iterator();
        while(it.hasNext())
        {
            Proveedor p=(Proveedor) it.next();
            getSession().delete(p);
        }
        
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
    }
    
/**
 * ---Articulo Operations---
 */
    
    public Articulo getArticuloByCodigo(int codigo)
    {
        return (Articulo) getSession().get(Articulo.class, codigo);
    }
    
    public ArrayList<Articulo> getArticulosByQuestion(String question)
    {
        Query query=getSession().createQuery("from Articulo a where a.nombre like :consulta");
        ArrayList<Articulo> list=(ArrayList<Articulo>) query.setParameter("consulta", "%"+question+"%").list();
        return list;
    }
    
    public ArrayList<Articulo> getArticulos()
    {
        return (ArrayList<Articulo>) getSession().createQuery("from Articulo").list();
    }
    
    public void insertArticulo(String nombre, double precio, int cantidad)
    {
        Articulo a=new Articulo(nombre, precio, cantidad);
        getSession().save(a);
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
        JOptionPane.showMessageDialog(null, "Se ha introducido el Articulo: "+nombre);
    }
    
    public void modifyArticulo(int codigoAntiguo, String nombre, double precio, int cantidad)
    {
        Articulo a=getArticuloByCodigo(codigoAntiguo);
        a.setNombre(nombre);
        a.setPrecio(precio);
        a.setCantidad(cantidad);
        
        getSession().update(a);
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
        JOptionPane.showMessageDialog(null, "Se ha modificado: "+nombre+". Satisfactoriamente.");
    }
    
    public void deleteArticulo(int codigo)
    {
        Articulo a=getArticuloByCodigo(codigo);
        
        getSession().delete(a);
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
        JOptionPane.showMessageDialog(null, "Se ha eliminado el Articulo: "+codigo);
    }
    
    public void deleteArticulos()
    {
        it=getArticulos().iterator();
        while(it.hasNext())
        {
            Articulo a=(Articulo) it.next();
            getSession().delete(a);
        }
        
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
    }
    
    public void deleteArticulos(ArrayList<Articulo> articulos)
    {
        it=articulos.iterator();
        while(it.hasNext())
        {
            Articulo a=(Articulo) it.next();
            getSession().delete(a);
        }
        
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
    }
    
/**
 * ---Documento Operations---
 */
    
    public Documento getDocumentoByCodigo(int codigo)
    {
        return (Documento) getSession().get(Documento.class, codigo);
    }
    
    public ArrayList<Documento> getDocumentos()
    {
        return (ArrayList<Documento>) getSession().createQuery("from Documento").list();
    }
    
    public void insertDocumento(Cliente cliente, String tipo, String fechaPedido, double base, double iva, double total)
    {
        Documento d=new Documento(cliente, tipo, fechaPedido, base, iva, total);
        
        getSession().save(d);
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
    }
    
    public void modifyDocumento(int codigoAntiguo, int codigoNuevo, Cliente cliente, String tipo, String fechaPedido, double base, double iva, double total)
    {
        Documento d=getDocumentoByCodigo(codigoAntiguo);
        d.setCodigo(codigoNuevo);
        d.setCliente(cliente);
        d.setTipo(tipo);
        d.setFechaPedido(fechaPedido);
        d.setBase(base);
        d.setIva(iva);
        d.setTotal(total);
        
        getSession().update(d);
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
    }
    
    public void deleteDocumento(int codigo)
    {
        Documento d=getDocumentoByCodigo(codigo);
        
        getSession().delete(d);
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
    }
    
    public void deleteDocumentos()
    {
        it=getDocumentos().iterator();
        while(it.hasNext())
        {
            Documento d=(Documento) it.next();
            getSession().delete(d);
        }
        
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
    }
    
    public void deleteDocumentos(ArrayList<Documento> documentos)
    {
        it=documentos.iterator();
        while(it.hasNext())
        {
            Documento d=(Documento) it.next();
            getSession().delete(d);
        }
        
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
    }
    
/**
 * ---Cobro Operations---
 */
    
    public Cobro getCobroByCodigo(int codigo)
    {
        return (Cobro) getSession().get(Cobro.class, codigo);
    }
    
    public ArrayList<Cobro> getCobroByFecha(String fecha)
    {
        Criteria criteria = getSession().createCriteria(Cobro.class);
        ArrayList<Cobro> c = (ArrayList<Cobro>) criteria.add(Restrictions.like("titulo", fecha)).list();
        return c;
    }
    
    public ArrayList<Cobro> getCobros()
    {
        return (ArrayList<Cobro>) getSession().createQuery("from Cobro").list();
    }
    
    public void insertCobro(Documento documento, String formaPago, String fecha, double importe)
    {
        Cobro c=new Cobro(documento, formaPago, fecha, importe);
        
        getSession().save(c);
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
    }
    
    public void modifyCobro(int codigoAntiguo, int codigoNuevo, Documento documento, String formaPago, String fecha, double importe)
    {
        Cobro c=getCobroByCodigo(codigoAntiguo);
        c.setCodigoCobro(codigoNuevo);
        c.setDocumento(documento);
        c.setFormaPago(formaPago);
        c.setFecha(fecha);
        c.setImporte(importe);
        
        getSession().update(c);
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
    }
    
    public void deleteCobro(int codigo)
    {
        Cobro c=getCobroByCodigo(codigo);
        
        getSession().delete(c);
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
    }
    
    public void deleteCobros()
    {
        it=getCobros().iterator();
        while(it.hasNext())
        {
            Cobro c=(Cobro) it.next();
            getSession().delete(c);
        }
        
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
    }
    
    public void deleteCobros(ArrayList<Cobro> cobros)
    {
        it=cobros.iterator();
        while(it.hasNext())
        {
            Cobro c=(Cobro) it.next();
            getSession().delete(c);
        }
        
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
    }
    
/**
 * ---ArticuloPedido Operations---
 */
    
    public ArticuloPedido getArticuloPedido(int codigoArticulo, int codigoDocumento)
    {
        ArticuloPedidoId api=new ArticuloPedidoId(codigoDocumento, codigoArticulo);
        return (ArticuloPedido) getSession().get(ArticuloPedido.class, api);
    }
    
    public ArrayList<ArticuloPedido> getArticulosPedidos()
    {
        return (ArrayList<ArticuloPedido>) getSession().createQuery("from ArticuloPedido").list();
    }
    
    public void insertArticuloPedido(int codigoArticulo, int codigoDocumento, int cantidad)
    {
        ArticuloPedidoId api=new ArticuloPedidoId(codigoDocumento, codigoArticulo);
        ArticuloPedido ap=new ArticuloPedido(api, getArticuloByCodigo(api.getCodigoArticulo()), getDocumentoByCodigo(api.getCodigoDocumento()), cantidad);
        
        getSession().save(ap);
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
    }
    
    public void deleteArticuloPedido(int codigoArticulo, int codigoDocumento)
    {
        ArticuloPedido ap=getArticuloPedido(codigoArticulo, codigoDocumento);
        
        getSession().delete(ap);
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
    }
    
    public void deleteArticulosPedidos()
    {
        it=getArticulosPedidos().iterator();
        while(it.hasNext())
        {
            ArticuloPedido ap=(ArticuloPedido) it.next();
            getSession().delete(ap);
        }
        
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
    }
    
    public void deleteArticulosPedidos(ArrayList<ArticuloPedido> articulosPedidos)
    {
        it=articulosPedidos.iterator();
        while(it.hasNext())
        {
            ArticuloPedido ap=(ArticuloPedido) it.next();
            getSession().delete(ap);
        }
        
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
    }
    
    public DefaultTableModel getTableModel(String table)
    {
        DefaultTableModel dtm=null;
        Vector columns;
        Vector row;
        
        int cont=0;
        
        try
        {
            dtm=new DefaultTableModel();
            columns=new Vector();
            
            /*
            Repito codigo en cada uno de los case por si hay que añadir 
            columnas necesarias para la vista pero que no esten en la BD,
            como las de el documento, el cobro y el articulo_pedido.
            En caso de no hacer falta ya se eliminaran en el futuro
            **/
            
            switch(table)
            {
                case "cliente":
                    rs=dbmd.getColumns(null, null, table, null);
                    while(rs.next())
                    {
                        columns.add(rs.getString(4));
                    }
                    dtm.setColumnIdentifiers(columns);
                    break;
                case "proveedor":
                    rs=dbmd.getColumns(null, null, table, null);
                    while(rs.next())
                    {
                        columns.add(rs.getString(4));
                    }
                    dtm.setColumnIdentifiers(columns);
                    break;
                case "articulo":
                    rs=dbmd.getColumns(null, null, table, null);
                    while(rs.next())
                    {
                        columns.add(rs.getString(4));
                    }
                    dtm.setColumnIdentifiers(columns);
                    break;
                case "documento":
                    rs=dbmd.getColumns(null, null, table, null);
                    while(rs.next())
                    {
                        if(cont==1){columns.add("DNI_CLIENTE");}
                        else if(cont==1){columns.add("NOMBRE_Y_APELLIDOS_CLIENTE");}
                        else{columns.add(rs.getString(4));}
                        cont++;
                    }
                    dtm.setColumnIdentifiers(columns);
                    break;
                case "cobro":
                    rs=dbmd.getColumns(null, null, table, null);
                    while(rs.next())
                    {
                        if(cont==0){columns.add("CODIGO_COBRO");}
                        else if(cont==1){columns.add("CODIGO_DOCUMENTO");}
                        else if(cont==2){columns.add("DNI_CLIENTE_DOCUMENTO");}
                        else{columns.add(rs.getString(4));}
                    }
                    dtm.setColumnIdentifiers(columns);
                    break;
                case "articulo_pedido":
                    rs=dbmd.getColumns(null, null, table, null);
                    while(rs.next())
                    {
                        if(cont==0){columns.add("CODIGO_ARTICULO");}
                        else if(cont==1){columns.add("NOMBRE_ARTICULO");}
                        else if(cont==2){columns.add("CODIGO_DOCUMENTO");}
                        else if(cont==3){columns.add("DNI_CLIENTE_DOCUMENTO");}
                        else{columns.add(rs.getString(4));}
                    }
                    dtm.setColumnIdentifiers(columns);
                    break;
            }
            
            switch(table)
            {
                case "cliente":
                    it=getClientes().iterator();
                    while(it.hasNext())
                    {
                        Cliente c=(Cliente) it.next();
                        row=new Vector();
                        
                        row.add(c.getDni());
                        row.add(c.getNombre());
                        row.add(c.getApellidos());
                        row.add(c.getDomicilio());
                        row.add(c.getCorreo());
                        row.add(c.getTelefono());
                        dtm.addRow(row);
                    }
                    break;
                case "proveedor":
                    it=getProveedores().iterator();
                    while(it.hasNext())
                    {
                        Proveedor p=(Proveedor) it.next();
                        row=new Vector();
                        
                        row.add(p.getCif());
                        row.add(p.getDenominacionSocial());
                        row.add(p.getTelefono());
                        row.add(p.getCorreo());
                        dtm.addRow(row);
                    }
                    break;
                case "articulo":
                    it=getArticulos().iterator();
                    while(it.hasNext())
                    {
                        Articulo a=(Articulo) it.next();
                        row=new Vector();
                        
                        row.add(a.getCodigo());
                        row.add(a.getNombre());
                        row.add(a.getPrecio());
                        row.add(a.getCantidad());
                        dtm.addRow(row);
                    }
                    break;
                case "documento":
                    it=getDocumentos().iterator();
                    while(it.hasNext())
                    {
                        Documento d=(Documento) it.next();
                        row=new Vector();
                        
                        row.add(d.getCodigo());
                        row.add(d.getCliente().getDni());
                        row.add(d.getCliente().getApellidos()+"-"+d.getCliente().getNombre());
                        row.add(d.getTipo());
                        row.add(d.getFechaPedido());
                        row.add(d.getBase());
                        row.add(d.getIva());
                        row.add(d.getTotal());
                        dtm.addRow(row);
                    }
                    break;
                case "cobro":
                    it=getCobros().iterator();
                    while(it.hasNext())
                    {
                        Cobro c=(Cobro) it.next();
                        row=new Vector();
                        
                        row.add(c.getCodigoCobro());
                        row.add(c.getDocumento().getCodigo());
                        row.add(c.getDocumento().getCliente().getDni());
                        row.add(c.getFormaPago());
                        row.add(c.getFecha());
                        row.add(c.getImporte());
                        dtm.addRow(row);
                    }
                    break;
                case "articulo_pedido":
                    it=getArticulosPedidos().iterator();
                    while(it.hasNext())
                    {
                        ArticuloPedido ap=(ArticuloPedido) it.next();
                        row=new Vector();
                        
                        row.add(ap.getArticulo().getCodigo());
                        row.add(ap.getArticulo().getNombre());
                        row.add(ap.getDocumento().getCodigo());
                        row.add(ap.getDocumento().getCliente().getDni());
                        row.add(ap.getCantidad());
                        dtm.addRow(row);
                    }
                    break;
            }
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return dtm;
    }
    
    public DefaultTableModel getTableModelByArrayList(ArrayList arrayList, String tipo)
    {
        DefaultTableModel dtm=null;
        Vector columns=new Vector();
        Vector row;
        try 
        {
            
//            articulos
//            clientes
//            proveedores
//            pedidos
//            articulo_pedido
            
            
            
            it=arrayList.iterator();
            dtm = new DefaultTableModel();
            if(tipo.equals("clientes"))
            {
                rs=dbmd.getColumns(null, null, "cliente", null);
                while(rs.next())
                {
                    columns.add(rs.getString(4));
                }
                dtm.setColumnIdentifiers(columns);

                it=arrayList.iterator();
                while(it.hasNext())
                {
                    Cliente c=(Cliente) it.next();
                    row=new Vector();

                    row.add(c.getDni());
                    row.add(c.getNombre());
                    row.add(c.getApellidos());
                    row.add(c.getDomicilio());
                    row.add(c.getCorreo());
                    row.add(c.getTelefono());
                    dtm.addRow(row);
                }
            }else if(tipo.equals("proveedores")){
                rs=dbmd.getColumns(null, null, "proveedor", null);
                    while(rs.next())
                    {
                        columns.add(rs.getString(4));
                    }
                    dtm.setColumnIdentifiers(columns);
                    
                    it=arrayList.iterator();
                    while(it.hasNext())
                    {
                        Proveedor p=(Proveedor) it.next();
                        row=new Vector();
                        
                        row.add(p.getCif());
                        row.add(p.getDenominacionSocial());
                        row.add(p.getTelefono());
                        row.add(p.getCorreo());
                        dtm.addRow(row);
                    }
            }else if(tipo.equals("articulos")){
                rs=dbmd.getColumns(null, null, "articulo", null);
                    while(rs.next())
                    {
                        columns.add(rs.getString(4));
                    }
                    dtm.setColumnIdentifiers(columns);
                    
                    it=arrayList.iterator();
                    while(it.hasNext())
                    {
                        Articulo a=(Articulo) it.next();
                        row=new Vector();
                        
                        row.add(a.getCodigo());
                        row.add(a.getNombre());
                        row.add(a.getPrecio());
                        row.add(a.getCantidad());
                        dtm.addRow(row);
                    }
            }
            
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dtm;
    }

    public DefaultTableModel insertarRow(int codigo, String nombre, double precio, int cantidad, int cantidadTotal, DefaultTableModel t) {

        //Sección 1 
        //DefaultTableModel modelo=(DefaultTableModel) this.v.tbl_Pedido_ArticulosPedidos.getModel(); 
        if (cantidad > cantidadTotal) {
            JOptionPane.showMessageDialog(null, "Has seleccionado demasiados articulos de " + nombre);
        } else {
            //Sección 2
            Object[] fila = new Object[6];

            //Sección 3
            fila[0] = codigo;
            fila[1] = nombre;
            fila[2] = precio;
            fila[3] = cantidad;
            
            sumaPresupuesto = sumaPresupuesto+(precio*cantidad);
            //Sección 4
            t.addRow(fila);
        }
        return t;

    }
    
    public DefaultTableModel borrarRow(DefaultTableModel t, int selectedRow, int cantidad,int cantTotal){
         
 
         //Sección 2
          int a = selectedRow; 
          
         //Sección 3
          if (a<0){ 
 
                JOptionPane.showMessageDialog(null, 
                "Debe seleccionar una fila de la tabla" ); 
 
         }
          if(cantTotal<=cantidad) {
                   t.removeRow(a); 

            }else{
              t.setValueAt((cantTotal-cantidad), a, 3);
          }
        
        return t;
    }
    public double getSumaPresupuesto(){
        return this.sumaPresupuesto;
    }
    public void setSumaPresupuesto(int presupuesto){
        this.sumaPresupuesto = presupuesto;
    }
    public DefaultTableModel rellenarProforma(DefaultTableModel tablaProforma, DefaultTableModel tablaArticulos){
        Object[] fila = new Object[6];
        for(int i=0;i<tablaArticulos.getRowCount();i++){
            double primero=Double.parseDouble(String.valueOf(tablaArticulos.getValueAt(i, 2)));
            double segundo=Double.parseDouble(String.valueOf(tablaArticulos.getValueAt(i, 3)));
            fila[0]= tablaArticulos.getValueAt(i, 1);
            fila[1]= tablaArticulos.getValueAt(i, 2);
            fila[2]= tablaArticulos.getValueAt(i, 3);
            double total = primero*segundo;
            fila[3]= total;
            fila[4]= total*0.21;
            fila[5]= total+(total*0.21);
            
            tablaProforma.addRow(fila);
        }
        
        return tablaProforma;
    }
    public double getSumaBase(DefaultTableModel t){
        double suma =0;
        for(int i=0; i<t.getRowCount();i++){
            suma = suma +((double)t.getValueAt(i, 1));
        }
        
        return suma;
    }
    public double getSumaIva(DefaultTableModel t){
        double suma =0;
        for(int i=0; i<t.getRowCount();i++){
            suma = suma +((double)t.getValueAt(i, 4));
        }
        
        return suma;
    }
    public double getSumaTotal(DefaultTableModel t){
        double suma =0;
        for(int i=0; i<t.getRowCount();i++){
            suma = suma +((double)t.getValueAt(i, 5));
        }
        
        return suma;
    }
    
}