/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3;

/**
 *
 * @author fabri
 */
public class GeneradorCorreos {
    private Dominio dom;
    private String correo;
    
    public void establecerDominio(Dominio d){ 
        dom = d;
    }
    
    public void establecerCorreo(String l){
       correo = String.format("%s%s", l, obtenerDominio().obtenerDominio());
    }
    
    public Dominio obtenerDominio(){
        return dom;
    }
    
    public String obtenerCorreo(){
        return correo;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s%s",
                 obtenerCorreo(), obtenerDominio());
        return cadena;
    }
    
}
