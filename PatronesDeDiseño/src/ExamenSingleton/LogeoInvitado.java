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
public class LogeoInvitado extends Logeo{
    private Usuario enLinea = null;    
    
    LogeoInvitado(Usuario [] usuarios, Usuario us){
        Usuario busqueda = BuscarUsuario(usuarios, us.getName(), us.getPass());
        if(busqueda != null){
            enLinea = busqueda;
        }
        else{
            enLinea = null;
        }
    }
    
    public Usuario getUsuario(){
        return enLinea;
    }
}
