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
public class Puesto {
    private String codigoPuesto;
    private String nombrePuesto;
    private int salario;
    private String horario;

    public Puesto() {
    }

    public Puesto(String codigoPuesto, String nombrePuesto, int salario, String horario) {
        this.codigoPuesto = codigoPuesto;
        this.nombrePuesto = nombrePuesto;
        this.salario = salario;
        this.horario = horario;
    }

    public String getCodigoPuesto() {
        return codigoPuesto;
    }

    public void setCodigoPuesto(String codigoPuesto) {
        this.codigoPuesto = codigoPuesto;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
}
