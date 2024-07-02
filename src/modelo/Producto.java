/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 59397
 */
public class Producto {

    private String fechaCaducidad;
    private int numeroLote;

    public Producto() {
    }

    public Producto(String fechaCaducidad, int numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }
    public void imprimir() {
        System.out.println("----------DATOS DEL PRODUCTO---------\n"
                + "FECHA DE CADUCIDAD:"+getFechaCaducidad()+"\n"
                + "NÚMERO DE LOTE:"+getNumeroLote()+"\n");
    }

}
