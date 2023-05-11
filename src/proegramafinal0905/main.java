/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proegramafinal0905;

import Controllador.EmpleadoController;
import Modelos.Conexion;
import Modelos.EmpleadosModel;
import Vistas.frmEmpleados;
import Vistas.frmPrincipal;

/**
 *
 * @author Usuario
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmEmpleados VistaEmpleados = new frmEmpleados(VistaPrincipal, true);
        Conexion nuevaConexion = new Conexion();
        //EmpleadosModel ModeloEmpleado = new EmpleadosModel();
        EmpleadoController ControladorEmpleado = new EmpleadoController( VistaPrincipal, VistaEmpleados, nuevaConexion);
        
    }
    
}
