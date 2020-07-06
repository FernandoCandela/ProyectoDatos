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
    private String idConvocatoria;
    private String fechaConvocatoria;
    private String descripcion;

    public Convocatoria() {
    }

    public Convocatoria(String idConvocatoria, String fechaConvocatoria, String descripcion) {
        this.idConvocatoria = idConvocatoria;
        this.fechaConvocatoria = fechaConvocatoria;
        this.descripcion = descripcion;
    }

    public String getIdConvocatoria() {
        return idConvocatoria;
    }

    public void setIdConvocatoria(String idConvocatoria) {
        this.idConvocatoria = idConvocatoria;
    }

    public String getFechaConvocatoria() {
        return fechaConvocatoria;
    }

    public void setFechaConvocatoria(String fechaConvocatoria) {
        this.fechaConvocatoria = fechaConvocatoria;
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

