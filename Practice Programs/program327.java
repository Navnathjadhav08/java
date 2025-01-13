package JAVA;
import java.util.*;


class program327
{
    //public int Factorial(int iV)
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iNO1 = sobj.nextInt();
        int iMult = 1;

        for(int iCnt = 1; iCnt <= iNO1; iCnt++)
        {
            iMult = iMult * iCnt;
        }

        System.out.println("Addition is : "+iMult);

        sobj.close();

    }
}