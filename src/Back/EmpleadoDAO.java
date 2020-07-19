/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Back;

import Clases.Empleado;
import static DB.DataBase.TEMPLEADO;
import static DB.DataBase.TEMPLEADO_AFP;
import static DB.DataBase.TEMPLEADO_CIUDAD;
import static DB.DataBase.TEMPLEADO_CORREO;
import static DB.DataBase.TEMPLEADO_CUENTA_BANCO;
import static DB.DataBase.TEMPLEADO_DIRECCION;
import static DB.DataBase.TEMPLEADO_DISTRITO;
import static DB.DataBase.TEMPLEADO_DNI;
import static DB.DataBase.TEMPLEADO_EDAD;
import static DB.DataBase.TEMPLEADO_ENTREVISTA;
import static DB.DataBase.TEMPLEADO_FECHA_NACIMIENTO;
import static DB.DataBase.TEMPLEADO_NOMBRE;
import static DB.DataBase.TEMPLEADO_TELEFONO;
import static DB.DataBase.TEMPLEADO_TIENDA;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Piero
 */
public class EmpleadoDAO extends Conexion{
    
    public ArrayList <Empleado> read(){
        ArrayList<Empleado> empleados = new ArrayList();
       try(Connection connection = get_connection()){
           
           String query = "SELECT * FROM " + TEMPLEADO;
           PreparedStatement preparedStatement = connection. prepareStatement(query);
           ResultSet rs = preparedStatement.executeQuery();
           
           while(rs.next()){
               Empleado empleado;
               empleado = new Empleado(
                       rs.getString(TEMPLEADO_DNI),
                       rs.getString(TEMPLEADO_NOMBRE),
                       rs.getString(TEMPLEADO_DIRECCION),
                       Integer.valueOf(rs.getString(TEMPLEADO_EDAD)),
                       rs.getString(TEMPLEADO_CIUDAD),
                       rs.getString(TEMPLEADO_DISTRITO),
                       rs.getString(TEMPLEADO_CORREO),
                       rs.getString(TEMPLEADO_TELEFONO),
                       rs.getString(TEMPLEADO_FECHA_NACIMIENTO),
                       rs.getString(TEMPLEADO_CUENTA_BANCO),
                       rs.getString(TEMPLEADO_AFP),
                       rs.getString(TEMPLEADO_ENTREVISTA),
                       rs.getString(TEMPLEADO_TIENDA));
               empleados.add(empleado);
           }
       }catch(SQLException e){
           e.printStackTrace();
       }
       return empleados;
    }
    
    
}

