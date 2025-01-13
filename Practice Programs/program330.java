import java.util.*;


class program330
{
   
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iNO1 = sobj.nextInt();

        Numbers nobj = new Numbers();

        int iRet = nobj.Factorial(iNO1);
       
        System.out.println("Addition is : "+iRet);

        sobj.close();

    }
}

class Numbers
{
     public  int Factorial(int iValue) 
    {
       int iMult = 1;

        for(int iCnt = 1; iCnt <= iValue; iCnt++)
        {
            iMult = iMult * iCnt;
        }

        return iMult;

    }
}

