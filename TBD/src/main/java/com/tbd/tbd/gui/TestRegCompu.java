
        
package com.tbd.tbd.gui;

import com.tbd.tbd.conexion.Conexion;
import com.tbd.tbd.usuarios.Usuario;
import java.sql.Connection;



public class TestRegCompu {
    
    private static Usuario usr;
    
    public static void main(String args[]){
        Connection c = Conexion.getConnection();
        usr = new Usuario(69, 999);
        
        /*
        VentanaRegistroComp v = new VentanaRegistroComp(usr, c);
        v.setVisible(true);
        */
        
        VentanaMostImg v = new VentanaMostImg(usr, c);
        v.setVisible(true);
    }
}
