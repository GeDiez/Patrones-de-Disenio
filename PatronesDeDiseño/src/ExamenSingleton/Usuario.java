/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenSingleton;

/**
 *
 * @author gediez
 */
public class Usuario {
    private String nombreUsuario, pass, tipo;
    
    Usuario(String nu, String p){
        nombreUsuario = nu;
        pass = p;
    }
    
    public String getName(){
        return nombreUsuario;
    }
    
    public String getPass(){
        return pass;
    }
    
    public String getTipo(){
        return tipo;
    }
}
