/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Back;

import Clases.Convocatoria;
import Clases.Postulante;
import static DB.DataBase.TCONVOCATORIA_ID;
import static DB.DataBase.TPOSTULANTE;
import static DB.DataBase.TPOSTULANTE_APROBADO;
import static DB.DataBase.TPOSTULANTE_CIUDAD;
import static DB.DataBase.TPOSTULANTE_CONVOCATORIA;
import static DB.DataBase.TPOSTULANTE_CORREO;
import static DB.DataBase.TPOSTULANTE_DIRECCION;
import static DB.DataBase.TPOSTULANTE_DISTRITO;
import static DB.DataBase.TPOSTULANTE_DNI;
import static DB.DataBase.TPOSTULANTE_EDAD;
import static DB.DataBase.TPOSTULANTE_ENTREVISTA;
import static DB.DataBase.TPOSTULANTE_FECHA_NACIMIENTO;
import static DB.DataBase.TPOSTULANTE_MEDIO;
import static DB.DataBase.TPOSTULANTE_NOMBRE;
import static DB.DataBase.TPOSTULANTE_PUESTO;
import static DB.DataBase.TPOSTULANTE_TELEFONO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Renatto
 */
public class PostulantesDAO extends Conexion{
    
    public ArrayList <Postulante> readByConvocatoria(String id_convocatoria){
        ArrayList<Postulante> postulantes = new ArrayList();
       try(Connection connection = get_connection()){
           
           String query = "SELECT * FROM " + TPOSTULANTE + " WHERE " + TCONVOCATORIA_ID +" = " + id_convocatoria;
           PreparedStatement preparedStatement = connection. prepareStatement(query);
           ResultSet rs = preparedStatement.executeQuery();
           
           while(rs.next()){
               Postulante postulante;
               postulante = new Postulante(
                       rs.getString(TPOSTULANTE_DNI),
                       rs.getString(TPOSTULANTE_NOMBRE),
                       rs.getString(TPOSTULANTE_DIRECCION),
                       Integer.valueOf(rs.getString(TPOSTULANTE_EDAD)),
                       rs.getString(TPOSTULANTE_APROBADO),
                       rs.getString(TPOSTULANTE_CIUDAD),
                       rs.getString(TPOSTULANTE_DISTRITO),
                       rs.getString(TPOSTULANTE_PUESTO),
                       rs.getString(TPOSTULANTE_MEDIO),
                       rs.getString(TPOSTULANTE_CORREO),
                       rs.getString(TPOSTULANTE_TELEFONO),
                       rs.getString(TPOSTULANTE_FECHA_NACIMIENTO),
                       rs.getString(TPOSTULANTE_CONVOCATORIA),
                       rs.getString(TPOSTULANTE_ENTREVISTA));
               postulantes.add(postulante);
           }
       }catch(SQLException e){
           e.printStackTrace();
       }
       return postulantes;
    }
    
    public void aprobarPostulante(String dni_postulante){
        
        try(Connection connection = get_connection()){
           
           String query = "UPDATE " + TPOSTULANTE + " SET " + TPOSTULANTE_APROBADO +" = 'SI' WHERE " + TPOSTULANTE_DNI + " = '" + dni_postulante + "'";
           PreparedStatement preparedStatement = connection. prepareStatement(query);
           preparedStatement.executeQuery();
               
       }catch(SQLException e){
           e.printStackTrace();
       }
    }
    
    public void updatePuesto(String dni_postulante,String puesto){ //Se leen los puestos de la tabla y el que se escoge se actualiza en el puesto del postulante
         try(Connection connection = get_connection()){
           
           String query = "UPDATE " + TPOSTULANTE + " SET " + TPOSTULANTE_PUESTO +" = '" + puesto + "' WHERE " + TPOSTULANTE_DNI + " = '" + dni_postulante + "'";
           PreparedStatement preparedStatement = connection. prepareStatement(query);
           preparedStatement.executeQuery();
               
       }catch(SQLException e){
           e.printStackTrace();
       }
    }
    
}
