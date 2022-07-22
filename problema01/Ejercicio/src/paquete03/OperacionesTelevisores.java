/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import java.util.ArrayList;
import paquete01.Televisor;

/**
 *
 * @author SALA I
 */
public class OperacionesTelevisores {
    ArrayList<Televisor> lista;
    private double totalTvs = 0;
    private double TvCaro = 0;
    private String listaMarcas = "";
    
    public OperacionesTelevisores(ArrayList<Televisor> o){
        lista = o;
    }

    public void establecerTotalPrecioTvs() {
        for (int i = 0; i < lista.size(); i++) {
            totalTvs = totalTvs + lista.get(i).obtenerPrecio();
        }
    }

    public void establecerTelevisorMasCaro() {
        for (int i = 0; i < lista.size(); i++) {
            if (TvCaro < lista.get(i).obtenerPrecio()) {
                TvCaro = lista.get(i).obtenerPrecio();
            }
        }
    }

    public void establecerListaMarcasVendidas() {
        for (int i = 0; i < lista.size(); i++) {
            listaMarcas = String.format("%s%s\n", listaMarcas, lista.get(i).obtenerMarca());
        }
    }

    public double obtenerTotalPrecioTvs() {
        return totalTvs;
    }
    
    public double obtenerTelevisorMasCaro() {
        return TvCaro;
    }
    
    public String obtenerListaMarcasVendidas() {
        return listaMarcas;
    }
    
    @Override
    public String toString(){
        
        String cadena = String.format("Precio total de los televisores: %.2f\n"
                + "Televisor más caro: %.2f\n"
                + "Lista de Marcas más vendidas:\n%s",
                obtenerTelevisorMasCaro(),
                TvCaro,
                listaMarcas);
        
        return cadena;
    }
    

}
