/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 59397
 */
public class Cuenta {

    private double saldo;
    private int numeroConsignaciones;
    private double comicionMensual;
    private int numeroRetiros;
    private double tasaAnual;

    public Cuenta() {
    }

    public Cuenta(double saldo, int numeroConsignaciones, double comicionMensual, int numeroRetiros, double tasaAnual) {
        this.saldo = saldo;
        this.numeroConsignaciones = numeroConsignaciones;
        this.comicionMensual = comicionMensual;
        this.numeroRetiros = numeroRetiros;
        this.tasaAnual = tasaAnual;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConsignaciones() {
        return numeroConsignaciones;
    }

    public void setNumeroConsignaciones(int numeroConsignaciones) {
        this.numeroConsignaciones = numeroConsignaciones;
    }

    public double getComicionMensual() {
        return comicionMensual;
    }

    public void setComicionMensual(double comicionMensual) {
        this.comicionMensual = comicionMensual;
    }

    public int getNumeroRetiros() {
        return numeroRetiros;
    }

    public void setNumeroRetiros(int numeroRetiros) {
        this.numeroRetiros = numeroRetiros;
    }

    public double getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(double tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public String imprimir() {
        return "--------CUENTA----------\n"
                + "SALDO:" + getSaldo() + "\n"
                + "N° de consignaciones:" + getNumeroConsignaciones() + "\n"
                + "N° de retiros:" + getNumeroRetiros() + "\n"
                + "Tasa anual:" + getTasaAnual() + "\n"
                + "omicion mansual:" + getComicionMensual() + "\n";

    }

    public void deposito(double valorDepositar) {
        setSaldo(getSaldo() + valorDepositar);
        setNumeroConsignaciones(getNumeroConsignaciones() + 1);
    }

    public void retiro(double valorRetirar) {
        if (valorRetirar > getSaldo()) {
            System.out.println("No cuenta con los fondos suficientes"
                    + " para realizar el retiro");
        } else {
            setSaldo(getSaldo() - valorRetirar);
            setNumeroRetiros(getNumeroRetiros() + 1);
        }

    }

    public void calcularInteresMensual() {
        float interesMensual = (float) ((getTasaAnual() / 12) * getSaldo() / 100);
    }

    public void extroctoMensual() {
        setSaldo(getSaldo() - getComicionMensual());
        calcularInteresMensual();
        setComicionMensual(0);
    }

}
