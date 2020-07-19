/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

/**
 *
 * @author Renatto
 */
public class DataBase {
    
    //CONTRATO
    public static final String TCONTRATO="CONTRATO";
    public static final String TCONTRATO_CODIGO="CODIGO_CONTRATO";
    public static final String TCONTRATO_FECHA_INICIO="FECHA_INICIO";
    public static final String TCONTRATO_FECHA_FIN="FECHA_FIN";
    public static final String TCONTRATO_TIPO="TIPO";
    public static final String TCONTRATO_HORARIO="HORARIO";
    public static final String TCONTRATO_SALARIO_BRUTO="SALARIO_BRUTO";
    public static final String TCONTRATO_PUESTO="PUESTO";
    public static final String TCONTRATO_DNI="DNI";
    
    //CONVOCATORIA
    public static final String TCONVOCATORIA="CONVOCATORIA";
    public static final String TCONVOCATORIA_ID="ID_CONVOCATORIA";
    public static final String TCONVOCATORIA_FECHA="FECHA_CONVOCATORIA";
    public static final String TCONVOCATORIA_DESCRIPCION="DESCRIPCION";
    
    //CONVOCATORIA_PUESTO
    
    public static final String TCONVOCATORIA_PUESTO="CONVOCATORIA_PUESTO";
    public static final String TCONVOCATORIA_PUESTO_ID_CONVOCATORIA="ID_CONVOCATORIA";
    public static final String TCONVOCATORIA_PUESTO_CODIGO_PUESTO="CODIGO_PUESTO";
    
    //CUENTA
    public static final String TCUENTA="CUENTA";
    public static final String TCUENTA_DNI="DNI";
    public static final String TCUENTA_USER="USUARIO";
    public static final String TCUENTA_PASSWORD="CONTRASENIA";
    
    //EMPLEADO
    public static final String TEMPLEADO="EMPLEADO";
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
    public static final String TEMPLEADO_TIENDA="NOMBRE_TIENDA";
    
    //ENTREVISTA
    public static final String TENTREVISTA="ENTREVISTA";
    public static final String TENTREVISTA_CODIGO="CODIGO";
    public static final String TENTREVISTA_RECLUTADOR="DNI_RECLUTADOR";
    
    //HABILIDAD
    public static final String THABILIDADES="HABILIDADES";
    public static final String THABILIDADES_CODIGO="CODIGO_HABILIDAD";
    public static final String THABILIDADES_HABILIDAD="HABILIDAD";
    
    //POSTULANTE
    public static final String TPOSTULANTE="POSTULANTE";            
    public static final String TPOSTULANTE_DNI="DNI";
    public static final String TPOSTULANTE_NOMBRE="NOMBRE_COMPLETO";
    public static final String TPOSTULANTE_DIRECCION="DIRECCION";
    public static final String TPOSTULANTE_EDAD="EDAD";
    public static final String TPOSTULANTE_APROBADO="APROBADO";
    public static final String TPOSTULANTE_CIUDAD="CIUDAD";
    public static final String TPOSTULANTE_DISTRITO="DISTRITO";
    public static final String TPOSTULANTE_PUESTO="PUESTO_POTENCIAL";
    public static final String TPOSTULANTE_MEDIO="MEDIO_CONVOCATORIA";
    public static final String TPOSTULANTE_CORREO="CORREO";
    public static final String TPOSTULANTE_TELEFONO="TELEFONO";
    public static final String TPOSTULANTE_FECHA_NACIMIENTO="FECHA_NACIMIENTO";
    public static final String TPOSTULANTE_CONVOCATORIA="ID_CONVOCATORIA";
    public static final String TPOSTULANTE_ENTREVISTA="CODIGO_ENTREVISTA";
    
    //POSTULANTE_HABILIDAD
    public static final String TPOSTULANTE_HABILIDAD="POSTULANTE_HABILIDAD";
    public static final String TPOSTULANTE_HABILIDAD_DNI="DNI";
    public static final String TPOSTULANTE_HABILIDAD_HABILIDAD="CODIGO_HABILIDAD";
    
    //PUESTOS
    public static final String TPUESTOS="PUESTOS";
    public static final String TPUESTOS_CODIGO="CODIGO_PUESTO";
    public static final String TPUESTOS_NOMBRE="NOMBRE_PUESTO";
    public static final String TPUESTOS_SALARIO="SALARIO";
    public static final String TPUESTOS_HORARIO="HORARIO";
    
    //RECLUTADOR
    public static final String TRECLUTADOR="RECLUTADOR";
    public static final String TRECLUTADOR_DNI="DNI";
    public static final String TRECLUTADOR_NOMBRE="NOMBRE_COMPLETO";
    
    //TELEFONO
    public static final String TTELEFONO="TELEFONO";
    public static final String TTELEFONO_DNI="DNI";
    public static final String TTELEFONO_NUMERO="NUMERO_TELEFONO";
    
    
            
    //Tienda
    public static final String TTIENDA = "TIENDA";
    public static final String TTIENDA_NOMBRE = "NOMBRE_TIENDA";
    public static final String TTIENDA_UBICACION = "UBICACION";
    
    
            
    
    
    
    
}
