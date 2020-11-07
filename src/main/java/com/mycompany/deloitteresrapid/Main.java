package com.mycompany.deloitteresrapid;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Diogo Pereira
 */
public class Main 
{
    public static void main(String[] args) throws IOException 
    {
                
        //Recursividade                 -------------------------------------------------------------
            /*Construir um metodo que sem utilizar um ciclo while ou for imprima para a consola os números
            múltiplos de 5 até 100.*/
            //System.out.println("Recursividade");
            //recursive(5, 1);
        
        //Constantes                    -------------------------------------------------------------
        /*
            Qual das seguintes declarações de uma constante numa classe, para uso somente nessa classe é a mais
            correta?

            b) private static final int CONST_VAR=1;
        */
        //Coleções                      -------------------------------------------------------------
        /*
            Que tipo de estrutura de coleção de dados deverá ser usada caso se pretenda que não exista
            duplicação de objetos na mesma?

            Set – interface que define uma coleção que não permite elementos duplicados. 
            A interface SortedSet, que estende Set, possibilita a classificação natural dos 
            elementos, tal como a ordem alfabética;
        */
        //Encontrar Indice              -------------------------------------------------------------
            /*
                Criar um método que dado um array de objetos devolva a posição onde se pode encontrar a primeira
                instância de um outro objecto.
                Ter em atenção que o objeto que se procura poderá ser null.
            */
        Objet1 var1 = new Objet1(1);
        Objet1 var2 = new Objet1(2);
        Objet2 varObjet2 = new Objet2();
        Objet1 var3 = new Objet1(4);
        Objet2 varObjet22 = new Objet2(10,"nada2");
        Objet1 var4 = new Objet1(5);
        Objet2 varObjet222 = new Objet2(15,"nada3");
        Objet1 var5 = new Objet1(6);
        Object[] x = new Object[]{var1,var2,varObjet2,var3,varObjet22,var4,varObjet222,var5};
        //Object[] arr = new Object[]{1,2,3,"string"};

       
        //System.out.println(Arrays.deepToString(x));
        System.out.println("Devolver primeira instância de um outro objecto");
        System.out.println(findFirstOccurrence(varObjet2, x));
        
        //Palavras Duplicadas           -------------------------------------------------------------
        /*
            Dado um ficheiro de texto, pretende-se que seja gerado um novo ficheiro de texto onde sejam
            removidas todas as palavras repetidas.
        */
            //replaceDuplicateWords();
        //Contagem de Tipo de Objetos   -------------------------------------------------------------
        /*
        Dada uma lista de objectos, criar dois metodos:
            1) Um metodo que devolva o numero de Strings existentes na lista de objetos;
            2) Um metodo que devolva o numero diferente de tipo de objetos;
        */
        ArrayList<Object> list; 
        list = new ArrayList<>();
        list.add(var1); 
        list.add("test"); 
        list.add(varObjet22); 
        list.add(2); 
        list.add(20); 
        list.add("NotGeeks");  
        list.add("NotGeeks");  
        list.add(30); 
        list.add("nada2");
        list.add(false); 
        System.out.println("Devolver o numero de Strings existentes na lista de objetos");
        System.out.println(countNumStringsInList(list));
        
        System.out.println("Devolver numero diferente de tipo de Objetos");
        System.out.println(countDifObjectInList(list));
        
    }
    public static void recursive(int n,int i) 
    {       
        if (n*i < 101)  
        {
          System.out.println(n * i); 
          recursive(n, i + 1);  
        }
        else            
        {
            System.out.println("Fim");
        }  
    }
    public static void replaceDuplicateWords() throws IOException
    {
        HashSet<String> uniqueNames = new HashSet<>();
        ArrayList<String> outputLines = new ArrayList<>();

        Scanner input = new Scanner(new File("sample.txt"));
        while (input.hasNextLine()) {

            // Split a line into an array of names.
            String[] names = input.nextLine().split(" ");
            String edited = "";
            for (String name : names) 
            {
                // If the name is already in the set, remove it.
                if (uniqueNames.add(name.toLowerCase())) 
                { //toLowerCase converts all letters to lowerCase
                    edited += name + " ";
                }
            }

            edited = edited.trim();  // remove excess whitespace

            // Add the final line to our output array.
            if (!edited.equals("")) {
                outputLines.add(edited);
            }
        }

        // Write the output array to a file.
        String outputFn = "output.txt";
        try (BufferedWriter output = new BufferedWriter(new FileWriter(outputFn))) 
        {
            output.write(String.join("\n", outputLines));
        }
        System.out.println("File '" + outputFn + "' created!");
    }
    public static int findFirstOccurrence(Object obj, Object[] objects)
    {
        
        for(int i = 0; i < objects.length; i++)
        {
           
            if(objects[i].getClass() == obj.getClass())
            {  
                return i;
            }
          
        }
      return -1;
    }
    public static int countDifObjectInList(ArrayList<Object> objects)
    {
        
        
        HashSet<Object> uniqueClass = new HashSet<>();
        
        
        for (int i = 0; i < objects.size(); i++)
        {      
            uniqueClass.add(objects.get(i).getClass());           
        }
            /*for (Object temp : uniqueClass) {
             System.out.println(temp);
             }*/
      return uniqueClass.size();
    }
      public static int countNumStringsInList(ArrayList<Object> objects)
    {
        int count = 0;
        
        for(int i = 0; i < objects.size(); i++) 
        {
            //System.out.println(objects.get(i));
            if (objects.get(i) instanceof String) {
                count++;
            }
            
        }
        
      return count;
    }
    
}
