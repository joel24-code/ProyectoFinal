

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joel_
 */
public class Usuario {
    private String nombreUsuario;
    private  String contrasena;
    
    
    public Usuario(String nombreUsuario, String contrasena){
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }
    public String getNombreUsuario(){
        return nombreUsuario;
    }
    public String getContrasena(){
        return contrasena;
    }
}

