package Proyecto1;

import java.util.ArrayList;

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
    public static ArrayList <Cliente> arrayCliente= new ArrayList();
    
    //Creación de constructor
    public Cliente(String cedula, String nombre, String telefono, String email, Representante datosRepresentante){
        super(cedula, nombre, telefono, email);
        this.datosRepresentante = datosRepresentante;
        arrayCliente.add(this);
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
    
    public void editarCliente(String nombre, String email, Representante datosRepresentante){
        
    }
}