/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import GUI.*;
import Procesos.*;

/**
 *
 * @author roban
 */
public class Factory {

    //Instancia de Procesos
    public SimplexMAX simplexMAX() {
        return new SimplexMAX();
    }

    //Instancia de la GUI
    /*public Principal principal() {
        return new Principal();
    }*/

    public GUI_Maximizacion gui_max() {
        return new GUI_Maximizacion();
    }

    /*public PuntoFijo puntoFijo() {
        return new PuntoFijo();
    }

    public BisectrizGUI bisectrizGUI() {
        return new BisectrizGUI();
    }*/
}
