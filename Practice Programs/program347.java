//Approach 2


package JAVA;

import java.util.Scanner;

class program347
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of Elements : ");
        int iSize = sobj.nextInt();

        MyArray mobj = new MyArray(iSize);
        mobj.Accept();
        mobj.Display();
        System.out.println("Sumation of all Elements : "+mobj.Summation());

        sobj.close();
    }
}

class ArrayX
{
    public int Arr[];

    public ArrayX(int iSize)
    {
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Elements : ");
        for(int iCnt = 0 ; iCnt < Arr.length; iCnt ++)
        {
            Arr[iCnt]  = sobj.nextInt();
        }

        sobj.close();
    }

    public void Display()
    {
        System.out.println(" Elements are : ");
        for(int iCnt = 0 ; iCnt < Arr.length; iCnt ++)
        {
            System.out.println(Arr[iCnt]);
        }

    }

   
}

class MyArray extends ArrayX
{
    public MyArray(int iSize)
    {
        super(iSize);
    }


     public int Summation()
    {
        int isum = 0;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            isum = isum + Arr[iCnt];
        }

        return isum;
    }
}


