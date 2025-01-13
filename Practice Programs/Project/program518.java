import java.util.*;
import java.io.*;

class program516
{
    public static void main(String arg[])
    {
        
        Scanner sobj = new Scanner(System.in);
        byte Header[] = new byte[100];

        System.out.println("----------- Marvellous Packer Unpacker ----------- ");
        
        System.out.println("UnPacking Actvity of the appication is started...");

        System.out.println("Enter the file name whitch contains the packed data : ");
        String PackFile = sobj.nextLine();

        try
        {
            File Packobj = new File(PackFile);

            FileInputStream inobj = new FileInputStream(Packobj);

            inobj.read(Header, 0, 100);

            String  HeaderStr = new String(Header);

            System.out.println(HeaderStr);

            String Tokens[];
            Tokens = HeaderStr.split(" ");

            System.out.println("File Name : "+Tokens[0]);
            System.out.println("File Length : "+Tokens[1]);

           

        }
        catch(Exception eobj)
        {
            System.out.println("Expection is Occured "+eobj);
        }

      

        
                

       
    }
}