/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;


public class Estudiante {
    String nombre;
    int numControl;
    String materia;
    double calificacion;
    String estado;
    
    public Estudiante(String nombre, int numControl, String materia, float calificacion)
    { //Constructor de la clase 
        setNombre(nombre);
        setNumControl(numControl);
        setMateria(materia);
        setCalificacion(calificacion);
        asignarEstado();
        
        
    }
    public void setNombre(String nombre)
    { //Metodo que recibe un string y lo almacena en nombre
	this.nombre = nombre;
    }
	
    public String getNombre(){ //metodo que regresa el nombre
	return nombre;
    }
    
    public void setNumControl(int numControl) /*Metodo que recibe un entero y lo almacena en matricula*/
        {
            this.numControl = numControl;
        }
    public int getNumControl()/*Metodo que regresa la matricula*/
        {
            return numControl;
        }
    
    public void setMateria(String materia)
        { //Metodo que recibe un string y lo almacena en nombre
            this.materia = materia;
        }
	
    public String getMateria(){ //metodo que regresa el nombre
	return materia;
    }
    
    public void setCalificacion(double calificacion) //guarda la calificacion del alumno en la variable calificacion
    {
        this.calificacion = calificacion;
    }
    public double getCalificacion() //devuelve un dato de tipo duble
    {
        return calificacion;
    }
    public String asignarEstado() //metodo que regresa un string dependiendo de la calificacion del alumno
    {
        if(calificacion >= 60)
        {
            estado = "Aprobado";
        }
        else
        {
            estado = "Reprobado";
        }
        return estado;
    }
    public void cambiarCalificacion(float nuevaCalificacion) //Metodo que cambia la calificacion del alumno
    {
        calificacion = nuevaCalificacion;
    }    
}
