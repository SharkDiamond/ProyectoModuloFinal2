/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalsegundomodulo;

/**
 *
 * @author gabriel
 */
public enum Menu {
    
    
    
   INICIARCATALOGOPELICULAS(0),
   AGREGARPELICULA(1),
   LISTARPELICULAS(2),
   BUSCARPELICULA(3),
   SALIR(4);
    
   private final int eleccion;

   Menu(int a){

this.eleccion=a;


}
   
    public int getEleccion() {
        return eleccion;
    }
   
   
   
   
   
   
    
}
