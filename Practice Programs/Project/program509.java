import java.util.*;
import java.io.*;

class program503
{
    public static void main(String arg[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the file name of folder : ");
        String Foldername = sobj.nextLine();

        File fobj = new File(Foldername);
        try
        {
               boolean bRet = fobj.isDirectory();

               if(bRet == true)
               {
                  File list[] = fobj.listFiles();

                  System.out.println("Number of files in that directory are : "+list.length);
               }
                 
        }
        
        catch(Exception iobj)
        {
            System.out.println("Exception is Occured : "+iobj);
        }
    }
}