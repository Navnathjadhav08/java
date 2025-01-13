

package JAVA;

import java.util.Scanner;

class program353
{

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Your name : ");
        String name = sobj.nextLine();

        StringX obj = new StringX();

        int iRet = obj.CountSmall(name);
        System.out.println("Number of small Characters : "+iRet);
       
        sobj.close();
    }
}


  

class StringX
{
    int iCOunt = 0;
        public int CountSmall(String str)
        {
            int ilen = str.length();
            char chr[] = str.toCharArray();


            for(int iCnt = 0 ; iCnt < ilen ; iCnt ++)
            {
                if((chr[iCnt] >= 'a') && (chr[iCnt] <= 'z') )
                {
                    iCOunt++;
                }
            }

            return iCOunt;
        }

}


