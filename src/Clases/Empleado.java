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

public class Empleado {
    private String dni;
    private String nombre_completo;
    private String direccion;
    private String edad;
    private String ciudad;
    private String distrito;
    private String correo;
    private String telefono;
    private String fecha_nacimiento;
    private String cuenta_banco;
    private String afp;
    private String codigo_entrevista;
    private String nombre_tienda;

    public Empleado() {
    }

    public Empleado(String dni, String nombre_completo, String direccion, String edad, String ciudad, String distrito, String correo, String telefono, String fecha_nacimiento, String cuenta_banco, String afp, String codigo_entrevista, String nombre_tienda) {
        this.dni = dni;
        this.nombre_completo = nombre_completo;
        this.direccion = direccion;
        this.edad = edad;
        this.ciudad = ciudad;
        this.distrito = distrito;
        this.correo = correo;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.cuenta_banco = cuenta_banco;
        this.afp = afp;
        this.codigo_entrevista = codigo_entrevista;
        this.nombre_tienda = nombre_tienda;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
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

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getCuenta_banco() {
        return cuenta_banco;
    }

    public void setCuenta_banco(String cuenta_banco) {
        this.cuenta_banco = cuenta_banco;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public String getCodigo_entrevista() {
        return codigo_entrevista;
    }

    public void setCodigo_entrevista(String codigo_entrevista) {
        this.codigo_entrevista = codigo_entrevista;
    }

    public String getNombre_tienda() {
        return nombre_tienda;
    }

    public void setNombre_tienda(String nombre_tienda) {
        this.nombre_tienda = nombre_tienda;
    }

    
    
    
}
