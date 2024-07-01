/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 59397
 */
public class CuentaAhorro extends Cuenta {

    private boolean activa;

    public CuentaAhorro() {
    }

    public CuentaAhorro(boolean activa, double saldo, int numeroConsignaciones, double comicionMensual, int numeroRetiros, double tasaAnual) {
        super(saldo, numeroConsignaciones, comicionMensual, numeroRetiros, tasaAnual);
        this.activa = activa;
    }

    public boolean getActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public String imprimir() {
        return "--------CUENTA DE AHORRO----------\n"
                + "Saldo cuenta:" + getSaldo() + "\n"
                + "Número de consignaciones:" + getNumeroConsignaciones() + "\n"
                + "Número de retiros:" + getNumeroRetiros() + "\n"
                + "Tasa anual:" + getTasaAnual() + "\n"
                + "Comisión mensual:" + getComicionMensual() + "\n"
                + "Cuenta activa:" + getActiva() + "\n";

    }

    public void comprobarCuenta() {
        setActiva(getSaldo() >= 10000);
        if (getActiva()) {
            System.out.println("La cuenta esta activa");
        } else {
            System.out.println("La cuenta esta inactiva");
        }

    }

    public void consignar(double cantidad) {
        if (getActiva()) {
            consignar(cantidad);
        } else {
            System.out.println("La cuenta está inactiva. No se puede consignar dinero");
        }

    }

    public void retiro(double valorRetirar) {
        if (getActiva()) {
            retiro(valorRetirar);
        } else {
            System.out.println("");
        }
        comprobarCuenta();
    }
    public void extroctoMensual(){
        if (getNumeroRetiros()>4){
            setComicionMensual(getComicionMensual()+(getNumeroRetiros()-4)*1000);
        }
       
        comprobarCuenta();
    }

}
