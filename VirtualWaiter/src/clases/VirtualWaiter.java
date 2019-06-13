/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.SQLException;
import login.login;

/**
 *
 * @author John
 */
public class VirtualWaiter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        login vent1 = new login();
        abrir(vent1); 
        vent1.cargaitem();
    }
    public static void abrir(login vent1){
       int [] ta = {vent1.getSize().height,vent1.getSize().width};
       vent1.setSize(ta[1], ta[0]);		
       vent1.setLocationRelativeTo(null);
       vent1.setVisible(true);
    } 
}
