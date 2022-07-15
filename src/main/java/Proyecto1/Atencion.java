/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto1;
import java.time.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Jorge Mawyin, Ricardo Freire, Kevin Roldan
 */
public class Atencion {
    //Creación de los atributos privados
    private boolean asistenciaCliente;
    private LocalTime duracionReal;
    private Cita cita;
    private Empleado encargadoAtencion;
    public static ArrayList <Atencion> arrayAtencion= new ArrayList();

    //Creacion de los métodos getters and setters
    public boolean getAsistenciaCliente() {
        return asistenciaCliente;
    }

    public void setAsistenciaCliente(boolean asistenciaCliente) {
        this.asistenciaCliente = asistenciaCliente;
    }

    public LocalTime getDuracionReal() {
        return duracionReal;
    }

    public void setDuracionReal(LocalTime duracionReal) {
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

    public Atencion(boolean asistenciaCliente, String duracionReal, Cita cita, Empleado encargadoAtencion) {
        this.asistenciaCliente = asistenciaCliente;
        this.duracionReal = LocalTime.parse(duracionReal);
        this.cita = cita;
        this.encargadoAtencion = encargadoAtencion;
        arrayAtencion.add(this);
    }
    
    
    //Creación métodos
    public static void registrarAtencion(String cedula){
       
        Scanner sc= new Scanner(System.in);  
        short cont = 1;
        for(Cita citas:Cita.arrayCita){
        if (citas.getCliente().getCedula().equals(cedula)){
        System.out.println(cont+".- "+citas);
        cont++;
            }
            
        }
        System.out.println("Seleccione la cita a registrar: ");
        int numeCita= sc.nextInt();        
        sc.nextLine();
        Cita citaRegistro = Cita.arrayCita.get(numeCita-1);
        
        System.out.println("¿El cliente asistio a la cita? (S/N): ");
        String bool= sc.nextLine();
        boolean asistCliente;
        
        if(bool.toLowerCase().equals("s")) asistCliente=true; 
        else asistCliente=false;
         
        if (asistCliente){
            
            System.out.println("¿Cuanto duro la cita? Ingrese la hora con el formato 'hora:min:seg': ");
            String duracionCita = (sc.nextLine());
            System.out.println("¿Cual de los siguientes empleados atendio esta cita?");
            cont =1;
            for(Empleado emp:Empleado.listaEmpleados){        
            System.out.println(cont+".- "+emp);
            cont++;  
            }
            Empleado encargadoReal = Empleado.listaEmpleados.get(sc.nextInt()-1);
            sc.nextLine();

            Atencion nuevaAtencion= new Atencion(asistCliente,duracionCita,citaRegistro,encargadoReal);
            System.out.println("Atención Registrada");
        }else{
            System.out.println("Atención no Registrada");
        }
            sc.close();
    }
    
    public static void consultarAtencion(){
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
                    if(aten.getEncargadoAtencion().getCedula().equals(cedulaEmp)){
                        System.out.println(aten);  
                    }
                }
                break;
            case 2:
                System.out.println("Ingrese la cédula del cliente:");
                String cedulaCli = sc.nextLine();
                for (Atencion aten:arrayAtencion){
                    if(aten.getCita().getCliente().getCedula().equals(cedulaCli)){
                        System.out.println(aten);
                    }
                }
                break;
            case 3:
                System.out.println("Ingrese la fecha de la cita con el formato 'año-mes-dia':");
                LocalDate fechaCit = LocalDate.parse(sc.nextLine());
                for (Atencion aten:arrayAtencion){
                    if(aten.getCita().getFechaCita().equals(fechaCit)){
                        System.out.println(aten);
                    }
                }
                break;
            default:
                break;
                
         }
       sc.close(); 
    }

    @Override
    public String toString() {
        System.out.println("Información del empleado: ");
        if(asistenciaCliente){
return "Atencion{" + "\nEl cliente asistió a la cita " + "\nDuración de la cita: " + duracionReal + "\nFecha de la cita: " + cita.getFechaCita() + "\nServicio de cita: "+cita.getServicio()+ "encargadoAtencion=" + encargadoAtencion + '}';
        }else{
            return(super.toString()+"\nEstado: Inactivo");}
        
    }
    
    
}
