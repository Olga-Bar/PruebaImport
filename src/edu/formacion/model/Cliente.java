package edu.formacion.model;

import java.util.Date;

public class Cliente {

    //private para getionar el encapsulamiento (POO)
    private String nombre;
    private String email;
    private String telefono;
    private boolean lead;

    private Date fechaAlta;

    private double facturacion;

    public Cliente(String nombre, String email, String telefono, boolean lead, Date fechaAlta, double facturacion) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.lead  =lead;
        this.fechaAlta = fechaAlta;
        this.facturacion = facturacion;

    }//cierra constructor

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isLead() {
        return lead;
    }

    public void setLead(boolean lead) {
        this.lead = lead;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public double getFacturacion() {
        return facturacion;
    }

    public void setFacturacion(double facturacion) {
        this.facturacion = facturacion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", lead=" + lead +
                ", fechaAlta=" + fechaAlta +
                ", facturacion=" + facturacion +
                '}';
    }
}// Fin de la clase Cliente

