/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Renatto
 */
public class Telefono {
    private String DNI;
    private String numero_telefono;

    public Telefono() {
    }

    public Telefono(String DNI, String numero_telefono) {
        this.DNI = DNI;
        this.numero_telefono = numero_telefono;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(String numero_telefono) {
        this.numero_telefono = numero_telefono;
    }
    
    
}
