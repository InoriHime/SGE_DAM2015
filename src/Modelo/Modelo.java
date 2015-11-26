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
            //Inicializamos todos los datos
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
    
    //Devuelve el Cliente segun su primaria
    public Cliente getClienteByDni(String dni)
    {
        return (Cliente) getSession().get(Cliente.class, dni);
    }
    
    //Devuelve los Clientes que corresponden con la consulta
    public ArrayList<Cliente> getClientesByQuestion(String question)
    {
        Query query=getSession().createQuery("from Cliente c where c.dni like :consulta OR c.nombre like :consulta OR c.apellidos like :consulta OR c.domicilio like :consulta OR c.correo like :consulta OR c.telefono like :consulta");
        ArrayList<Cliente> list=(ArrayList<Cliente>) query.setParameter("consulta", "%"+question+"%").list();
        return list;
    }
    
    //Devuelve todos los Clientes
    public ArrayList<Cliente> getClientes()
    {
        return (ArrayList<Cliente>) getSession().createQuery("from Cliente").list();
    }
    
    //Inserta un Cliente
    public void insertCliente(String dni, String nombre, String apellidos, String domicilio, String correo, String telefono)
    {
        Cliente c=new Cliente(dni, nombre, apellidos, domicilio, correo, telefono);//Creamos el objeto de tipo Cliente con sus respectivos datos
        
        getSession().save(c);//Obtenemos la sesion donde lleva la conexion y guardamos el objetos que hemos creado
        if(!tx.isActive()){tx=getSession().beginTransaction();}//Si el objeto transaction no esta activado lo activamos
        tx.commit();//Sube los cambios a la Base de Datos
        JOptionPane.showMessageDialog(null, "Cliente Introducido");
    }
    
    //Modifica un cliente
    public void modifyCliente(String dniAntiguio, String nombre, String apellidos, String domicilio, String correo, String telefono)
    {
        Cliente c=getClienteByDni(dniAntiguio);//Obtenemos un cliente mediante el metodo getClienteByDni
        
        //Modificamos los datos pertinentes
        c.setNombre(nombre);
        c.setApellidos(apellidos);
        c.setDomicilio(domicilio);
        c.setCorreo(correo);
        c.setTelefono(telefono);
        
        getSession().update(c);//Obtenemos la sesion y actualizamos el objeto
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();//Subimos los cambios a la Base de Datos
        JOptionPane.showMessageDialog(null, "Se ha modificado: "+dniAntiguio+". Satisfactoriamente.");
    }
    
    //Eliminamos un Cliente
    public void deleteCliente(String dni)
    {
        Cliente c=getClienteByDni(dni);//Obtenemos el Cliente segun su clave primaria(dni)
        
        getSession().delete(c);//Obtenemos la sesion y borramos el objeto que recogemos
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();//Subimos los cambios a la Base de Datos
        JOptionPane.showMessageDialog(null, "Se ha eliminado "+dni+" satisfactoriamente.");
    }
    
    //Eliminamos todos los Clientes
    public void deleteClientes()
    {
        it=getClientes().iterator();
        while(it.hasNext())//Recorremos todos los Clientes
        {
            Cliente c=(Cliente) it.next();
            getSession().delete(c);//Borramos cada cliente
        }
        
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();//Subimos los cambios a la Base de Datos
    }
    
    //Borramos los Clientes que esten contenidos en el ArrayList
    public void deleteClientes(ArrayList<Cliente> clientes)
    {
        it=clientes.iterator();
        while(it.hasNext())//Recorremos los clientes que le hemos introducido por parametro
        {
            Cliente c=(Cliente) it.next();
            getSession().delete(c);//Borramos uno por uno cada Cliente
        }
        
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();//Subimos los cambios a la Base de Datos
    }
