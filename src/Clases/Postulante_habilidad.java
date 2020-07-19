/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Renatto
 */
public class Postulante_habilidad {
    private String DNI;
    private String codigo_habilidad;

    public Postulante_habilidad() {
    }

    public Postulante_habilidad(String DNI, String codigo_habilidad) {
        this.DNI = DNI;
        this.codigo_habilidad = codigo_habilidad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCodigo_habilidad() {
        return codigo_habilidad;
    }

    public void setCodigo_habilidad(String codigo_habilidad) {
        this.codigo_habilidad = codigo_habilidad;
    }
    
    
}
