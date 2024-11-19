/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

public class Estudiantes {
    
    private String nombre;
    private int edad;
    private double promedio;


    public Estudiantes(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }


    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        return "Nombre del estudiante: " + nombre + ", Edad: " + edad + ", Promedio: " + promedio;
    }
} 

