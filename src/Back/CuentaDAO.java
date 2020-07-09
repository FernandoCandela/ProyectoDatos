/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Back;

import Clases.Cuenta;
import static DB.DataBase.TCUENTA;
import static DB.DataBase.TCUENTA_DNI;
import static DB.DataBase.TCUENTA_PASSWORD;
import static DB.DataBase.TCUENTA_USER;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Renatto
 */
public class CuentaDAO extends Conexion{
    
    public ArrayList <Cuenta> read(){
        ArrayList<Cuenta> cuentas = new ArrayList();
       try(Connection connection = get_connection()){
           
           String query = "SELECT * FROM " + TCUENTA;
           PreparedStatement preparedStatement = connection. prepareStatement(query);
           ResultSet rs = preparedStatement.executeQuery();
           
           while(rs.next()){
               Cuenta cuenta= new Cuenta(
                                rs.getString(TCUENTA_DNI),
                                rs.getString(TCUENTA_USER),
                                rs.getString(TCUENTA_PASSWORD));
               cuentas.add(cuenta);
           }
       }catch(SQLException e){
           e.printStackTrace();
       }
       return cuentas;
    }
}
