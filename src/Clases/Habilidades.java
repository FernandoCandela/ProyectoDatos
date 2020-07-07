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
public class Habilidades {
    private String codigo;
    private String habilidad;

    public Habilidades() {
    }

    public Habilidades(String codigo, String habilidad) {
        this.codigo = codigo;
        this.habilidad = habilidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }
    
}
