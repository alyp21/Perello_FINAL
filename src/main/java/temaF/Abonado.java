/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temaF;

/**
 *
 * @author alybe
 */
public class Abonado extends Persona {
    
    private String celular;
    private String mail;
    private Domicilio domicilio;
    private boolean debitoAutomatico;
    private int password;

    public Abonado() {
    }


    public Abonado(String celular, String mail, Domicilio domicilio, boolean debitoAutomatico, int password, String nombre) {
        super(nombre);
        this.celular = celular;
        this.mail = mail;
        this.domicilio = domicilio;
        this.debitoAutomatico = debitoAutomatico;
        this.password = password;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public boolean isDebitoAutomatico() {
        return debitoAutomatico;
    }

    public void setDebitoAutomatico(boolean debitoAutomatico) {
        this.debitoAutomatico = debitoAutomatico;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    
    public boolean validarIngreso (int password){
        
        return false;
        
    }
    
    public void cambioPassword(String passNueva){
        
    }
    
}
