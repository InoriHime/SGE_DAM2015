
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
        principalCargarTablaClientes
    }
    
    public void iniciarMain() {
           try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(v);
            this.v.setLocationRelativeTo(null);
            v.setVisible(true);
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {}
        
        
        this.v.btn_principal_articulos.setActionCommand("principalCargarTablaArticulos");
        this.v.btn_principal_articulos.addActionListener(this);
        this.v.btn_principal_clientes.setActionCommand("principalCargarTablaClientes");
        this.v.btn_principal_clientes.addActionListener(this);
        
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
        }
    }
      
    
}
