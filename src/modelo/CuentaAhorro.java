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

    public CuentaAhorro(boolean activa) {
        this.activa = activa;
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

    public void comprobarCuenta() {
        if (getSaldo() >= 10000) {
            setActiva(true);
            System.out.println("La cuenta esta activa");
        } else {
            setActiva(false);
            System.out.println("La cuenta esta inactiva");
        }

    }

    @Override
    public void retiro(double valorRetirar) {
        if (getActiva()) {
            super.retiro(valorRetirar);
            comprobarCuenta();
        } else {
            System.out.println("No se puede retirar dinero");
        }
    }

    public void consigna(double valorDepositar) {
        if (getActiva()) {
            super.deposito(valorDepositar);
            comprobarCuenta();
        } else {
            System.out.println("La cuenta está inactiva. ");
        }
    }

    @Override
    public void extroctoMensual() {
        if (getNumeroRetiros() > 4) {
            setComicionMensual(getComicionMensual() + (getNumeroRetiros() - 4) * 1000);
        }
        super.extroctoMensual();
        comprobarCuenta();
    }

    @Override
    public String imprimir() {
        System.out.println("""
                            --------CUENTA DE AHORRO----------
                            Cuenta activa:""" + getActiva() + "\n"
                + "Saldo cuenta:" + getSaldo() + "\n"
                + "Número de consignaciones:" + getNumeroConsignaciones() + "\n"
                + "Número de retiros:" + getNumeroRetiros() + "\n"
                + "Tasa anual:" + getTasaAnual() + "\n"
                + "Comisión mensual:" + getComicionMensual() + "\n");
        return null;
    }

}
