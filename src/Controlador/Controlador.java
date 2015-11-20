
package Controlador;

import Modelo.Modelo;
import Vistas.Vista_Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Controlador implements ActionListener{
    
Vista_Principal v;
Modelo m;

    public Controlador(Vista_Principal vista) {
      this.v=vista;
    }

    

    public enum Acciones{
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
        mostrarFrameConfig
    }
    
    public void iniciarMain() {
           try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(v);
            this.v.setLocationRelativeTo(null);
            v.setVisible(true);
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {}
        
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
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(Acciones.valueOf(e.getActionCommand())){
            case principalCargarTablaArticulos:
                this.v.tbl_Tabla_Principal.setModel(this.m.getTableModel("articulo"));
                break;
            case principalCargarTablaClientes:
                this.v.tbl_Tabla_Principal.setModel(this.m.getTableModel("cliente"));
                break;
            case principalCargarTablaProveedores:
                this.v.tbl_Tabla_Principal.setModel(this.m.getTableModel("proveedor"));
                break;
            case principalCargarTablaPedidos:
                this.v.tbl_Tabla_Principal.setModel(this.m.getTableModel("articulo_pedido"));
                break;
            case principalBuscarEnTablaPrincipal:
                
                break;
            case mostrarFrameArticulo:
                this.v.Frame_Articulo.setVisible(true);
                break;
            case mostrarFrameCliente:
                this.v.Frame_Cliente.setVisible(true);
                break;
            case mostrarFrameProveedor:
                this.v.Frame_Proveedor.setVisible(true);
                break;
            case mostrarFramePedido:
                this.v.Frame_Pedido.setVisible(true);
                break;
            case mostrarFrameGastos:
                this.v.Frame_Gastos.setVisible(true);
                break;
            case mostrarFrameCobrosPagos:
                this.v.Frame_CobrosPagos.setVisible(true);
                break;
            case mostrarFrameConfig:
                this.v.Frame_DatosEmpresa.setVisible(true);
                break;
        }
    }
      
    
}
