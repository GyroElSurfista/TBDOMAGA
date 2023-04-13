/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbd.tbd.conexion;
import java.sql.*;

/**
 *
 * @author Jairo
 */
public class Conexion {
      
    public static Connection getConnection(){
        Connection conn;
        
        conn = null;
        try {
            // URL de conexión
            String url = "jdbc:postgresql://192.168.40.128:5432/compusf";
            // Nombre de usuario y contraseña
            String user = "tbd";
            String password = "tbd";
            // Crear una instancia de la clase Connection
            conn = DriverManager.getConnection(url, user, password);
            // Realizar operaciones en la base de datos utilizando la conexión conn
            // ...
        } catch (SQLException e) {
            System.out.println("Error al conectarse a la base de datos");
            e.printStackTrace();
        }        
        
        return conn;
    }
    
    
}
