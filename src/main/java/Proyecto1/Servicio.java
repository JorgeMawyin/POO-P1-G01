/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto1;

import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Jorge Mawyin, Ricardo Freire, Kevin Roldan
 */

public class Servicio implements Iterator {
    
    //Creacion de atributos de Servicios
    private TipoServicio nombreServicio;
    private int duracionAtencion;
    private double precio;
    private boolean estado;  
    public static ArrayList <Servicio> arrayServ= new ArrayList();
    
    // Creacion de Getters and Setters

    public TipoServicio getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(TipoServicio nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public int getDuracionAtencion() {
        return duracionAtencion;
    }

    public void setDuracionAtencion(int duracionAtencion) {
        this.duracionAtencion = duracionAtencion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    //Creacion de constructor

    public Servicio(TipoServicio nombreServicio, int duracionAtencion, double precio, boolean estado) {
        this.nombreServicio = nombreServicio;
        this.duracionAtencion = duracionAtencion;
        this.precio = precio;
        this.estado = estado;
        arrayServ.add(this);
        
    }
    
    //Creacion de metodos
    public void eliminarServicios(){
        this.estado = false;
               
    }
    
    public static void mostrarServicios(){
        Iterator <Servicio> iter = arrayServ.iterator();
        while(iter.hasNext()){
            Servicio serv = iter.next();
            System.out.println(serv);
        }
    }
@Override
    public String toString(){
        
        System.out.println("Información del servicio: ");
        if(estado){
            return("Nombre del servicio: "+nombreServicio+"\n Duración: "+duracionAtencion+"\n Precio: "+precio+"\n Estado: Activo");
        }else{
            return("Nombre del servicio: "+nombreServicio+"\n Duración: "+duracionAtencion+"\n Precio: "+precio+"\n Estado: Inactivo");
        }
     
    }
//metodos de la interaz Iterator
    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object next() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
     
     
     

        
}
