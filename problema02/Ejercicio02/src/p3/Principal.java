/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import java.util.ArrayList;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.MatriculaEscuela;
import p1.MatriculaJardin;
import p1.MatriculaMaternal;
import p2.Matricula;
import p2.TipoMatricula;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        TipoMatricula tipos = new TipoMatricula();
        
        MatriculaCampamento mcamp = new MatriculaCampamento();
        mcamp.establecerTarifa();
        
        MatriculaColegio mcolegio = new MatriculaColegio();
        mcolegio.establecerTarifa();
        
        MatriculaEscuela mescuela = new MatriculaEscuela();
        mescuela.establecerTarifa();
        
        MatriculaJardin mjardin = new MatriculaJardin();
        mjardin.establecerTarifa();
        
        MatriculaMaternal mmaternal = new MatriculaMaternal();
        mmaternal.establecerTarifa();
        
        MatriculaMaternal mmaternal2 = new MatriculaMaternal();
        mmaternal2.establecerTarifa();
        
        ArrayList<Matricula> joj = new ArrayList<>();
        
        joj.add(mcamp);
        joj.add(mcolegio);
        joj.add(mescuela);
        joj.add(mjardin);
        joj.add(mmaternal);
        joj.add(mmaternal2);
        tipos.establecerMatriculas(joj);
        tipos.establecerPromedioTarifas();
        System.out.printf("%s\n", tipos);
    }
}
