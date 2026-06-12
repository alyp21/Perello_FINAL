/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temaF;

import java.util.Date;

/**
 *
 * @author alybe
 */
public class VisitaTecnica {
    
    private int numeroVisita;
    private String ubicacion;
    private String tamano;
    private Date fechaCreacion;
    private Date fechaReparacion;
    private String observaciones;
    private Cuadrilla cuadrillaAsignada;

    public VisitaTecnica(int numeroVisita, String ubicacion, String tamano, Date fechaCreacion, Date fechaReparacion, String observaciones, Cuadrilla cuadrillaAsignada) {
        this.numeroVisita = numeroVisita;
        this.ubicacion = ubicacion;
        this.tamano = tamano;
        this.fechaCreacion = fechaCreacion;
        this.fechaReparacion = fechaReparacion;
        this.observaciones = observaciones;
        this.cuadrillaAsignada = cuadrillaAsignada;
    }
    
    
}
