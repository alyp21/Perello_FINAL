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
public class SolicitudArreglo {
    
    private int codInf;
    private Date fechaInforme;
    private String problema;
    private int codUrgencia;
    private int prioridad;
    private Modem modemRoto;
    private Abonado abonadoInformante;
    private VisitaTecnica pedidoVisita;

    public SolicitudArreglo(int codInf, Date fechaInforme, String problema, int codUrgencia, int prioridad, Modem modemRoto, Abonado abonadoInformante, VisitaTecnica pedidoVisita) {
        this.codInf = codInf;
        this.fechaInforme = fechaInforme;
        this.problema = problema;
        this.codUrgencia = codUrgencia;
        this.prioridad = prioridad;
        this.modemRoto = modemRoto;
        this.abonadoInformante = abonadoInformante;
        this.pedidoVisita = pedidoVisita;
    }
    
    
}
