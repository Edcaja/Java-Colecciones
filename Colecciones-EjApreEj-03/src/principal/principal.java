/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import servicio.AlumnoServicio;



/**
 *
 * @author egar0
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     AlumnoServicio as = new AlumnoServicio();
     as.crearAlumno();
     as.notaFinal();
    }
    
}
