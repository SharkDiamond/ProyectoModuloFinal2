/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.peliculas.datos;

import java.util.List;
import mx.com.gm.peliculas.domain.Peliculas;

/**
 *
 * @author gabriel
 */
public interface AccesoDatos {
    
    
    public boolean existe(String nombreArchivo);//listo
    
    public List<Peliculas> listar(String nombreArchivo);
    
    public void escribir(Peliculas pelicula,String NombreArchivo,boolean Anexar);//listo
    
    public String buscar(String nombreArchivo,String buscar);//listo
    
    public void Crear(String nombreArchivo);//listo
    
    public void Eliminar(String nombreArchivo);//lsito
    
    
}
