//Approach 2


package JAVA;

import java.util.Scanner;

class program351err

{

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Your name : ");
        String name = sobj.nextLine();

        System.out.println("Your NAme is : "+name);

        System.out.println("Length of string is : "+name.length());

        char str = name.toCharArray();

        for(int iCnt = 0; iCnt < name.length(); iCnt++)
        {
            System.out.println(str(iCnt));
        }



       
        sobj.close();
    }
}


  