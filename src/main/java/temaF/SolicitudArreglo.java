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
public class SolicitudArreglo {
    
    private int codInf;
    private LocalDate fechaInforme;
    private String problema;
    private int codUrgencia;
    private int prioridad;
    private Modem modemRoto;
    private Abonado abonadoInformante;
    private VisitaTecnica pedidoVisita;

    public SolicitudArreglo(int codInf, LocalDate fechaInforme, String problema, int codUrgencia, int prioridad, Modem modemRoto, Abonado abonadoInformante, VisitaTecnica pedidoVisita) {
        this.codInf = codInf;
        this.fechaInforme = fechaInforme;
        this.problema = problema;
        this.codUrgencia = codUrgencia;
        this.prioridad = prioridad;
        this.modemRoto = modemRoto;
        this.abonadoInformante = abonadoInformante;
        this.pedidoVisita = pedidoVisita;
    }

    public int getCodInf() {
        return codInf;
    }

    public void setCodInf(int codInf) {
        this.codInf = codInf;
    }

    public LocalDate getFechaInforme() {
        return fechaInforme;
    }

    public void setFechaInforme(LocalDate fechaInforme) {
        this.fechaInforme = fechaInforme;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public int getCodUrgencia() {
        return codUrgencia;
    }

    public void setCodUrgencia(int codUrgencia) {
        this.codUrgencia = codUrgencia;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public Modem getModemRoto() {
        return modemRoto;
    }

    public void setModemRoto(Modem modemRoto) {
        this.modemRoto = modemRoto;
    }

    public Abonado getAbonadoInformante() {
        return abonadoInformante;
    }

    public void setAbonadoInformante(Abonado abonadoInformante) {
        this.abonadoInformante = abonadoInformante;
    }

    public VisitaTecnica getPedidoVisita() {
        return pedidoVisita;
    }

    public void setPedidoVisita(VisitaTecnica pedidoVisita) {
        this.pedidoVisita = pedidoVisita;
    }


    
    
    
}
