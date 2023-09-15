import java.util.*;

class practic
{
    public static void main(String args[])
    {

       Scanner sobj = new Scanner(System.in);
       System.out.println("Enter number of Elements");
       int N = sobj.nextInt();

       int Arr[] = new int[N];

       System.out.println("Enter The Elements : ");
       int iCnt = 0;

       for( iCnt = 0; iCnt < N ; iCnt ++ )
       {
            Arr[iCnt] = sobj.nextInt();

       }

       System.out.println("Your Elements are");

       
       for(iCnt = 0 ; iCnt < N; iCnt++)
       {
        System.out.println(Arr[iCnt]);
       }

       int Odd , Even;
       Odd=Even=0;
       for(iCnt = 0 ; iCnt < N; iCnt++)
       {
          if(Arr[iCnt]%2 == 0)
          {
            Even++;
          }
          else
          {
            Odd++;
          }
       }

       System.out.println("Total Number of Odd Numbers Are : "+Odd);
       System.out.println("Total Number of Even Numbers Are : "+Even);

    }
}

