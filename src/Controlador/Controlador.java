package Controlador;

import Modelo.Modelo;
import Vistas.Vista_Principal;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Controlador implements ActionListener, MouseListener {

    Vista_Principal v;
    Modelo m = new Modelo();
    String tablaMenuPrincipal = "articulos";
    int fila_Articulo;
    int fila_Cliente;
    int fila_Proveedor;

    public Controlador(Vista_Principal vista) {
        this.v = vista;
    }

    public enum Acciones {

        principalCargarTablaArticulos,
        principalCargarTablaClientes,
        principalCargarTablaProveedores,
        principalCargarTablaPedidos,
        principalBuscarEnTablaPrincipal,
        mostrarFrameArticulo,
        mostrarFrameCliente,
        mostrarFrameProveedor,
        mostrarFramePedido,
        mostrarFrameGastos,
        mostrarFrameCobrosPagos,
        mostrarFrameConfig,
        cerrarFrameCliente,
        insertarCliente,
        buscarTablaModificarCliente,
        modificarCliente,
        buscarTablaEliminarCliente,
        eliminarCliente,
        cerrarFrameProveedor,
        insertarProveedor,
        buscarTablaModificarProveedor,
        modificarProveedor,
        buscarTablaEliminarProveedor,
        eliminarProveedor,
        cerrarFrameArticulo,
        insertarArticulo,
        buscarTablaModificarArticulo,
        modificarArticulo,
        buscarTablaEliminarArticulo,
        eliminarArticulo,
        cerrarFramePedido,
        radioPedidoCliente,
        radioPedidoProveedor,
        cerrarFrameGastos,
        cerrarFrameCobrosPagos,
        cerrarConfig,
        Salir
    }

    public void iniciarMain() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(v);
            this.v.setLocationRelativeTo(null);
            v.setVisible(true);
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
        }
        //Cargamos la tabla del menu principal por defecto
        this.v.tbl_Tabla_Principal.setModel(this.m.getTableModel("articulo"));
        //Cargamos el pane por defecto en el frame de pedidos
        this.v.pnl_Pedido_ClienteProveedor.add(this.v.pnl_Pedido_Contenedor_Cliente, BorderLayout.CENTER);

        //Listener botones en la ventana principal
        this.v.btn_principal_articulos.setActionCommand("principalCargarTablaArticulos");
        this.v.btn_principal_articulos.addActionListener(this);
        this.v.btn_principal_clientes.setActionCommand("principalCargarTablaClientes");
        this.v.btn_principal_clientes.addActionListener(this);
        this.v.btn_principal_proveedores.setActionCommand("principalCargarTablaProveedores");
        this.v.btn_principal_proveedores.addActionListener(this);
        this.v.btn_principal_pedidos.setActionCommand("principalCargarTablaPedidos");
        this.v.btn_principal_pedidos.addActionListener(this);
        this.v.btn_principal_buscar.setActionCommand("principalBuscarEnTablaPrincipal");
        this.v.btn_principal_buscar.addActionListener(this);

        //Listeners en el menú
        //Menu Nuevo
        this.v.Menu_Nuevo_Articulo.setActionCommand("mostrarFrameArticulo");
        this.v.Menu_Nuevo_Articulo.addActionListener(this);
        this.v.Menu_Nuevo_Cliente.setActionCommand("mostrarFrameCliente");
        this.v.Menu_Nuevo_Cliente.addActionListener(this);
        this.v.Menu_Nuevo_Proveedor.setActionCommand("mostrarFrameProveedor");
        this.v.Menu_Nuevo_Proveedor.addActionListener(this);
        this.v.Menu_Nuevo_Pedido.setActionCommand("mostrarFramePedido");
        this.v.Menu_Nuevo_Pedido.addActionListener(this);
        //Menu empresa
        this.v.Menu_Empresa_Gastos.setActionCommand("mostrarFrameGastos");
        this.v.Menu_Empresa_Gastos.addActionListener(this);
        this.v.Menu_Empresa_Cobros_Pagos.setActionCommand("mostrarFrameCobrosPagos");
        this.v.Menu_Empresa_Cobros_Pagos.addActionListener(this);
        //Menu configuracion
        this.v.Menu_Confi_Ver.setActionCommand("mostrarFrameConfig");
        this.v.Menu_Confi_Ver.addActionListener(this);
        //Menu sesion
        this.v.Menu_Sesion_Salir.setActionCommand("Salir");
        this.v.Menu_Sesion_Salir.addActionListener(this);
        //Listeners frame cliente
        this.v.btn_Cliente_Cancelar.setActionCommand("cerrarFrameCliente");
        this.v.btn_Cliente_Cancelar.addActionListener(this);
        //Crear cliente
        this.v.btn_Crear_Cliente.setActionCommand("insertarCliente");
        this.v.btn_Crear_Cliente.addActionListener(this);
        //Modificar cliente
        this.v.btn_Modificar_Cliente_Busqueda.setActionCommand("buscarTablaModificarCliente");
        this.v.btn_Modificar_Cliente_Busqueda.addActionListener(this);
        this.v.btn_Modificar_Cliente.setActionCommand("modificarCliente");
        this.v.btn_Modificar_Cliente.addActionListener(this);
        //Eliminar cliente
        this.v.btn_Eliminar_Cliente_Buscar.setActionCommand("buscarTablaEliminarCliente");
        this.v.btn_Eliminar_Cliente_Buscar.addActionListener(this);
        this.v.btn_Eliminar_Cliente.setActionCommand("eliminarCliente");
        this.v.btn_Eliminar_Cliente.addActionListener(this);
        
        //Listeners frame proveedor
        this.v.btn_Proveedor_Cancelar.setActionCommand("cerrarFrameProveedor");
        this.v.btn_Proveedor_Cancelar.addActionListener(this);
        //Crear proveedor
        this.v.btn_Crear_Proveedor.setActionCommand("insertarProveedor");
        this.v.btn_Crear_Proveedor.addActionListener(this);
        //Modificar proveedor
        this.v.btn_Modificar_Proveedor_Busqueda.setActionCommand("buscarTablaModificarProveedor");
        this.v.btn_Modificar_Proveedor_Busqueda.addActionListener(this);
        this.v.btn_Modificar_Proveedor.setActionCommand("modificarProveedor");
        this.v.btn_Modificar_Proveedor.addActionListener(this);
        //Eliminar proveedor
        this.v.btn_Eliminar_Proveedor_Buscar.setActionCommand("buscarTablaEliminarProveedor");
        this.v.btn_Eliminar_Proveedor_Buscar.addActionListener(this);
        this.v.btn_Eliminar_Proveedor.setActionCommand("eliminarProveedor");
        this.v.btn_Eliminar_Proveedor.addActionListener(this);
        
        //Listeners frame articulo
        this.v.btn_Articulo_Cancelar.setActionCommand("cerrarFrameArticulo");
        this.v.btn_Articulo_Cancelar.addActionListener(this);
        //Crear articulo
        this.v.btn_Crear_Articulo.setActionCommand("insertarArticulo");
        this.v.btn_Crear_Articulo.addActionListener(this);
        //Modificar articulo
        this.v.btn_Modificar_Articulo_Busqueda.setActionCommand("buscarTablaModificarArticulo");
        this.v.btn_Modificar_Articulo_Busqueda.addActionListener(this);
        this.v.btn_Modificar_Articulo.setActionCommand("modificarArticulo");
        this.v.btn_Modificar_Articulo.addActionListener(this);
        //Eliminar articulo
        this.v.btn_Eliminar_Articulo_Buscar.setActionCommand("buscarTablaEliminarArticulo");
        this.v.btn_Eliminar_Articulo_Buscar.addActionListener(this);
        this.v.btn_Eliminar_Articulo.setActionCommand("eliminarArticulo");
        this.v.btn_Eliminar_Articulo.addActionListener(this);
        
        //Listeners frame pedido
        this.v.btn_Pedido_Cancelar.setActionCommand("cerrarFramePedido");
        this.v.btn_Pedido_Cancelar.addActionListener(this);
        this.v.rad_Pedido_Cliente.setActionCommand("radioPedidoCliente");
        this.v.rad_Pedido_Cliente.addActionListener(this);
        this.v.rad_Pedido_Proveedor.setActionCommand("radioPedidoProveedor");
        this.v.rad_Pedido_Proveedor.addActionListener(this);
        
        //Listeners frame Gastos
        this.v.btn_Gastos_Salir.setActionCommand("cerrarFrameGastos");
        this.v.btn_Gastos_Salir.addActionListener(this);
        
        //Listeners frame CobrosPagos
        this.v.btn_Cobros_Pagos_Salir.setActionCommand("cerrarFrameCobrosPagos");
        this.v.btn_Cobros_Pagos_Salir.addActionListener(this);
        
        //Listeners Frame Config
        this.v.btn_DatosEmpresa_Salir.setActionCommand("cerrarConfig");
        this.v.btn_DatosEmpresa_Salir.addActionListener(this);
        this.v.btn_DatosEmpresa_Modificar.setActionCommand("modificarConfig");
        this.v.btn_DatosEmpresa_Modificar.addActionListener(this);
        
        
        //Mouse Listeners Tablas
        this.v.tbl_Tabla_Modificar_Articulo.addMouseListener(this);
        this.v.tbl_Tabla_Modificar_Cliente.addMouseListener(this);
        this.v.tbl_Tabla_Modificar_Proveedor.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (Acciones.valueOf(e.getActionCommand())) {
            case principalCargarTablaArticulos:
                this.tablaMenuPrincipal = "articulos";
                this.v.tbl_Tabla_Principal.setModel(this.m.getTableModel("articulo"));
                break;
            case principalCargarTablaClientes:
                this.tablaMenuPrincipal = "clientes";
                this.v.tbl_Tabla_Principal.setModel(this.m.getTableModel("cliente"));
                break;
            case principalCargarTablaProveedores:
                this.tablaMenuPrincipal = "proveedores";
                this.v.tbl_Tabla_Principal.setModel(this.m.getTableModel("proveedor"));
                break;
            case principalCargarTablaPedidos:
                this.tablaMenuPrincipal = "pedidos";
                this.v.tbl_Tabla_Principal.setModel(this.m.getTableModel("articulo_pedido"));
                break;
            case principalBuscarEnTablaPrincipal:
                String busqueda = this.v.txt_principal_busqueda.getText();
                switch(tablaMenuPrincipal){
                    case "articulos":
                        this.v.tbl_Tabla_Principal.setModel(m.getTableModelByArrayList(m.getArticulosByQuestion((busqueda))));
                        break;
                    case "clientes":
                        this.v.tbl_Tabla_Principal.setModel(m.getTableModelByArrayList(m.getClientesByQuestion(busqueda)));
                        break;
                    case "proveedores":
                        this.v.tbl_Tabla_Principal.setModel(m.getTableModelByArrayList(m.getProveedoresByQuestion(busqueda)));
                        break;
                    case "pedidos":
                        
                        break;
                }

                break;
            case mostrarFrameArticulo:
                this.v.Frame_Articulo.setVisible(true);
                this.v.Frame_Articulo.setSize(700,354);
                this.v.Frame_Articulo.setLocationRelativeTo(v);
                this.v.tbl_Tabla_Modificar_Articulo.setModel(this.m.getTableModel("articulo"));
                break;
            case mostrarFrameCliente:
                this.v.Frame_Cliente.setVisible(true);
                this.v.Frame_Cliente.setSize(700, 525);
                this.v.Frame_Cliente.setLocationRelativeTo(v);
                this.v.tbl_Tabla_Modificar_Cliente.setModel(this.m.getTableModel("cliente"));
                break;
            case mostrarFrameProveedor:
                this.v.Frame_Proveedor.setVisible(true);
                this.v.Frame_Proveedor.setSize(787,487);
                this.v.Frame_Proveedor.setLocationRelativeTo(v);
                this.v.tbl_Tabla_Modificar_Proveedor.setModel(this.m.getTableModel("proveedor"));
                break;
            case mostrarFramePedido:
                this.v.Frame_Pedido.setVisible(true);
                this.v.Frame_Pedido.setSize(700,600);
                this.v.Frame_Pedido.setLocationRelativeTo(v);
                break;
            case mostrarFrameGastos:
                this.v.Frame_Gastos.setVisible(true);
                this.v.Frame_Gastos.setSize(600,330);
                this.v.Frame_Gastos.setLocationRelativeTo(v);
                break;
            case mostrarFrameCobrosPagos:
                this.v.Frame_CobrosPagos.setVisible(true);
                this.v.Frame_CobrosPagos.setSize(700,400);
                this.v.Frame_CobrosPagos.setLocationRelativeTo(v);
                break;
            case mostrarFrameConfig:
                this.v.Frame_DatosEmpresa.setVisible(true);
                this.v.Frame_DatosEmpresa.setSize(700,350);
                this.v.Frame_DatosEmpresa.setLocationRelativeTo(v);
                break;
            case cerrarFrameCliente:
                this.v.Frame_Cliente.setVisible(false);
                break;
            case insertarCliente:
                m.insertCliente(this.v.txt_Crear_Cliente_Dni.getText(), this.v.txt_Crear_Cliente_Nombre.getText(), this.v.txt_Crear_Cliente_Apellidos.getText(), this.v.txt_Crear_Cliente_Domicilio.getText(), this.v.txt_Crear_Cliente_Correo.getText(), this.v.txt_Crear_Cliente_Telefono.getText());
                this.tablaMenuPrincipal = "clientes";
                this.v.tbl_Tabla_Principal.setModel(this.m.getTableModel("cliente"));
                break;
            case buscarTablaModificarCliente:
                this.v.tbl_Tabla_Modificar_Cliente.setModel(m.getTableModelByArrayList(m.getClientesByQuestion(this.v.txt_Modificar_Cliente_Buscar.getText())));
                break;
            case modificarCliente:
                m.modifyCliente(this.v.eti_Modificar_Cliente_Dni_antiguo.getText() , this.v.txt_Modificar_Cliente_Nombre.getText(), this.v.txt_Modificar_Cliente_Apellidos.getText(), this.v.txt_Modificar_Cliente_Domicilio.getText(), this.v.txt_Modificar_Cliente_Correo.getText(), this.v.txt_Modificar_Cliente_Telefono.getText());
                this.tablaMenuPrincipal = "clientes";
                this.v.tbl_Tabla_Principal.setModel(this.m.getTableModel("cliente"));
                break;
            case buscarTablaEliminarCliente:
                this.v.tbl_Eliminar_Cliente.setModel(m.getTableModelByArrayList(m.getClientesByQuestion(this.v.txt_Modificar_Cliente_Buscar.getText())));
                break;
            case eliminarCliente:
                
                break;
            case cerrarFrameProveedor:
                this.v.Frame_Proveedor.setVisible(false);
                break;
            case insertarProveedor:
                m.insertProveedor(this.v.txt_Crear_Proveedor_Cif.getText(), this.v.txt_Crear_Proveedor_DSocial.getText(), this.v.txt_Crear_Proveedor_Telefono.getText(), this.v.txt_Crear_Proveedor_Correo.getText());
                this.tablaMenuPrincipal = "proveedores";
                this.v.tbl_Tabla_Principal.setModel(this.m.getTableModel("proveedor"));
                break;
            case buscarTablaModificarProveedor:
                this.v.tbl_Tabla_Modificar_Proveedor.setModel(m.getTableModelByArrayList(m.getProveedoresByQuestion(this.v.txt_Modificar_Proveedor_Buscar.getText())));
                break;
            case modificarProveedor:
                m.modifyProveedor(this.v.eti_Modificar_Proveedor_CIF.getText(), this.v.txt_Modificar_Proveedor_DSocial.getText(), this.v.txt_Modificar_Proveedor_Telefono.getText(), this.v.txt_Modificar_Proveedor_Correo.getText());
                this.tablaMenuPrincipal = "proveedores";
                this.v.tbl_Tabla_Principal.setModel(this.m.getTableModel("proveedor"));
                break;
            case buscarTablaEliminarProveedor:
                this.v.tbl_Eliminar_Proveedor.setModel(m.getTableModelByArrayList(m.getProveedoresByQuestion(this.v.txt_Modificar_Proveedor_Buscar.getText())));
                break;
            case eliminarProveedor:
              
                break;
            case cerrarFrameArticulo:
                this.v.Frame_Articulo.setVisible(false);
                break;
            case insertarArticulo:
               
                    m.insertArticulo(this.v.txt_Crear_Articulo_Nombre.getText(), Double.parseDouble(this.v.txt_Crear_Articulo_Precio.getText()), Integer.parseInt(this.v.spinner_Crear_Articulo_Cantidad.getValue().toString()));
                    this.tablaMenuPrincipal = "articulos";
                    this.v.tbl_Tabla_Principal.setModel(this.m.getTableModel("articulo"));
                
                break;
            case buscarTablaModificarArticulo:
                this.v.tbl_Tabla_Modificar_Articulo.setModel(m.getTableModelByArrayList(m.getArticulosByQuestion(this.v.txt_Modificar_Articulo_Buscar.getText())));
                break;
            case modificarArticulo:
                double decimal = Double.parseDouble(String.valueOf(this.v.txt_Modificar_Articulo_Precio.getText()));
                int value = (Integer) this.v.sp_Modificar_Articulo_Spinner.getValue();
                int id = Integer.parseInt(String.valueOf(this.v.eti_Modificar_Articulo_ID.getText()));
                m.modifyArticulo(id, this.v.txt_Modificar_Articulo_Nombre.getText(), decimal, value);
                this.tablaMenuPrincipal = "articulos";
                this.v.tbl_Tabla_Principal.setModel(this.m.getTableModel("articulo"));
                break;
            case buscarTablaEliminarArticulo:
                this.v.tbl_Eliminar_Articulo.setModel(m.getTableModelByArrayList(m.getArticulosByQuestion(this.v.txt_Modificar_Articulo_Buscar.getText().toString())));
                break;
            case eliminarArticulo:
                
                break;
            case cerrarFramePedido:
                this.v.Frame_Pedido.setVisible(false);
                break;
            case radioPedidoCliente:
                this.v.pnl_Pedido_ClienteProveedor.removeAll();
                this.v.pnl_Pedido_ClienteProveedor.add(this.v.pnl_Pedido_Contenedor_Cliente, BorderLayout.CENTER);
                this.v.pnl_Pedido_ClienteProveedor.revalidate();
                this.v.pnl_Pedido_ClienteProveedor.repaint();
                break;
            case radioPedidoProveedor:
                this.v.pnl_Pedido_ClienteProveedor.removeAll();
                this.v.pnl_Pedido_ClienteProveedor.add(this.v.pnl_Pedido_Contenedor_Proveedor, BorderLayout.CENTER);
                this.v.pnl_Pedido_ClienteProveedor.revalidate();
                this.v.pnl_Pedido_ClienteProveedor.repaint();
                break;
            case cerrarFrameGastos:
                this.v.Frame_Gastos.setVisible(false);
                break;
            case cerrarFrameCobrosPagos:
                this.v.Frame_CobrosPagos.setVisible(false);
                break;
            case cerrarConfig:
                this.v.Frame_DatosEmpresa.setVisible(false);
                break;
            case Salir:
                System.exit(WIDTH);
                break;
                //Updates:  
            
        }
    }
