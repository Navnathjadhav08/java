package JAVA;
import java.util.*;


class program327
{
    public  static int Factorial(int iValue) 
    {
 int iMult = 1;

        for(int iCnt = 1; iCnt <= iValue; iCnt++)
        {
            iMult = iMult * iCnt;
        }

        return iMult;

    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iNO1 = sobj.nextInt();

        int iRet = Factorial(iNO1);
       
        System.out.println("Addition is : "+iRet);

        sobj.close();

    }
}