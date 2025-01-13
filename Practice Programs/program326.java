package JAVA;
import java.util.*;


class program326
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int iNO1 = sobj.nextInt();
        
        System.out.println("Enter Second number : ");
        int iNO2 = sobj.nextInt();

        int iAns = 0;
        iAns = iNO1 + iNO2;

        System.out.println("Addition is : "+iAns);

        sobj.close();

    }
}