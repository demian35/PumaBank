/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pumabank;

/**
 *
 * @author josed
 */
public class Cuenta {
    
    private String tipoCuenta;
    private double montoInicial;
    
    public Cuenta(){}
    
    
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
