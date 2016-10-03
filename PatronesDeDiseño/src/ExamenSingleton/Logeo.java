/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenSingleton;

import java.util.HashMap;

/**
 *
 * @author gediez
 */
public abstract class Logeo {
        
    Logeo(){}
    
    public static Usuario BuscarUsuario(Usuario [] usuarios, String nu, String pass){
        Usuario encontrado = null;
        for(int i=0; i<usuarios.length; i++){
            if(usuarios[i].getName().equals(nu) && usuarios[i].getPass().equals(pass)){
                encontrado = usuarios[i];
            }
        }
        return encontrado;
    }
    
    public void iniciarSesion(String nom, String p){}
}
