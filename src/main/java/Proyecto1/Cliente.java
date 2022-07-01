package Proyecto1;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jorge Mawyin, Ricardo Freire, Kevin Roldan
 */
public class Cliente extends Persona {
    //Creación de atributos privados
    private Representante datosRepresentante;
    
    //Creación de constructor
    public Cliente(String cedula, String nombre, String telefono, String email, Representante datosRepresentante){
        super(cedula, nombre, telefono, email);
        this.datosRepresentante = datosRepresentante;
    }
    
    //Creación de getter y setter
    public Representante getDatosRepresentante(){
        return datosRepresentante;
    }
    
    public void setDatosRepresentante(Representante datosRepresentante){
        this.datosRepresentante = datosRepresentante;
    }
    
    public String editarCliente(String nombre, String email, Representante datosRepresentante){
        return "s";
    }
    
    @Override
    public String toString(){
        System.out.println("Información del cliente: ");
        return(super.toString()+"\nDatos Representante: \n"+datosRepresentante.toString());
    }
}