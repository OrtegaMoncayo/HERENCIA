/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 59397
 */
public class CongeladorPorNitrogeno extends ProductoCongelado {

    private String metodoCongelacion;
    private int tiempoExposicion;

    public CongeladorPorNitrogeno() {
    }

    public CongeladorPorNitrogeno(String metodoCongelacion, int tiempoExposicion) {
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicion = tiempoExposicion;
    }

    public CongeladorPorNitrogeno(String metodoCongelacion, int tiempoExposicion, String fechaEnvasado, String paisOrigen, double temperaturaMantenimiento, String fechaCaducidad, int numeroLote) {
        super(fechaEnvasado, paisOrigen, temperaturaMantenimiento, fechaCaducidad, numeroLote);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicion = tiempoExposicion;
    }

    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }

    public void setMetodoCongelacion(String metodoCongelacion) {
        this.metodoCongelacion = metodoCongelacion;
    }

    public int getTiempoExposicion() {
        return tiempoExposicion;
    }

    public void setTiempoExposicion(int tiempoExposicion) {
        this.tiempoExposicion = tiempoExposicion;
    }

    @Override
    public void imprimir() {
        System.out.println("----------Congelador Por Nitrogeno---------\n"
                + "FECHA DE CADUCIDAD:" + getFechaCaducidad() + "\n"
                + "NÚMERO DE LOTE:" + getNumeroLote() + "\n"
                + "FECHA DE ENVASADO:" + getFechaEnvasado() + "\n"
                + "TEMPERATURA DE MANTENIMIENTO:" + getTemperaturaMantenimiento() + "\n"
                + "PAIS DE ORIGEN" + getPaisOrigen() + "\n"
                + "METODO DE CONGELACION" + getMetodoCongelacion() + "\n"
                + "TIEMPO DE EXPOSICION" + getTiempoExposicion() + "\n");
    }
}
