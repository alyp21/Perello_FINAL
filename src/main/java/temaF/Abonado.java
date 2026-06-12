/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temaF;

/**
 *
 * @author alybe
 */
public class Abonado {
    
    private String celular;
    private String mail;
    private Domicilio domicilio;
    private boolean debitoAutomatico;
    private int password;

    public Abonado() {
    }

    public Abonado(String celular, String mail, Domicilio domicilio, boolean debitoAutomatico, int password) {
        this.celular = celular;
        this.mail = mail;
        this.domicilio = domicilio;
        this.debitoAutomatico = debitoAutomatico;
        this.password = password;
    }
    
    public boolean validarIngreso (int password){
        
        return false;
        
    }
    
    public void cambioPassword(String passNueva){
        
    }
    
}
