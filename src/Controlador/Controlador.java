
package Controlador;

import Modelo.Modelo;
import Vistas.Vista_Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{
    
Vista_Principal v;
Modelo m = new Modelo();

    public Controlador(Vista_Principal vista) {
      this.v=vista;
    }

    

    public enum Acciones{
        principalCargarTablaArticulos
    }
    
    public void iniciarMain() {
        this.v.setVisible(true);
        
        this.v.tbl_Tabla_Principal.setModel(this.m.getTableModel("articulo"));
        
        this.v.btn_principal_articulos.setActionCommand("principalCargarTablaArticulos");
        this.v.btn_principal_articulos.addActionListener(this);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(Acciones.valueOf(e.getActionCommand())){
            case principalCargarTablaArticulos:
                
                break;
        }
    }
      
    
}
