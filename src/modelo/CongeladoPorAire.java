/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 59397
 */
public class CongeladoPorAire extends ProductoCongelado {

    private double porcentajeNitrogeno;
    private double porcentajeOxigeno;
    private double porcentajeDioxidoCarbono;
    private double porcentajeVaporAgua;

    public CongeladoPorAire() {
    }

    public CongeladoPorAire(double porcentajeNitrogeno, double porcentajeOxigeno, double porcentajeDioxidoCarbono, double porcentajeVaporAgua) {
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }

    public CongeladoPorAire(double porcentajeNitrogeno, double porcentajeOxigeno, double porcentajeDioxidoCarbono, double porcentajeVaporAgua, String fechaEnvasado, String paisOrigen, double temperaturaMantenimiento, String fechaCaducidad, int numeroLote) {
        super(fechaEnvasado, paisOrigen, temperaturaMantenimiento, fechaCaducidad, numeroLote);
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }

    public double getPorcentajeNitrogeno() {
        return porcentajeNitrogeno;
    }

    public void setPorcentajeNitrogeno(double porcentajeNitrogeno) {
        this.porcentajeNitrogeno = porcentajeNitrogeno;
    }

    public double getPorcentajeOxigeno() {
        return porcentajeOxigeno;
    }

    public void setPorcentajeOxigeno(double porcentajeOxigeno) {
        this.porcentajeOxigeno = porcentajeOxigeno;
    }

    public double getPorcentajeDioxidoCarbono() {
        return porcentajeDioxidoCarbono;
    }

    public void setPorcentajeDioxidoCarbono(double porcentajeDioxidoCarbono) {
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
    }

    public double getPorcentajeVaporAgua() {
        return porcentajeVaporAgua;
    }

    public void setPorcentajeVaporAgua(double porcentajeVaporAgua) {
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }

    @Override
    public void imprimir() {
        System.out.println("----------DATOS DEL PRODUCTO---------\n"
                + "FECHA DE CADUCIDAD:" + getFechaCaducidad() + "\n"
                + "NÚMERO DE LOTE:" + getNumeroLote() + "\n"
                + "FECHA DE ENVASADO:" + getFechaEnvasado() + "\n"
                + "TEMPERATURA DE MANTENIMIENTO:" + getTemperaturaMantenimiento() + "\n"
                + "PAIS DE ORIGEN" + getPaisOrigen() + "\n"
                + "COMPOSICIÓN DEL AIRE:\n"
                + "N2=" + getNumeroLote()+"%" + "\n"
                + "%,02=" + getFechaEnvasado() + "%" + "\n"
                + "%,C02=" + getTemperaturaMantenimiento()+"%" + "\n"
                + "%,H2O" + getPaisOrigen()+"%");
    }

}
