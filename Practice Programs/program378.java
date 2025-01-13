

package JAVA;

import java.util.Scanner;

class program373
{

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Your name : ");
        String str = sobj.nextLine();

     

        str = str.replaceAll("\\s+", " ");

        str = str.trim();

        String arr[] = str.split(" ");

        StringBuffer output = new StringBuffer();

        for(String s : arr)
        {
            StringBuffer word = new StringBuffer(s);
            output.append((word.reverse()).append(" ") );
        }

       

        System.out.println("Result is :  "+output);

        
       
        sobj.close();
    }
}


  




