/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Back.CuentaDAO;
import java.util.ArrayList;

/**
 *
 * @author Renatto
 */
public class Cuenta extends CuentaDAO{
    private String DNI;
    private String user;
    private String password;

    public Cuenta() {
    }

    public Cuenta(String DNI, String user, String password) {
        this.DNI = DNI;
        this.user = user;
        this.password = password;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public static ArrayList<Cuenta> make_Lista_Cuenta(){
        Cuenta cuenta= new Cuenta();
        return cuenta.read();
        
    }
}
