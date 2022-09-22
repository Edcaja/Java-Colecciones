/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author egar0
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> perros = new ArrayList();
        String resp;
        
        do {
            System.out.println("Ingresar Raza de perro");
            String raza = leer.nextLine();
            perros.add(raza);
            while(true){
                System.out.println("¿quieres agregar otra perro?(s/n)");
                resp=leer.nextLine();
            if (resp.equals("n")||resp.equals("s")){
               break; 
            } else{
                System.out.println("ingresa una respuesta validad");
            }       
           }
        }while(!resp.equals("n"));
        for (String aux : perros) {
            System.out.println(aux);
        }
        System.out.println("-----------Segunda parte-ejercicio n° 2-----------");
        Iterator<String> ite = perros.iterator();
        System.out.println("Ingresa una raza de perro para eliminar de la lista");
        String raza2 = leer.nextLine();
        boolean encontro = false;
        while(ite.hasNext()){
            String perro2 = ite.next();
            if(perro2.equals(raza2)){
                ite.remove();
                System.out.println("El perro se elimino de forma correcta");
                encontro = true;
                break;
            }       
        }
        if(!encontro){
            System.out.println("El perro no se encuntra en lA LISTA");
        }
        Collections.sort(perros);
        for (String aux : perros) {
            System.out.println(aux);
        }
    }
    
}
