/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Administrativo;
import modelo.Docente;
import modelo.Estudiante;
import modelo.Personas;

/**
 *
 * @author 59397
 */
public class Main {

    public static void main(String[] args) {
        Personas p = new Personas();
        Docente d = new Docente();
        d.setIdPersonas(1);
        d.setNombre("Richar");
        d.setApellido("Ortega");
        d.setCedula("1003088778");
        d.setTitulo("Electrico");
//        System.out.println(d.imprimir());

//        Administrativo a = new Administrativo(1, "SECRETARIA", "SOFTWARE", 2, "JULIANA", "PEREZ", "13746456388", 23875528, "", "", "", "");
//        System.out.println(a.imprimir());
        //UPCASTING: CREAR OBJETOS DE LA CLASE PADRE
        //USANDO CONSTRUCTORES DE LA CLASE HIJAS
        Personas pe = new Estudiante();
        pe.setNombre("PEPITO");
        pe.setApellido("DIAZ");
        pe.setCedula("345676543");
        //DOWNCASTING CAMBIAR EL TIPO DE DATO A UN OBJETO
        Estudiante e = (Estudiante) pe;
        System.out.println(e.imprimir());

    }

}
