/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Administrativo;
import modelo.Docente;
import modelo.Estudiante;
import modelo.Persona;

/**
 *
 * @author 59397
 */
public class Main {

    public static void main(String[] args) {
        Persona p = new Persona();
        Docente d = new Docente();
        d.setIdPersona(1);
        d.setNombre("Richar");
        d.setApellido("Ortega");
        d.setCedula("1003088778");
        d.setTitulo("Electrico");
//        System.out.println(d.imprimir());
        
        
        Administrativo a=new Administrativo
        (1, "SECRETARIA", "SOFTWARE", 2, "JULIANA", "PEREZ", "13746456388", 23875528, "","", "","");
        System.out.println(a.imprimir());
        
        Estudiante e=new Estudiante(1, 235563, "","");
        System.out.println(e.imprimir());

    }

}
