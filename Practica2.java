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
public class Practica2 { //Archivo donde se encuentra el metodo main de la practica 


    public static void main(String[] args) {
        Estudiante estudiantes[] = new Estudiante[10]; //Se declara arreglo de 10 estudiantes
        //Se inicializan los primeros 5 estudiantes 
        estudiantes[0] = new Estudiante("Luis", 1, "POO",80);
        estudiantes[1] = new Estudiante("Mario",2,"POO", 72);
        estudiantes[2] = new Estudiante("Alan", 3, "POO", 95);
        estudiantes[3] = new Estudiante("Fernando", 4, "POO", 58);
        estudiantes[4] = new Estudiante("Alex", 5, "POO", 43);
        int op;
       do{ //El menu aparecera hasta que no se salga del do while
            op = 0;
            System.out.println("1) Capturar Alumnos");
            System.out.println("2) Mostrar Alumno");
            System.out.println("3) Cambiar calificacion");
            System.out.println("4) Salir");
            op = CapturaEntrada.capturarEntero("Opcion");
            switch(op)
            {
                case 1 ->                //Capturar estudiantes 
                {
                    for(int i = 5; i<10;i++) //Solo se capturan los estudiantes faltantes
                    {
                        estudiantes[i] = new Estudiante(CapturaEntrada.capturarCadena("Nombre"), CapturaEntrada.capturarEntero("Matricula"), CapturaEntrada.capturarCadena("Materia"), CapturaEntrada.capturarFlotante("Calificacion"));
                    }
                    break;
                }
                case 2 ->                 { //Imprimir estudiantes
                     if(estudiantes[5] == null) //Si el sexto estudiante está vacio es que aun no se inicializan por lo tnato solo se imprimirar los primeros 5
                     {
                         for(int i = 0;i<5;i++)
                         {
                             System.out.println("Alumno numero" + i);
                             System.out.println("Nombre: " + estudiantes[i].getNombre());
                             System.out.println("Num. Control: " + estudiantes[i].getNumControl());
                             System.out.println("Materia: "+ estudiantes[i].getMateria());
                             System.out.println("Calificacion: " + estudiantes[i].getCalificacion());
                             System.out.println("Estado de la materia: " + estudiantes[i].estado);
                             System.out.println();
                         }
                     }
                     else //Si existe el sexto estudiante es que el arreglo está lleno por lo tanto se imprimen los 10 estudiantes
                     {
                         for(int i = 0;i<10;i++) 
                         {
                             System.out.println("Alumno numero" + i);
                             System.out.println("Nombre: " + estudiantes[i].getNombre());
                             System.out.println("Num. Control: " + estudiantes[i].getNumControl());
                             System.out.println("Materia: "+ estudiantes[i].getMateria());
                             System.out.println("Calificacion: " + estudiantes[i].getCalificacion());
                             System.out.println("Estado de la materia: " + estudiantes[i].asignarEstado());
                             System.out.println();
                         }
                     }
                     break;
                }
                case 3 -> //Cambiar calificacion
                {
                    if(estudiantes[5] == null) //Si el sexto estudiante esta vacio solo se cambiaran las calificaciones a los primeros 5
                     {
                         for(int i = 0;i<5;i++)
                         {
                           estudiantes[i].setCalificacion(CapturaEntrada.capturarFlotante("Introduce calficacion nueva para " + estudiantes[i].getNombre()));

                         }
                     }
                    else //Si no se cambiaran a todos 
                     {
                         for(int i = 0;i<10;i++)
                         {
                           estudiantes[i].setCalificacion(CapturaEntrada.capturarFlotante("Introduce calficacion nueva para " + estudiantes[i].getNombre()));

                         }
                     }
                    break;
                }
                
            }
       }while(op != 4);        //Si op es igual a 4 se saldra del ciclo 
    }
}

