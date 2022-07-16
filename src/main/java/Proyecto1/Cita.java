/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto1;

import java.time.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Objects;

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
    private Servicio servicio;
    //Creación de un array static tipo cita
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
    
    public Servicio getServicio(){
        return servicio;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setEncargado(Empleado encargado) {
        this.encargado = encargado;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
    
    //Creación contructores
     public Cita(String fechaCita, String horaCita, Cliente cliente, Empleado encargado, Servicio servicio) {
     ArrayList<LocalDateTime> horariosEmp = new  ArrayList<LocalDateTime>();
     for(Cita cita:arrayCita){
        if(cita.getEncargado().equals(encargado)) horariosEmp.add(LocalDateTime.of(cita.getFechaCita(),cita.getHoraCita()));
     }     
     if (!horariosEmp.contains(LocalDateTime.of(LocalDate.parse(fechaCita),LocalTime.parse(horaCita)))){
        this.fechaCita = LocalDate.parse(fechaCita);
        this.horaCita = LocalTime.parse(horaCita);
        this.cliente = cliente;
        this.encargado = encargado;
        this.servicio = servicio;
        arrayCita.add(this);
     }
     
    }   
    
    //Creación del método Crear Cita
    public static void crearCita(){
        Scanner sc = new Scanner(System.in);
        System.out.println("CREACIÓN DE CITA");
        System.out.print("Ingrese la fecha de la cita (AAAA-MM-DD): ");
        String recfecha = sc.nextLine();
        System.out.print("\nIngrese la hora de la cita(HH:MM:SS): ");
        String recHora = sc.nextLine();
        System.out.print("\nIngrese la cédula del cliente: ");
        String recCedulaC = sc.nextLine();
        Cliente nuevoCliente = Cliente.buscarCliente(recCedulaC);
        if (nuevoCliente == null){
        System.out.print("\nINGRESE LOS DATOS DEL CLIENTE");
        System.out.print("\nIngrese el nombre del cliente: ");
        String recNombreC = sc.nextLine();
        System.out.print("\nIngrese el teléfono del cliente: ");
        String recTelefonoC = sc.nextLine();
        System.out.print("\nIngrese el e-mail del cliente: ");
        String recEmailC= sc.nextLine();
        System.out.print("\nINGRESE LOS DATOS DEL REPRESENTANTE DEL CLIENTE");
        System.out.print("\nIngrese el nombre del Representante: ");
        String recNombreR = sc.nextLine();
        System.out.print("\nIngrese la cédula del Representante: ");
        String recCedulaR = sc.nextLine();
        System.out.print("\nIngrese el teléfono del Representante: ");
        String recTelefonoR = sc.nextLine();
        System.out.print("\nIngrese el e-mail del Representante: ");
        String recEmailR= sc.nextLine();
        Representante nuevoR = new Representante(recCedulaR, recNombreR, recTelefonoR, recEmailR);
        nuevoCliente = new Cliente(recCedulaC, recNombreC, recTelefonoC, recEmailC, nuevoR);
        }
        System.out.print("\nServicios: ");
        Servicio.mostrarServicios();
        System.out.print("\nSeleccione un servicio: ");
        int recOpcion = sc.nextInt();
        sc.nextLine();
        Servicio recServicio = Servicio.arrayServ.get(recOpcion-1);
        
        System.out.print("\nIngrese la cédula persona encargada de la cita: ");
        String recCedulaEncargado = sc.nextLine();
                        
        Empleado empleado = null;
        for (Empleado e:Empleado.listaEmpleados){
            if (e.getCedula().equals(recCedulaEncargado)){
                empleado = e;
            }
        }
        Cita nuevaCita = new Cita(recfecha, recHora, nuevoCliente,empleado,recServicio);
        System.out.println("Cita creada exitosamente :D");
     }
     
    //Creación del método Eliminar Cita 
    public static void eliminarCita(){
       Iterator <Cita> iter = arrayCita.iterator();
        
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese la cédula del cliente:");
       String cedulaCli = sc.nextLine();
       ArrayList<Cita> citasCliente=new ArrayList<Cita>();
       short contador=1;
       for (Cita cita:arrayCita){
          if(cita.getCliente().getCedula().equals(cedulaCli)){
          //System.out.println(contador+".- "+cita);
          citasCliente.add(cita);
          //contador++;
          }  
       }
       if (citasCliente.size()==0){
           System.out.println("El cliente no tiene citas");
            
       }else{
          for (Cita cita:citasCliente){
            System.out.println(contador+".- "+cita);
            contador++;
       }
       System.out.println(contador+".- Salir");
       int elim;
  
       
       System.out.println("Seleccione la cita a eliminar: ");
       elim = sc.nextInt();
       sc.nextLine();
       
       while(iter.hasNext()){
           Cita c =iter.next();
           if (c.equals(citasCliente.get(elim-1))){
                iter.remove();
                System.out.println("Cita eliminada");  
           }
       }                  
                
       } 
    } 
        
    //Creación del método Consultar Cita
    public static void consultarCita(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la fecha para consultar su cita (AAAA-MM-DD):");
        String consulta = sc.nextLine();
        LocalDate consultarCit= LocalDate.parse(consulta);
        int n = 0;
        for (Cita cit:arrayCita){
            if(cit.getFechaCita().equals(consultarCit)){
                System.out.println(cit);
                n=1;
            }
            
            }
        if (n==0){
                System.out.println("No se encontraron citas en esa fecha");   
        }
        
        
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cita other = (Cita) obj;
        return Objects.equals(this.fechaCita, other.fechaCita)&&Objects.equals(this.horaCita, other.horaCita)&&Objects.equals(this.cliente, other.cliente);
            
        
    }

    @Override
    public String toString() {
        return "Cita:" + "\nFecha de la cita: " + fechaCita + "\nHora de la cita: " + horaCita + "\nNombre del cliente: " + cliente.getNombre() + "\nNombre del encargado: " + encargado.getNombre() + "\nServicio: "+servicio.getNombreServicio();
    }

    
}
