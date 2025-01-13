

package JAVA;

import java.util.Scanner;

class program358
{

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Your name : ");
        String name = sobj.nextLine();

        StringX obj = new StringX();

        String sret = obj.Reverse(name);
        System.out.println("Result is  : "+sret);
       
        sobj.close();
    }
}


  

class StringX
{
    public String Reverse(String str)
    {
        char Arr[] = str.toCharArray();

        int iStart = 0;
        int iEnd =  Arr.length-1;
        char cTemp = ' ';

        While(iStart < iEnd)
        {
            cTemp = Arr[iStart];
            Arr[iStart] = Arr[iEnd];
            
        }
        
        

    }


  

}


