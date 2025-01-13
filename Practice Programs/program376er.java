

package JAVA;

import java.util.Scanner;

class program376
{

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Your name : ");
        String str = sobj.nextLine();

      

        str = str.trim();

        String arr[] = str.split(" ");

        int iMax = 0;
        int iPos = 0;

        for(int iCnt = 0; iCnt < arr.length; iCnt++)
        {
            if(arr[iCnt].length() > iMax)
            {
                iMax = arr[iCnt].length();
                iPos = iCnt;
            }
        }

       System.out.println("Largest word is : "+arr[iPos]);

        
       
        sobj.close();
    }
}