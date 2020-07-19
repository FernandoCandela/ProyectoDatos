/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Back.ContratoDAO;
import java.util.ArrayList;

/**
 *
 * @author Renatto
 */
public class Contrato extends ContratoDAO{
    private String codigo;
    private String fecha_inicio;
    private String fecha_fin;
    private String tipo;
    private String horario;
    private Integer salario;
    private String puesto;
    private String DNI;

    public Contrato() {
    }

    public Contrato(String codigo, String fecha_inicio, String fecha_fin, String tipo, String horario, Integer salario, String puesto, String DNI) {
        this.codigo = codigo;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.tipo = tipo;
        this.horario = horario;
        this.salario = salario;
        this.puesto = puesto;
        this.DNI = DNI;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    public static ArrayList <Contrato> makeList(){
        Contrato foobar = new Contrato();
        return foobar.read();
        
    }
    public static void insertarContrato(Contrato contrato){
        Contrato foobar = new Contrato();
        foobar.insert(contrato);
    }
    
}
