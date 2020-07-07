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
public class Convocatoria_puesto {
    private String id_convocatoria;
    private String Codigo_puesto;

    public Convocatoria_puesto() {
    }

    public Convocatoria_puesto(String id_convocatoria, String Codigo_puesto) {
        this.id_convocatoria = id_convocatoria;
        this.Codigo_puesto = Codigo_puesto;
    }

    public String getId_convocatoria() {
        return id_convocatoria;
    }

    public void setId_convocatoria(String id_convocatoria) {
        this.id_convocatoria = id_convocatoria;
    }

    public String getCodigo_puesto() {
        return Codigo_puesto;
    }

    public void setCodigo_puesto(String Codigo_puesto) {
        this.Codigo_puesto = Codigo_puesto;
    }
    
}

