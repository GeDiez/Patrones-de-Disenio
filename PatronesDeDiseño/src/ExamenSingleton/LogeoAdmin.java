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
public abstract class LogeoAdmin extends Logeo{
    private static int numInstancias = 0;
    private static Usuario instancia = null;
    private static LogeoAdmin enLinea = null;
    
    private LogeoAdmin(){
        
    }
    
    public static Usuario getInstancia(Usuario [] usuarios, Usuario us){
        Usuario busqueda = BuscarUsuario(usuarios, us.getName(), us.getPass());
        if(busqueda == null){
            return null;
        }
        if(instancia == null){
            instancia = busqueda;
            numInstancias++;
            return busqueda;
        }
        else{
            return instancia;
        }
    }
    
    
}
