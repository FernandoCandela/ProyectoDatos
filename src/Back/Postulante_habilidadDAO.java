/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Back;

import Clases.Postulante_habilidad;
import static DB.DataBase.TPOSTULANTE_HABILIDAD;
import static DB.DataBase.TPOSTULANTE_HABILIDAD_DNI;
import static DB.DataBase.TPOSTULANTE_HABILIDAD_HABILIDAD;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
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
    
    public void insert(Postulante_habilidad foobar){
        try(Connection connection = get_connection()){
            Statement statement = connection.createStatement();
            String query="INSERT INTO "+ TPOSTULANTE_HABILIDAD + " (" 
                    +TPOSTULANTE_HABILIDAD_DNI + ", "+ TPOSTULANTE_HABILIDAD_HABILIDAD + ")" + " VALUES('"
                    + foobar.getDNI() + "', '"
                    + foobar.getCodigo_habilidad()+ "')";
            
            if(statement.executeUpdate(query)>0){
                System.out.println("Se inserto Convocatoria");
            }
                    
         }catch(SQLException e){
             e.printStackTrace();
         }
    }
}
