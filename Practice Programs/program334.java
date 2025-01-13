import java.util.*;


class program335
{
   
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iNO1 = sobj.nextInt();

        Numbers nobj = new Numbers();

        int iRet =nobj.EvenFact(iNO1);

        System.out.println("MUltiplication of Even Factors is : "+iRet);

       

        sobj.close();

    }
}

class Numbers
{
     public  int EvenFact(int iValue) 
    {
       int iMult = 1;

        for(int iCnt = 2; iCnt <= iValue; iCnt+=2)        // N/2
        {
            if(((iValue % iCnt) == 0)  )
            {
               
                 iMult = iMult * iCnt;
                 
            }
           
        }

        return iMult;

    }
}

