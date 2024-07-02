/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.CongeladoPorAgua;
import modelo.CongeladoPorAire;
import modelo.CongeladorPorNitrogeno;
import modelo.ProductoCongelado;
import modelo.ProductoFresco;
import modelo.ProductoRefrigerado;

/**
 *
 * @author 59397
 */
public class MainProducto {
    public static void main(String[] args) {
        
        ProductoFresco pF=new ProductoFresco("12/02/2023", "Ecuador", "12/04/2025", 30);
        pF.imprimir();
        
        ProductoRefrigerado pR=new ProductoRefrigerado("", "", 20, "");
        pR.imprimir();
        
        ProductoCongelado pC=new ProductoCongelado("", "", 0, "", 0);
        pC.imprimir();
        
        CongeladoPorAgua cA = new CongeladoPorAgua(0);
        cA.imprimir();
        
        CongeladoPorAire cPa=new CongeladoPorAire(0, 0, 0, 0);
        cPa.imprimir();
        
        CongeladorPorNitrogeno cN=new CongeladorPorNitrogeno("", 0);
        cN.imprimir();
        
    }
    
}