/**
 * ---Proveedor Operations---
 */
    
    //Obtenemos un Proveedor segun el cif
    public Proveedor getProveedorByCif(String cif)
    {
        return (Proveedor) getSession().get(Proveedor.class, cif);
    }
    
    //Obtenemos los objetos de tipo Proveedor que correspondan con la consulta
    public ArrayList<Proveedor> getProveedoresByQuestion(String question)
    {
        Query query=getSession().createQuery("from Proveedor p where p.cif like :consulta OR p.denominacionsocial like :consulta OR p.telefono like :consulta OR p.correo like :consulta");
        ArrayList<Proveedor> list=(ArrayList<Proveedor>) query.setParameter("consulta", "%"+question+"%").list();
        return list;
    }
    
    //Obtenemos todos los Proveedores
    public ArrayList<Proveedor> getProveedores()
    {
        return (ArrayList<Proveedor>) getSession().createQuery("from Proveedor").list();
    }
    
    //Insertamos un Proveedor
    public void insertProveedor(String cif, String denominacion_social, String telefono, String correo)
    {
        Proveedor p=new Proveedor(cif, denominacion_social, telefono, correo);
        
        getSession().save(p);
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
        JOptionPane.showMessageDialog(null, "Se ha introducido el Proveedor: "+cif);
    }
    
    //Modificamos un Proveedor
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
    
    //Borramos un Proveedor segun el cif
    public void deleteProveedor(String cif)
    {
        Proveedor p=getProveedorByCif(cif);
        
        getSession().delete(p);
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
        JOptionPane.showMessageDialog(null, "Se ha eliminado el Proveedor: "+cif);
    }
    
    //Borramos todos los Proveedores
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
    
    //Borramos los Proveedores que contiene el ArrayList
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
    
    //Obtenemos el Articulo segun el codigo
    public Articulo getArticuloByCodigo(int codigo)
    {
        return (Articulo) getSession().get(Articulo.class, codigo);
    }
    
    //Obtenemos los Articulos segun la consulta
    public ArrayList<Articulo> getArticulosByQuestion(String question)
    {
        Query query=getSession().createQuery("from Articulo a where a.nombre like :consulta");
        ArrayList<Articulo> list=(ArrayList<Articulo>) query.setParameter("consulta", "%"+question+"%").list();
        return list;
    }
    
    //Obtenemos todos los Articulos
    public ArrayList<Articulo> getArticulos()
    {
        return (ArrayList<Articulo>) getSession().createQuery("from Articulo").list();
    }
    
    //Insertamos un Articulo
    public void insertArticulo(String nombre, double precio, int cantidad)
    {
        Articulo a=new Articulo(nombre, precio, cantidad);
        getSession().save(a);
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
        JOptionPane.showMessageDialog(null, "Se ha introducido el Articulo: "+nombre);
    }
    
    //Modificamos un Articulo
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
    
    //Borramos un Articulo segun el codigo
    public void deleteArticulo(int codigo)
    {
        Articulo a=getArticuloByCodigo(codigo);
        
        getSession().delete(a);
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
        JOptionPane.showMessageDialog(null, "Se ha eliminado el Articulo: "+codigo);
    }
    
    //Borramos todos los Articulos
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
    
    //Borramos todos los Articulos que esten contenidos en el ArrayList
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
    
    //Obtenemos un Documento segun el codigo
    public Documento getDocumentoByCodigo(int codigo)
    {
        return (Documento) getSession().get(Documento.class, codigo);
    }
    
    //Obtenemos todos los Documentos
    public ArrayList<Documento> getDocumentos()
    {
        return (ArrayList<Documento>) getSession().createQuery("from Documento").list();
    }
    
    //Insertamos un Documento con Cliente
    public void insertDocumentoCliente(Cliente cliente, String tipo, String fechaPedido, double base, double iva, double total)
    {
        Documento d=new Documento(cliente, null, tipo, fechaPedido, base, iva, total);
        
        getSession().save(d);
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
        JOptionPane.showMessageDialog(null, "Se ha introducido el Pedido.");
    }
    
