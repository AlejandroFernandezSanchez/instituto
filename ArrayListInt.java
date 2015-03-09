
/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    private int[] ints;

    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {
        ints = new int[0];
    }
  
    public void add(int elemento)
    {
        int[] newArray = new int[ints.length+1];
        if (ints.length!=0)
        {
            for (int i = 0; i<ints.length; i++)
            {
                newArray[i]=ints[i];        
                
            }
            
        }   
        ints = newArray;
            ints[ints.length-1] = elemento;
    }
    
    public void add(int index, int elemento)
    {
        if (index<ints.length)
        {
            int[] newArray= new int[ints.length+1];            
            for (int i = 0; i<index; i++)
            {
                newArray[i]=ints[i];  
            }
            newArray[index] = elemento;
            for (int i = index; i<ints.length; i++)
            {
                newArray[i+1]=ints[i];                        
            }           
            ints = newArray;
        }        
    }
    
    public void clear()
    {
        ints = new int[0];
    }
    
    public int remove(int index)
    {
        int removed = -1;
        if ((index<=ints.length) && (ints.length !=0) && (index >=0))
        {
            int[] newArray= new int[ints.length-1];        
            removed = ints[index];
            for (int i = 0; i<index; i++)
            {
                newArray[i]=ints[i];  
            }
            
            for (int i = index; i<ints.length-1; i++)
            {
                newArray[i]=ints[i+1];        
                
            }           
            ints = newArray;
        }
        return removed;
    }
    
    public boolean contains(int elemento)
    {
        boolean found = false;
        int index = 0;
        while (!found && index <ints.length)
        {
            if (ints[index]==elemento)
            {
                found= true;
            }
            index++;
        }        
        return found;
    }  
    
    public int get(int index)
    {
        int num = -1;
        if (index >= 0 && index < ints.length)
        {
            num = ints[index];
        }
        return num;
    }
    
    public boolean isEmpty()
    {
        boolean empty = false;
        if (ints.length == 0)
        {
            empty = true;
        }        
        return empty;
    }
    
    public void set( int index, int elemento)
    {      
        if ((index < ints.length) && (index >= 0))
        {      
           ints[index] = elemento;
        }
    }
    
    public int size()
    {
        return ints.length;
    }
    
    public int indexOf(int elemento)
    {
        boolean found = false;
        int index = 0;
        int result = -1;
        while (!(found) && index < ints.length)
        {
            if (ints[index] == elemento)
            {                
                result = index;
                found = true;
            }
            index++;
        }
        return result;
    }
    
   
}

