import java.io.*;

class InputDemoX
{
    public static void main(String Arg[])
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
        int No1 = 0,No2 = 0;

        try
        {
            System.out.println("Enter first number");
            No1 = Integer.parseInt(bobj.readLine());

            System.out.println("Enter second number");
            No2 = Integer.parseInt(bobj.readLine());
        }
        catch(IOException obj)
        {            
        }
        int Ans = No1 + No2;

        System.out.println("Addition is : "+Ans);
    }
}