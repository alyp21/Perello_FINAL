/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temaF;

/**
 *
 * @author alybe
 */
public class Modem {
    
    private String serialNumber;
    private String marca;
    private String velocidad;
    private int puertosEthernet;
    private int puertoCoaxial;
    private String protocoloRed;
    private int nroLeds;
    private boolean tieneFirewall;

    public Modem(String serialNumber, String marca, String velocidad, int puertosEthernet, int puertoCoaxial, String protocoloRed, int nroLeds, boolean tieneFirewall) {
        this.serialNumber = serialNumber;
        this.marca = marca;
        this.velocidad = velocidad;
        this.puertosEthernet = puertosEthernet;
        this.puertoCoaxial = puertoCoaxial;
        this.protocoloRed = protocoloRed;
        this.nroLeds = nroLeds;
        this.tieneFirewall = tieneFirewall;
    }
    
    
}
