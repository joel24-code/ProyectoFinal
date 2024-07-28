
import java.util.List;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joel_
 */
public class UsuarioManager {
    private List<Usuario> usuarios;
       
    public UsuarioManager(){
        this.usuarios = new ArrayList<>();
    }
    public void agregarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    public Usuario buscarUsuario(String nombreUsuario){
        for(Usuario usuario : usuarios){
            if(usuario.getNombreUsuario().equals(nombreUsuario)){
                return usuario;
            }
        }
        return null;
    }
    public boolean validarUsuario(String nombreUsuario, String contrasena){
        Usuario usuario = buscarUsuario(nombreUsuario);
        return usuario !=null && usuario.getContrasena().equals(contrasena);
    }
}

