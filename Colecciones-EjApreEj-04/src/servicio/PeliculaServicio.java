/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import utilidad.Comparadores;

/**
 *
 * @author egar0
 */
public class PeliculaServicio {
    
    Scanner leer = new Scanner(System.in);
    ArrayList<Pelicula>peliculas = new ArrayList();
    public void cargarPelicula(){
        String resp;
        do{
        System.out.println("Ingresar Titulo de la pelicula");
        String titulo = leer.next();
        
        System.out.println("Ingrese el Director de la Pelicula");
        String dir = leer.next();
        
        System.out.println("Ingrese la Duración de la pelicula en Horas");
        int hora = leer.nextInt();
        do{
            System.out.println("¿quiere cargar otra Pelicula?(s/n)");
            resp = leer.next();
            if(resp.equals("n")||resp.equals("s")){
                break;
            }else{
                System.out.println("ingrese una respuesta valida");
            }
        }while(true);
        peliculas.add(new Pelicula(titulo, dir, hora));
        }while(resp.equals("s"));
       
      //new Pelicula(titulo, dir, hora);  
    }
    public void mostrarPeliculas(){
     for (Pelicula peli : peliculas) {
          System.out.println(peli.toString());
        }
    }
    public void mostrarPelicularMayor1Hora(){
         for (Pelicula peli : peliculas) {
             if (peli.getDuracion()> 1){
                 System.out.println("las peliculas de duracion mayor a 1 hora son: ");
                 System.out.println(peli.toString());
             }
          
        }
    }
    public void ordenarPeliculasdeMayorAMenor(){
        System.out.println("Peliculas ordenadas de Mayor a Menor");
        Collections.sort(peliculas, Comparadores.ordenarDuracionDescendente);
        for (Pelicula peli : peliculas) {
          System.out.println(peli.toString());
        }
    }
    public void ordenarPeliculasdeMenorAMyor(){
        System.out.println("Peliculas ordenadas de menor a mayor");
        Collections.sort(peliculas, Comparadores.ordenarDuracionAscendente);
        for (Pelicula peli : peliculas) {
          System.out.println(peli.toString());
        }
    }
    public void ordenarPeliculasXTitulos(){
        Collections.sort(peliculas, Comparadores.ordenarTituloAscendente);
        System.out.println("Peliculas Ordenadas Por Titulos Alfabeticamente");
         for (Pelicula peli : peliculas) {
          System.out.println(peli.toString());
        }
    }
    public void ordenarPeliculasXDirector(){
       System.out.println("Peliculas Ordenadas Por Director Alfabeticamente");
       Collections.sort(peliculas, Comparadores.ordenarDirectorAscendente);
         for (Pelicula peli : peliculas) {
          System.out.println(peli.toString());
        } 
    } 
   
}
