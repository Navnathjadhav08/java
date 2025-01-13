import java.util.*;


class program335
{
   
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iNO1 = sobj.nextInt();

        Digits nobj = new Digits();

        int iRet =nobj.CountDigits(iNO1);

        System.out.println("NUmber of Digits is : "+iRet);

       

        sobj.close();

    }
}

class Digits
{
     public  int CountDigits(int iValue) 
    {
       int iCount = 0;
        int iDigits = 0;

        while(iValue != 0)
        {
            iDigits = (iValue % 10 );
            iCount++;
            iValue = iValue /10;
        } 
        
        return iCount;
        

      

    }
}

