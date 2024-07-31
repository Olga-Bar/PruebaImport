package edu.formacion.model;

import java.time.LocalDate;
//import java.util.Date;
/*
Date es una clase que está obsoleta, se recomienda usar LocalDate
Date forma parte de java 1.0 y LocalDate de java 8
Date representa el tiempo en milisegundos desde el 1 de enero de 1970
LocalDate representa una fecha en el calendario gregoriano. No hay restricción de zona horario ...
Date es mutable. Cambiar el valor después de crearse.
LocalDate es inmutable. No se puede cambiar el valor después de crearse.
Date no aplica formato con métodos propios. Necesita clases externas como SimpleDateFormat
LocalDate aplica formato con métodos propios. No necesita clases externas
Date está vinculado a la zona horaria. LocalDate no está vinculado a la zona horaria.
zona horaria depende del sistema en donde se ejecute el programa.

 */

public class Asignatura {
    //atributos de la instancia de clase. private para gestionar el encapsulamiento de POO
    private int id;
    private String nombre;
    private int creditos;
    private LocalDate fechaExamen;

    //constructor
    public Asignatura(int id, String nombre, int creditos, LocalDate fechaExamen) {
        this.id = id;
        this.nombre = nombre;
        this.creditos = creditos;
        this.fechaExamen = fechaExamen;
    }//cierra constructor

    //getter y setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public LocalDate getFechaExamen() {
        return fechaExamen;
    }

    public void setFechaExamen(LocalDate fechaExamen) {
        this.fechaExamen = fechaExamen;
    }

    //toString

    @Override //sobreescribir un método que ya existe en otras clases
    public String toString() {
        return "Asignatura{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", creditos=" + creditos +
                ", fechaExamen=" + fechaExamen +
                '}';
    }
}//cierra clase Asignatura








