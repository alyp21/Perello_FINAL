/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temaF;

import java.util.List;

/**
 *
 * @author alybe
 */
public class Cuadrilla {
    
    private int numero;
    private int cantidadTrabajadores;
    private String equipamiento;
    private String materiales;
    private Trabajador lider;
    private List <Trabajador> auxiliares;

    public Cuadrilla(int numero, int cantidadTrabajadores, String equipamiento, String materiales, Trabajador lider, List<Trabajador> auxiliares) {
        this.numero = numero;
        this.cantidadTrabajadores = cantidadTrabajadores;
        this.equipamiento = equipamiento;
        this.materiales = materiales;
        this.lider = lider;
        this.auxiliares = auxiliares;
    }
    
}
