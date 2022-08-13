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
        System.out.print("Ingrese la opción deseada: ");
        int opcion = sc.nextInt();
        sc.nextLine();
        
        
        do{
        System.out.println("\u000C");
        switch (opcion){
            case 1:
                System.out.println("INFORMACIÓN DE LOS SERVICIOS");
                Servicio.mostrarServicios();
                System.out.println("MENU SERVICIOS");
                System.out.println("1. Agregar Servicio");
                System.out.println("2. Editar Servicio");
                System.out.println("3. Eliminar Servicio");
                System.out.println("4. Salir");
                System.out.print("Ingrese la opción deseada: ");
                int opcionServ = sc.nextInt();
                sc.nextLine();
                
                switch(opcionServ){
                    case 1:
                        System.out.println("AGREGAR SERVICIO");
                        
                        TipoServicio[] tiposS = TipoServicio.values();
                        for (int i = 0; i < tiposS.length; i++){
                            System.out.println(i+1+". "+tiposS[i]);
                        }
                        System.out.print("Seleccione un tipo de servicio: ");
                        int recTipo = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ingrese la duración del servicio en minutos: ");
                        int recDur = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ingrese el précio del servicio: ");
                        double recPre = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Ingrese el estado del servicio (1 si es activo y 0 si está inactivo): ");
                        int recEst = sc.nextInt();
                        sc.nextLine();
                        boolean estad;
                        if (recEst == 1){
                            estad = true;
                        }else{
                            estad = false;
                        }
                        Servicio nuevoS = new Servicio(tiposS[recTipo], recDur, recPre, estad);
                        System.out.println("Servicio Agregado");
                        break;
                    case 2:
                        System.out.println("EDITAR SERVICIOS");
                        System.out.println("SERVICIOS");
                        Servicio.mostrarServicios();
                        System.out.print("Ingrese el servicio a editar: ");         
                        int recEdi = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Servicio a editar: \n");
                        String recOpc = "S";
                        while(recOpc.equals("S")){
                            System.out.println( "1. Nombre del servicio"+"\n2. Duración"+"\n3. Precio"+"\n4. Estado");
                            System.out.print("\nIngrese que campo desea editar: ");
                            int recCampo = sc.nextInt();
                            sc.nextLine();
                            switch(recCampo){
                                case 1:
                                    TipoServicio[] tiposServ = TipoServicio.values();
                                    for (int i = 0; i < tiposServ.length; i++){
                                    System.out.println(i+1+". "+tiposServ[i]);
                                    }
                                    System.out.println("Escoja un nuevo tipo de servicio: ");
                                    int recTipoServ = sc.nextInt();
                                    sc.nextLine();

                                    Servicio.arrayServ.get(recEdi-1).setNombreServicio(tiposServ[recTipoServ-1]);
                                    System.out.println("Tipo de servicio actualizado");
                                    break;
                                case 2:
                                    System.out.print("Ingrese la nueva duración del servicio en minutos: ");
                                    int recDurEdi = sc.nextInt();
                                    sc.nextLine();
                                    Servicio.arrayServ.get(recEdi-1).setDuracionAtencion(recDurEdi);
                                    System.out.println("Duración actualizada");
                                    break;
                                case 3:
                                    System.out.print("Ingrese el nuevo precio del servicio: ");
                                    Double recPreEdi = sc.nextDouble();
                                    Servicio.arrayServ.get(recEdi-1).setPrecio(recPreEdi);
                                    System.out.println("Precio actualizado");
                                    break;
                                case 4:
                                    if (Servicio.arrayServ.get(recEdi-1).getEstado() == false){
                                        Servicio.arrayServ.get(recEdi-1).setEstado(true);
                                    }else{
                                        Servicio.arrayServ.get(recEdi-1).setEstado(false);
                                    }
                                    System.out.println("Estado actualizado");
                                    break;
                                default:
                                    break;
                            }
                            System.out.println("Ingrese 'S' para seguir editando o 'N' para salir: ");
                            recOpc = sc.nextLine();    
                        }
                        System.out.println("Servicio Editado");
                        break;
                    case 3:
                        System.out.println("ELIMINAR SERVICIOS");
                        System.out.println("SERVICIOS");
                        Servicio.mostrarServicios();
                        System.out.print("Ingrese el servicio a eliminar: ");
                        int recEli = sc.nextInt();
                        sc.nextLine();
                        for (Servicio s: Servicio.arrayServ){
                            if (s == Servicio.arrayServ.get(recEli-1)){
                                s.eliminarServicios();
                            }
                        }
                        break;
                    case 4:
                        
                        break;
                    default:
                        break;
                }                
                
                break;
            case 2:
                System.out.println("INFORMACION DE LOS EMPLEADOS");
                Empleado.mostrarEmpleados();
                System.out.println("\nMENU EMPLEADOS");
                System.out.println("1. Agregar Empleados");
                System.out.println("2. Editar Empleados");
                System.out.println("3. Eliminar Empleados");
                System.out.println("4. Salir");
                System.out.print("Ingrese la opción deseada: ");
                int opcionEmple = sc.nextInt();
                sc.nextLine();
                switch(opcionEmple){
                    case 1:
                        System.out.print("AGREGAR EMPLEADO");
                        System.out.print("\nIngrese la cédula del empleado: ");
                        String recCedE = sc.nextLine();
                        System.out.print("\nIngrese el nombre del empleado: ");
                        String recNombreE = sc.nextLine();
                        System.out.print("\nIngrese el teléfono del empleado: ");
                        String recTelefonoE = sc.nextLine();
                        System.out.print("\nIngrese el e-mail del empleado: ");
                        String recEmailE= sc.nextLine();
                        System.out.print("Ingrese el estado del empleado (1 si es activo y 0 si está inactivo): ");
                        int recEst = sc.nextInt();
                        sc.nextLine();
                        boolean estad;
                        if (recEst == 1){
                            estad = true;
                        }else{
                            estad = false;
                        }
                        TipoServicio[] tiposS = TipoServicio.values();
                        for (int i = 0; i < tiposS.length; i++){
                            System.out.println(i+1+". "+tiposS[i]);
                        }
                        System.out.print("Seleccione un tipo de servicio: ");
                        int recTipo = sc.nextInt();
                        sc.nextLine();
                        Empleado NewEmpleado = new Empleado(recCedE, recNombreE, recTelefonoE, recEmailE, estad, tiposS[recTipo]);
                        System.out.println("Empleado Agregado");
                        break;
                    case 2:
                        System.out.println("EDITAR EMPLEADO");
                        System.out.println("EMPLEADOS");
                        Empleado.mostrarEmpleados();
                        System.out.print("Ingrese el empleado a editar: ");
                        int recEdi = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Empleado a editar: \n");   
                        String recOpc = "S";
                        while(recOpc.equals("S")){
                            System.out.println( "1. Nombre"+"\n2. Telefono"+"\n3. Email"+"\n4. Estado"+"\n5. Tipo Servicio");
                            System.out.print("\nIngrese que campo desea editar: ");
                            int recCampo = sc.nextInt();
                            sc.nextLine();
                            switch(recCampo){
                                case 1:
                                    System.out.println("Ingrese un nuevo nombre:");
                                    String nuevoNombre = sc.nextLine();
                                    Empleado.listaEmpleados.get(recEdi-1).setNombre(nuevoNombre);
                                    System.out.println("Nombre del empleado editado");
                                    break;
                                case 2:
                                    System.out.println("Ingrese un nuevo telefono:");
                                    String nuevoTelef = sc.nextLine();
                                    Empleado.listaEmpleados.get(recEdi-1).setTelefono(nuevoTelef);
                                    System.out.println("Telefono del empleado editado"); 
                                    break;
                                case 3:
                                    System.out.println("Ingrese un nuevo email:");
                                    String nuevoEmail = sc.nextLine();
                                    Empleado.listaEmpleados.get(recEdi-1).setEmail(nuevoEmail);
                                    System.out.println("Email del empleado editado");
                                    break;
                                case 4:
                                    if (Empleado.listaEmpleados.get(recEdi-1).getEstadoEmpleado()== false){
                                        Empleado.listaEmpleados.get(recEdi-1).setEstadoEmpleado(true);
                                    }else{
                                        Empleado.listaEmpleados.get(recEdi-1).setEstadoEmpleado(false);
                                    }
                                    System.out.println("Estado actualizado");
                                    break;
                                case 5:
                                    TipoServicio[] serv = TipoServicio.values();
                                    for (int i = 0; i < serv.length; i++){
                                        System.out.println(i+1+". "+serv[i]);
                                    }
                                    System.out.print("Seleccione un tipo de servicio: ");
                                    int nuevoServ = sc.nextInt();
                                    sc.nextLine();
                                    Empleado.listaEmpleados.get(recEdi-1).setTipoServicio(serv[nuevoServ-1]);
                                    System.out.println("Tipo de servicio actualizado");
                                    break;
                                default:
                                    break;
                            }
                            System.out.println("Ingrese 'S' para seguir editando o 'N' para salir: ");
                            recOpc = sc.nextLine();
                        }
                        
                        
                        break;
                    case 3:
                        System.out.println("ELIMINAR EMPLEADO");
                        System.out.println("EMPLEADOS");
                        Empleado.mostrarEmpleados();
                        System.out.print("Ingrese el servicio a eliminar: ");
                        int recEli = sc.nextInt();
                        sc.nextLine();
                        for (Empleado e: Empleado.listaEmpleados){
                            if (e == Empleado.listaEmpleados.get(recEli-1)){
                                e.eliminarEmpleado();
                            }
                        }
                        break;
                    case 4:
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                System.out.println("INFORMACIÓN DE LOS CLIENTES");
                Cliente.mostrarClientes();
                System.out.println("\nMENU CLIENTES");
                System.out.println("1. Agregar Cliente");
                System.out.println("2. Editar Cliente");
                System.out.println("3. Salir");
                System.out.print("Ingrese la opción deseada: ");
                int opcionCliente = sc.nextInt();
                sc.nextLine();
                switch(opcionCliente){
                    case 1:
                        System.out.println("AGREGAR CLIENTES");
                        System.out.print("\nIngrese la cédula del cliente: ");
                        String newCed = sc.nextLine();
                        System.out.print("\nIngrese el nombre del cliente: ");
                        String newNom = sc.nextLine();
                        System.out.print("\nIngrese el teléfono del cliente: ");
                        String newTelef = sc.nextLine();
                        System.out.print("\nIngrese el e-mail del cliente: ");
                        String newEmail= sc.nextLine();
                        System.out.print("\nIngrese la cédula del representante: ");
                        String repreCed= sc.nextLine();
                        Representante nuevoRepresentante = Representante.buscarRepresentante(repreCed);
                        if(nuevoRepresentante == null){
                            System.out.print("\nINGRESE LOS DATOS DEL REPRESENTANTE DEL CLIENTE");
                            System.out.print("\nIngrese el nombre del Representante: ");
                            String recNombreR = sc.nextLine();
                            System.out.print("\nIngrese la cédula del Representante: ");
                            String recCedulaR = sc.nextLine();
                            System.out.print("\nIngrese el teléfono del Representante: ");
                            String recTelefonoR = sc.nextLine();
                            System.out.print("\nIngrese el e-mail del Representante: ");
                            String recEmailR= sc.nextLine();
                            nuevoRepresentante = new Representante(recCedulaR, recNombreR, recTelefonoR, recEmailR);
                            Cliente nuevoCliente = new Cliente(newCed, newNom, newTelef, newEmail, nuevoRepresentante);
                        }
                        System.out.println("CLIENTE AGREGADO");
                        break;
                    case 2:
                        System.out.println("EDITAR CLIENTES");
                        System.out.println("CLIENTES");
                        Cliente.mostrarClientes();
                        System.out.print("Ingrese el cliente a editar: ");
                        int recEdi = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Empleado a editar: \n");   
                        String recOpc = "S";
                        while(recOpc.equals("S")){
                            System.out.println("1. Nombre"+"\n2. Telefono"+"\n3. Email"+"\n4. Representante");
                            System.out.print("\nIngrese que campo desea editar: ");
                            int recCampo = sc.nextInt();
                            sc.nextLine();
                            switch(recCampo){
                                case 1:
                                    System.out.println("Ingrese un nuevo nombre:");
                                    String nuevoNombre = sc.nextLine();
                                    Cliente.arrayCliente.get(recEdi-1).setNombre(nuevoNombre);
                                    System.out.println("Nombre del cliente editado");
                                    break;
                                case 2:
                                    System.out.println("Ingrese un nuevo telefono:");
                                    String nuevoTelef = sc.nextLine();
                                    Cliente.arrayCliente.get(recEdi-1).setTelefono(nuevoTelef);
                                    System.out.println("Telefono del cliente editado"); 
                                    break;
                                case 3:
                                    System.out.println("Ingrese un nuevo email:");
                                    String nuevoEmail = sc.nextLine();
                                    Cliente.arrayCliente.get(recEdi-1).setEmail(nuevoEmail);
                                    System.out.println("Email del cliente editado");
                                    break;
                                case 4:
                                    System.out.println("REPRESENTANTE");
                                    System.out.println(Cliente.arrayCliente.get(recEdi-1).getDatosRepresentante());
                                    System.out.println("Campos para editar");
                                    System.out.println( "1. Nombre"+"\n2. Telefono"+"\n3. Email");
                                    System.out.print("\nIngrese que campo desea editar: ");
                                    int editarRe = sc.nextInt();
                                    sc.nextLine();
                                    switch(editarRe){
                                        case 1:
                                            System.out.println("Ingrese un nuevo nombre:");
                                            String nombreRepre = sc.nextLine();
                                            Cliente.arrayCliente.get(recEdi-1).getDatosRepresentante().setNombre(nombreRepre);
                                            System.out.println("Nombre del representante editado");
                                            break;
                                        case 2:
                                            System.out.println("Ingrese un nuevo telefono:");
                                            String telefonoRepre = sc.nextLine();
                                            Cliente.arrayCliente.get(recEdi-1).getDatosRepresentante().setTelefono(telefonoRepre);
                                            System.out.println("Telefono del representante editado");
                                            break;
                                        case 3:
                                            System.out.println("Ingrese un nuevo email:");
                                            String EmailRepre = sc.nextLine();
                                            Cliente.arrayCliente.get(recEdi-1).getDatosRepresentante().setEmail(EmailRepre);
                                            System.out.println("Email del representante editado");
                                            break;
                                        default:
                                            break;
                                    }
                                    System.out.println("Representante editado");
                                    break;
                                default:
                                    break;
                            }
                            System.out.println("Ingrese 'S' para seguir editando o 'N' para salir: ");
                            recOpc = sc.nextLine();
                        }
                        
                        
                        break;
                    case 3:
                        break;
                    default:
                        break;
                }
                break;
            case 4:
                System.out.println("MENU CITA");
                System.out.println("1. Crear cita");
                System.out.println("2. Eliminar cita");
                System.out.println("3. Consultar cita");
                System.out.println("4. Salir");
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
                    case 4:
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

    public static void main() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}