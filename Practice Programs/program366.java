

package JAVA;

import java.util.Scanner;

class program366
{

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Your name : ");
        String str = sobj.nextLine();

       str = str.toLowerCase();

       char Arr[] = str.toCharArray();

       int freq[] = new int[26];
       int iCnt = 0;

       for(char ch : Arr)
       {
           freq[ch - 'a']++;

       }

       System.out.println("Frequency of each letter is : ");
       for(iCnt = 0; iCnt < freq.length; iCnt++)
       {
        if(freq[iCnt] != 0)
        {
                System.out.println("Frequency of  "+(char)(iCnt+'a') + " is : "+ freq[iCnt]);
        }
            
       }
       
        sobj.close();
    }
}


  




