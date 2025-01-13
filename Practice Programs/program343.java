//Approach 1//Approach 1


package JAVA;

import java.util.Scanner;

class program343
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of Elements : ");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the Elements : ");

        int iCnt= 0 ;

         for(iCnt = 0 ; iCnt < iSize; iCnt++)
        {
            (Arr[iCnt]) = sobj.nextInt();
        }

        System.out.println(" Elements are");

        for(iCnt = 0 ; iCnt < iSize; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

        sobj.close();
    }
}