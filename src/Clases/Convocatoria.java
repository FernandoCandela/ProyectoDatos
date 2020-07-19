/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Back.ConvocatoriaDAO;
import java.util.ArrayList;

/**
 *
 * @author Piero
 */
public class Convocatoria extends ConvocatoriaDAO {
    private Integer id_convocatoria;
    private String fecha_convocatoria;
    private String descripcion;

    public Convocatoria() {
    }

    public Convocatoria(Integer id_convocatoria, String fecha_convocatoria, String descripcion) {
        this.id_convocatoria = id_convocatoria;
        this.fecha_convocatoria = fecha_convocatoria;
        this.descripcion = descripcion;
    }

    public Integer getId_convocatoria() {
        return id_convocatoria;
    }

    public void setId_convocatoria(Integer id_convocatoria) {
        this.id_convocatoria = id_convocatoria;
    }

    public String getFecha_convocatoria() {
        return fecha_convocatoria;
    }

    public void setFecha_convocatoria(String fecha_convocatoria) {
        this.fecha_convocatoria = fecha_convocatoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public static ArrayList<Convocatoria> makeConvocatoriaList(){
        Convocatoria convocatoria = new Convocatoria();
        
        return convocatoria.read();
    }
    
    public static void insertConvocatoria(Convocatoria convocatoria){
        Convocatoria conv = new Convocatoria();
        
        conv.insert(convocatoria);
        
    }
}

