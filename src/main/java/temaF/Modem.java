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

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public int getPuertosEthernet() {
        return puertosEthernet;
    }

    public void setPuertosEthernet(int puertosEthernet) {
        this.puertosEthernet = puertosEthernet;
    }

    public int getPuertoCoaxial() {
        return puertoCoaxial;
    }

    public void setPuertoCoaxial(int puertoCoaxial) {
        this.puertoCoaxial = puertoCoaxial;
    }

    public String getProtocoloRed() {
        return protocoloRed;
    }

    public void setProtocoloRed(String protocoloRed) {
        this.protocoloRed = protocoloRed;
    }

    public int getNroLeds() {
        return nroLeds;
    }

    public void setNroLeds(int nroLeds) {
        this.nroLeds = nroLeds;
    }

    public boolean isTieneFirewall() {
        return tieneFirewall;
    }

    public void setTieneFirewall(boolean tieneFirewall) {
        this.tieneFirewall = tieneFirewall;
    }
    
    
}
