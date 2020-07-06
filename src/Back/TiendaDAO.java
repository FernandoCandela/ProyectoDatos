/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Back;

import Clases.Tienda;
import static DB.DataBase.TTIENDA;
import static DB.DataBase.TTIENDA_NOMBRE;
import static DB.DataBase.TTIENDA_UBICACION;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Renatto
 */
public class TiendaDAO extends Conexion{
    
     public ArrayList<Tienda> read(){
       ArrayList<Tienda> tiendas = new ArrayList();
       try(Connection connection = get_connection()){
           
           String query = "SELECT * FROM " + TTIENDA;
           PreparedStatement preparedStatement = connection. prepareStatement(query);
           ResultSet rs = preparedStatement.executeQuery();
           
           while(rs.next()){
               Tienda tienda= new Tienda(
                                rs.getString(TTIENDA_NOMBRE),
                                rs.getString(TTIENDA_UBICACION));
               tiendas.add(tienda);
           }
       }catch(SQLException e){
           
       }
       return tiendas;
       
    }
}
