/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author luis0
 */
public class EstudiantePuntosExtra {
    String nombre;
    int numControl;
    String materia;
    float calificacion;
    String estado;
    
    /*public EstudiantePuntosExtra(String _nombre, int _numControl, String _materia) //metodo constructor publico con parametros
    {
        nombre = _nombre;
        numControl = _numControl;
        materia = _materia;
    }
    
    /*private EstudiantePuntosExtra() //Metodo constructor de la clase con acceso privado
    {
        nombre = "Maria";
        numControl = 12012;
    }*/ 
   /* public EstudiantePuntosExtra(String nombre,int numControl,String materia) /*Metodo constructor con el nombre de los parametros 
            igual que los atributos de la clase
    {
        nombre = nombre;
        numControl = numControl;
        materia = materia;
    } */
    public EstudiantePuntosExtra(String nombre,int numControl,String materia) /*Metodo constructor con el nombre de los parametros 
            igual que los atributos de la clase*/
    {
        this.nombre = nombre;
        this.numControl = numControl;
        this.materia = materia;
    } 

}
