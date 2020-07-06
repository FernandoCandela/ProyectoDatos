/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Back;

import Clases.Convocatoria;
import static DB.DataBase.TCONVOCATORIA;
import static DB.DataBase.TCONVOCATORIA_DESCRIPCION;
import static DB.DataBase.TCONVOCATORIA_FECHA;
import static DB.DataBase.TCONVOCATORIA_ID;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Renatto
 */
public class ConvocatoriaDAO extends Conexion{
    
     public ArrayList<Convocatoria> read(){
       ArrayList<Convocatoria> convocatorias = new ArrayList();
       try(Connection connection = get_connection()){
           
           String query = "SELECT * FROM " + TCONVOCATORIA;
           PreparedStatement preparedStatement = connection. prepareStatement(query);
           ResultSet rs = preparedStatement.executeQuery();
           
           while(rs.next()){
               Convocatoria convocatoria= new Convocatoria(
                                rs.getString(TCONVOCATORIA_ID),
                                rs.getString(TCONVOCATORIA_FECHA),
                                rs.getString(TCONVOCATORIA_DESCRIPCION));
              convocatorias.add(convocatoria);
           }
       }catch(SQLException e){
           
       }    
       return convocatorias;
       
    }
     
     public void insert(Convocatoria convocatoria){
         
         try(Connection connection = get_connection()){
            Statement statement = connection.createStatement();
            String query="INSERT INTO "+ TCONVOCATORIA + " (" 
                    +TCONVOCATORIA_ID + ", "+ TCONVOCATORIA_FECHA + ", "
                    + TCONVOCATORIA_DESCRIPCION + ")" + " VALUES('"
                    + convocatoria.getIdConvocatoria() + "', '"
                    + convocatoria.getFechaConvocatoria() + "', '"
                    +convocatoria.getDescripcion() + "')";
            
            if(statement.executeUpdate(query)>0){
                System.out.println("Se inserto Convocatoria");
            }
                    
         }catch(SQLException e){
             e.printStackTrace();
         }
     }
}
