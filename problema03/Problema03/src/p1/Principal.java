/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.ArrayList;
import p2.Estudiante;
import p3.Correo;
import p3.DominioGmail;
import p3.DominioGobierno;
import p3.DominioOutlook;
import p3.DominioUTPL;
import p3.DominioYahoo;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        /*
        El mini-sistema debe permitir que se genere
        diversos correos para un estudiante.
        Para Gmail
        Para Outlook
        Para Yahoo
        Para utpl.edu.ec
        Para gobiernoec.gob
        
        */
        
        Estudiante e = new Estudiante();
        e.establecerNombres("René Elizalde");
        e.establecerUserName("rrelizalde");
        ArrayList<Correo> lista = new ArrayList<>();
        
        DominioGmail dominioG = new DominioGmail();
        dominioG.establecerDominio("gmail.com");
        DominioOutlook dominioO = new DominioOutlook();
        dominioO.establecerDominio("hotmail.com");
        DominioYahoo dominioY = new DominioYahoo();
        dominioY.establecerDominio("yahoo.com");
        DominioUTPL dominioU = new DominioUTPL();
        dominioU.establecerDominio("utpl.edu.ec");
        DominioGobierno dominioGo = new DominioGobierno();
        dominioGo.establecerDominio("gob.ec");
        Correo c = new Correo();
        c.establecerDominio(dominio);
        c.establecerUserName(e.obtenerUserName());
        c.establecerCorreo();
        
        lista.add(c);
        
        e.establecerCorreos(lista);
        
        System.out.printf("%s\n", e);
        
        
    }
    
}
