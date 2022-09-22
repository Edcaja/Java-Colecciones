/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author egar0
 */
public class AlumnoServicio {
    ArrayList<Alumno>alumnos = new ArrayList();
    ArrayList<Integer>notasalunmo; //= new ArrayList();
    Scanner leer = new Scanner(System.in);
    public void crearAlumno(){
        String resp ;
        do{
        System.out.println("ingrese nombre de alumno");
        String nombre1 = leer.next();
        //alumnos.add();
        //alumnos.add(nombre1);
        //ArrayList<Integer>notasalunmo = new ArrayList();
        notasalunmo = new ArrayList();
            System.out.println("ingrese las 3 notas");
            System.out.println("------------------------------");
            for (int i = 0; i < 3; i++) {
                System.out.println("ingrese la nota n°: "+(i+1));
                int nota = leer.nextInt();
                notasalunmo.add(nota);
            }
           //alumnos.add(new Alumno(nombre1, notasalunmo));
        do{
            
            System.out.println("¿quieres agregar otro alumno?(s/n)");
            resp = leer.next();
           if(resp.equals("n")||resp.equals("s")){
               break;
           }else{
               System.out.println("debe ingresar una respuesta validad");
           }
        }while(true);    
        alumnos.add(new Alumno(nombre1, notasalunmo));
       }while(resp.equals("s"));
        for (Alumno aux : alumnos) {
            System.out.println(aux);
        }
    }
    public void notaFinal(){
        int sum = 0;
        System.out.println("Ingrese nombre del Alumno para calcular promedio");
        String nombre2 = leer.next();
        for (Alumno alu : alumnos) {
            if(alu.getNombre().equals(nombre2)){
               // sum = alu.getNotas().stream().
                for (Integer aux : notasalunmo) {
                    sum+=aux.intValue();
                    
                }
            }
           
        }
        System.out.println("El promedio del alunmo "+nombre2+" es: "+sum/notasalunmo.size());
    }
}
