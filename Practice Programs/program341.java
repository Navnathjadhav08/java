package JAVA;
import java.util.*;



class program341
{
   
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iNO1 = sobj.nextInt();

        Digits nobj = new Digits();

        boolean bRet = nobj.CheckArmstrong(iNO1);

        if(bRet == true)
        {
            System.out.println("Number is Armstrong ");
        }

        System.out.println("NUmber of Digits of sum is : "+bRet);

       

        sobj.close();

    }
}

class Digits
{
     public  boolean CheckArmstrong(int iValue ) 
    {
        int

       
       }

         return iValue;

      

    }
}

/*
        IN : 371
        3^3 + 7^3 + 1^3
        27  + 343 + 1
        = 371

*/