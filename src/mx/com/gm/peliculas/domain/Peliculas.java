/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.peliculas.domain;

/**
 *
 * @author gabriel
 */
public class Peliculas {

 
    
    private String nombre;

   
    public Peliculas(String pelicula){
    
    this.nombre=pelicula;
    
    
    }
    
    
    
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
       @Override
    public String toString() {
        return "Peliculas{" + "nombre=" + nombre + '}';
    }
    
    
}
