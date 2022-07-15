/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto1;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author Jorge Mawyin, Ricardo Freire, Kevin Roldan
 */
public class Persona {
    //Creación de atributos privados
    private String cedula;
    private String nombre;
    private String telefono;
    private String email;

    //Creación de getters para cada atributo
    public String getCedula(){
        return cedula;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public String getEmail(){
        return email;
    }
    
    //Creaciòn de setters para cada atributo
 
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    //Creador de constructor
    public Persona(String cedula, String nombre, String telefono, String email){
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }
    
    @Override
    public String toString(){
        return("Nombre: "+nombre+"\nCedula: "+cedula+"\nTelefono: "+telefono+"\nEmail: "+email);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return Objects.equals(this.cedula, other.cedula);
    }
    
    
}
