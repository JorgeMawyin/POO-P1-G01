/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto1;
import java.time.*;

import java.util.ArrayList;
import java.util.Scanner;

/*
+ crearCita(String fechaCita, String horaCita, Cliente cliente, Empleado encargado): void
+ eliminarCita(String cedula): void
+ consutarCita(String fechaCita): void
//setters&getters
*/

/**
 *
 * @author Jorge Mawyin, Ricardo Freire, Kevin Roldan
 */
public class Cita {

    //Creación de atributos privados
    private String fechaCita;
    private String horaCita;
    private Cliente cliente;
    private Empleado encargado;
    public static ArrayList <Cita> arrayCita= new ArrayList();
    
    //Creación de getters and setters
    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public Empleado getEncargado() {
        return encargado;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setEncargado(Empleado encargado) {
        this.encargado = encargado;
    }
    //Creación contructores
 public Cita(String fechaCita, String horaCita, Cliente cliente, Empleado encargado) {
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.cliente = cliente;
        this.encargado = encargado;
        arrayCita.add(this);
    }   
    
    //Creación de los métodos
    public void crearCita(String fechaCita, String horaCita){
        System.out.println("Cita Creada");
    }
    
    public void eliminarCita(){
        System.out.println("Cita eliminada");
    }
    
    public void consultarCita(String fechaCita){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la fecha para consultar su cita:");
        int consultarCit = sc.nextInt();
        for (Cita cit:arrayCita){
            if(fechaCita.equals(consultarCit)){
                System.out.println(cit);
            }
        }
    
    }
}
