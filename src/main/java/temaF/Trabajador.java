/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temaF;

/**
 *
 * @author alybe
 */
public class Trabajador extends Persona {
    
    private int id;
    private String puesto;
    private boolean ocupado;

    public Trabajador(int id, String puesto, boolean ocupado, String nombre) {
        super(nombre);
        this.id = id;
        this.puesto = puesto;
        this.ocupado = ocupado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }




    
    
}
