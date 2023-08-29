/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.umariana.taller;

import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Scanner;
import mundo.Alumno;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

/**
 *
 * @author Asus
 */

//
public class TALLER {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner lector = new Scanner(System.in);
        
        //bandera que permite terminar el programa
        boolean activo= true;
         ArrayList<Alumno> misAlumnos = new ArrayList<Alumno>();
         reporteNariño(misAlumnos);
        do{
        System.out.println("---------- menu de opciones---------");
        System.out.println("1. Insertar alumno");
         System.out.println("2. Eliminar  alumno");
         System.out.println("3. Modificar alumno");
         System.out.println("4. Consultar  alumno");
         System.out.println("5. Reporte alumnos");
         System.out.println("6. Terminar programa");
         System.out.println(".----------------------------------");
        
         int opcion=lector.nextInt();
            switch (opcion) {
                case 1:
             System.out.println("Introduce la cedula del alumno");
             String Cedula = lector.next();
              System.out.println("Introduce el nombre del alumno");
             String Nombre = lector.next();
             System.out.println("Introduce el Apellido del alumno");
             String Apellido = lector.next();
             System.out.println("Introduce el Semetre del alumno");
             String Semestre = lector.next();
             System.out.println("Introduce el Correo del alumno");
             String Correo = lector.next();
             System.out.println("Introduce el Numero de celular del alumno");
             String Celular = lector.next();
              
             // se crea un objeto para guardar la informacion de cada alumno
             Alumno alumno = new Alumno();
             alumno.setCedula(Cedula);
             alumno.setNombre(Nombre);
             alumno.setApellido(Apellido);
             alumno.setSemestre(Semestre);
             alumno.setCorreo(Correo);
             alumno.setCelular(Celular);
             
             //se agrega el valor del objetp a ListArray
             misAlumnos.add(new Alumno(Nombre, Apellido, Cedula,Semestre,Celular,Correo));
    System.out.println("¡Felicidades! Te has registrado correctamente.");
             
             break; 
                case 2: 
                    System.out.println("Ingrese la cedula del estudiante a eliminar: ");
       
             String cedulaBuscada = lector.next();
             lector.nextInt();
           
             for(Alumno nAlumno : misAlumnos) {
            	 if(cedulaBuscada.equals(nAlumno.getCedula())){
            		 misAlumnos.remove(nAlumno);
            		 System.out.println("Estudiante eliminado exitosamente. ");
            		 break;
            	 }else {
            		 System.out.println("No se encontro el alumno");
            	 }
             }
             System.out.println("Alumno no encontrado");
                break;
                case 3:
                    System.out.println("Ingrese la cedula del estudiante a modificar: ");
             String cedulaB = lector.nextLine(); 
             lector.nextInt();
            boolean encontrado = false;
             for(Alumno nAlumno : misAlumnos) {
            	 if(nAlumno.getCedula().equals(cedulaB)) {
            		 System.out.println("Modificando Alumno con cedula: "+nAlumno.getNombre() + " "+nAlumno.getApellido());
                      System.out.println("Nuevo Nombre: ");
                     String nombre = lector.next();
                     if (!nombre.isEmpty()) {
                     nAlumno.setNombre(nombre);
                     }
                     System.out.println("Nuevo Apellido: ");
                     String apellido = lector.next();
                     if(!apellido.isEmpty()) {
                    nAlumno.setApellido(apellido);
                    }
                     System.out.println("Nuevo Semestre: ");
                     String semestre = lector.next();
                     if(!semestre.isEmpty()) {
                    nAlumno.setSemestre(semestre);
                    }
                     System.out.println("Nuevo Correo: ");
                     String correo = lector.next();
                     if(!correo.isEmpty()) {
                    nAlumno.setCorreo(correo);
                    }
                     System.out.println("Nuevo Celular: ");
                     String celular = lector.next();
                     if(!celular.isEmpty()) {
                    nAlumno.setCelular(celular);
                    }
                     System.out.println("Alumno modificado exitosamente. ");
                     encontrado = true;
                     return;
            		 
            	 }
            	 
             }
             if (!encontrado) {
        System.out.println("\"¡ALUMNO NO ENCONTRADO! Puede que hayas escrito mal la cedula.\"");
    }
             break;
                case 4:
                    
             if (misAlumnos.isEmpty()) {
        System.out.println("no hemos encontrado ninguna lista.");
    } else {
        System.out.println("Listado de Alumnos:");
        for (Alumno nAlumno : misAlumnos) {
            System.out.println("Nombre: " + nAlumno.getNombre());
            System.out.println("Apellido: " + nAlumno.getApellido());
            System.out.println("Cédula: " + nAlumno.getCedula());
            System.out.println("Semestre: " + nAlumno.getSemestre());
            System.out.println("Correo: " + nAlumno.getCorreo());
            System.out.println("Celular: " + nAlumno.getCelular());
            System.out.println("===================================");
       
        }
             }
            break;
                case 5: 
                    System.out.println("------------------------------");
                    System.out.println(" Reporte Alumno");
                    System.out.println("------------------------------");
                    reporteN(misAlumnos);
                    
            System.out.println("Debe seleccionar una de las opciones del menu");        
            break;
                case 6: 
                     System.out.println("------------------------------");
                    System.out.println("Espero te haya gustado la experiencia. Seguiremos Mejorando");
                    System.exit(0);
                    System.out.println("------------------------------");
                    
            
                    
            } 
    
        } while(activo);
           lector.close();
    
        
        
    }
    //Método para leer datos de un archivo y almacenarlos en la lista 'misAlumnos'
    public static void reporteNariño(ArrayList<Alumno> misAlumnos){
        File texto = new File("reporteNariño.txt");
        try (BufferedReader bf = new BufferedReader(new FileReader(texto))){
            String linea;
            while ((linea = bf.readLine()) !=null){
                String [] x = linea.split("/");
                if (x.length == 6){
                   String nombre = x[0].trim();
                   String apellido = x[1].trim();
                   String cedula = x[2].trim();
                   String semestre = x[3].trim();
                   String correo = x[4].trim();
                   String celular = x[5].trim();
                   
                   // Crear un objeto Alumno y agregarlo a la lista misAlumnos
                   Alumno alumN = new Alumno (nombre, apellido, cedula, semestre, correo, celular);
                   misAlumnos.add(alumN);
                   
                }
            }
            // Imprimir un mensaje de éxito en la lectura del archivo
            System.out.println("-----------------------------------");
            System.out.println("Se genero el Reporte");
            System.out.println("-----------------------------------");
            
        }catch(IOException e){
            System.out.println("No se pudo leer. ");
        }
        
        
    }
    public static void reporteN (ArrayList<Alumno>misAlumnos) throws FileNotFoundException{
        // Método para escribir los datos de la lista de alumnos en un archivo
        File texto = new File("reporteNariño.txt");
        try (PrintWriter pluma = new PrintWriter(texto)){
            for(Alumno alumno : misAlumnos){
                // Escribir los datos del alumno en una línea del archivo
                pluma.println(alumno.getNombre() + "/" + 
                        alumno.getApellido() + "/" +
                        alumno.getCedula() + "/" +
                        alumno.getSemestre() + "/" +
                        alumno.getCorreo() + "/" +
                        alumno.getCelular());
                
            }
        }
    }
}
   
       



