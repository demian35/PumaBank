/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pumabank;

import java.util.ArrayList;

/**
 *
 * @author josed
 */
public class Cuenta {
    
    private String tipoCuenta;
    private double montoInicial;
    ArrayList<Movimiento> historial;
    
    public Cuenta(){
        historial=new ArrayList<Movimiento>();
    }
    
    
    public String getTipoCuenta(){
        return tipoCuenta;
    }
    
    public double getMontoInicial(){
        return montoInicial;
    }
    
    public void setTipoCuenta(String tipoCuenta){
        this.tipoCuenta=tipoCuenta;
    }
    
    public void setMontoInicial(double montoInicial){
        this.montoInicial=montoInicial;
    }
    
    
}
