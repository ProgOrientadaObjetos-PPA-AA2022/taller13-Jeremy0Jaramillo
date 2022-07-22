/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;

/**
 *
 * @author asjkhd
 */
public class TipoMatricula {
    private ArrayList<Matricula> ola;
    private double promedioMatriculas = 0;
    
    
    
    public void establecerMatriculas(ArrayList<Matricula> v){
        ola = v;
    }
    

    public void establecerPromedioTarifas() {
        for (int i = 0; i < ola.size(); i++) {
        promedioMatriculas = (promedioMatriculas + ola.get(i).obtenerTarifa());
        }
        promedioMatriculas = promedioMatriculas/ ola.size();
    }
    
    public ArrayList<Matricula> obtenerMatriculas(){
        return ola;
    }

    public double obtenerPromedioTarifas() {
        return promedioMatriculas;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Lista de Matrículas:\n");
        
        for (int i = 0; i < ola.size(); i++) {
            cadena = String.format("%s%s\n",cadena,ola.get(i));
        }
                
         cadena = String.format("%sPromedio de matriculas: %.2f",
                 cadena,
                promedioMatriculas);
        
        return cadena;
    }
}
