/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Administrativo;
import modelo.CuentaAhorro;
import modelo.CuentaCorriente;
import modelo.Docente;
import modelo.Estudiante;
import modelo.Personas;

/**
 *
 * @author 59397
 */
public class Main {

    public static void main(String[] args) {

//        Cuenta c = new Cuenta();
//        c.setSaldo(10000);
//        c.setNumeroConsignaciones(5);
//        c.setComicionMensual(2);
//        c.setNumeroRetiros(5);
//        c.setTasaAnual(12);
//        c.extroctoMensual();
//        c.imprimir();
//
        
       CuentaAhorro Ca = new CuentaAhorro(true, 1000009, 0, 0, 0, 0);
        for (int i = 0; i < 5; i++) {
            Ca.comprobarCuenta();
            Ca.retiro(1800);
            Ca.consigna(i);
           Ca.imprimir();
       }
       CuentaCorriente Cc = new CuentaCorriente(0, 1234560, 0, 0, 0, 0);
       Cc.retiro(13000);
       Cc.extroctoMensual();
      Cc.imprimir();
    }
}
