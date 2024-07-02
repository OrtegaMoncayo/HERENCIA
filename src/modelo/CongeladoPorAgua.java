/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 59397
 */
public class CongeladoPorAgua extends ProductoCongelado {

    private double salinidadAgua;

    public CongeladoPorAgua() {
    }

    public CongeladoPorAgua(double salinidadAgua) {
        this.salinidadAgua = salinidadAgua;
    }

    public CongeladoPorAgua(double salinidadAgua, String fechaEnvasado, String paisOrigen, double temperaturaMantenimiento, String fechaCaducidad, int numeroLote) {
        super(fechaEnvasado, paisOrigen, temperaturaMantenimiento, fechaCaducidad, numeroLote);
        this.salinidadAgua = salinidadAgua;
    }

    public double getSalinidadAgua() {
        return salinidadAgua;
    }

    public void setSalinidadAgua(double salinidadAgua) {
        this.salinidadAgua = salinidadAgua;
    }

    @Override
    public void imprimir() {
        System.out.println("----------DATOS DEL PRODUCTO---------\n"
                + "FECHA DE CADUCIDAD:" + getFechaCaducidad() + "\n"
                + "NÚMERO DE LOTE:" + getNumeroLote() + "\n"
                + "FECHA DE ENVASADO:" + getFechaEnvasado() + "\n"
                + "TEMPERATURA DE MANTENIMIENTO:" + getTemperaturaMantenimiento() + "\n"
                + "PAIS DE ORIGEN" + getPaisOrigen() + "\n"
                + "SALINIDAD DEL AQUA:" + getSalinidadAgua());
    }

}
