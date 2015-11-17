/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vistas.Vista_Principal;

/**
 *
 * @author MrDrulix
 */
public class Controlador {
    
Vista_Principal v;

    public Controlador(Vista_Principal vista) {
      this.v=vista;
    }

    public void iniciarMain() {
        this.v.setVisible(true);
        
    }
    
}
