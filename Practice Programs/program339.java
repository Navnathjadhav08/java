import java.util.*;


class program339
{
   
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iNO1 = sobj.nextInt();

        Digits nobj = new Digits();

        int iRet =nobj.GenericRoot(iNO1);

        System.out.println("NUmber of Digits of sum is : "+iRet);

       

        sobj.close();

    }
}

class Digits
{
     public  int GenericRoot(int iValue) 
    {
       int iSum = 0;
        int iDigits = 0;



       while(iValue > 10)
       {
             while(iValue != 0)
                 {
                      iDigits = iValue % 10;
                        iSum = iSum +iDigits;
                        iValue = iValue / 10;
                 }
                 if(iSum > 10)
                 {
                    iValue = iSum;
                    iSum = 0;
                 }
                 else
                 {
                        iValue = iSum;
                        break;
                 }
               

       }

         return iValue;

      

    }
}

