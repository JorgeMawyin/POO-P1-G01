/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto1;
import java.util.ArrayList;
/**
 *
 * @author Jorge Daniel
 */
public class Empleado extends Persona{
    
    //creacion variable en privado
    private boolean estadoEmpleado;
    private ArrayList <TipoServicio> serviciosEmpleado;
    public static ArrayList <Empleado> listaEmpleados = new ArrayList <Empleado>();
    
    //constructor
    public Empleado(String cedula, String nombre, String telefono, String email, Boolean estadoEmpleado, ArrayList serviciosEmpleado){
        super(cedula, nombre, telefono, email);
        this.estadoEmpleado = estadoEmpleado;
        this.serviciosEmpleado = serviciosEmpleado;
    }
    
    public Empleado(String cedula, String nombre, String telefono, String email, Boolean estadoEmpleado, TipoServicio servicioEmpleado){
        super(cedula, nombre, telefono, email);
        this.estadoEmpleado = estadoEmpleado;
        serviciosEmpleado = new ArrayList <TipoServicio> ();
        this.serviciosEmpleado.add(servicioEmpleado);
    }
    
    //getters
    public boolean estadoEmpleado(){
        return estadoEmpleado;
    } 
    
    //setters
    public void setEstadoEmpleado(boolean estadoEmpleado){
        this.estadoEmpleado = estadoEmpleado;
    }
    
    
    @Override
    public String toString(){
        System.out.println("Información del servicio: ");
        if(estadoEmpleado){
            return(super.toString()+"\nEstado: Activo");
        }else{
            return(super.toString()+"\nEstado: Inactivo");
        } 
    }
    
    
    
}
