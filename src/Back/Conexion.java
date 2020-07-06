/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Back;

import java.sql.*;


/**
 *
 * @author Renatto
 */
public class Conexion {
    
    public Connection get_connection(){
        Connection conection = null;
        try{
            conection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1","TAREADATOS","123");
            if(conection!= null){
                System.out.println("Conexion exitosa");
            }
        }catch(SQLException e){
            System.out.println(e);  
        }
        return conection;
    }
}
