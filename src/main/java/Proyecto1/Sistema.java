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
       
       
        Sistema.inicializarSistema();
        
        
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
        
        
        do{
        System.out.println("\u000C");
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
                        System.out.println("Ingrese la cedula del cliente cuya cita se registrará: ");
                        String cedula = sc.nextLine();
                        if (Cliente.buscarCliente(cedula)== null){
                            System.out.println("Este cliente no existe");
                        }else{
                            Atencion.registrarAtencion(cedula);
                        }
                       
                        
                        
                        
                        
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
            System.out.println("Pulse enter para regresar al menú");
            String limpiar = sc.nextLine();
            if (limpiar == ""){
                System.out.println("\u000C");
            }
            System.out.println("MENU");
            System.out.println("1. Servicio");
            System.out.println("2. Empleado");
            System.out.println("3. Clientes");
            System.out.println("4. Citas");
            System.out.println("5. Atenciones");
            System.out.println("6. Salir");
            System.out.print("\nIngrese la opción deseada:");
            opcion = sc.nextInt();
            sc.nextLine();
        }while(opcion!=6);
        System.out.println("Gracias por preferirnos :D");
        sc.close();
    }
    
    //Creación del método inicializarSistema con los objetos solicitados
    public static void inicializarSistema(){
        Servicio s1 = new Servicio(TipoServicio.TerapiaDeLenguaje,10,555,true);
        Servicio s2 = new Servicio(TipoServicio.TerapiaPsicopedagógica,20,300,true);
        Servicio s3 = new Servicio(TipoServicio.TerapiaPsicopedagógica,60,500,false);
        Empleado e1 = new Empleado("0902348539", "Bolivar Avendaño", "0929385532", "boav@espol.edu.ec", true, TipoServicio.TerapiaDeLenguaje);
        Cliente c1 = new Cliente("0439240392", "Jennifer Illych", "0984738283","jenil@espol.edu.ec",new Representante("0293844839","Illych Pepe", "09392848543", "illych@gmail.com"));
        Cliente c2 = new Cliente("05449240392", "Emilio Romo", "0984745683","emirom@espol.edu.ec",new Representante("048524839","Papa Romo", "0987455543", "romopapa@gmail.com"));
        Cita cita1 = new Cita("2022-07-16","19:00:00",c1,e1,s1);
        Cita cita2 = new Cita("2023-01-01","01:00:00",c2,e1,s2);
        Atencion a1 = new Atencion(true, "00:20:00",new Cita("2003-01-23","14:00:00",c1,e1,s3),e1);
        
    } 
}
