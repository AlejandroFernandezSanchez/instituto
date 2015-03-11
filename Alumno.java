
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    // instance variables - replace the example below with your own
    private String nombre;
    private int edad;
    private static int AULA = 0;;
    private int numClase;
    private ArrayListInt notas;

    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(String nombre, int edad)
    {
        notas = new ArrayListInt();
        this.nombre = nombre;
        this.edad = edad;
        AULA++;
        numClase = AULA;
    }

    /**
     * @return un string con todos los datos
     */
    public String toString()
    {
        // put your code here
        String toString = "nombre: " + nombre + ". Edad: " + edad + ". Nº de alumno: " + numClase + ". Media de las notas: " + media();
        if (notas.size()!=0)
        {
            toString = toString + " Y sus notas son: ";
            for (int i = 0; i<notas.size(); i++)
            {
                toString = toString + " NOTA" + (i+1) + " = " + notas.get(i);
            }
            if (aprobado())
            {
                toString += ". Está aprobado con media " + media() + ".";
                
            }     
            else
            {
                toString += ". Está suspenso con media " +media() + ".";
            }
        }
        else
        {
            toString += "No hay notas aun.";
        }
        System.out.println(toString);
        return toString; 
    }
    
    public int media()
    {
        int media = -1;
        if(notas.size()!=0)
        {            
            for (int i = 0; i<notas.size(); i++)
            {
                media = media + notas.get(i);
            }
            media = media/notas.size();
        }
        return  media;
    }
    
     public boolean aprobado()
    {
        boolean  aprobado= false;
        if(notas.size()!=0)
        {
            if (media()>=5)
            {
                aprobado = true;
            } 
        }
        return aprobado;
    }
    
    public int getNota(int index)
    {
        return notas.get(index);
    }
    
    public void putNota(int nota)
    {
        notas.add(nota);
    }
}
