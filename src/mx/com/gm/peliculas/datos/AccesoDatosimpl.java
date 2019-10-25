/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.peliculas.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
   
        File a=new File("/home/gabriel/practica/peliculas"+nombrArchivo);
     
    
        
        try {
            
            
            BufferedReader entra=new BufferedReader(new FileReader(a));
            
            String lee;
            
            lee=entra.readLine();
            
            
            while(lee!=null){
            
            lee=entra.readLine();
            
            lista.add(new Peliculas(lee));
            
            
            }
            
            entra.close();
            
            return lista;
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccesoDatosimpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccesoDatosimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    return lista;
    
    }
    

    @Override
    public void escribir(Peliculas pelicula, String NombreArchivo, boolean Anexar) {
    
        File a=new File("/home/gabriel/practica/peliculas"+NombreArchivo);
     
        
            try {
                PrintWriter escribeArchivo=new PrintWriter(new FileWriter(a,Anexar));
                
                escribeArchivo.println(pelicula.getNombre());
                
                escribeArchivo.close();
                
                
            } catch (IOException ex) {
                Logger.getLogger(AccesoDatosimpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
         
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) {
//el archivo donde lo voy a buscar y el archivo donde lo voy a buscar
    
         File archivo=new File("/home/gabriel/practica/peliculas"+nombreArchivo);
        
        String lectura;
     
        try {
            //archivo a leer
            FileReader z=new FileReader(archivo);
            
           //lectura del archivo
       BufferedReader x=new BufferedReader(z);
        
        lectura=x.readLine();
        
        
        
        
        
        
    
        while(lectura!=null){
        
        
           lectura=x.readLine();
        
           if(lectura.equals(buscar)){
        
            
            return lectura;
        
        
        }
        
        else{
        
        
        System.out.println("Pelicula:"+buscar+" no encontrada en este archivo");
        
        
        }
        
    
        
        }
        
        x.close();
     
        
       
  
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccesoDatosimpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccesoDatosimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    
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
