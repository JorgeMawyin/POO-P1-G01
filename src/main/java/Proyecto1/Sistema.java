/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Proyecto1;
import java.util.Scanner;
/**
 *
 * @author Jorge Mawyin, Ricardo Freire, Kevin Roldan
 */
public class Sistema {
  
//Creación de objetos Servicio
         
        
    public static void main(String[] args) {
        Servicio s1 = new Servicio(TipoServicio.TerapiaDeLenguaje,10,555,true);
        
       
        
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1. Servicio");
        System.out.println("2. Empleado");
        System.out.println("3. Clientes");
        System.out.println("4. Citas");
        System.out.println("5. Atenciones");
        System.out.println("6. Salir");
        System.out.println("Ingrese la opción deseada:");
        int opcion = sc.nextInt();
        sc.nextLine();
      
        switch (opcion){
            case 1:
                Servicio.mostrarServicios();
                break;
            case 2:
                Empleado.mostrarEmpleados();
                break;
            case 3:
                Cliente.mostrarClientes();
                break;
            case 4:
                System.out.println("MENU CITA");
                System.out.println("1. Crear cita");
                System.out.println("2. Eliminar cita");
                System.out.println("3. Consultar cita");
                System.out.print("Ingrese la opción deseada: ");
                int opcionCita = sc.nextInt();
                sc.nextLine();
                
                switch(opcionCita){
                    case 1:
                        Cita.crearCita();
                        break;
                    case 2:
                        Cita.eliminarCita();
                        break;
                    case 3:
                        Cita.consultarCita();
                        break;
                    default:
                        break;
                }
                break;
            case 5:
                System.out.println("MENU ATENCIÓN");
                System.out.println("1. Registrar Atención");
                System.out.println("2. Consultar Atención");
                System.out.print("Ingrese la opción deseada: ");
                int opcionAtencion = sc.nextInt();
                sc.nextLine();
                switch(opcionAtencion){
                    case 1:
                        System.out.println("Ingrese la cedula del cliente cuya cita se registrara: ");
                        String cedula = sc.nextLine();
                        Atencion.registrarAtencion(cedula);
                        
                        
                        
                        break;
                    case 2:
                        Atencion.consultarAtencion();
                        break;
                    default:
                        break;
                }
                break;
            case 6:
                System.out.println("Gracias por preferirnos :D");
                break;
            default:
                break;
        }
       
        
        sc.close();
    }
}
