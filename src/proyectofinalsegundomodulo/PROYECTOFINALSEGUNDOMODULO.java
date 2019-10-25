/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalsegundomodulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
        
       boolean condicion=true; 
       
       while(condicion){
       
       //ENTRADA
       System.out.println("Elige Opcion:");
       System.out.println("1-"+Menu.INICIARCATALOGOPELICULAS);
       System.out.println("2-"+Menu.AGREGARPELICULA);
       System.out.println("3-"+Menu.LISTARPELICULAS);
       System.out.println("4-"+Menu.BUSCARPELICULA);
       System.out.println("0-"+Menu.SALIR);
       
       opcion=elige.nextInt();
    
       //Procesos
       switch(opcion){
       
           case 1:
               
               
               
               break;
               
               
          case 2:
               
               
               break;
               
              
                 case 3:
               
               
               break;
               
                  case 4:
               
               
               break;
               
               
                  case 0:
               
                      condicion=false;
               
               break;
               
               
                  default:
                      
                      System.out.println("No se eligio una opcion valida");
       
       }
       
       }
       
       System.out.println("Saliendo del sistema que tengas un gran dia");
      System.exit(0);
    }
    
}
