/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelo.Cuenta;
import modelo.CuentaAhorro;
import modelo.CuentaCorriente;

/**
 *
 * @author 59397
 */
public class MainCuenta {

    public static void main(String[] args) {

        Scanner es = new Scanner(System.in);
        
        Cuenta c=new Cuenta(10000, 2000, 15000, 5, 0);

        CuentaAhorro Ca = new CuentaAhorro();
        Ca.retiro(1000);
        Ca.consignar(100);
        Ca.deposito(10);
        Ca.extroctoMensual();
        Ca.comprobarCuenta();
        Ca.imprimir();

        CuentaCorriente Cc = new CuentaCorriente();
        Cc.consigna(2000);
        Cc.retiro(20);
        Cc.deposito(100);
        Cc.extroctoMensual();
        Cc.imprimir();

    }
}
