package Controlador;

import Modelo.LectorProperties;
import Modelo.Modelo;
import Modelo.generatePDF;
import Vistas.Vista_Principal;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import Atxy2k.CustomTextField.RestrictedTextField;
import Hibernate.ArticuloPedido;
import Hibernate.Documento;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Noneking, Inno, MrDrulix
 */
public class Controlador implements ActionListener, MouseListener {

    Vista_Principal v;
    Modelo m = new Modelo();
    String tablaMenuPrincipal = "articulos";
    int fila_Articulo;
    int fila_Cliente;
    int fila_Proveedor;
    int fila_Cliente_Pedido;
    int fila_Proveedor_Pedido;

    int fila_Articulos;
    int art_Codigo;
    String art_Nombre;
    double art_Precio;
    int art_Cantidad;

    int row;
    String now;
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
        hacerPedido,
        radioPedidoCliente,
        radioPedidoProveedor,
        cerrarFrameGastos,
        cerrarFrameCobrosPagos,
        cambiarFechaCobros,
        cerrarConfig,
        modificarConfig,
        Salir,
        mostrarFrameProforma,
        btnAñadirArticuloPedido,
        btnQuitarArticuloPedido,
        salirFrameProforma,
        cancelarFactura,
        confirmarFactura
    }

    public void iniciarMain() {
        try {
            UIManager.setLookAndFeel(new WindowsLookAndFeel());
            SwingUtilities.updateComponentTreeUI(v);
            this.v.setLocationRelativeTo(null);
            v.setVisible(true);
        } catch (UnsupportedLookAndFeelException ex) {
        }
        
        this.v.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/img/stk.jpg")));
        restriccionesTextFields();
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
//        this.v.Menu_Empresa_Gastos.setActionCommand("mostrarFrameGastos");
//        this.v.Menu_Empresa_Gastos.addActionListener(this);
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
        this.v.btn_Pedido_HacerPedido.setActionCommand("hacerPedido");
        this.v.btn_Pedido_HacerPedido.addActionListener(this);

        this.v.btn_Añadir_Articulo_Pedido.setActionCommand("btnAñadirArticuloPedido");
        this.v.btn_Añadir_Articulo_Pedido.addActionListener(this);
        this.v.btn_Quitar_Articulo_Pedido.setActionCommand("btnQuitarArticuloPedido");
        this.v.btn_Quitar_Articulo_Pedido.addActionListener(this);

        //Listeners frame Gastos
        this.v.btn_Gastos_Salir.setActionCommand("cerrarFrameGastos");
        this.v.btn_Gastos_Salir.addActionListener(this);
//        this.v.cbox_CobrosPagos_MesAno.setActionCommand("cambiarFechaCobros");
//        this.v.cbox_CobrosPagos_MesAno.addActionListener(this);
        
        //Listeners frame CobrosPagos
        this.v.btn_Cobros_Pagos_Salir.setActionCommand("cerrarFrameCobrosPagos");
        this.v.btn_Cobros_Pagos_Salir.addActionListener(this);

        //Listeners Frame Config
        this.v.btn_DatosEmpresa_Salir.setActionCommand("cerrarConfig");
        this.v.btn_DatosEmpresa_Salir.addActionListener(this);
        this.v.btn_DatosEmpresa_Modificar.setActionCommand("modificarConfig");
        this.v.btn_DatosEmpresa_Modificar.addActionListener(this);

        //Listeners Frame Proforma
        this.v.btn_Pedido_VerProforma.setActionCommand("mostrarFrameProforma");
        this.v.btn_Pedido_VerProforma.addActionListener(this);
        this.v.btn_Proforma_Salir.setActionCommand("salirFrameProforma");
        this.v.btn_Proforma_Salir.addActionListener(this);

        //Listeners Frame Factura
        this.v.btn_Factura_Cancelar.setActionCommand("cancelarFactura");
        this.v.btn_Factura_Cancelar.addActionListener(this);
        this.v.btn_Factura_ConfirmarFactura.setActionCommand("confirmarFactura");
        this.v.btn_Factura_ConfirmarFactura.addActionListener(this);

        //Mouse Listeners Tablas
        this.v.tbl_Tabla_Modificar_Articulo.addMouseListener(this);
        this.v.tbl_Tabla_Modificar_Cliente.addMouseListener(this);
        this.v.tbl_Tabla_Modificar_Proveedor.addMouseListener(this);
        this.v.tbl_Pedido_Cliente_Busqueda.addMouseListener(this);
        this.v.tbl_Pedido_Proveedor_Busqueda.addMouseListener(this);
        this.v.tbl_Pedido_Articulos.addMouseListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (Acciones.valueOf(e.getActionCommand())) {

//Principal---------------------------------------------------------------------------------------------------------------            
            
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
                switch (tablaMenuPrincipal) {
                    case "articulos":
                        this.v.tbl_Tabla_Principal.setModel(m.getTableModelByArrayList(m.getArticulosByQuestion(busqueda), "articulos"));
                        break;
                    case "clientes":
                        this.v.tbl_Tabla_Principal.setModel(m.getTableModelByArrayList(m.getClientesByQuestion(busqueda), "clientes"));
                        break;
                    case "proveedores":
                        this.v.tbl_Tabla_Principal.setModel(m.getTableModelByArrayList(m.getProveedoresByQuestion(busqueda), "proveedores"));
                        break;
                    case "pedidos":

                        break;
                }
                break;
                
//MenuBar------------------------------------------------------------------------------------------------------------------------                
           
            case mostrarFrameArticulo:
                this.v.Frame_Articulo.setVisible(true);
                this.v.Frame_Articulo.setSize(700, 525);
                this.v.Frame_Articulo.setLocationRelativeTo(v);
                this.v.tbl_Tabla_Modificar_Articulo.setModel(this.m.getTableModel("articulo"));
                this.v.tbl_Eliminar_Articulo.setModel(this.m.getTableModel("articulo"));
                break;
            case mostrarFrameCliente:
                this.v.Frame_Cliente.setVisible(true);
                this.v.Frame_Cliente.setSize(700, 525);
                this.v.Frame_Cliente.setLocationRelativeTo(v);
                this.v.tbl_Tabla_Modificar_Cliente.setModel(this.m.getTableModel("cliente"));
                this.v.tbl_Eliminar_Cliente.setModel(this.m.getTableModel("cliente"));
                break;
            case mostrarFrameProveedor:
                this.v.Frame_Proveedor.setVisible(true);
                this.v.Frame_Proveedor.setSize(700, 525);
                this.v.Frame_Proveedor.setLocationRelativeTo(v);
                this.v.tbl_Tabla_Modificar_Proveedor.setModel(this.m.getTableModel("proveedor"));
                this.v.tbl_Eliminar_Proveedor.setModel(this.m.getTableModel("proveedor"));
                break;
            case mostrarFramePedido:
                this.v.Frame_Pedido.setVisible(true);
                this.v.Frame_Pedido.setSize(700, 600);
                this.v.Frame_Pedido.setLocationRelativeTo(v);
                this.v.tbl_Pedido_Cliente_Busqueda.setModel(this.m.getTableModel("cliente"));
                this.v.tbl_Pedido_Proveedor_Busqueda.setModel(this.m.getTableModel("proveedor"));
                this.v.tbl_Pedido_Articulos.setModel(this.m.getTableModel("articulo"));
                break;
            case mostrarFrameGastos:
                this.v.Frame_Gastos.setVisible(true);
                this.v.Frame_Gastos.setSize(600, 350);
                this.v.Frame_Gastos.setLocationRelativeTo(v);
                break;
            case mostrarFrameCobrosPagos:
                this.v.Frame_CobrosPagos.setVisible(true);
                this.v.Frame_CobrosPagos.setSize(700, 400);
                this.v.Frame_CobrosPagos.setLocationRelativeTo(v);
                this.v.tbl_CobrosPagos.setModel(m.getTableModel("cobro"));
                break;
            case mostrarFrameConfig:
                this.v.Frame_DatosEmpresa.setVisible(true);
                this.v.Frame_DatosEmpresa.setSize(700, 350);
                this.v.Frame_DatosEmpresa.setLocationRelativeTo(v);
                this.v.eti_DatosEmpresa_Nombre.setText(LectorProperties.getPropiedad("NOMBRE"));
                this.v.eti_DatosEmpresa_Correo.setText(LectorProperties.getPropiedad("CORREO"));
                this.v.eti_DatosEmpresa_Direccion.setText(LectorProperties.getPropiedad("DIRECCION"));
                this.v.eti_DatosEmpresa_Iva.setText(LectorProperties.getPropiedad("IVA"));
                break;
            case Salir:
                System.exit(WIDTH);
                break;

//Menu Clientes-------------------------------------------------------------------------------------------------------------------                
           
            case cerrarFrameCliente:
                this.v.Frame_Cliente.setVisible(false);
                Clean();
                break;
            case insertarCliente:
                if (JOptionPane.showConfirmDialog(this.v.Frame_Cliente, "¿Desea Insertar el nuevo Cliente? " + this.v.txt_Crear_Cliente_Dni.getText()) == 0) {
                    m.insertCliente(this.v.txt_Crear_Cliente_Dni.getText(), this.v.txt_Crear_Cliente_Nombre.getText(), this.v.txt_Crear_Cliente_Apellidos.getText(), this.v.txt_Crear_Cliente_Domicilio.getText(), this.v.txt_Crear_Cliente_Correo.getText(), this.v.txt_Crear_Cliente_Telefono.getText());
                    this.tablaMenuPrincipal = "clientes";
                    this.v.tbl_Tabla_Principal.setModel(this.m.getTableModel("cliente"));
                    this.v.tbl_Tabla_Modificar_Cliente.setModel(this.m.getTableModel("cliente"));
                    this.v.tbl_Eliminar_Cliente.setModel(this.m.getTableModel("cliente"));
                    Clean();
                }
                break;
            case buscarTablaModificarCliente:
                this.v.tbl_Tabla_Modificar_Cliente.setModel(m.getTableModelByArrayList(m.getClientesByQuestion(this.v.txt_Modificar_Cliente_Buscar.getText()), "clientes"));
                break;
            case modificarCliente:
                if (JOptionPane.showConfirmDialog(this.v.Frame_Cliente, "¿Desea modificar el cliente: " + this.v.eti_Modificar_Cliente_Dni_antiguo.getText() + " ?") == 0) {
                    m.modifyCliente(this.v.eti_Modificar_Cliente_Dni_antiguo.getText(), this.v.txt_Modificar_Cliente_Nombre.getText(), this.v.txt_Modificar_Cliente_Apellidos.getText(), this.v.txt_Modificar_Cliente_Domicilio.getText(), this.v.txt_Modificar_Cliente_Correo.getText(), this.v.txt_Modificar_Cliente_Telefono.getText());
                    this.tablaMenuPrincipal = "clientes";
                    this.v.tbl_Tabla_Principal.setModel(this.m.getTableModel("cliente"));
                    this.v.tbl_Tabla_Modificar_Cliente.setModel(this.m.getTableModel("cliente"));
                    this.v.tbl_Eliminar_Cliente.setModel(this.m.getTableModel("cliente"));
                    Clean();
                }
                break;
            case buscarTablaEliminarCliente:
                this.v.tbl_Eliminar_Cliente.setModel(m.getTableModelByArrayList(m.getClientesByQuestion(this.v.txt_Modificar_Cliente_Buscar.getText()), "clientes"));
                break;
            case eliminarCliente:
                if (JOptionPane.showConfirmDialog(this.v.Frame_Cliente, "¿De verdad desea eliminar " + this.v.tbl_Eliminar_Cliente.getValueAt(this.v.tbl_Eliminar_Cliente.getSelectedRow(), 0).toString() + "?") == 0) {
                    m.deleteCliente(this.v.tbl_Eliminar_Cliente.getValueAt(this.v.tbl_Eliminar_Cliente.getSelectedRow(), 0).toString());
                    this.tablaMenuPrincipal = "clientes";
                    this.v.tbl_Tabla_Principal.setModel(this.m.getTableModel("cliente"));
                    this.v.tbl_Tabla_Modificar_Cliente.setModel(this.m.getTableModel("cliente"));
                    this.v.tbl_Eliminar_Cliente.setModel(this.m.getTableModel("cliente"));
                }
                break;

//Menu Proveedor-----------------------------------------------------------------------------------------------------------------
           
            case cerrarFrameProveedor:
                this.v.Frame_Proveedor.setVisible(false);
                Clean();
                break;
            case insertarProveedor:
                if (JOptionPane.showConfirmDialog(this.v.Frame_Proveedor, "¿Desea insertar el Proveedor?") == 0) {
                    m.insertProveedor(this.v.txt_Crear_Proveedor_Cif.getText(), this.v.txt_Crear_Proveedor_DSocial.getText(), this.v.txt_Crear_Proveedor_Telefono.getText(), this.v.txt_Crear_Proveedor_Correo.getText());
                    this.tablaMenuPrincipal = "proveedores";
                    this.v.tbl_Tabla_Principal.setModel(this.m.getTableModel("proveedor"));
                    this.v.tbl_Tabla_Modificar_Proveedor.setModel(this.m.getTableModel("proveedor"));
                    this.v.tbl_Eliminar_Proveedor.setModel(this.m.getTableModel("proveedor"));
                    Clean();
                }
                break;
            case buscarTablaModificarProveedor:
                this.v.tbl_Tabla_Modificar_Proveedor.setModel(m.getTableModelByArrayList(m.getProveedoresByQuestion(this.v.txt_Modificar_Proveedor_Buscar.getText()), "proveedores"));
                break;
            case modificarProveedor:
                if (JOptionPane.showConfirmDialog(this.v.Frame_Proveedor, "¿Desea modificar el Proveedor: " + this.v.eti_Modificar_Proveedor_CIF.getText() + "?") == 0) {
                    m.modifyProveedor(this.v.eti_Modificar_Proveedor_CIF.getText(), this.v.txt_Modificar_Proveedor_DSocial.getText(), this.v.txt_Modificar_Proveedor_Telefono.getText(), this.v.txt_Modificar_Proveedor_Correo.getText());
                    this.tablaMenuPrincipal = "proveedores";
                    this.v.tbl_Tabla_Principal.setModel(this.m.getTableModel("proveedor"));
                    this.v.tbl_Tabla_Modificar_Proveedor.setModel(this.m.getTableModel("proveedor"));
                    this.v.tbl_Eliminar_Proveedor.setModel(this.m.getTableModel("proveedor"));
                    Clean();
                }
                break;
            case buscarTablaEliminarProveedor:
                this.v.tbl_Eliminar_Proveedor.setModel(m.getTableModelByArrayList(m.getProveedoresByQuestion(this.v.txt_Modificar_Proveedor_Buscar.getText()), "proveedores"));
                break;
            case eliminarProveedor:
                if (JOptionPane.showConfirmDialog(this.v.Frame_Proveedor, "¿Desea eliminar el Proveedor: " + this.v.tbl_Eliminar_Proveedor.getValueAt(this.v.tbl_Eliminar_Proveedor.getSelectedRow(), 0).toString() + "?") == 0) {
                    m.deleteProveedor(this.v.tbl_Eliminar_Proveedor.getValueAt(this.v.tbl_Eliminar_Proveedor.getSelectedRow(), 0).toString());
                    this.tablaMenuPrincipal = "proveedores";
                    this.v.tbl_Tabla_Principal.setModel(this.m.getTableModel("proveedor"));
                    this.v.tbl_Tabla_Modificar_Proveedor.setModel(this.m.getTableModel("proveedor"));
                    this.v.tbl_Eliminar_Proveedor.setModel(this.m.getTableModel("proveedor"));
                    break;
                }

//Menu Articulos---------------------------------------------------------------------------------------------------------------------------------------                
            
            case cerrarFrameArticulo:
                this.v.Frame_Articulo.setVisible(false);
                Clean();
                break;
            case insertarArticulo:
                if (JOptionPane.showConfirmDialog(this.v.Frame_Articulo, "¿Desea introducir el Articulo?") == 0) {
                    m.insertArticulo(this.v.txt_Crear_Articulo_Nombre.getText(), Double.parseDouble(this.v.txt_Crear_Articulo_Precio.getText()), Integer.parseInt(this.v.spinner_Crear_Articulo_Cantidad.getValue().toString()));
                    this.tablaMenuPrincipal = "articulos";
                    this.v.tbl_Tabla_Principal.setModel(this.m.getTableModel("articulo"));
                    this.v.tbl_Tabla_Modificar_Articulo.setModel(this.m.getTableModel("articulo"));
                    this.v.tbl_Eliminar_Articulo.setModel(this.m.getTableModel("articulo"));
                    Clean();
                }
                break;
            case buscarTablaModificarArticulo:
                this.v.tbl_Tabla_Modificar_Articulo.setModel(m.getTableModelByArrayList(m.getArticulosByQuestion(this.v.txt_Modificar_Articulo_Buscar.getText()), "articulos"));
                break;
            case modificarArticulo:
                if (JOptionPane.showConfirmDialog(this.v.Frame_Articulo, "¿Desea modificar el Articulo" + this.v.txt_Modificar_Articulo_Nombre.getText() + "?") == 0) {
                    double decimal = Double.parseDouble(String.valueOf(this.v.txt_Modificar_Articulo_Precio.getText()));
                    int value = (Integer) this.v.sp_Modificar_Articulo_Spinner.getValue();
                    int id = Integer.parseInt(String.valueOf(this.v.eti_Modificar_Articulo_ID.getText()));
                    m.modifyArticulo(id, this.v.txt_Modificar_Articulo_Nombre.getText(), decimal, value);
                    this.tablaMenuPrincipal = "articulos";
                    this.v.tbl_Tabla_Principal.setModel(this.m.getTableModel("articulo"));
                    this.v.tbl_Tabla_Modificar_Articulo.setModel(this.m.getTableModel("articulo"));
                    this.v.tbl_Eliminar_Articulo.setModel(this.m.getTableModel("articulo"));
                    Clean();
                }
                break;

            case buscarTablaEliminarArticulo:
                this.v.tbl_Eliminar_Articulo.setModel(m.getTableModelByArrayList(m.getArticulosByQuestion(this.v.txt_Modificar_Articulo_Buscar.getText().toString()), "articulos"));
                break;

            case eliminarArticulo:
                if (JOptionPane.showConfirmDialog(this.v.Frame_Articulo, "¿Desea eliminar el Articulo:" + this.v.tbl_Eliminar_Articulo.getValueAt(this.v.tbl_Eliminar_Articulo.getSelectedRow(), 0).toString() + "?") == 0) {
                    m.deleteArticulo(Integer.parseInt(this.v.tbl_Eliminar_Articulo.getValueAt(this.v.tbl_Eliminar_Articulo.getSelectedRow(), 0).toString()));
                    this.tablaMenuPrincipal = "articulos";
                    this.v.tbl_Tabla_Principal.setModel(this.m.getTableModel("articulo"));
                    this.v.tbl_Tabla_Modificar_Articulo.setModel(this.m.getTableModel("articulo"));
                    this.v.tbl_Eliminar_Articulo.setModel(this.m.getTableModel("articulo"));
                }

                break;

//Menu Gastos---------------------------------------------------------------------------------------------------------------------------------------
            
            case cerrarFrameGastos:
                this.v.Frame_Gastos.setVisible(false);
                break;
                
//Menu CobrosPagos-----------------------------------------------------------------------------------------------------------------                

            case cerrarFrameCobrosPagos:
                this.v.Frame_CobrosPagos.setVisible(false);
                break;
//            case cambiarFechaCobros:
////                this.v.tbl_CobrosPagos.setModel(m.getTableModel("cobro"));
//                this.v.tbl_CobrosPagos.setModel(this.m.getTableModelByArrayList(m.getCobroByFecha("%/"+this.v.cbox_CobrosPagos_MesAno.getSelectedItem().toString()), "cobros"));
//                break;

//Menu Configuracion Ver datos Empresa---------------------------------------------------------------------------------------------------                

            case cerrarConfig:
                this.v.Frame_DatosEmpresa.setVisible(false);
                break;
            case modificarConfig:

                int resul = JOptionPane.showConfirmDialog(this.v.Frame_DatosEmpresa, "¿Desea modificarlos siguientes campos? \n"
                        + "Nombre: " + this.v.txt_DatosEmpresa_Nombre.getText() + "\n"
                        + "Correo: " + this.v.txt_DatosEmpresa_Correo.getText() + "\n"
                        + "Direccion: " + this.v.txt_DatosEmpresa_Direccion.getText() + "\n"
                        + "IVA: " + this.v.txt_DatosEmpresa_Iva.getText());
                if (resul == 0) {
                    LectorProperties.setPropiedad(this.v.txt_DatosEmpresa_Nombre.getText(),
                            this.v.txt_DatosEmpresa_Correo.getText(),
                            this.v.txt_DatosEmpresa_Direccion.getText(),
                            this.v.txt_DatosEmpresa_Iva.getText());
                    this.v.eti_DatosEmpresa_Nombre.setText(LectorProperties.getPropiedad("NOMBRE"));
                    this.v.eti_DatosEmpresa_Correo.setText(LectorProperties.getPropiedad("CORREO"));
                    this.v.eti_DatosEmpresa_Direccion.setText(LectorProperties.getPropiedad("DIRECCION"));
                    this.v.eti_DatosEmpresa_Iva.setText(LectorProperties.getPropiedad("IVA"));

                }
                break;

//Pedidos -----------------------------------------------------------------------------------------------------------------------
           
            case btnAñadirArticuloPedido:
                if(this.v.rad_Pedido_Cliente.isSelected()) {
                    if ((int) this.v.sp_Pedido_SpinnerCantidad.getValue() > 0 && (int) this.v.sp_Pedido_SpinnerCantidad.getValue() <= art_Cantidad) {
                        this.v.tbl_Pedido_ArticulosPedidos.setModel(m.insertarRowCliente(art_Codigo, art_Nombre, art_Precio, (int) this.v.sp_Pedido_SpinnerCantidad.getValue(), art_Cantidad, (DefaultTableModel) this.v.tbl_Pedido_ArticulosPedidos.getModel()));
                        m.borrarRowCliente((DefaultTableModel) this.v.tbl_Pedido_Articulos.getModel(), row, (int) this.v.sp_Pedido_SpinnerCantidad.getValue(), art_Cantidad);
                        art_Codigo = 0;
                        art_Nombre = "";
                        art_Precio = 0;
                        art_Cantidad = 0;
                        this.v.eti_Presupuesto.setText("" + m.getSumaPresupuesto() + "€");
                    }
                } else if (this.v.rad_Pedido_Proveedor.isSelected()) {
                    if ((int) this.v.sp_Pedido_SpinnerCantidad.getValue() > 0 && (int) this.v.sp_Pedido_SpinnerCantidad.getValue() <= art_Cantidad) {
                        this.v.tbl_Pedido_ArticulosPedidos.setModel(m.insertarRowProveedor(art_Codigo, art_Nombre, art_Precio, (int) this.v.sp_Pedido_SpinnerCantidad.getValue(), art_Cantidad, (DefaultTableModel) this.v.tbl_Pedido_ArticulosPedidos.getModel()));
                        m.borrarRowProveedor((DefaultTableModel) this.v.tbl_Pedido_Articulos.getModel(), row, (int) this.v.sp_Pedido_SpinnerCantidad.getValue(), art_Cantidad);
                        art_Codigo = 0;
                        art_Nombre = "";
                        art_Precio = 0;
                        art_Cantidad = 0;
                        this.v.eti_Presupuesto.setText("" + m.getSumaPresupuesto() + "€");
                    }
                }
                break;
            case btnQuitarArticuloPedido:
                limpiarArticulosPedidos();
                break;
            case radioPedidoCliente:
                this.v.pnl_Pedido_ClienteProveedor.removeAll();
                this.v.pnl_Pedido_ClienteProveedor.add(this.v.pnl_Pedido_Contenedor_Cliente, BorderLayout.CENTER);
                this.v.pnl_Pedido_ClienteProveedor.revalidate();
                this.v.pnl_Pedido_ClienteProveedor.repaint();
                limpiarArticulosPedidos();
                break;
            case radioPedidoProveedor:
                this.v.pnl_Pedido_ClienteProveedor.removeAll();
                this.v.pnl_Pedido_ClienteProveedor.add(this.v.pnl_Pedido_Contenedor_Proveedor, BorderLayout.CENTER);
                this.v.pnl_Pedido_ClienteProveedor.revalidate();
                this.v.pnl_Pedido_ClienteProveedor.repaint();
                limpiarArticulosPedidos();
                break;
            case hacerPedido:
                if (fila_Cliente_Pedido >= 0 && this.v.tbl_Pedido_ArticulosPedidos.getRowCount() > 0) {
                    if (this.v.rad_Pedido_Cliente.isSelected()) {
                        this.v.Frame_Pedido.setVisible(false);
                        this.v.Frame_Factura.setVisible(true);
                        this.v.Frame_Factura.setSize(705, 500);
                        this.v.Frame_Factura.setLocationRelativeTo(v);

                        this.v.pnl_Factura_ClienteProveedor.removeAll();
                        this.v.pnl_Factura_ClienteProveedor.add(this.v.pnl_Factura_Cliente, BorderLayout.CENTER);
                        this.v.pnl_Factura_ClienteProveedor.revalidate();
                        this.v.pnl_Factura_ClienteProveedor.repaint();

                        rellenarFacturaCliente();
                    }
                } else if(fila_Proveedor_Pedido >= 0 && this.v.tbl_Pedido_ArticulosPedidos.getRowCount() > 0)
                {
                    if(this.v.rad_Pedido_Proveedor.isSelected())
                    {
                        this.v.Frame_Pedido.setVisible(false);
                        this.v.Frame_Factura.setVisible(true);
                        this.v.Frame_Factura.setSize(705, 500);
                        this.v.Frame_Factura.setLocationRelativeTo(v);
                        
                        this.v.pnl_Factura_ClienteProveedor.removeAll();
                        this.v.pnl_Factura_ClienteProveedor.add(this.v.pnl_Factura_Proveedor, BorderLayout.CENTER);
                        this.v.pnl_Factura_ClienteProveedor.revalidate();
                        this.v.pnl_Factura_ClienteProveedor.repaint();
                    }
                }else {
                    JOptionPane.showMessageDialog(null, "Tienes que seleccionar algun cliente o un proveedor para poder realizar el pedido.");
                }
                if (fila_Proveedor_Pedido >= 0 && this.v.tbl_Pedido_ArticulosPedidos.getRowCount() > 0) {
                    if (this.v.rad_Pedido_Proveedor.isSelected()) {
                        this.v.Frame_Pedido.setVisible(false);
                        this.v.Frame_Factura.setVisible(true);
                        this.v.Frame_Factura.setSize(705, 500);
                        this.v.Frame_Factura.setLocationRelativeTo(v);

                        this.v.pnl_Factura_ClienteProveedor.removeAll();
                        this.v.pnl_Factura_ClienteProveedor.add(this.v.pnl_Factura_Proveedor, BorderLayout.CENTER);
                        this.v.pnl_Factura_ClienteProveedor.revalidate();
                        this.v.pnl_Factura_ClienteProveedor.repaint();
                        rellenarFacturaProveedor();
                    }
                }
                DefaultTableModel t4 = (DefaultTableModel) this.v.tbl_Factura.getModel();

                for (int i = 0; i < this.v.tbl_Factura.getRowCount(); i++) {
                    t4.removeRow(i);
                    i -= 1;
                }
                this.v.tbl_Factura.setModel(m.rellenarProforma((DefaultTableModel) this.v.tbl_Factura.getModel(), (DefaultTableModel) this.v.tbl_Pedido_ArticulosPedidos.getModel()));
                this.v.eti_Factura_Base.setText("" + m.getSumaBase((DefaultTableModel) this.v.tbl_Factura.getModel()) + "");
                this.v.eti_Factura_IVA.setText("" + m.getSumaIva((DefaultTableModel) this.v.tbl_Factura.getModel()) + "");
                this.v.eti_Factura_Total.setText("" + m.getSumaTotal((DefaultTableModel) this.v.tbl_Factura.getModel()) + "");
                break;

            case cancelarFactura:
                this.v.Frame_Factura.setVisible(false);
                this.v.Frame_Pedido.setVisible(true);
                break;
            case confirmarFactura:
                    Calendar fecha = Calendar.getInstance();
                    now= fecha.get(Calendar.DAY_OF_WEEK)+"/"+fecha.get(Calendar.MONTH)+"/"+fecha.get(Calendar.YEAR);
                    System.out.println(""+now);
                    
                    double base = Double.parseDouble(this.v.eti_Factura_Base.getText());
                    double iva = Double.parseDouble(this.v.eti_Factura_IVA.getText());
                    
                    boolean insertado = false;

                    ArrayList<ArticuloPedido> arrayList=new ArrayList<ArticuloPedido>();
                    
                if (this.v.rad_Pedido_Cliente.isSelected() && JOptionPane.showConfirmDialog(null, "¿Estas seguro de realizar el pedido?") == 0) {
                    
                    m.insertDocumentoCliente(m.getClienteByDni(this.v.eti_Factura_Cliente_Dni.getText()), "Cliente", now, base, iva, (base + iva));
                    Iterator it = m.getDocumentos().iterator();
                    int codigo =0;
                    while(it.hasNext()){
                        Documento d= (Documento) it.next();
                        codigo = d.getCodigo();
                    }
                    for(int i=0;i<this.v.tbl_Pedido_ArticulosPedidos.getRowCount();i++){
                        
                        int cod_articulo = (int) this.v.tbl_Pedido_ArticulosPedidos.getValueAt(i, 0);
                        int cantidad = (int) this.v.tbl_Pedido_ArticulosPedidos.getValueAt(i, 3);
                        m.insertArticuloPedido(cod_articulo, codigo, cantidad);
                        arrayList.add(m.getArticuloPedido(cod_articulo, codigo));
                        m.modifyArticulo(cod_articulo, this.v.tbl_Pedido_ArticulosPedidos.getValueAt(i, 1).toString(), (double) this.v.tbl_Pedido_ArticulosPedidos.getValueAt(i, 2), (int) this.v.tbl_Pedido_Articulos.getValueAt(i, 3));
                    }
                    insertado = true;
                } else if (this.v.rad_Pedido_Proveedor.isSelected() && JOptionPane.showConfirmDialog(null, "¿Estas seguro de realizar el pedido?") == 0) {
                    m.insertDocumentoProveedor(m.getProveedorByCif(this.v.eti_Factura_Proveedor_Cif.getText()), "Proveedor", now, base, iva, (base + iva));
                    
                    Iterator it = m.getDocumentos().iterator();
                    int codigo =0;
                    while(it.hasNext()){
                        Documento d= (Documento) it.next();
                        codigo = d.getCodigo();
                    }
                    for(int i=0;i<this.v.tbl_Pedido_ArticulosPedidos.getRowCount();i++){
                        
                        int cod_articulo = (int) this.v.tbl_Pedido_ArticulosPedidos.getValueAt(i, 0);
                        int cantidad = (int) this.v.tbl_Pedido_ArticulosPedidos.getValueAt(i, 3);
                        m.insertArticuloPedido(cod_articulo, codigo, cantidad);
                        arrayList.add(m.getArticuloPedido(cod_articulo, codigo));
                        m.modifyArticulo(cod_articulo, this.v.tbl_Pedido_ArticulosPedidos.getValueAt(i, 1).toString(), (double) this.v.tbl_Pedido_ArticulosPedidos.getValueAt(i, 2), (int) this.v.tbl_Pedido_Articulos.getValueAt(i, 3));
                    }
                    
                    
                    
                    insertado = true;
                }
                if (insertado == true && this.v.rad_Pedido_Cliente.isSelected()) {
                    int result = this.v.jFileChooser.showSaveDialog(this.v.jFileChooser);
                    if (result == this.v.jFileChooser.APPROVE_OPTION) {

                        generatePDF g = new generatePDF();
                        double suma = Double.parseDouble(this.v.eti_Factura_Total.getText());
                        if (this.v.rad_Pedido_Cliente.isSelected()) {
                            g.generatePDFFactura(this.v.jFileChooser.getSelectedFile().getAbsolutePath(), m.getClienteByDni(this.v.eti_Factura_Cliente_Dni.getText()), arrayList , suma);
                        }
                    }
                    this.v.Frame_Factura.setVisible(false);
                }
                break;
            case cerrarFramePedido:
                this.v.Frame_Pedido.setVisible(false);
                limpiarArticulosPedidos();
                break;

//Proforma- - - - - - -   - --- -  - - - -  - --------------------------------------------------------------------------
            
            case mostrarFrameProforma:
                this.v.Frame_Proforma.setVisible(true);
                this.v.Frame_Proforma.setSize(700, 600);
                this.v.Frame_Proforma.setLocationRelativeTo(v);
                DefaultTableModel t3 = (DefaultTableModel) this.v.tbl_Proforma.getModel();

                for (int i = 0; i < this.v.tbl_Proforma.getRowCount(); i++) {
                    t3.removeRow(i);
                    i -= 1;
                }
                this.v.tbl_Proforma.setModel(m.rellenarProforma((DefaultTableModel) this.v.tbl_Proforma.getModel(), (DefaultTableModel) this.v.tbl_Pedido_ArticulosPedidos.getModel()));
                this.v.eti_Proforma_TOTAL.setText("" + (m.getSumaPresupuesto() * 0.21 + m.getSumaPresupuesto()));
                break;
            case salirFrameProforma:
                this.v.Frame_Proforma.setVisible(false);
                break;

        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

//Recogedores de Fila de tabla seleccionada------------------------------------------------------------------------------------------
        
        fila_Articulo = this.v.tbl_Tabla_Modificar_Articulo.getSelectedRow();
        fila_Cliente = this.v.tbl_Tabla_Modificar_Cliente.getSelectedRow();
        fila_Proveedor = this.v.tbl_Tabla_Modificar_Proveedor.getSelectedRow();
        fila_Cliente_Pedido = this.v.tbl_Pedido_Cliente_Busqueda.getSelectedRow();
        fila_Proveedor_Pedido = this.v.tbl_Pedido_Proveedor_Busqueda.getSelectedRow();

        fila_Articulos = this.v.tbl_Pedido_Articulos.getSelectedRow();

//Tabla Articulo Modificar----------------------------------------------------------------------------------------------------------        
       
        if (fila_Articulo >= 0) {
            System.out.println("Estas en Tab ==Modificar Articulo");
            this.v.eti_Modificar_Articulo_ID.setText("" + v.tbl_Tabla_Modificar_Articulo.getValueAt(fila_Articulo, 0));
            this.v.txt_Modificar_Articulo_Nombre.setText("" + v.tbl_Tabla_Modificar_Articulo.getValueAt(fila_Articulo, 1));
            this.v.txt_Modificar_Articulo_Precio.setText("" + v.tbl_Tabla_Modificar_Articulo.getValueAt(fila_Articulo, 2));
            this.v.sp_Modificar_Articulo_Spinner.setValue(v.tbl_Tabla_Modificar_Articulo.getValueAt(fila_Articulo, 3));
        }

//Tabla Cliente Modificar------------------------------------------------------------------------------------------------------------        
       
        if (fila_Cliente >= 0) {
            System.out.println("Estas en Tab ==Modificar Cliene");
            this.v.eti_Modificar_Cliente_Dni_antiguo.setText("" + v.tbl_Tabla_Modificar_Cliente.getValueAt(fila_Cliente, 0));
            this.v.txt_Modificar_Cliente_Nombre.setText("" + v.tbl_Tabla_Modificar_Cliente.getValueAt(fila_Cliente, 1));
            this.v.txt_Modificar_Cliente_Apellidos.setText("" + v.tbl_Tabla_Modificar_Cliente.getValueAt(fila_Cliente, 2));
            this.v.txt_Modificar_Cliente_Domicilio.setText("" + v.tbl_Tabla_Modificar_Cliente.getValueAt(fila_Cliente, 3));
            this.v.txt_Modificar_Cliente_Correo.setText("" + v.tbl_Tabla_Modificar_Cliente.getValueAt(fila_Cliente, 4));
            this.v.txt_Modificar_Cliente_Telefono.setText("" + v.tbl_Tabla_Modificar_Cliente.getValueAt(fila_Cliente, 5));
        }

//Tabla Proveedor Modificar------------------------------------------------------------------------------------------------------------------
       
        if (fila_Proveedor >= 0) {
            System.out.println("Estas en Tab ==Modificar Cliene");
            this.v.eti_Modificar_Proveedor_CIF.setText("" + v.tbl_Tabla_Modificar_Proveedor.getValueAt(fila_Proveedor, 0));
            this.v.txt_Modificar_Proveedor_DSocial.setText("" + v.tbl_Tabla_Modificar_Proveedor.getValueAt(fila_Proveedor, 1));
            this.v.txt_Modificar_Proveedor_Telefono.setText("" + v.tbl_Tabla_Modificar_Proveedor.getValueAt(fila_Proveedor, 2));
            this.v.txt_Modificar_Proveedor_Correo.setText("" + v.tbl_Tabla_Modificar_Proveedor.getValueAt(fila_Proveedor, 3));
        }

//Tabla Pedido Seleccion de Cliente-------------------------------------------------------------------------------------------------------------        
       
        if (fila_Cliente_Pedido >= 0) {
            System.out.println("Estas en Tab ==Tabla Cliente Pedido");
            this.v.eti_Pedido_Cliente_Dni.setText("" + v.tbl_Pedido_Cliente_Busqueda.getValueAt(fila_Cliente_Pedido, 0));
            this.v.eti_Pedido_Cliente_Nombre.setText("" + v.tbl_Pedido_Cliente_Busqueda.getValueAt(fila_Cliente_Pedido, 1));
            this.v.eti_Pedido_Cliente_Apellidos.setText("" + v.tbl_Pedido_Cliente_Busqueda.getValueAt(fila_Cliente_Pedido, 2));
            this.v.eti_Pedido_Cliente_Domicilio.setText("" + v.tbl_Pedido_Cliente_Busqueda.getValueAt(fila_Cliente_Pedido, 3));
            this.v.eti_Pedido_Cliente_Correo.setText("" + v.tbl_Pedido_Cliente_Busqueda.getValueAt(fila_Cliente_Pedido, 4));
            this.v.eti_Pedido_Cliente_Telefono.setText("" + v.tbl_Pedido_Cliente_Busqueda.getValueAt(fila_Cliente_Pedido, 5));
        }

//Tabla Pedido Seleccion de Proveedor-----------------------------------------------------------------------------------------------------------        
       
        if (fila_Proveedor_Pedido >= 0) {
            System.out.println("Estas en Tab == Tabla Proveedor Pedido");
            this.v.eti_Pedido_Proveedor_CIF.setText("" + v.tbl_Pedido_Proveedor_Busqueda.getValueAt(fila_Proveedor_Pedido, 0));
            this.v.eti_Pedido_Proveedor_DSocial.setText("" + v.tbl_Pedido_Proveedor_Busqueda.getValueAt(fila_Proveedor_Pedido, 1));
        }

//Tabla Seleccion de Articulos para hacer Pedido--------------------------------------------------------------------------------------------------        
       
        if (fila_Articulos >= 0) {
            art_Codigo = (int) this.v.tbl_Pedido_Articulos.getValueAt(fila_Articulos, 0);
            art_Nombre = this.v.tbl_Pedido_Articulos.getValueAt(fila_Articulos, 1).toString();
            art_Precio = (double) this.v.tbl_Pedido_Articulos.getValueAt(fila_Articulos, 2);
            art_Cantidad = (int) this.v.tbl_Pedido_Articulos.getValueAt(fila_Articulos, 3);
            System.out.println("" + art_Codigo + " " + art_Nombre + " " + art_Precio + " " + art_Cantidad);
            row = this.v.tbl_Pedido_Articulos.getSelectedRow();
        }
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

//Metodo Clean para limpiar Campos de Texto--------------------------------------------------------------------------------------------------------    
    
    public void Clean() {
        //Limpiar Articulo
        //limpiar crear articulo
        this.v.txt_Crear_Articulo_Nombre.setText("");
        this.v.txt_Crear_Articulo_Precio.setText("");
        this.v.spinner_Crear_Articulo_Cantidad.setValue(0);
        //limpiar modificar articulo
        this.v.eti_Modificar_Articulo_ID.setText("");
        this.v.txt_Modificar_Articulo_Buscar.setText("");
        this.v.txt_Modificar_Articulo_Nombre.setText("");
        this.v.txt_Modificar_Articulo_Precio.setText("");
        this.v.sp_Modificar_Articulo_Spinner.setValue(0);
        //limpiar eliminar articulo
        this.v.txt_Eliminar_Articulo_Buscar.setText("");

        //Limpiar Cliente
        //limpiar crear cliente
        this.v.txt_Crear_Cliente_Apellidos.setText("");
        this.v.txt_Crear_Cliente_Correo.setText("");
        this.v.txt_Crear_Cliente_Dni.setText("");
        this.v.txt_Crear_Cliente_Domicilio.setText("");
        this.v.txt_Crear_Cliente_Nombre.setText("");
        this.v.txt_Crear_Cliente_Telefono.setText("");
        //limpiar modificar cliente
        this.v.eti_Modificar_Cliente_Dni_antiguo.setText("");
        this.v.txt_Modificar_Cliente_Apellidos.setText("");
        this.v.txt_Modificar_Cliente_Correo.setText("");
        this.v.txt_Modificar_Cliente_Domicilio.setText("");
        this.v.txt_Modificar_Cliente_Nombre.setText("");
        this.v.txt_Modificar_Cliente_Telefono.setText("");
        //limpiar eliminar cliente
        this.v.txt_Eliminar_Cliente_Buscar.setText("");

        //Limpiar Proveedor 
        //limpiar crear proveedor
        this.v.txt_Crear_Proveedor_Cif.setText("");
        this.v.txt_Crear_Proveedor_Correo.setText("");
        this.v.txt_Crear_Proveedor_DSocial.setText("");
        this.v.txt_Crear_Proveedor_Telefono.setText("");
        //limpiar modificar proveedor
        this.v.txt_Modificar_Proveedor_Buscar.setText("");
        this.v.txt_Modificar_Proveedor_Correo.setText("");
        this.v.txt_Modificar_Proveedor_DSocial.setText("");
        this.v.txt_Modificar_Proveedor_Telefono.setText("");
        //limpiar eliminar proveedor
        this.v.txt_Eliminar_Proveedor_Buscar.setText("");
        //Limpiar DatosEmpresa
        //limpiar cambos Modificar Config
        this.v.txt_DatosEmpresa_Correo.setText("");
        this.v.txt_DatosEmpresa_Nombre.setText("");
        this.v.txt_DatosEmpresa_Direccion.setText("");
        this.v.txt_DatosEmpresa_Iva.setText("");
    }

//Metodo para Controlar los TextFields de la aplicacion--------------------------------------------------------------------------------------------    
    
    public void restriccionesTextFields() {
        //Restricciones Frame Articulo
        //Crear
        RestrictedTextField resCrearArticuloPrecio = new RestrictedTextField(this.v.txt_Crear_Articulo_Precio);
        resCrearArticuloPrecio.setOnlyNums(true);
        //Modificar
        RestrictedTextField resModificarArticuloPrecio = new RestrictedTextField(this.v.txt_Modificar_Articulo_Precio);
        resModificarArticuloPrecio.setOnlyNums(true);

        //Restricciones Frame Cliente
        //Crear
        RestrictedTextField resCrearClienteNombre = new RestrictedTextField(this.v.txt_Crear_Cliente_Nombre);
        resCrearClienteNombre.setOnlyText(true);
        RestrictedTextField resCrearClienteApellidos = new RestrictedTextField(this.v.txt_Crear_Cliente_Apellidos);
        resCrearClienteApellidos.setOnlyText(true);
        RestrictedTextField resCrearClienteDni = new RestrictedTextField(this.v.txt_Crear_Cliente_Dni);
        resCrearClienteDni.setLimit(9);
        RestrictedTextField resCrearClienteTelefono = new RestrictedTextField(this.v.txt_Crear_Cliente_Telefono);
        resCrearClienteTelefono.setOnlyNums(true);
        resCrearClienteTelefono.setLimit(9);
        //Modificar
        RestrictedTextField resModificarClienteNombre = new RestrictedTextField(this.v.txt_Modificar_Cliente_Nombre);
        resModificarClienteNombre.setOnlyText(true);
        RestrictedTextField resModificarClienteApellidos = new RestrictedTextField(this.v.txt_Modificar_Cliente_Apellidos);
        resModificarClienteApellidos.setOnlyText(true);
        RestrictedTextField resModificarClienteTelefono = new RestrictedTextField(this.v.txt_Modificar_Cliente_Telefono);
        resModificarClienteTelefono.setOnlyNums(true);
        resModificarClienteTelefono.setLimit(9);

        //Restricciones Frame Proveedor
        RestrictedTextField resCrearProveedorTelefono = new RestrictedTextField(this.v.txt_Crear_Proveedor_Telefono);
        resCrearProveedorTelefono.setLimit(9);
        resCrearProveedorTelefono.setOnlyNums(true);
        RestrictedTextField resModificarProveedorTelefono = new RestrictedTextField(this.v.txt_Modificar_Proveedor_Telefono);
        resModificarProveedorTelefono.setLimit(9);
        resModificarProveedorTelefono.setOnlyNums(true);
        //Restricciones Frame Configuracion
        RestrictedTextField resConfigIVA = new RestrictedTextField(this.v.txt_DatosEmpresa_Iva);
        resConfigIVA.setOnlyNums(true);
        resConfigIVA.setLimit(2);
    }

//Metodo para rellenar Labels de Factura_Cliente------------------------------------------------------------------------------------------------    
   
    public void rellenarFacturaCliente() {
        this.v.eti_Factura_Cliente_Dni.setText(this.v.eti_Pedido_Cliente_Dni.getText());
        this.v.eti_Factura_Cliente_Nombre.setText(this.v.eti_Pedido_Cliente_Nombre.getText());
        this.v.eti_Factura_Cliente_Apellidos.setText(this.v.eti_Pedido_Cliente_Apellidos.getText());
        this.v.eti_Factura_Cliente_Domicilio.setText(this.v.eti_Pedido_Cliente_Domicilio.getText());
        this.v.eti_Factura_Cliente_Correo.setText(this.v.eti_Pedido_Cliente_Correo.getText());
        this.v.eti_Factura_Cliente_Telefono.setText(this.v.eti_Pedido_Cliente_Telefono.getText());

    }

//Metodo para rellenar Labels de Factura_Proveedor----------------------------------------------------------------------------------------------------    
   
    public void rellenarFacturaProveedor() {
        this.v.eti_Factura_Proveedor_Cif.setText(this.v.eti_Pedido_Proveedor_CIF.getText());
        this.v.eti_Factura_Proveedor_DSocial.setText(this.v.eti_Pedido_Proveedor_DSocial.getText());
    }
    
    public void limpiarArticulosPedidos()
    {
        DefaultTableModel t = (DefaultTableModel) this.v.tbl_Pedido_ArticulosPedidos.getModel();

        for (int i = 0; i < this.v.tbl_Pedido_ArticulosPedidos.getRowCount(); i++) {
            t.removeRow(i);
            i -= 1;
        }
        DefaultTableModel t2 = (DefaultTableModel) this.v.tbl_Proforma.getModel();

        for (int i = 0; i < this.v.tbl_Proforma.getRowCount(); i++) {
            t2.removeRow(i);
            i -= 1;
        }
        this.v.tbl_Pedido_ArticulosPedidos.setModel(t);
        this.v.tbl_Pedido_Articulos.setModel(this.m.getTableModel("articulo"));

        this.v.eti_Presupuesto.setText("0");
        m.setSumaPresupuesto(0);
    }

}
