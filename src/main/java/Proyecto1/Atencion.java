/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto1;
import java.sql.Time;
/**
 *
 * @author Jorge Mawyin, Ricardo Freire, Kevin Roldan
 */
public class Atencion {
    //Creación de los atributos privados
    private boolean asistenciaCliente;
    private Time duracionReal;
    //private Cita cita;
    //private Empleado encargadoAtencion;

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
    
    //Creación constructor
    public Atencion(boolean asistenciaCliente, Time duracionReal) {
        this.asistenciaCliente = asistenciaCliente;
        this.duracionReal = duracionReal;
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
        System.out.println("");
    }
    
    
}
