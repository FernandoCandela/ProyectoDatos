/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Back.PostulanteDAO;
import java.util.ArrayList;

/**
 *
 * @author Piero
 */
/*
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
*/

public class Postulante extends PostulanteDAO{
    private String dni;
    private String nombre;
    private String direccion;
    private Integer edad;
    private String aprobado;
    private String ciudad;
    private String distrito;
    private String puesto_potencial;
    private String medio_convocatoria;
    private String correo;
    private String telefono;
    private String fecha_nac;
    private Integer id_convocatoria;
    private Integer cod_entrevista;

    public Postulante() {
    }

    public Postulante(String dni, String nombre, String direccion, Integer edad,String aprobado, 
            String ciudad, String distrito, String puesto_potencial, String medio_convocatoria, 
            String correo, String telefono, String fecha_nac, Integer id_convocatoria, Integer cod_entrevista) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.aprobado = aprobado;
        this.ciudad = ciudad;
        this.distrito = distrito;
        this.puesto_potencial = puesto_potencial;
        this.medio_convocatoria = medio_convocatoria;
        this.correo = correo;
        this.telefono = telefono;
        this.fecha_nac = fecha_nac;
        this.id_convocatoria = id_convocatoria;
        this.cod_entrevista = cod_entrevista;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getAprobado() {
        return aprobado;
    }

    public void setAprobado(String aprobado) {
        this.aprobado = aprobado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getPuesto_potencial() {
        return puesto_potencial;
    }

    public void setPuesto_potencial(String puesto_potencial) {
        this.puesto_potencial = puesto_potencial;
    }

    public String getMedio_convocatoria() {
        return medio_convocatoria;
    }

    public void setMedio_convocatoria(String medio_convocatoria) {
        this.medio_convocatoria = medio_convocatoria;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public Integer getId_convocatoria() {
        return id_convocatoria;
    }

    public void setId_convocatoria(Integer id_convocatoria) {
        this.id_convocatoria = id_convocatoria;
    }

    public Integer getCod_entrevista() {
        return cod_entrevista;
    }

    public void setCod_entrevista(Integer cod_entrevista) {
        this.cod_entrevista = cod_entrevista;
    }

    @Override
    public String toString() {
        return "Postulante{" + "dni=" + dni + ", nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + ", aprobado=" + aprobado + ", ciudad=" + ciudad + ", distrito=" + distrito + ", puesto_potencial=" + puesto_potencial + ", medio_convocatoria=" + medio_convocatoria + ", correo=" + correo + ", telefono=" + telefono + ", fecha_nac=" + fecha_nac + ", id_convocatoria=" + id_convocatoria + ", cod_entrevista=" + cod_entrevista + '}';
    }

    public static void crear_Postulante(Postulante postulante){
        Postulante foobar= new Postulante();
        foobar.insertarPostulante(postulante);
    }
    
    public static ArrayList<Postulante> leer_postulantes_por_convocatoria(Integer id_convocatoria){
        Postulante foobar=new Postulante();
        return foobar.readByConvocatoria(id_convocatoria);
    }
    
    public static void aprobar_postulante(String dni_postulante){
        Postulante foobar= new Postulante();
        foobar.aprobarPostulante(dni_postulante);
    }
    public static void actualizar_puesto(String dni_postulante,String puesto){
        Postulante foobar= new Postulante();
        foobar.updatePuesto(dni_postulante, puesto);
    }
    public static ArrayList <Postulante> leer_postulante_aprobado(){
        Postulante foobar=new Postulante();
        return foobar.readIfApproved();
    }
    public static void removerPostulante(String dni_postulante){
        Postulante foobar= new Postulante();
        foobar.removePostulante(dni_postulante);
    }
}
