/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;


public class GestionEstudiantes {
 private Estudiantes [] arreglo;
 private int cantidadActual;
 private int capacidadMax;

    public GestionEstudiantes(int capacidadMax) {
        this.capacidadMax = capacidadMax;
        this.arreglo = new Estudiantes[capacidadMax];
        this.cantidadActual = 0;
    }

    
    public void agregarEstudiante(String nombre, int edad, double promedio) {
        if (cantidadActual < capacidadMax) {
            Estudiantes nuevoEstudiante = new Estudiantes(nombre, edad, promedio);
           arreglo[cantidadActual] = nuevoEstudiante;
            cantidadActual++;
            System.out.println("El estudiante se ha agregado exitosamente.");
        } else {
            System.out.println("No hay mas espacio para agregar mas estudiantes.");
        }
    }

    
    public void mostrarEstudiantes() {
        if (cantidadActual == 0) {
            System.out.println("No se encuentran estudiantes registrados.");
        } else {
            for (int i = 0; i < cantidadActual; i++) {
                System.out.println(arreglo[i]);
            }
        }
    }

  
    public void buscarPorNombre(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < cantidadActual; i++) {
            if (arreglo[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(arreglo[i]);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Estudiante no  se ha encontrado.");
        }
    }

    public void calcularPromedioGeneral() {
        if (cantidadActual == 0) {
            System.out.println("No hay estudiantes registrados para calcular el promedio.");
        } else {
            double sumaPromedios = 0;
            for (int i = 0; i < cantidadActual; i++) {
                sumaPromedios += arreglo[i].getPromedio();
            }
            double promedioGeneral = sumaPromedios / cantidadActual;
            System.out.println("Promedio general de los estudiantes: " + promedioGeneral);
        }
    }
}

