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
    private String nombreCompleto;
    private String direccion;
    private String cuentaBanco;
    private String afp;
    private String codigoEntrevista;
    private String nombreTienda;

    public Empleado() {
    }

    public Empleado(String dni, String nombreCompleto, String direccion, String cuentaBanco, String afp, String codigoEntrevista, String nombreTienda) {
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.cuentaBanco = cuentaBanco;
        this.afp = afp;
        this.codigoEntrevista = codigoEntrevista;
        this.nombreTienda = nombreTienda;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCuentaBanco() {
        return cuentaBanco;
    }

    public void setCuentaBanco(String cuentaBanco) {
        this.cuentaBanco = cuentaBanco;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public String getCodigoEntrevista() {
        return codigoEntrevista;
    }

    public void setCodigoEntrevista(String codigoEntrevista) {
        this.codigoEntrevista = codigoEntrevista;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }
    
    
}
