

package JAVA;

import java.util.Scanner;

class program380
{

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First string: ");
        String str1 = sobj.nextLine();

         System.out.println("Enter Second String : ");
        String str2 = sobj.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char Arr[] = str1.toCharArray();
        char Brr[] = str2.toCharArray();

        int freq1[] = new int[26];
        int freq2[] = new int[26];

        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            freq1[Arr[iCnt] - 'a']++;
        }

        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            freq2[Brr[iCnt] - 'a']++;
        }

        for(iCnt = 0; iCnt < freq1.length; iCnt++)
        {
            if(freq1[iCnt] != freq2[iCnt])
            {
                break;

            }
        }

        if(iCnt == freq1.length)
        {
            
        }

       

       

       


        
       
        sobj.close();
    }
}


  




