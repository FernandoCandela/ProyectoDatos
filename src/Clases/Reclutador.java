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
    private String dniReclutador;
    private String nombreCompleto;

    public Reclutador() {
    }

    public Reclutador(String dniReclutador, String nombreCompleto) {
        this.dniReclutador = dniReclutador;
        this.nombreCompleto = nombreCompleto;
    }

    public String getDniReclutador() {
        return dniReclutador;
    }

    public void setDniReclutador(String dniReclutador) {
        this.dniReclutador = dniReclutador;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    
    
    
    
}
