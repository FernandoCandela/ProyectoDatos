/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

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

public class Postulante {
    private String dni;
    private String nombre;
    private String direccion;
    private int edad;
    private boolean aprobado;
    private String ciudad;
    private String distrito;
    private String puesto_potencial;
    private String medio_convocatoria;
    private String correo;
    private String telefono;
    private String fecha_nac;
    private String id_convocatoria;
    private String cod_entrevista;

    public Postulante() {
    }

    public Postulante(String dni, String nombre, String direccion, int edad, boolean aprobado, String ciudad, String distrito, String puesto_potencial, String medio_convocatoria, String correo, String telefono, String fecha_nac, String id_convocatoria, String cod_entrevista) {
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
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

    public String getId_convocatoria() {
        return id_convocatoria;
    }

    public void setId_convocatoria(String id_convocatoria) {
        this.id_convocatoria = id_convocatoria;
    }

    public String getCod_entrevista() {
        return cod_entrevista;
    }

    public void setCod_entrevista(String cod_entrevista) {
        this.cod_entrevista = cod_entrevista;
    }

    
    
    
}
