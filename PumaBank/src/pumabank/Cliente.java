/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pumabank;

/**
 *
 * @author josed
 */
public class Cliente {
    
    private String nombre;
    private String telefono;
    private String direccion;
    
    public Cliente(){}
    
    
    public String getNombre(){
        return nombre;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public String getDireccion(){
        return direccion;
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
    
}
