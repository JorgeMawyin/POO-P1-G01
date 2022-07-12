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
                System.out.println("MENU ");
                System.out.println("1. Crear cita");
                System.out.println("2. Eliminar cita");
                System.out.println("3. Consultar cita");
                System.out.print("Ingrese la opción deseada: ");
                int opcionCita = sc.nextInt();
                sc.nextLine();
                
                switch(opcionCita){
                    case 1:
                        
                        System.out.println("CREACIÓN DE CITA");
                        System.out.print("Ingrese la fecha de la cita: ");
                        String recfecha = sc.nextLine();
                        System.out.println("Ingrese la hora de la cita: ");
                        String recHora = sc.nextLine();
                        System.out.println("INGRESE LOS DATOS DEL CLIENTE");
                        System.out.println("Ingrese el nombre del cliente: ");
                        String recNombreC = sc.nextLine();
                        System.out.println("Ingrese la cédula del cliente: ");
                        String recCedulaC = sc.nextLine();
                        System.out.println("Ingrese el teléfono del cliente: ");
                        String recTelefonoC = sc.nextLine();
                        System.out.println("Ingrese el e-mail del cliente: ");
                        String recEmailC= sc.nextLine();
                        
                        System.out.println("INGRESE LOS DATOS DEL REPRESENTANTE DEL CLIENTE");
                        System.out.println("Ingrese el nombre del Representante: ");
                        String recNombreR = sc.nextLine();
                        System.out.println("Ingrese la cédula del Representante: ");
                        String recCedulaR = sc.nextLine();
                        System.out.println("Ingrese el teléfono del Representante: ");
                        String recTelefonoR = sc.nextLine();
                        System.out.println("Ingrese el e-mail del Representante: ");
                        String recEmailR= sc.nextLine();
                        Representante nuevoR = new Representante(recCedulaR, recNombreR, recTelefonoR, recEmailR);
                        Cliente nuevoCliente = new Cliente(recCedulaC, recNombreC, recTelefonoC, recEmailC, nuevoR);
                        System.out.println("Ingrese la cédula persona encargada de la cita: ");
                        String recCedulaEncargado = sc.nextLine();
                        
                        Empleado empleado = null;
                        for (Empleado e:Empleado.listaEmpleados){
                        if (e.getCedula().equals(recCedulaEncargado)){
                          empleado = e;
                        }
                        }
                        Cita nuevaCita = new Cita(recfecha, recHora, nuevoCliente,empleado);
                        break;

                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                        break;
                }
                break;
            case 5:
                break;
            case 6:
                System.out.println("Gracias por preferirnos :D");
                break;
            default:
                break;
        }
       
    }
}
