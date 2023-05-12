/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllador;

import Modelos.Conexion;
import Modelos.EmpleadosModel;
import Vistas.frmEmpleados;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Usuario
 */
public class EmpleadoController implements ActionListener{
    frmPrincipal VistaPrincipal;
    frmEmpleados VistaPersonas;
    Conexion ModeloConexion;
    EmpleadosModel ModeloPersona;

    public EmpleadoController(frmPrincipal VistaPrincipal, frmEmpleados VistaPersonas, Conexion ModeloConexion) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaPersonas = VistaPersonas;
        this.ModeloConexion = ModeloConexion;
        //this.ModeloPersona = ModeloPersona;
        
        this.VistaPrincipal.setVisible(true);
        
        this.ModeloPersona.ListarDatos();
        
        this.VistaPrincipal.btnEmpleados.addActionListener(this);
        this.VistaPersonas.btnAgregar.addActionListener(this);
        this.VistaPersonas.btnEditar.addActionListener(this);
        this.VistaPersonas.btnEliminar.addActionListener(this);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaPrincipal.btnEmpleados){
            this.VistaPersonas.setVisible(true);
        }
    }
}
