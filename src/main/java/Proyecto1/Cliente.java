 package Proyecto1;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pc
 */
public class Cliente extends Persona implements Iterator{
    //Creación de atributos privados
    private Representante datosRepresentante;
    //Creacion de la lista static tipo Cliente
    public static ArrayList <Cliente> arrayCliente= new ArrayList();
    
    //Creación de constructor que sirve para agregar clientes como un método agregarClientes()
    public Cliente(String cedula, String nombre, String telefono, String email, Representante datosRepresentante){
        super(cedula, nombre, telefono, email);
        this.datosRepresentante = datosRepresentante;
        arrayCliente.add(this);
    }
    
    //se editan los clientes con los setters
    //se agregan los clientes con el constructor
    
    //Creación de getter y setter
    public Representante getDatosRepresentante(){
        return datosRepresentante;
    }
    
    public void setDatosRepresentante(Representante datosRepresentante){
        this.datosRepresentante = datosRepresentante;
    }
    
    //Creación de método buscar cliente
    public static Cliente buscarCliente(String c){
        for (Cliente listaC:arrayCliente){
            if (listaC.getCedula().equals(c)){
                return listaC;
            }
        }
        return null;
    }
    
    //Creación de método mostar cliente
    public static void mostrarClientes(){
        Iterator <Cliente> iter = arrayCliente.iterator();
        while(iter.hasNext()){
            Cliente clt = iter.next();
            System.out.println(clt);
        }
    }
    
    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object next() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return super.toString() + "\nDatos del representante:\n" + datosRepresentante+"\n";
    }
    

}