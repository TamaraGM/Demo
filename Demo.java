import java.util.*;
//static le pertenece a la clase

public class Demo
{
    static void ordenarEnteros(int max)
    {
        int enteros[];
        enteros = new int [max];
        for(int i= 0; i < max; i++)
        {
            enteros[i]= (int)(Math.random()* max);
        }
        
        Arrays.sort(enteros);
        for(int i = 0; i< enteros.length; i++)
        {
            System.out.println(enteros[i]);
        }
    }
}