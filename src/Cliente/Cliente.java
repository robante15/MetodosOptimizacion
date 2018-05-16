package Cliente;
import Factory.Factory;
import GUI.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roban
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    
    private static Factory factory;
    
    public static void main(String[] args) {
        factory = new Factory();
        GUI_Maximizacion GUI_Max = factory.gui_max();
        GUI_Max.setVisible(true);
    }
    
}
