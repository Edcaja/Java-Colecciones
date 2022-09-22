/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import servicio.PeliculaServicio;

/**
 *
 * @author egar0
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaServicio sp = new PeliculaServicio();
      sp.cargarPelicula();
        System.out.println("---------Lista de peliculas---------");
      sp.mostrarPeliculas();
        System.out.println("---------Lista de peliculas con una duracion mayor a 1 hoara---------");
      sp.mostrarPelicularMayor1Hora();
        System.out.println("---------Lista de peliculas ordenadas-----------");
      sp.ordenarPeliculasdeMayorAMenor();
      sp.ordenarPeliculasdeMenorAMyor();
      sp.ordenarPeliculasXTitulos();
      sp.ordenarPeliculasXDirector();
    }
    
}
