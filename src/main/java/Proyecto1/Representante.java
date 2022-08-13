  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto1;

import java.util.ArrayList;

/**
 *
 * @author Jorge Mawyin, Ricardo Freire, Kevin Roldan
 */
public class Representante extends Persona {
    //Creacion del constructor
    public static ArrayList <Representante> arrayRepresentante= new ArrayList();
    public Representante(String cedula, String nombre, String telefono, String email){
        super(cedula, nombre, telefono, email);
        arrayRepresentante.add(this);
    }
    
    public static Representante buscarRepresentante(String c){
        for (Representante listaR:arrayRepresentante){
            if (listaR.getCedula().equals(c)){
                return listaR;
            }
        }
        return null;
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
}
