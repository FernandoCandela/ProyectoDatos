/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Back.TiendaDAO;
import java.util.ArrayList;

/**
 *
 * @author Renatto
 */
public class Tienda extends TiendaDAO {
    private String nombre;
    private String ubicacion;

    public Tienda(){
        
    }

    public Tienda(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
      
    public static ArrayList<Tienda> makeTiendaList(){
 
        Tienda tienda = new Tienda();
        
        return tienda.read();
    }
    
    
   
   
    
}
