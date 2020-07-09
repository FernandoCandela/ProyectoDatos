/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Back;

import Clases.Postulante_habilidad;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Renatto
 */
public class Postulante_habilidadDAO extends Conexion{
    
    public ArrayList<Postulante_habilidad> read(){
        
        ArrayList<Postulante_habilidad> array_postulante_habilidad= new ArrayList();
        
        try(Connection connection = get_connection()){
             
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return array_postulante_habilidad;
    }
}
