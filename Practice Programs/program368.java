

package JAVA;

import java.util.Scanner;

class program367
{

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Your name : ");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s+", " ");

        System.out.println("Updated string is : "+str);
       
        sobj.close();
    }
}


  




