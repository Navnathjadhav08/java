

package JAVA;

import java.util.Scanner;

class Matrix
{
    public int Arr[];

    public Matrix(int i,int j)
    {
        Arr = new int[i][j];
    }

    public void accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Elements : ");
        for(int i = 0; i<Arr.length; i++)
        {
            for(int j; j< Arr[i].length;j++)
            {
                Arr[i][j] = sobj.nextInt();

            }
        }
    }

    public void Display()
    {
        System.out.println("Elements of matrix are : ");
        for(int i = 0; i<Arr.length; i++)
        {
            for(int j; j< Arr[i].length;j++)
            {
                 System.out.println(Arr[i][j]+"\t");
                
            }
            System.out.println();
        }
   }

   int summation()
   {
    
   }
}

class program387
{

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0, iCol = 0;

        System.out.println("Enter number of Rows ");
        iRow = sobj.nextInt();

        System.out.println("Enter number of Column");
        iCol = sobj.nextInt();

        Matrix mobj = new Matrix(iRow,iCol);

        mobj.accept();
        mobj.Display();


    }
}