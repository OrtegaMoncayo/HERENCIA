/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import java.util.ArrayList;
import modelo.Cuenta;
import modelo.CuentaAhorro;
import modelo.CuentaCorriente;

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
        
        ArrayList<CuentaAhorro> listaCuentaAhorro=new  ArrayList<>();
        Scanner es=new Scanner(System.in);
        System.out.println("BENVENIDOS EL VANCO PEREZ GONSALES");
        System.out.println("CUIDANDOLE DES DEL 1998");
        System.out.println("ELIJA LA OPCION QUE USTED REQUIERA EJECUTAR:\n"
        +"1.CREAR\n"
        +"2.consulta\n"
        +"3.IMPRIMIR ESTADO DE CUENTA\n"
        +"4.DEPOSITAR\n"
        +"5.RETIRO\n");
        int op1=es.nextInt();
        if (op1==1){
            System.out.println("");
            int sm1=es.nextInt();
            if (sm1==1){
                System.out.println("");
                System.out.println("");
                double monto=es.nextDouble();
                CuentaAhorro cA=new CuentaAhorro(true, monto, 0, 1.35,0 , 12);
                cA.imprimir();
            }else if (sm1==2){
                System.out.println("");
                System.out.println("");
                double monto=es.nextDouble();
                CuentaAhorro cA=new CuentaAhorro(true, monto, 0, 1.35,0 , 12);
                cA.imprimir();
            }
        }
    }
}
