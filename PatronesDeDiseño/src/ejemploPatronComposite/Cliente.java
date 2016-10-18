/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploPatronComposite;

/**
 *
 * @author gediez
 */
public class Cliente {
    public static void main(String [] args){
        Carpeta raiz = new Carpeta("Raiz", "Origen", 10);
        Carpeta home = new Carpeta("Usuario", "Datos de usuario", 10);
        Carpeta tools = new Carpeta("Tools", "Datos de usuario", 15);
        Carpeta etc = new Carpeta("etc", "configuraciones del sistema", 512);
        Archivo doc1 = new TextoPlano("Archivo1", "texto", 12);
        Archivo doc2 = new TextoPlano("Archivo2", "texto", 15);
        Archivo doc3 = new TextoPlano("Archivo3", "texto", 12);
        Archivo doc4 = new TextoPlano("Archivo4", "texto", 17);
        Archivo doc5 = new TextoPlano("Archivo5", "texto", 5);
        Archivo doc6 = new TextoPlano("Archivo6", "texto", 120);
        Archivo doc7 = new TextoPlano("Archivo7", "texto", 110);
        Archivo doc8 = new TextoPlano("Archivo8", "texto", 101);
        Archivo doc9 = new TextoPlano("Archivo9", "texto", 200);
        
        etc.agregar(doc7);
        etc.agregar(doc8);
        etc.agregar(doc9);        
        tools.agregar(doc4);
        tools.agregar(doc5);
        tools.agregar(doc6);        
        home.agregar(tools);
        home.agregar(doc2);
        home.agregar(doc3);
        raiz.agregar(home);
        raiz.agregar(doc1);
        raiz.agregar(etc);
        
        raiz.imprimir("");
    }
}
