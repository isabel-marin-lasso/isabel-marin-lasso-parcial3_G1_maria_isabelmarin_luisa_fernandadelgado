/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestion;


import java.util.Scanner;


public class mainE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        GestionEstudiantes gs = new GestionEstudiantes(10);

        while (true) {
        
            System.out.println("/// MENU GESTION DE ESTUDIANTES /// ");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar todos los estudiantes");
            System.out.println("3. Buscar el Estudiante por Nombre");
            System.out.println("4. Calcular el promedio general");
            System.out.println("5. Salir del menu");
            System.out.print("Selecciona una opcion: ");
            
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                   
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese la edad del estudiante: ");
                    int edad = sc.nextInt();
                    System.out.print("Ingrese el promedio del estudiante: ");
                    double promedio = sc.nextDouble();
                    sc.nextLine();
                    gs.agregarEstudiante(nombre, edad, promedio);
                    break;
                case 2:
                
                    gs.mostrarEstudiantes();
                    break;
                case 3:
                   
                    System.out.print("Ingrese el nombre del estudiante a buscar: ");
                    String nombreBuscar = sc.nextLine();
                    gs.buscarPorNombre(nombreBuscar);
                    break;
                case 4:
               
                    gs.calcularPromedioGeneral();
                    break;
                case 5:
             
                    System.out.println("¡HASTA LUEGUITO..!");
                    return;
                default:
                    System.out.println("ESTA OPCION QUE INGRESASTE NO ES VALIDA!.");
            }
        }
    }
}

    