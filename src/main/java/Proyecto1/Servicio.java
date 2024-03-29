 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
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
    
    
    //Creacion de constructor

    public Servicio(TipoServicio nombreServicio, int duracionAtencion, double precio, boolean estado) {
        this.nombreServicio = nombreServicio;
        this.duracionAtencion = duracionAtencion;
        this.precio = precio;
        this.estado = estado;
        arrayServ.add(this);
    }
    
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

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    //se editan los servicios con los setters
    //se agregan los servicios con el constructor
    
    //Creacion de metodos
    public void eliminarServicios(){
        this.estado = false;
               
    }
    
    public static void mostrarServicios(){
        int num = 1;
        Iterator <Servicio> iter = arrayServ.iterator();
        while(iter.hasNext()){
            Servicio serv = iter.next();
            System.out.println(num+"."+serv);
            num +=1;
        }
    }
    
@Override
    public String toString(){
        if(estado){
            return("Nombre del servicio: "+nombreServicio+"\n Duración: "+duracionAtencion+" minutos"+"\n Precio: "+precio+"\n Estado: Activo\n");
        }else{
            return("Nombre del servicio: "+nombreServicio+"\n Duración: "+duracionAtencion+" minutos"+"\n Precio: "+precio+"\n Estado: Inactivo\n");
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
