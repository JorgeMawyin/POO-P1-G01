/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto1;

/**
 *
 * @author Jorge Daniel
 */
public class Empleado extends Persona{
    
    //creacion variable en privado
    private boolean estadoEmpleado;
    
    //métodos
    public Empleado(String cedula, String nombre, String telefono, String email, Boolean estadoEmpleado){
        super(cedula, nombre, telefono, email);
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
