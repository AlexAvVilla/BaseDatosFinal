/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Conexion {
    Connection conexion;
    
    
    public Connection Conectar(){
        try 
        {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            
            String servidor = "255.255.248.0"; //localhost
            String numero_puerto = "1521";
            String sid = "umg"; //xe
            String url = "jdbc:oracle:thin:@"+servidor+":"+numero_puerto+":"+sid;
            
            String usuario ="HA32";
            String password ="Umg$2023";
            
            conexion = DriverManager.getConnection(url, usuario, password);
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
            return conexion;
            
        }
        catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "No se conecto tio.."+e.getMessage());
            return conexion;
        }
    }
}
