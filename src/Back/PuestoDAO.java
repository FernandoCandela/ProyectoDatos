/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Back;

import Clases.Puesto;
import static DB.DataBase.TPUESTOS;
import static DB.DataBase.TPUESTOS_CODIGO;
import static DB.DataBase.TPUESTOS_HORARIO;
import static DB.DataBase.TPUESTOS_NOMBRE;
import static DB.DataBase.TPUESTOS_SALARIO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Renatto
 */
public class PuestoDAO extends Conexion{
     public ArrayList<Puesto> read(){
       ArrayList<Puesto> puestos = new ArrayList();
       try(Connection connection = get_connection()){
           
           String query = "SELECT * FROM " + TPUESTOS;
           PreparedStatement preparedStatement = connection. prepareStatement(query);
           ResultSet rs = preparedStatement.executeQuery();
           
           /*public static final String TPUESTOS="PUESTOS";
            public static final String TPUESTOS_CODIGO="CODIGO_PUESTO";
            public static final String TPUESTOS_NOMBRE="NOMBRE_PUESTO";
            public static final String TPUESTOS_SALARIO="SALARIO";
            public static final String TPUESTOS_HORARIO="HORARIO";*/
           while(rs.next()){
               Puesto puesto= new Puesto(
                                rs.getString(TPUESTOS_CODIGO),
                                rs.getString(TPUESTOS_NOMBRE),
                                Integer.valueOf(rs.getString(TPUESTOS_SALARIO)),
                                rs.getString(TPUESTOS_HORARIO));
              puestos.add(puesto);
           }
       }catch(SQLException e){
           e.printStackTrace();
       }    
       return puestos;
       
    }
}
