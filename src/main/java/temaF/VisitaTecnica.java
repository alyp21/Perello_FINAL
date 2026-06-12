/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temaF;

import java.util.Date;
import java.time.LocalDate;

/**
 *
 * @author alybe
 */
public class VisitaTecnica {
    
    private int numeroVisita;
    private String ubicacion;
    private String tamano;
    private LocalDate fechaCreacion;
    private LocalDate fechaReparacion;
    private String observaciones;
    private Cuadrilla cuadrillaAsignada;

    public VisitaTecnica(int numeroVisita, String ubicacion, String tamano, LocalDate fechaCreacion, LocalDate fechaReparacion, String observaciones, Cuadrilla cuadrillaAsignada) {
        this.numeroVisita = numeroVisita;
        this.ubicacion = ubicacion;
        this.tamano = tamano;
        this.fechaCreacion = fechaCreacion;
        this.fechaReparacion = fechaReparacion;
        this.observaciones = observaciones;
        this.cuadrillaAsignada = cuadrillaAsignada;
    }

    public int getNumeroVisita() {
        return numeroVisita;
    }

    public void setNumeroVisita(int numeroVisita) {
        this.numeroVisita = numeroVisita;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaReparacion() {
        return fechaReparacion;
    }

    public void setFechaReparacion(LocalDate fechaReparacion) {
        this.fechaReparacion = fechaReparacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Cuadrilla getCuadrillaAsignada() {
        return cuadrillaAsignada;
    }

    public void setCuadrillaAsignada(Cuadrilla cuadrillaAsignada) {
        this.cuadrillaAsignada = cuadrillaAsignada;
    }

    
    
    
}
