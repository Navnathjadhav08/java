

package JAVA;

import java.util.Scanner;

class program355
{

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Your name : ");
        String name = sobj.nextLine();

        StringX obj = new StringX();

        int iRet = obj.CountCap(name);
        System.out.println("Number of Capital Characters : "+iRet);
       
        sobj.close();
    }
}


  

class StringX
{
    int iCOunt = 0;
        public int CountCap(String str)
        {
            int ilen = str.length();
           


            for(int iCnt = 0 ; iCnt < ilen ; iCnt ++)
            {
                if((str.charAt(iCnt) >= 'A') && (str.charAt(iCnt) <= 'Z') )
                {
                    iCOunt++;
                }
            }

            return iCOunt;
        }

}


