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

    public void consigna(double cantidad) {
        if (getSobregiro() > 0) {
            if (cantidad >= getSobregiro()) {
                setSaldo(getSaldo() + (cantidad - getSobregiro()));
                setSobregiro(0);
            } else {
                setSobregiro((getSobregiro() - cantidad));
            }
        } else {
            consigna(cantidad);
        }
    }
     public String imprimir() {
        return "--------CUENTA CORRIENTE----------\n"
                + "Saldo de cuenta:" + getSaldo() + "\n"
                + "Número de consignacion:" + getNumeroConsignaciones() + "\n"
                + "N° retiro:" + getNumeroRetiros() + "\n"
                + "Tasa anual:" + getTasaAnual() + "\n"
                + "Comocion mensual:" + getComicionMensual() + "\n"
                + "Sobregiro:" + getSobregiro()+ "\n";

    }

    public void retiro(double cantidad) {
        if (cantidad <= getSaldo()) {
            retiro(cantidad);

        } else {
            setSobregiro(getSobregiro() + (cantidad - getSaldo()));
            setSaldo(0);
            setNumeroRetiros(getNumeroRetiros()+1);
        }
    }
     public void extroctoMensual(){
        if (getNumeroRetiros()>4){
            setComicionMensual(getComicionMensual()+(getNumeroRetiros()-4)*1000);
        }
        extroctoMensual();
    }
}
