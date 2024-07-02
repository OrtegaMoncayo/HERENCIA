/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 59397
 */
public class CuentaCorriente extends Cuenta {

    private double sobregiro;

    public CuentaCorriente() {
    }

    public CuentaCorriente(double sobregiro) {
        this.sobregiro = sobregiro;
    }

    public CuentaCorriente(double sobregiro, double saldo, int numeroConsignaciones, double comicionMensual, int numeroRetiros, double tasaAnual) {
        super(saldo, numeroConsignaciones, comicionMensual, numeroRetiros, tasaAnual);
        this.sobregiro = sobregiro;
    }

    public double getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(double sobregiro) {
        this.sobregiro = sobregiro;
    }



    public void consigna(double valorDepositar) {
        if (getSobregiro() > 0) {
            if (valorDepositar < getSobregiro()) {
                setSobregiro((getSobregiro() - valorDepositar));
                
            } else {
                double saldo=valorDepositar-getSobregiro();
                setSaldo(saldo);
            }
        } else {
            super.deposito(valorDepositar);
        }
    }

    @Override
    public void retiro(double valorRetirar) {
        if (valorRetirar < getSaldo()) {
            super.retiro(valorRetirar);

        } else {
            setSobregiro(getSobregiro() + (valorRetirar - getSaldo()));
            setSaldo(0);
            setNumeroRetiros(getNumeroRetiros() + 1);
        }
    }

    @Override
    public void extroctoMensual() {
        if (getNumeroRetiros() > 4) {
            setComicionMensual(getComicionMensual() + (getNumeroRetiros() - 4) * 1000);
        }
        super.extroctoMensual();
    }
        @Override
    public String imprimir() {
            System.out.println( """
               --------CUENTA CORRIENTE----------
               Saldo de cuenta:""" + getSaldo() + "\n"
                + "Número de consignacion:" + getNumeroConsignaciones() + "\n"
                + "N° retiro:" + getNumeroRetiros() + "\n"
                + "Tasa anual:" + getTasaAnual() + "\n"
                + "Comocion mensual:" + getComicionMensual() + "\n"
                + "Sobregiro:" + getSobregiro() + "\n");
            return null;

    }
}
