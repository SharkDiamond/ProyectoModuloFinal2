/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.peliculas.datos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.gm.peliculas.domain.Peliculas;

/**
 *
 * @author gabriel
 */
public class AccesoDatosimpl  implements AccesoDatos{

    @Override
    public boolean existe(String nombreArchivo) {
        
        File a=new File("/home/gabriel/practica/peliculas"+nombreArchivo);
     
       return a.exists();
        
        
    }

    @Override
    public List<Peliculas> listar(String nombrArchivo) {
       
    List<Peliculas> lista=new ArrayList();
        
   
    
    
    return lista;
    
    }
    

    @Override
    public void escribir(Peliculas pelicula, String NombreArchivo, boolean Anexar) {
    
        
        if(Anexar){
        
            try {
                PrintWriter escribeArchivo=new PrintWriter(new FileWriter(NombreArchivo));
                
                escribeArchivo.println(pelicula.getNombre());
                
                escribeArchivo.close();
                
                
            } catch (IOException ex) {
                Logger.getLogger(AccesoDatosimpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
        }
        
        
        else{
        
        
        System.out.println("El Archivo No Existe Por Lo Tanto No Se Pueden Agregar Peliculas");
        
        }
        
        
        
        
        
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) {
//el archivo donde lo voy a buscar y el archivo donde lo voy a buscar
    
    
    
    return "Encontrado";
    }

    @Override
    public void Crear(String nombreArchivo) {
        File archivo =new File("/home/gabriel/practica/peliculas"+nombreArchivo);
        
        
        
        try {
            PrintWriter creaarchivo=new PrintWriter(archivo);
            
            
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccesoDatosimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Eliminar(String nombreArchivo) {
        
        File archivo=new File("/home/gabriel/practica/peliculas"+nombreArchivo);
        
      if(this.existe(nombreArchivo)==true){
      
       archivo.delete();
        
      System.out.println("Archivo Eliminado");
      
      }
      
      else{
      
      
      System.out.println("El archivo no se pudo eliminar ya que este no existe");
      
      
      }
      
      
      
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