@Override
    public void mouseClicked(MouseEvent e) {
    
           fila_Articulo = this.v.tbl_Tabla_Modificar_Articulo.getSelectedRow();
           fila_Cliente = this.v.tbl_Tabla_Modificar_Cliente.getSelectedRow();
           fila_Proveedor = this.v.tbl_Tabla_Modificar_Proveedor.getSelectedRow();
           
           if(fila_Articulo>=0){
               System.out.println("Estas en Tab ==Modificar Articulo");
           this.v.eti_Modificar_Articulo_ID.setText(""+v.tbl_Tabla_Modificar_Articulo.getValueAt(fila_Articulo, 0));
           this.v.txt_Modificar_Articulo_Nombre.setText(""+v.tbl_Tabla_Modificar_Articulo.getValueAt(fila_Articulo, 1));
           this.v.txt_Modificar_Articulo_Precio.setText(""+v.tbl_Tabla_Modificar_Articulo.getValueAt(fila_Articulo, 2));
           this.v.sp_Modificar_Articulo_Spinner.setValue(v.tbl_Tabla_Modificar_Articulo.getValueAt(fila_Articulo, 3));
           }
           if(fila_Cliente>=0){
               System.out.println("Estas en Tab ==Modificar Cliene");
           this.v.eti_Modificar_Cliente_Dni_antiguo.setText(""+v.tbl_Tabla_Modificar_Cliente.getValueAt(fila_Cliente, 0));
           this.v.txt_Modificar_Cliente_Nombre.setText(""+v.tbl_Tabla_Modificar_Cliente.getValueAt(fila_Cliente, 1));
           this.v.txt_Modificar_Cliente_Apellidos.setText(""+v.tbl_Tabla_Modificar_Cliente.getValueAt(fila_Cliente, 2));
           this.v.txt_Modificar_Cliente_Domicilio.setText(""+v.tbl_Tabla_Modificar_Cliente.getValueAt(fila_Cliente, 3));
           this.v.txt_Modificar_Cliente_Correo.setText(""+v.tbl_Tabla_Modificar_Cliente.getValueAt(fila_Cliente, 4));
           this.v.txt_Modificar_Cliente_Telefono.setText(""+v.tbl_Tabla_Modificar_Cliente.getValueAt(fila_Cliente, 5));
           }
           if(fila_Proveedor>=0){
               System.out.println("Estas en Tab ==Modificar Cliene");
               this.v.eti_Modificar_Proveedor_CIF.setText(""+v.tbl_Tabla_Modificar_Proveedor.getValueAt(fila_Proveedor, 0));
               this.v.txt_Modificar_Proveedor_DSocial.setText(""+v.tbl_Tabla_Modificar_Proveedor.getValueAt(fila_Proveedor, 1));
               this.v.txt_Modificar_Proveedor_Telefono.setText(""+v.tbl_Tabla_Modificar_Proveedor.getValueAt(fila_Proveedor, 2));
               this.v.txt_Modificar_Proveedor_Correo.setText(""+v.tbl_Tabla_Modificar_Proveedor.getValueAt(fila_Proveedor, 3));
           }
    }
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}
