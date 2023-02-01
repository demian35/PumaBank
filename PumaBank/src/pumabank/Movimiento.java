/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pumabank;

/**
 *
 * @author josed
 */
public class Movimiento {
    
    private String tipoMovimiento;
    private String fechaMovimiento;
    private double monto;
    
    
    public Movimiento(){
    }
    
    public String getTipoMovimiento(){
        return tipoMovimiento;
    }
    
    public String getFechaMovimiento(){
        return fechaMovimiento;
    }
    
    public double getMonto(){
        return monto;
    }
    
    public void setTipoMovimiento(String tipoMovimiento){
        this.tipoMovimiento=tipoMovimiento;
    }
    
    public void setFechaMovimiento(String fechaMovimiento){
        this.fechaMovimiento=fechaMovimiento;
    }
    
    public void setMonto(double monto){
        this.monto=monto;
    }
    
    
}
