import java.util.*;


class program338
{
   
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iNO1 = sobj.nextInt();

        Digits nobj = new Digits();

        int iRet =nobj.SumDigits(iNO1);

        System.out.println("NUmber of Digits of sum is : "+iRet);

       

        sobj.close();

    }
}

class Digits
{
     public  int SumDigits(int iValue) 
    {
       int iSum = 0;
        int iDigits = 0;

        while(iValue != 0)
        {
            
            iSum = iSum + (iValue % 10 );
            iValue = iValue /10;
        } 
        
        return iSum;
        

      

    }
}

