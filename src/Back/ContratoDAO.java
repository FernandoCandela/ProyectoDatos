    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package Back;

    import Clases.Contrato;
    import static DB.DataBase.TCONTRATO;
    import static DB.DataBase.TCONTRATO_CODIGO;
    import static DB.DataBase.TCONTRATO_DNI;
    import static DB.DataBase.TCONTRATO_FECHA_FIN;
    import static DB.DataBase.TCONTRATO_FECHA_INICIO;
    import static DB.DataBase.TCONTRATO_HORARIO;
    import static DB.DataBase.TCONTRATO_PUESTO;
    import static DB.DataBase.TCONTRATO_SALARIO_BRUTO;
    import static DB.DataBase.TCONTRATO_TIPO;
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
    public class ContratoDAO extends Conexion{

         public ArrayList<Contrato> read(){
           ArrayList<Contrato> contratos = new ArrayList();
           try(Connection connection = get_connection()){

               String query = "SELECT * FROM " + TCONTRATO;
               PreparedStatement preparedStatement = connection. prepareStatement(query);
               ResultSet rs = preparedStatement.executeQuery();

               while(rs.next()){
                   Contrato contrato= new Contrato(
                                    rs.getString(TCONTRATO_CODIGO),
                                    rs.getString(TCONTRATO_FECHA_INICIO),
                                    rs.getString(TCONTRATO_FECHA_FIN),
                                    rs.getString(TCONTRATO_TIPO),
                                    rs.getString(TCONTRATO_HORARIO),
                                    rs.getString(TCONTRATO_SALARIO_BRUTO),
                                    rs.getString(TCONTRATO_PUESTO),
                                    rs.getString(TCONTRATO_DNI));
                  contratos.add(contrato);
               }
           }catch(SQLException e){

           }    
           return contratos;

        }

         public void insert(Contrato contrato){

             try(Connection connection = get_connection()){
                Statement statement = connection.createStatement();
                String query="INSERT INTO "+ TCONTRATO + " (" 
                        +TCONTRATO_CODIGO + ", "+ TCONTRATO_FECHA_INICIO + ", "
                        + TCONTRATO_FECHA_FIN + ", "+TCONTRATO_TIPO + ", "+TCONTRATO_HORARIO + ", "
                        + TCONTRATO_SALARIO_BRUTO + ", "+TCONTRATO_PUESTO + ", "+TCONTRATO_DNI +")" + " VALUES('"
                        + contrato.getCodigo() + "', '"
                        + contrato.getFecha_inicio() + "', '"
                        + contrato.getFecha_fin() + "', '"
                        + contrato.getTipo() + "', '"
                        + contrato.getHorario() + "', '"
                        + contrato.getSalario() + "', '"
                        + contrato.getPuesto() + "', '"
                        + contrato.getDNI()+ "')";

                if(statement.executeUpdate(query)>0){
                    System.out.println("Se inserto Contrato");
                }

             }catch(SQLException e){
                 e.printStackTrace();
             }
         }
    }
