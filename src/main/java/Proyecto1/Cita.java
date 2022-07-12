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
    private LocalDate fechaCita;
    private LocalTime horaCita;
    private Cliente cliente;
    private Empleado encargado;
    public static ArrayList <Cita> arrayCita= new ArrayList();
    
    //Creación de getters and setters
    public LocalDate getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(LocalDate fechaCita) {
        this.fechaCita = fechaCita;
    }

    public LocalTime getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(LocalTime horaCita) {
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
     
     ArrayList<LocalTime> horariosEmp = new  ArrayList<LocalTime>();
     for(Cita cita:arrayCita){
         if(cita.getEncargado().equals(encargado)) horariosEmp.add(cita.getHoraCita());
     }    
     
     if (!horariosEmp.contains(LocalTime.parse(horaCita))){
        this.fechaCita = LocalDate.parse(fechaCita);
        this.horaCita = LocalTime.parse(horaCita);
        this.cliente = cliente;
        this.encargado = encargado;
        arrayCita.add(this);
     }
     
    }   
    
    //Creación de los métodos
    
    public void eliminarCita(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cédula del cliente:");
        String cedulaCli = sc.nextLine();
        ArrayList<Cita> citasCliente=new ArrayList<Cita>();
        short contador=1;
        for (Cita cita:arrayCita){
            if(cita.getCliente().getCedula().equals(cedulaCli)){
            System.out.println(contador+".- "+cita);
            citasCliente.add(cita);
            contador++;
            }
            
        }
        System.out.println(contador+".- Salir");
        int elim;
  
        do{
        System.out.println("Seleccione la cita a eliminar: ");
        elim = sc.nextInt();
        sc.nextLine();
        arrayCita.remove(citasCliente.get(elim-1));                     
        System.out.println("Cita eliminada");  
        
        }while(elim<contador);
        
    }
    
    
    
    public void consultarCita(String fechaCita){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la fecha para consultar su cita:");
        String consulta = sc.nextLine();
        LocalDate consultarCit= LocalDate.parse(consulta);
        for (Cita cit:arrayCita){
            if(fechaCita.equals(consultarCit)){
                System.out.println(cit);
            }
        }
        sc.close();
    }
}
