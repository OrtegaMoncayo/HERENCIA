/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import Controlador.PersonaControlador;
import java.util.Scanner;
import java.util.ArrayList;
import modelo.Cuenta;
import modelo.CuentaAhorro;
import modelo.CuentaCorriente;
import modelo.Personas;

/**
 *
 * @author 59397
 */
public class MainCuenta {

    public static void main(String[] args) {

        Cuenta c = new Cuenta();
        c.setSaldo(10000);
        c.setNumeroConsignaciones(5);
        c.setComicionMensual(2);
        c.setNumeroRetiros(5);
        c.setTasaAnual(12);
        c.extroctoMensual();
        c.imprimir();

//        
//        CuentaAhorro Ca = new CuentaAhorro(true, 1000009, 0, 0, 0, 0);
//        for (int i = 0; i < 5; i++) {
//            Ca.comprobarCuenta();
//            Ca.retiro(1800);
//            Ca.consigna(i);
//            Ca.imprimir();
//        }
        CuentaCorriente Cc = new CuentaCorriente(0, 1234560, 0, 0, 0, 0);
        Cc.retiro(13000);
        Cc.extroctoMensual();
        Cc.imprimir();

        ArrayList<CuentaAhorro> listaCuentaAhorro = new ArrayList<>();
        ArrayList<CuentaCorriente> listaCuentaCorriente = new ArrayList<>();
        Scanner es = new Scanner(System.in);
        int i = 1;
        do {
            System.out.println("BIENVENIDO AL BANCO PEPITO PÉREZ");
            System.out.println("Cuidando tu dinero desde 1992");
            System.out.println("Elija la opción que Usted requiera ejecutar:\n"
                    + "1.Crear Cuenta\n"
                    + "2.Consultar Saldo\n"
                    + "3.Imprimir Estado de Cuenta\n"
                    + "4.Depósitos\n"
                    + "5.Retiros\n"
                    + "5.Crear persona\n"
                    + "0.Salir");
            int op1 = es.nextInt();
            if (op1 == 1) {
                System.out.println("Elija el tipo de Cuenta que quiere Crear\n"
                        + "1.Cuenta de Ahorros\n"
                        + "2.Cuenta Corriente");
                int sm1 = es.nextInt();
                if (sm1 == 1 || sm1 == 2) {
                    if (sm1 == 1) {
                        System.out.println("---FORMULARIO DE CREACIÓN DE CUENTA DE AHORROS---");
                        System.out.println("Ingrese el monto de creación de la cuenta:");
                        double monto = es.nextDouble();
                        CuentaAhorro ca = new CuentaAhorro(false, monto, 1, 0, 12, 1.35);
                        listaCuentaAhorro.add(ca);
                        ca.imprimir();
                    } else if (sm1 == 2) {
                        System.out.println("---FORMULARIO DE CREACIÓN DE CUENTA CORRIENTE---");
                        System.out.println("Ingrese el monto de creación de la cuenta:");
                        double monto = es.nextDouble();
                        CuentaCorriente cc = new CuentaCorriente(0, monto, 1, 0, 12, 1.35);
                        listaCuentaCorriente.add(cc);
                        cc.imprimir();
                    }
                } else {
                    System.out.println("Ingrese una opción del menú");
                }

            } else if (op1 == 5) {
                System.out.println(" datos personales \n"
                        + "1.Crear\n");
                int pes = es.nextInt();
                if (pes == 1) {
                    Personas p=new Personas();
                    System.out.println("Ingrese su Nombre:");
                p.setNombre(es.next());
                System.out.println("Ingrese su Apellidos:");
                p.setApellido(es.next());
                System.out.println("Ingrese su número de cédula:");
                p.setCedula(es.next());
                System.out.println("Ingrese un Usuario:");
                p.setUsuario(es.next());
                System.out.println("Ingrese una Clave:");
                p.setClave(es.next());
                System.out.println("Ingrese una Dirección:");
                p.setDireccion(es.next());
                System.out.println("Ingrese su Correo Electrónico:");
                p.setCorreoElectronico(es.next());
                System.out.println("Ingrese el sexo:");
                p.setSexo(es.next());
                System.out.println("Ingrese su Fecha de Nacimiento:");
                p.setFechaNacimiento(es.next());
                System.out.println("Ingrese un número Telefónico:");
                p.setTelefono(es.nextInt());

                PersonaControlador pc = new PersonaControlador();
                pc.crearPersona(p);
                
                }

            }

        } while (i == 1);

    }
}
