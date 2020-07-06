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
public class Postulante {
    private String dniPostulante;
    private String nombrePostulante;
    private String direccion;
    private int edad;
    private boolean aprobado;
    private String ciudad;
    private String distrito;
    private String puestoPotencial;
    private String medioConvocatoria;
    private String correo;
    private String telefono;
    private String fecha_nac;
    private String idConvocatoria;
    private String cod_entrevista;

    public Postulante() {
    }

    public Postulante(String dniPostulante, String nombrePostulante, String direccion, int edad, boolean aprobado, String ciudad, String distrito, String puestoPotencial, String medioConvocatoria, String correo, String telefono, String fecha_nac, String idConvocatoria, String cod_entrevista) {
        this.dniPostulante = dniPostulante;
        this.nombrePostulante = nombrePostulante;
        this.direccion = direccion;
        this.edad = edad;
        this.aprobado = aprobado;
        this.ciudad = ciudad;
        this.distrito = distrito;
        this.puestoPotencial = puestoPotencial;
        this.medioConvocatoria = medioConvocatoria;
        this.correo = correo;
        this.telefono = telefono;
        this.fecha_nac = fecha_nac;
        this.idConvocatoria = idConvocatoria;
        this.cod_entrevista = cod_entrevista;
    }
    
    

    public String getDniPostulante() {
        return dniPostulante;
    }

    public void setDniPostulante(String dniPostulante) {
        this.dniPostulante = dniPostulante;
    }

    public String getNombrePostulante() {
        return nombrePostulante;
    }

    public void setNombrePostulante(String nombrePostulante) {
        this.nombrePostulante = nombrePostulante;
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

    public String getPuestoPotencial() {
        return puestoPotencial;
    }

    public void setPuestoPotencial(String puestoPotencial) {
        this.puestoPotencial = puestoPotencial;
    }

    public String getMedioConvocatoria() {
        return medioConvocatoria;
    }

    public void setMedioConvocatoria(String medioConvocatoria) {
        this.medioConvocatoria = medioConvocatoria;
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

    public String getIdConvocatoria() {
        return idConvocatoria;
    }

    public void setIdConvocatoria(String idConvocatoria) {
        this.idConvocatoria = idConvocatoria;
    }

    public String getCod_entrevista() {
        return cod_entrevista;
    }

    public void setCod_entrevista(String cod_entrevista) {
        this.cod_entrevista = cod_entrevista;
    }
    
    
}
