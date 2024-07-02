/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 59397
 */
public class ProductoCongelado extends Producto{
    private String fechaEnvasado;
    private String paisOrigen;
    private double temperaturaMantenimiento;

    public ProductoCongelado() {
    }

    public ProductoCongelado(String fechaEnvasado, String paisOrigen, double temperaturaMantenimiento) {
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    public ProductoCongelado(String fechaEnvasado, String paisOrigen, double temperaturaMantenimiento, String fechaCaducidad, int numeroLote) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public double getTemperaturaMantenimiento() {
        return temperaturaMantenimiento;
    }

    public void setTemperaturaMantenimiento(double temperaturaMantenimiento) {
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }
       @Override
    public void imprimir() {
        System.out.println("----------DATOS DEL PRODUCTO---------\n"
                + "FECHA DE CADUCIDAD:" + getFechaCaducidad() + "\n"
                + "NÚMERO DE LOTE:" + getNumeroLote() + "\n"
                + "FECHA DE ENVASADO:" + getFechaEnvasado() + "\n"
                + "TEMPERATURA DE MANTENIMIENTO:" + getTemperaturaMantenimiento() + "\n"
                + "PAIS DE ORIGEN" + getPaisOrigen());
    }
    
}
