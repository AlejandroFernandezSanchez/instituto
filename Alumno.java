
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
    private int clase;
    private ArrayListInt notas;

    /**
     * Constructor for objects of class Alumno
     */
    public Alumno()
    {
        notas = new ArrayListInt();
    }

    /**
     * @return un string con todos los datos
     */
    public String toString()
    {
        // put your code here
        return "nombre: " + nombre + "edad: " + edad + "clase: " + clase + "media de las notas: " + media(); 
    }
    
    public int media()
    {
        int media = 0;
        for (int i = 0; i<notas.size(); i++)
        {
            media = media + notas.get(i);
        }
        media = media/notas.size();
        return  media;
    }
    
     public boolean aprobado()
    {
        boolean  aprobado= false;
        if (media()>=5)
        {
            aprobado = true;
        }
        
        return aprobado;
    }
    
    
}
