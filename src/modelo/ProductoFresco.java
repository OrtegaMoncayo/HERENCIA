/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 59397
 */
public class ProductoFresco extends Producto{
    private String fechaEnvasado;
    private String paisOringen;

    public ProductoFresco() {
    }

    public ProductoFresco(String fechaEnvasado, String paisOringen) {
        this.fechaEnvasado = fechaEnvasado;
        this.paisOringen = paisOringen;
    }

    public ProductoFresco(String fechaEnvasado, String paisOringen, String fechaCaducidad, int numeroLote) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOringen = paisOringen;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOringen() {
        return paisOringen;
    }

    public void setPaisOringen(String paisOringen) {
        this.paisOringen = paisOringen;
    }
    
     public void imprimir() {
        System.out.println("----------DATOS DEL PRODUCTO---------\n"
                + "FECHA DE CADUCIDAD:"+getFechaCaducidad()+"\n"
                + "NÚMERO DE LOTE:"+getNumeroLote()+"\n"
        +"PAÍS DE ORIGEN:"+getPaisOringen()+"\n"
        +"");
    }
}
