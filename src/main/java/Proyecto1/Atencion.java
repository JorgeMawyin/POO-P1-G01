/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto1;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Jorge Mawyin, Ricardo Freire, Kevin Roldan
 */
public class Atencion {
    //Creación de los atributos privados
    private boolean asistenciaCliente;
    private Time duracionReal;
    private Cita cita;
    private Empleado encargadoAtencion;
    public static ArrayList <Atencion> arrayAtencion= new ArrayList();

    //Creacion de los métodos getters and setters
    public boolean isAsistenciaCliente() {
        return asistenciaCliente;
    }

    public void setAsistenciaCliente(boolean asistenciaCliente) {
        this.asistenciaCliente = asistenciaCliente;
    }

    public Time getDuracionReal() {
        return duracionReal;
    }

    public void setDuracionReal(Time duracionReal) {
        this.duracionReal = duracionReal;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public Empleado getEncargadoAtencion() {
        return encargadoAtencion;
    }

    public void setEncargadoAtencion(Empleado encargadoAtencion) {
        this.encargadoAtencion = encargadoAtencion;
    }
    
    //Creación constructor

    public Atencion(boolean asistenciaCliente, Time duracionReal, Cita cita, Empleado encargadoAtencion) {
        this.asistenciaCliente = asistenciaCliente;
        this.duracionReal = duracionReal;
        this.cita = cita;
        this.encargadoAtencion = encargadoAtencion;
        arrayAtencion.add(this);
    }
    
    
    //Creación métodos
    public void registrarAtencion(boolean asistenciaCliente, Time duracionReal){
        
        if (!asistenciaCliente){
            System.out.println("Atención Registrada");
        }else{
            System.out.println("Atención no Registrada");
        }

    }
    
    public void consultarAtencion(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Consultas");
        System.out.println("1. Cédula empleado");
        System.out.println("2. Cédula cliente");
        System.out.println("3. Fecha");
        int opcion = sc.nextInt();
        sc.nextLine();
        switch(opcion){
            case 1:
                System.out.println("Ingrese la cédula del empleado:");
                String cedulaEmp = sc.nextLine();
                for (Atencion aten:arrayAtencion){
                    if(encargadoAtencion.getCedula().equals(cedulaEmp)){
                        System.out.println(aten);  
                    }
                }
                break;
            case 2:
                System.out.println("Ingrese la cédula del cliente:");
                String cedulaCli = sc.nextLine();
                for (Atencion aten:arrayAtencion){
                    if(cita.getCliente().getCedula().equals(cedulaCli)){
                        System.out.println(aten);
                    }
                }
                break;
            case 3:
                System.out.println("Ingrese la fecha de la cita:");
                String fechaCit = sc.nextLine();
                for (Atencion aten:arrayAtencion){
                    if(cita.getFechaCita().equals(fechaCit)){
                        System.out.println(aten);
                    }
                }
                break;
                
         }
       sc.close(); 
    }
    
    
}
