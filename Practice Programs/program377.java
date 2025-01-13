

package JAVA;

import java.util.Scanner;

class program376
{

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Your name : ");
        String str = sobj.nextLine();

        StringBuffer sbobj = new StringBuffer(str);

        sbobj = sbobj.reverse();

        System.out.println(sbobj);



        
        
       
        sobj.close();
    }
}