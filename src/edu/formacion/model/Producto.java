package edu.formacion.model;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Producto {
    //encapsulamiento de POO. No se puede acceder a los
    // atributos directamente sino que debes hacer a través de sus métodos getter y setter

    private String nombre;
    private int unidades;
    private double precio;
    private Date fechaEntrega;
    private static final double IVA = 0.21; //constante. Y su valor no puede cambiar

    public Producto(String nombre, int unidades, double precio, Date fechaEntrega) {
        this.nombre = nombre;
        this.unidades = unidades;
        this.precio = precio;
        this.fechaEntrega = fechaEntrega;
    }//cierra constructor

    //getter y setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        if(unidades>5){
            this.unidades = unidades;
        }
        else{
            System.out.println("Las unidades deben ser 5 como mínimo");
        }

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public String getFechaEntregaFormatter() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(fechaEntrega);
    }

    public String getFechaEntregaFormatter2() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return formatter.format(fechaEntrega.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public void info(){//debe ser public porque tienes que acceder desde otra clase
        System.out.println("Ficha de producto");
        System.out.println("Nombre de producto: " + this.nombre);
        System.out.println("Stock unidades de producto " + this.unidades);
        System.out.println("------------------------------------------------------");
        System.out.println("Precio de producto: " + this.precio);
        System.out.println("Fecha de entrega (orientativa): " + this.fechaEntrega);

    }//cierra método info

    public void calcularFactura(){//void indica que no return un tipo de dato. Pinta por consola
        double totalSinIva = this.precio * this.unidades;//utilizas atributos y no usas los métodos getter
        double totalIvaIncluido = this.precio * this.unidades * (1 + IVA);//IVA es una constante
        System.out.println("La factura sin Iva es: " + totalSinIva);
        System.out.println("La factura con Iva es: " + totalIvaIncluido);
    }

}//cierra clase