//    public void insertDocumentoClienteAux(Documento d){
//        getSession().save(d);
//        if(!tx.isActive()){tx=getSession().beginTransaction();}
//        tx.commit();
//        JOptionPane.showMessageDialog(null, "Se ha introducido el Pedido.");
//        
//    }
    
    //Insertamos un Documento con Proveedor
    public void insertDocumentoProveedor(Proveedor proveedor, String tipo, String fechaPedido, double base, double iva, double total)
    {
        Documento d=new Documento(null ,proveedor, tipo, fechaPedido, base, iva, total);
        
        getSession().save(d);
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
        JOptionPane.showMessageDialog(null, "Se ha introducido el Pedido.");
    }
    
    //Modificamos un Documento
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
    
    //Borramos un Documento segun el codigo
    public void deleteDocumento(int codigo)
    {
        Documento d=getDocumentoByCodigo(codigo);
        
        getSession().delete(d);
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
    }
    
    //Borramos todos los Documentos
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
    
    //Borramos todos los Documentos contenidos en el ArrayList
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
    
    //Obtenemos un Cobro segun el codigo
    public Cobro getCobroByCodigo(int codigo)
    {
        return (Cobro) getSession().get(Cobro.class, codigo);
    }
    
    //Obtenemos un Cobro segun la fecha
    public ArrayList<Cobro> getCobroByFecha(String fecha)
    {
        //La clase Criteria permite añadir restricciones a la busqueda de objetos en Hibernate
        Criteria criteria = getSession().createCriteria(Cobro.class);
        ArrayList<Cobro> c = (ArrayList<Cobro>) criteria.add(Restrictions.like("fecha", fecha)).list();//Buscamo segun el atributo "fecha" del objeto cobro cuyo valor sea la variable que le pasamos
        return c;
    }
    
    //Obtenemos todos los Cobros
    public ArrayList<Cobro> getCobros()
    {
        return (ArrayList<Cobro>) getSession().createQuery("from Cobro").list();
    }
    
    //Insertamos un Cobro
    public void insertCobro(Documento documento, String formaPago, String fecha, double importe)
    {
        Cobro c=new Cobro(documento, formaPago, fecha, importe);
        
        getSession().save(c);
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
        JOptionPane.showMessageDialog(null, "Se ha realizado el cobro "+formaPago);
    }
    
    //Modificamos un Cobro
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
    
    //Borramos un Cobro segun el codigo
    public void deleteCobro(int codigo)
    {
        Cobro c=getCobroByCodigo(codigo);
        
        getSession().delete(c);
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
    }
    
    //Borramos todos los Cobros
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
    
    //Borramos todos los Cobros contenidos en el ArrayList
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
    
    //Obtenemos un ArticuloPedido segun sus claves primarias
    public ArticuloPedido getArticuloPedido(int codigoArticulo, int codigoDocumento)
    {
        ArticuloPedidoId api=new ArticuloPedidoId(codigoDocumento, codigoArticulo);
        return (ArticuloPedido) getSession().get(ArticuloPedido.class, api);
    }
    
    //Obtenemos todos los ArticulosPedidos
    public ArrayList<ArticuloPedido> getArticulosPedidos()
    {
        return (ArrayList<ArticuloPedido>) getSession().createQuery("from ArticuloPedido").list();
    }
    
    //Insertamos un ArticuloPedido
    public void insertArticuloPedido(int codigoArticulo, int codigoDocumento, int cantidad)
    {
        ArticuloPedidoId api=new ArticuloPedidoId(codigoDocumento, codigoArticulo);
        ArticuloPedido ap=new ArticuloPedido(api, getArticuloByCodigo(api.getCodigoArticulo()), getDocumentoByCodigo(api.getCodigoDocumento()), cantidad);
        
        getSession().save(ap);
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
    }
    
    //Borramos un ArticuloPedido segun sus claves primarias
    public void deleteArticuloPedido(int codigoArticulo, int codigoDocumento)
    {
        ArticuloPedido ap=getArticuloPedido(codigoArticulo, codigoDocumento);
        
        getSession().delete(ap);
        if(!tx.isActive()){tx=getSession().beginTransaction();}
        tx.commit();
    }
    
    //Borramos todos los ArticulosPedidos
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
    
    //Borramos todos los ArticulosPedidos contenidos en el ArrayList
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
    
    //Nos devuelve el modelo de la tabla que le pedimos
    public DefaultTableModel getTableModel(String table)
    {
        DefaultTableModel dtm=null;
        Vector columns;
        Vector row;
        
        int cont=0;//Este contador se usara posteriormente para saber en que numero de columna se esta operando
        
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
            
            //Este switch le da nombre a las columnas de las tablas
            switch(table)
            {
                case "cliente":
                    rs=dbmd.getColumns(null, null, table, null);//Obtenemos un ResultSet a travez del objeto de la clase DataBaseMetaData con todas la columnas de la tabla que le especificamos
                    while(rs.next())
                    {
                        columns.add(rs.getString(4));//Nos devuelve el cuarto valor de ResultSet, que corresponde al nombre de la columna en la Base de Datos
                    }
                    dtm.setColumnIdentifiers(columns);//Le asignamos las columnas al modelo de la tabla
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
                        /**Aqui ayudandonos de la variable cont le asignamos el nombre que nosotros querramos a la columna cuyo numero sea correspondiente al de la variable.
                         Esto lo hacemos porque no nos interesa que aparezca con los mismos nombres que tienen en la Base de Datos o bien porque añadimos columnas que no existen
                         en la tabla*/
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
                        cont++;
                    }
                    dtm.setColumnIdentifiers(columns);
                    break;
                case "articulo_pedido":
//                    rs=dbmd.getColumns(null, null, table, null);
//                    while(rs.next())
//                    {
                        for(int i=0;i<5;i++)
                        {
                            if(cont==0){columns.add("CODIGO_ARTICULO");}
                            else if(cont==1){columns.add("NOMBRE_ARTICULO");}
                            else if(cont==2){columns.add("CODIGO_DOCUMENTO");}
                            else if(cont==3){columns.add("DNI_CLIENTE_DOCUMENTO");}
                            else if(cont==4){columns.add("CIF_PROVEEDOR_DOCUMENTO");}
                            else{columns.add("CANTIDAD");}
//                            else{columns.add(rs.getString(4));}
                            cont++;
                        }
//                    }
                    dtm.setColumnIdentifiers(columns);
                    break;
            }
            
            //En este switch es donde se insertan las filas de la tabla
            switch(table)
            {
                case "cliente":
                    it=getClientes().iterator();//En este caso recogemos todos los Clientes y los recorremos
                    while(it.hasNext())
                    {
                        Cliente c=(Cliente) it.next();
                        row=new Vector();//Dentro del Vector row iran los datos de cada fila
                        
                        row.add(c.getDni());
                        row.add(c.getNombre());
                        row.add(c.getApellidos());
                        row.add(c.getDomicilio());
                        row.add(c.getCorreo());
                        row.add(c.getTelefono());
                        dtm.addRow(row);//Anadimos la fila al modelo de la tabla
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
//                        row.add(ap.getDocumento().getCliente().getDni());
//                        row.add("");
//                        row.add("");
                        if(ap.getDocumento().getCliente()==null){row.add("");}else{row.add(ap.getDocumento().getCliente().getDni());}
                        if(ap.getDocumento().getProveedor()==null){row.add("");}else{row.add(ap.getDocumento().getProveedor().getCif());}
//                        row.add(ap.getDocumento().getProveedor().getCif());
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
    
    //Obtenemos el modelo de la tabla que especificamos de los objetos contenidos del ArrayList que le pasamos.
    //Los pasos son primos hermanos a los de el metodo getTableModel
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
//            cobro
            
            int cont=0;
            
            
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
            }else if(tipo.equals("cobros"))
            {
                rs=dbmd.getColumns(null, null, "cobro", null);
                while(rs.next())
                {
                    if(cont==0){columns.add("CODIGO_COBRO");}
                    else if(cont==1){columns.add("CODIGO_DOCUMENTO");}
                    else if(cont==2){columns.add("DNI_CLIENTE_DOCUMENTO");}
                    else{columns.add(rs.getString(4));}
                    cont++;
                }
                dtm.setColumnIdentifiers(columns);
            }
            
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dtm;
    }
    //aqui esta el metodo que se encarga de crear un Modelo, en el cual se van a metter los datos(filas) de los articulos en la parte de CLiente
    public DefaultTableModel insertarRowCliente(int codigo, String nombre, double precio, int cantidad, int cantidadTotal, DefaultTableModel t) {

        //Sección 1 
        //DefaultTableModel modelo=(DefaultTableModel) this.v.tbl_Pedido_ArticulosPedidos.getModel(); 
        //aqui comparamos la cantidad anterior con la cantidad nueva, si es mayor, entonces no deberia de introducirse enel modelo, y entonces devolvera el modelo introducido sin modificar
        if (cantidad > cantidadTotal) {
            JOptionPane.showMessageDialog(null, "Has seleccionado demasiados articulos de " + nombre);
        } else {
            
            //creamos un array de objeto llamado Fila
            Object[] fila = new Object[6];

            //le añadimos los datos y creamos el array de objeto con los datos de la tabla ArticulosPedido
            fila[0] = codigo;
            fila[1] = nombre;
            fila[2] = precio;
            fila[3] = cantidad;
            //aqui sumamos los precios en la variable global sumaPresupuesto para luego recojerlo y mostrarlo en la Factura
            sumaPresupuesto = sumaPresupuesto + (precio * cantidad);
            //aññadimos finalmente el array de objeto en el objeto Default Model f
            t.addRow(fila);
        }
        return t;//devolvemos f

    }
    //este modelo es igual , lo unico que cambia es que se utilizara en la seccion de Proveedor, y por tanto no hay q controlar que la cantidad sea mayor a la actual
    //si hay tiempo añadirlo al metodo anterior
    public DefaultTableModel insertarRowProveedor(int codigo, String nombre, double precio, int cantidad, int cantidadTotal, DefaultTableModel t) {

        
        Object[] fila = new Object[6];

        
        fila[0] = codigo;
        fila[1] = nombre;
        fila[2] = precio;
        fila[3] = cantidad;

        sumaPresupuesto = sumaPresupuesto+(precio*cantidad);
        
        t.addRow(fila);
        return t;

    }
    //este metodo es el encargado de modificar las tablas segun la cantidad seleccionada
    public DefaultTableModel borrarRowCliente(DefaultTableModel t, int selectedRow, int cantidad,int cantTotal){
         
 
         //aqui se coje la fila seleccionada y se le pasa al atributo "a" 
          int a = selectedRow; 
          
         //si no hay almenos una fila seleccionada
          if (a<0){ 
 
                JOptionPane.showMessageDialog(null, 
                "Debe seleccionar una fila de la tabla" ); 
 
         }if(cantTotal<=cantidad) {// controlamos que la cantidad sea menos que la cantidad nueva, sino se venderian articulos que no existen
             //en ese caso, se enviaria un 0       
             t.setValueAt(0, a, 3);
             //de todas formas, en capas superiores se controla que el numero de la cantidad no sea mayor, pero por si las moscas  se controla
            }else{
              t.setValueAt((cantTotal-cantidad), a, 3);//aqui si todo va bien, se le resta a la cantidad total la cantidad vendida
          }
        
        return t;
    }
    
    public DefaultTableModel borrarRowProveedor(DefaultTableModel t, int selectedRow, int cantidad, int cantTotal)
    {//este metodo es igual al anterior , exceptuando que en este caso no resta, sino que suma
        int a = selectedRow; 
          
        if (a<0)//aqui se controla que se haya seleccionado almenos una fila
        { 
            JOptionPane.showMessageDialog(null, 
            "Debe seleccionar una fila de la tabla" ); 
         }
         t.setValueAt((cantTotal+cantidad), a, 3);//aqui sumamos la cantidad que tenemos más la cantidad del pedido q se hara al proveedor
        
        return t;
    }
    //este metodo devuelve la suma del presupuesto que se mostrara en el Frame Presupuesto, SIN iva, eso se mostrara en la Proforma
    public double getSumaPresupuesto(){
        return this.sumaPresupuesto;
    }
    public void setSumaPresupuesto(int presupuesto){ // aqui se le pasa un valor, inicial al atributo sumaPresupuesto
        this.sumaPresupuesto = presupuesto;
    }
    //este metodo rellena la tabla de la proforma con los datos de la tabla de ArticulosPedidos
    public DefaultTableModel rellenarProforma(DefaultTableModel tablaProforma, DefaultTableModel tablaArticulos){ // se le pasan los modelos de la tabla proforma(que es el que se devuelve) y la tabla ArticulosPedidos
        Object[] fila = new Object[6];
        double IVA = Double.parseDouble(LectorProperties.getPropiedad("IVA"));//cojemos el iva del fichero
        IVA = IVA/100;
                
        for(int i=0;i<tablaArticulos.getRowCount();i++){//recorreomos la tabla, cojemos los datos y lo metemos en el array de objetos Fila
            double primero=Double.parseDouble(String.valueOf(tablaArticulos.getValueAt(i, 2)));
            double segundo=Double.parseDouble(String.valueOf(tablaArticulos.getValueAt(i, 3)));
            fila[0]= tablaArticulos.getValueAt(i, 1);
            fila[1]= tablaArticulos.getValueAt(i, 2);
            fila[2]= tablaArticulos.getValueAt(i, 3);
            double total = primero*segundo;
            fila[3]= total;
            fila[4]= total*IVA;
            fila[5]= total+(total*IVA);
            
            tablaProforma.addRow(fila);//añadimos la fila al modelo
        }
        
        return tablaProforma;//devolvemos el modelo
    }
    //aqui sumamos la base de los articulos
    public double getSumaBase(DefaultTableModel t){
        double suma =0;
        for(int i=0; i<t.getRowCount();i++){//recorremos la tabla, y sumamos en un atributo suma
            suma = suma +((double)t.getValueAt(i, 3));
        }
        
        return suma;
    }
    //aqui sumamos los importes del iva
    public double getSumaIva(DefaultTableModel t){
        double suma =0;
        for(int i=0; i<t.getRowCount();i++){//recorremos la tabla y cojemos los campos de iva
            suma = suma +((double)t.getValueAt(i, 4));//los sumamos
        }
        
        return suma;//lo devolvemos
    }
    
    //aqui sumamos el TOTAl de base y de iva
    public double getSumaTotal(DefaultTableModel t){
        double suma =0;
        for(int i=0; i<t.getRowCount();i++){
            suma = suma +((double)t.getValueAt(i, 5));//recorremos la tabla y sumamos en la variable suma
        }
        
        return suma;//devolvemod suma
    }
    
}