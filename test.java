import java.util.Random;
import java.util.ArrayList;
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
    // instance variables - replace the example below with your own
    private ArrayList<Alumno> alumnos;    

    /**
     * Constructor for objects of class test
     */
    public test()
    {
        Random rand = new Random();
        alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Pepe", 10+rand.nextInt(10)));
        alumnos.add(new Alumno("Juan", 10+rand.nextInt(10)));
        alumnos.add(new Alumno("Francisco", 10+rand.nextInt(10)));
        alumnos.add(new Alumno("Federico", 10+rand.nextInt(10)));
        alumnos.add(new Alumno("Cojoncio", 10+rand.nextInt(10)));
        
        for (Alumno alumno: alumnos)
        {
            alumno.putNota(rand.nextInt(11));
            alumno.putNota(rand.nextInt(11));
            alumno.putNota(rand.nextInt(11));
        }
        
        for (Alumno alumno: alumnos)
        {
            alumno.toString();
        }
    }

}
