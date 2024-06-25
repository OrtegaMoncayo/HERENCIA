/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Docente;
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
        System.out.println(d.imprimir());

    }

}
