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
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.gm.peliculas.datos.AccesoDatosimpl;
import mx.com.gm.peliculas.domain.Peliculas;

/**
 *
 * @author gabriel
 */
public class CatalogoPeliculasimpl implements CatalogoPeliculas{

      AccesoDatosimpl metods=new AccesoDatosimpl();
    
    public CatalogoPeliculasimpl(){}
    @Override
    
  
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
      
    Peliculas pelicula=new Peliculas(nombrePelicula);
  
    
    metods.escribir(pelicula, nombreArchivo, metods.existe(nombreArchivo));
    
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
        
        File archivo=new File("/home/gabriel/practica/peliculas"+nombreArchivo);
        
        String lectura;
        try {
            //archivo a leer
            FileReader z=new FileReader(archivo);
            
            //lectura del archivo
        BufferedReader x=new BufferedReader(z);
            
        lectura=x.readLine();
        
        System.out.println(lectura);
            
        x.close();
        
        while(lectura!=null){
        
            System.out.println(lectura);
            
         lectura=x.readLine();
        }
        
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CatalogoPeliculasimpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CatalogoPeliculasimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
     
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {

        
         File archivo=new File("/home/gabriel/practica/peliculas"+nombreArchivo);
        
        String lectura;
     
        try {
            //archivo a leer
            FileReader z=new FileReader(archivo);
            
           //lectura del archivo
       BufferedReader x=new BufferedReader(z);
        
        lectura=x.readLine();
        
        x.close();
        
        while(lectura!=null){
        
        
           lectura=x.readLine();
        
        
        
        }
        
        
        if(lectura.equals(buscar)){
        
        System.out.println("Pelicula:"+buscar+" encontrada");
        
        }
        
        else{
        
        
        System.out.println("Pelicula:"+buscar+" no encontrada en este archivo");
        
        
        }
        
        
       
  
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CatalogoPeliculasimpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CatalogoPeliculasimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     

    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
      
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
