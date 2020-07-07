/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Piero
 */
public class Reclutador {
    private String dni;
    private String nombre_completo;

    public Reclutador() {
    }

    public Reclutador(String dni, String nombre_completo) {
        this.dni = dni;
        this.nombre_completo = nombre_completo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }
    
}
