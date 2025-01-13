

package JAVA;

import java.util.Scanner;

class program380
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

        for(int iCnt = arr.length-1; iCnt >= 0; iCnt--)
        {
            StringBuffer sb = new StringBuffer(arr[iCnt]);
            output.append(arr[iCnt].append(" "));
        }

       

        System.out.println("Result is :  "+output);

        
       
        sobj.close();
    }
}


  




