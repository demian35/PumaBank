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
public class Cliente {
    
    private String nombre;
    private String telefono;
    private String direccion;
    //las cuentas que abra el cliente las iremos guardando en el arraylist
    private ArrayList<Cuenta> miscuentas;
    
    //al momento de crear un cliente instanciamos esta lista de cuentas
    public Cliente(){
        miscuentas= new ArrayList<Cuenta>();
    
    }
    
    //cuendo el cliente abra una cuenta la guardaremos en el arraylist
    public void agregaCuenta(Cuenta cuenta){
        miscuentas.add(cuenta);
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public ArrayList<Cuenta> getMisCuentas(){
        return miscuentas;
    }
    
    
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    
    public void setMisCuentas(ArrayList<Cuenta> miscuentas){
        this.miscuentas=miscuentas;
    }
    
}
