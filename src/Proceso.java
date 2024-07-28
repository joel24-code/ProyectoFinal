
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joel_
 */
public class Proceso {
    private ArrayList<Object> a = new ArrayList<Object>();
    
    public Proceso(){}
    
    public Proceso(ArrayList<Object> a){
        this.a = a;
    }
    public void agregarRegistro(Cliente p){
        this.a.add(p);
    }
    public void modificarRegistro(int i, Cliente p){
        this.a.set(i, p);
    }
    public void eliminarRegistro(int i){
        this.a.remove(i);
    }
    public Cliente obtenerRegistro(int i){
        return (Cliente)a.get(i);
    }
    public int cantidadRegistro(){
        return this.a.size();
    }
    public int buscaCodigo(int codigo){
        for(int i=0; i<cantidadRegistro(); i++){
            if(codigo==obtenerRegistro(i).getCodigo())return i;
    }
        return -1;
}
}
