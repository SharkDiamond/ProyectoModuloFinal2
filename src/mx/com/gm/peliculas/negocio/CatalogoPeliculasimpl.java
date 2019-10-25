/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.peliculas.negocio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.gm.peliculas.datos.AccesoDatos;
import mx.com.gm.peliculas.datos.AccesoDatosimpl;
import mx.com.gm.peliculas.domain.Peliculas;

/**
 *
 * @author gabriel
 */
public class CatalogoPeliculasimpl implements CatalogoPeliculas{

      AccesoDatos metods=new AccesoDatosimpl();
    
    public CatalogoPeliculasimpl(){}
    @Override
    
  
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
      
    Peliculas pelicula=new Peliculas(nombrePelicula);
  
    
    metods.escribir(pelicula, nombreArchivo, metods.existe(nombreArchivo));
    
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
        
      List g= metods.listar(nombreArchivo);
    
     System.out.println(g.iterator());
      
          for (Iterator it = g.iterator(); it.hasNext();) {
              Peliculas f = (Peliculas) it.next();
              
              System.out.println(f.getNombre());
          }
       
      
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {

        metods.buscar(nombreArchivo, buscar);
     

    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
      
        
        metods.Crear(nombreArchivo);
        
        
        
        
    }
    
    
    
    
    
    
}
