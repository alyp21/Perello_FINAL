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
public class Empresa {
    
    private List <Abonado> abonados;
    private List <Modem> modems;
    private List <SolicitudArreglo> solicitudesArreglo;
    private List <VisitaTecnica> visitasTecnicas;
    private List <Cuadrilla> cuadrillas;
    private List <Trabajador> trabajadores;

    public Empresa(List<Abonado> abonados, List<Modem> modems, List<SolicitudArreglo> solicitudesArreglo, List<VisitaTecnica> visitasTecnicas, List<Cuadrilla> cuadrillas, List<Trabajador> trabajadores) {
        this.abonados = abonados;
        this.modems = modems;
        this.solicitudesArreglo = solicitudesArreglo;
        this.visitasTecnicas = visitasTecnicas;
        this.cuadrillas = cuadrillas;
        this.trabajadores = trabajadores;
    }
    
    public void listadoAbonados() {
        System.out.println("Lista de abonados:");
        for (Abonado ab : abonados) {
            System.out.println("Nombre: " + ab.getNombre() + " Celular: " + ab.getCelular());
        }
    }

    public void informesSolicitudesPorMarca() {
        System.out.println("Lista de solicitudes agrupadas por marca:");
        for (SolicitudArreglo solicitud : solicitudesArreglo) {
            System.out.println("Solicitud nro: " + solicitud.getCodInf() + 
                               "Marca del modem roto: " + solicitud.getModemRoto().getMarca());
        }
    }

    public void informeCuadrillasOciosas() {
        System.out.println("Lista de cuadrillas ociosas:");
        for (Cuadrilla cua : cuadrillas) {
            boolean liderOcupado = cua.getLider().isOcupado();
            
            boolean algunAuxiliarOcupado = false;
            for (Trabajador aux : cua.getAuxiliares()) {
                if (aux.isOcupado()) {
                    algunAuxiliarOcupado = true;
                }
            }
            
            if (!liderOcupado && !algunAuxiliarOcupado) {
                System.out.println("La Cuadrilla nro " + cua.getNumero() + " esta libre.");
            }
        }
    }

    public void visitasPorCuadrilla() {
        System.out.println(" Lista de visitas asignadas:");
        for (VisitaTecnica visita : visitasTecnicas) {
            System.out.println("Visita nro: " + visita.getNumeroVisita() + 
                               " Asignada a la cuadrilla nro: " + visita.getCuadrillaAsignada().getNumero());
        }
    }

    public void solicitudesSinVisita() {
        System.out.println("Solicitudes pendientes (sin una visita asignada):");
        for (SolicitudArreglo solicitud : solicitudesArreglo) {
            if (solicitud.getPedidoVisita() == null) {
                System.out.println("Solicitud nro " + solicitud.getCodInf() + " de " + 
                                   solicitud.getAbonadoInformante().getNombre() + " todavia no tiene una visita.");
            }
        }
    }

    public void trabajadoresPorCuadrilla() {
        System.out.println("Lista de trabajadores por cuadrilla:");
        for (Cuadrilla cua : cuadrillas) {
            System.out.println("Cuadrilla nro: " + cua.getNumero());
            System.out.println("Lider: " + cua.getLider().getNombre() + " ( Puesto: " + cua.getLider().getPuesto() + " ) ");
            
            System.out.println("Auxiliares:");
            for (Trabajador aux : cua.getAuxiliares()) {
                System.out.println("   - " + aux.getNombre() + " ( Puesto: " + aux.getPuesto() + " ) ");
            }
        }
    }
}
