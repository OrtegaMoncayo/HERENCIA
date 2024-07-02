/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 59397
 */
public class ProductoRefrigerado extends Producto {

    private String codigoOrganismo;
    private String fechaEnvasado;
    private double temperaturaMantenimiento;
    private String paisOrigen;

    public ProductoRefrigerado() {
    }

    public ProductoRefrigerado(String codigoOrganismo, String fechaEnvasado, double temperaturaMantenimiento, String paisOrigen) {
        this.codigoOrganismo = codigoOrganismo;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
        this.paisOrigen = paisOrigen;
    }

    public ProductoRefrigerado(String codigoOrganismo, String fechaEnvasado, double temperaturaMantenimiento, String paisOrigen, String fechaCaducidad, int numeroLote) {
        super(fechaCaducidad, numeroLote);
        this.codigoOrganismo = codigoOrganismo;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
        this.paisOrigen = paisOrigen;
    }

    public String getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(String codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public double getTemperaturaMantenimiento() {
        return temperaturaMantenimiento;
    }

    public void setTemperaturaMantenimiento(double temperaturaMantenimiento) {
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public void imprimir() {
        System.out.println("----------DATOS DEL PRODUCTO---------\n"
                + "FECHA DE CADUCIDAD:" + getFechaCaducidad() + "\n"
                + "NÚMERO DE LOTE:" + getNumeroLote() + "\n"
                + "CODIGO DEL ORGANISMO:" + getCodigoOrganismo() + "\n"
                + "FECHA DE ENVASADO:" + getFechaEnvasado() + "\n"
                + "TEMPERATURA DE MANTENIMIENTO:" + getTemperaturaMantenimiento() + "\n"
                + "PAIS DE ORIGEN" + getPaisOrigen());
    }

}
