/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Pais;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author egar0
 */
public class PaisServicio {
    Scanner leer = new Scanner(System.in);
    Set<Pais> paises = new HashSet();
    //TreeSet<Pais>ordernarpais; //= new TreeSet<>(paises);
    public void crearPais(){
        String resp;
        do{
            System.out.println("Ingrese el Nombre del Pais");
            String nombrepais = leer.next();
            paises.add(new Pais(nombrepais));
           while(true){
               System.out.println("¿Quieres ingresar otro Pais?(s/n)");
               resp = leer.next();
               if(resp.equals("n")||resp.equals("s")){
                   break;
               }else{
                   System.out.println("ingrese una respuesta validad");
               }     
           }
        }while(resp.equals("s"));
    }
    public void mostrarPaises(){
        System.out.println("Informacion LIsta de paises Agregados");
        for (Pais pa : paises) {
            System.out.println(pa.toString());
        }
    }
    public void ordenarPaisesAlfabeticamente(){
        System.out.println("los paises ordenados Alfabeticamente");
        TreeSet<Pais>ordernarpais= new TreeSet<>(paises);
        
        for (Pais ordernarpai : ordernarpais) {
            System.out.println(ordernarpai.toString());
        }
    }
    public void eliminarPaises(){
        System.out.println("Ingrese el nombre dle pais que quiere eliminar del conjunto");
        String nomPiseliminar = leer.next();
        Iterator<Pais> it = paises.iterator();
        boolean encontro= false;
        while(it.hasNext()){
            Pais p = it.next();
            if(p.getNombre().equals(nomPiseliminar)){
                it.remove();
                encontro = true;
                break;
            }    
        }
        if(!encontro){
             System.out.println("El país no se encuentra en el conjunto");
        }else{
             System.out.println("El país se eliminó correctamente");
        }
    }
}

