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
import java.sql.Statement;
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
                       Integer.valueOf(rs.getString(TEMPLEADO_ENTREVISTA)),
                       rs.getString(TEMPLEADO_TIENDA));
               empleados.add(empleado);
           }
       }catch(SQLException e){
           e.printStackTrace();
       }
       return empleados;
    }
    
     /*public static final String TEMPLEADO="EMPLEADO";
    public static final String TEMPLEADO_DNI="DNI";
    public static final String TEMPLEADO_NOMBRE="NOMBRE_COMPLETO";
    public static final String TEMPLEADO_DIRECCION="DIRECCION";
    public static final String TEMPLEADO_EDAD="EDAD";
    public static final String TEMPLEADO_CIUDAD="CIUDAD";
    public static final String TEMPLEADO_DISTRITO="DISTRITO";
    public static final String TEMPLEADO_CORREO="CORREO";
    public static final String TEMPLEADO_TELEFONO="TELEFONO";
    public static final String TEMPLEADO_FECHA_NACIMIENTO="FECHA_NACIMIENTO";
    public static final String TEMPLEADO_CUENTA_BANCO="CUENTA_BANCO";
    public static final String TEMPLEADO_AFP="AFP";
    public static final String TEMPLEADO_ENTREVISTA="CODIGO_ENTREVISTA";
    public static final String TEMPLEADO_TIENDA="NOMBRE_TIENDA";*/
    
    public void insert(Empleado empleado){
        try(Connection connection = get_connection()){
            Statement statement = connection.createStatement();
            String query="INSERT INTO "+ TEMPLEADO + " (" 
                    +TEMPLEADO_DNI + ", "+ TEMPLEADO_NOMBRE + ", "
                    + TEMPLEADO_DIRECCION + ", "+ TEMPLEADO_EDAD + ", "
                    + TEMPLEADO_CIUDAD + ", "+ TEMPLEADO_DISTRITO + ", "
                    + TEMPLEADO_CORREO + ", "+ TEMPLEADO_TELEFONO + ", "
                    + TEMPLEADO_FECHA_NACIMIENTO + ", "+ TEMPLEADO_CUENTA_BANCO + ", "
                    + TEMPLEADO_AFP + ", "+ TEMPLEADO_ENTREVISTA + ", "+ TEMPLEADO_TIENDA 
                    + ")" + " VALUES('"
                    + empleado.getDni()+ "', '"+empleado.getNombre_completo()+"','"+
                    empleado.getDireccion()+"',"+empleado.getEdad()+",'"+empleado.getCiudad()+
                    "','"+empleado.getDistrito()+"','"+empleado.getCorreo()+"','"+empleado.getTelefono()
                    +"','"+empleado.getFecha_nacimiento()+"','"+empleado.getCuenta_banco()+"','"+empleado.getAfp()
                    +"',"+empleado.getCodigo_entrevista()+",'"+empleado.getNombre_tienda()+"')";
                    
            
            if(statement.executeUpdate(query)>0){
                System.out.println("Se inserto Convocatoria");
            }
                    
         }catch(SQLException e){
             e.printStackTrace();
         }
    }
    
}

