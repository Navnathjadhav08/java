import java.util.*;
import java.io.*;

class program503
{
    public static void main(String arg[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the file name that you want to creat : ");
        String Filename = sobj.nextLine();

        try
        {
                File fobj = new File(Filename);

                 boolean bRet = fobj.exists();

                 if(bRet == true)
                    {
                           System.out.println("File is created successfully ");
                    }
                 else
                 {
                        System.out.println("File is Not created successfully ");
                 }
        }
        
        catch(Exception iobj)
        {
            System.out.println("Exception is Occured : "+iobj);
        }
    }
}