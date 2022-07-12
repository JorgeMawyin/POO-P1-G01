/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Proyecto1;
import static Proyecto1.Servicio.arrayServ;
import java.util.ArrayList;
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
                break;
            case 3:
                break;
            case 4:
                System.out.println("MENU");
                System.out.println("1. Crear cita");
                System.out.println("2. Eliminar cita");
                System.out.println("3. Consultar cita");
                System.out.println("Ingrese la opción deseada:");
                int opcionCita = sc.nextInt();
                
                switch(opcionCita){
                    case 1:
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
