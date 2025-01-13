

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

         String sret = obj.StrToggle(name);
        System.out.println("Converted String  : "+sret);
       
        sobj.close();
    }
}


  

class StringX
{
    public String StrToggle(String str)
    {
        char Arr[] = str.toCharArray();

        for(int iCnt = 0;iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] >= 'a' && Arr[iCnt] <= 'z')
            {
                Arr[iCnt] =(char) (Arr[iCnt] - 32);
            }
            else  if(Arr[iCnt] >= 'A' && Arr[iCnt] <= 'Z')
            {
                Arr[iCnt] =(char) (Arr[iCnt] + 32);
            }

        }  
        
        
        
        String ret = new String(Arr); 
         return ret;
    }

  

  
    

}


