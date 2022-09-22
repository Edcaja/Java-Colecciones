/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.ejapreej.pkg05;

import servicio.PaisServicio;

/**
 *
 * @author egar0
 */
public class ColeccionesEjApreEj05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisServicio ps = new PaisServicio();
        ps.crearPais();
        ps.mostrarPaises();
        ps.ordenarPaisesAlfabeticamente();
        ps.eliminarPaises();
        ps.mostrarPaises();
    }
    
}
