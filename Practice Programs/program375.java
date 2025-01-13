

package JAVA;

import java.util.Scanner;

class program373
{

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Your name : ");
        String str = sobj.nextLine();

        if(str.length() == 0)
        {
            System.out.println("Number of words are : 0");
            return;
        }

        str = str.replaceAll("\\s+", " ");

        str = str.trim();

        String arr[] = str.split(" ");

        System.out.println("Enter Your word that want to search : ");
        String word = sobj.nextLine();

        int iFrequency = 0;

        for(String s : arr)
        {
            if(s.equals(word))
            {
                iFrequency++;
            }

        }
        



        System.out.println("Number of Word india Occurs in String : "+iFrequency);

        
       
        sobj.close();
    }
}


  




