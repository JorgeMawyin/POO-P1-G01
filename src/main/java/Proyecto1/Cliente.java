package Proyecto1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pc
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
    
    public String mostrarCliente(String cliente){
        return "Cliente: "+cliente;
    }
    
    public String editarCliente(String nombre, String email, Representante datosRepresentante){
        ret
    }
}