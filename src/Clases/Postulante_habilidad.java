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
    private String codigo_habildiad;

    public Postulante_habilidad() {
    }

    public Postulante_habilidad(String DNI, String codigo_habildiad) {
        this.DNI = DNI;
        this.codigo_habildiad = codigo_habildiad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCodigo_habildiad() {
        return codigo_habildiad;
    }

    public void setCodigo_habildiad(String codigo_habildiad) {
        this.codigo_habildiad = codigo_habildiad;
    }
    
}
