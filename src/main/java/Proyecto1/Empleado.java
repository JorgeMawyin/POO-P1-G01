/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto1;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Jorge Daniel
 */
public class Empleado extends Persona implements Iterator{
    
    //creacion variable en privado
    private boolean estadoEmpleado;
    private ArrayList <TipoServicio> serviciosEmpleado;
    public static ArrayList <Empleado> listaEmpleados = new ArrayList <Empleado>();
    
    //constructor
    public Empleado(String cedula, String nombre, String telefono, String email, Boolean estadoEmpleado, ArrayList serviciosEmpleado){
        super(cedula, nombre, telefono, email);
        this.estadoEmpleado = estadoEmpleado;
        this.serviciosEmpleado = serviciosEmpleado;
        listaEmpleados.add(this);
    }
    
    public Empleado(String cedula, String nombre, String telefono, String email, Boolean estadoEmpleado, TipoServicio servicioEmpleado){
        super(cedula, nombre, telefono, email);
        this.estadoEmpleado = estadoEmpleado;
        serviciosEmpleado = new ArrayList <TipoServicio> ();
        this.serviciosEmpleado.add(servicioEmpleado);
        listaEmpleados.add(this);
    }
    
    //se editan los empleados con los setters
    //se agregan los empleados con el constructor
    
    //getters
    public boolean estadoEmpleado(){
        return estadoEmpleado;
    } 
    
    //setters
    public void setEstadoEmpleado(boolean estadoEmpleado){
        this.estadoEmpleado = estadoEmpleado;
    }
    
    //Creación método eliminarEmpleados
    public void eliminarEmpleado(){
        this.estadoEmpleado = false;
    }
    
    
    //Creación método mostrarEmpleados 
    public static void mostrarEmpleados(){
        Iterator <Empleado> iter = listaEmpleados.iterator();
        while(iter.hasNext()){
            Empleado emp = iter.next();
            System.out.println(emp);
        }
    }
    
    @Override
    public String toString(){
        System.out.println("Información del empleado: ");
        if(estadoEmpleado){
            return(super.toString()+"\nEstado: Activo");
        }else{
            return(super.toString()+"\nEstado: Inactivo");
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
    
    
    
}
