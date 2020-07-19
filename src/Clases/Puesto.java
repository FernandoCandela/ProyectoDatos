/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Back.PuestoDAO;
import java.util.ArrayList;

/**
 *
 * @author Piero
 */
public class Puesto extends PuestoDAO{
    private String codigo;
    private String nombre;
    private int salario;
    private String horario;

    public Puesto() {
    }

    public Puesto(String codigo, String nombre, int salario, String horario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.salario = salario;
        this.horario = horario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public static ArrayList<Puesto> makePuestoList(){
        Puesto foobar= new Puesto();
        return foobar.read();
    }
    
    
    
}
