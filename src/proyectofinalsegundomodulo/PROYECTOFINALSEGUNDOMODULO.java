/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalsegundomodulo;

import java.util.Scanner;
import mx.com.gm.peliculas.negocio.CatalogoPeliculas;
import mx.com.gm.peliculas.negocio.CatalogoPeliculasimpl;

/**
 *
 * @author gabriel
 */
public class PROYECTOFINALSEGUNDOMODULO {

    public static void main(String[] args) {
       
        int opcion;
        String nombrearchivo;
        
       Scanner elige=new Scanner(System.in);
       
       
       CatalogoPeliculas catalogo=new CatalogoPeliculasimpl();
        
        
       
       
       //ENTRADA
       System.out.println("Elige Opcion:");
       System.out.println("1-"+Menu.INICIARCATALOGOPELICULAS);
       System.out.println("2-"+Menu.AGREGARPELICULA);
       System.out.println("3-"+Menu.LISTARPELICULAS);
       System.out.println("4-"+Menu.BUSCARPELICULA);
       System.out.println("0-"+Menu.SALIR);
       
       opcion=elige.nextInt();
    
     
       
    }
    
}
