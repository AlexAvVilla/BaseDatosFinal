/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class EmpleadosModel {
    int codigo;
    String apellidos;
    String nombre;
    String telefono;
    Connection myConexion;
    Conexion nuevaConexion;
    ResultSet rst;
    
    public EmpleadosModel(int codigo, String apellidos, String nombre, String telefono) {
        this.codigo = codigo;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public ResultSet ListarDatos(){
       try
       {
           myConexion = nuevaConexion.Conectar();
           Statement sentencia = myConexion.createStatement();
           rst = sentencia.executeQuery("Select * from Empleados");
           return rst;
       }
       catch(SQLException e){
           JOptionPane.showMessageDialog(null, "No se pudo Listar");
           return rst;
       }
    }
    // metodo agregar
    
    //metodo editar execute porno.exe
        
    //metodo eliminar
    
    /*public void GuardarPersona(String apellido, String nombre, int telefono){
        try{
            Conexion nuevaConexion = new Conexion();
            this.myConexion = nuevaConexion.Conectar(nombre, nombre);
            Statement sentencia = myConexion.createStatement();
            sentencia.execute("Insert into Persona values('"+this.getCodigo()+"',"+this.getApellidos()+"','"+this.getNombre()+"','"+this.getTelefono()+"')");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar el registro tio "+e.getMessage());
        } 
    }*/
    
}
