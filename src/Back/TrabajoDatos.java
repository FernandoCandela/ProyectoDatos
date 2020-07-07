/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Back;

import Clases.Convocatoria;
import Clases.Tienda;
import java.util.ArrayList;

/**
 *
 * @author Renatto
 */
public class TrabajoDatos {

    /**
     */
    public static void main() {
        // TODO code application logic here
    
        ArrayList<Tienda> aux= new ArrayList();
        aux=Tienda.makeTiendaList();
        for(int i=0;i<aux.size();i++){
            System.out.println("Nombre: "+aux.get(i).getNombre());
            System.out.println("Ubicacion: " + aux.get(i).getUbicacion());
            System.out.println("");
        }
       
        ArrayList<Convocatoria> conv1=new ArrayList();
        conv1=Convocatoria.makeConvocatoriaList();
        
        System.out.println("id: "+conv1.get(conv1.size()-1).getId_convocatoria());
        System.out.println("id: "+conv1.get(conv1.size()-2).getId_convocatoria());
        System.out.println("id: "+conv1.get(conv1.size()-3).getId_convocatoria());
        System.out.println("id: "+conv1.get(conv1.size()-4).getId_convocatoria());
        
        /*for(int i=0;i<conv1.size();i++){
            System.out.println("id: "+conv1.get(i).getIdConvocatoria());
            System.out.println("Fecha: "+conv1.get(i).getFechaConvocatoria());
            System.out.println("Descripcion: "+conv1.get(i).getDescripcion());
        }*/
    }
    
}
