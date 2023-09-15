import java.util.*;

class Input
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        int iNo2 = sobj.nextInt();
        
        int iAns = 0;
        iAns = iNo1 + iNo2;
        System.out.println("Addition is : "+iAns);
    
        sobj.close();
    }
}

/*

Datatype        Method from Scanner class

boolean         nextBoolean();
byte            nextByte();
short           nextShort();
int             nextInt();
float           nextFloat();
double          nextDouble();
long            nextLong();
string          nextLine();

*/
