/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto1;

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
    //private Cliente cliente;
    //private Empleado encargado;
    
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
    
    //Creación contructores
    public Cita(String fechaCita, String horaCita) {
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
    }
    
    //Creación de los métodos
    public void crearCita(String fechaCita, String horaCita){
        System.out.println("Cita Creada");
    }
    
    public void eliminarCita(){
        System.out.println("Cita eliminada");
    }
    
    public void consultarCita(String fechaCita){
        System.out.println("Las citas de la fecha: "+fechaCita+" son: ");
    
    }
    /*System.out.println("MENU");
    System.out.println("1. Crear cita");
    System.out.println("2. Eliminar cita");
    System.out.println("3. Consultar cita");
    System.out.println("Ingrese la opción deseada:");
    int opcion = sc.nextInt();*/
    
}
