class Marvellous extends Thread
{
    public void run()
    {
        try
        {
            for(int i = 1; i< 10; i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(Exception obj)
        {}
    }
}

class Multi5
{
    public static void main(String Arg[])
    {
        Marvellous mobj1 = new Marvellous();
        Marvellous mobj2 = new Marvellous();

        Thread t1 = new Thread(mobj1);
        Thread t2 = new Thread(mobj2);

        t1.start();
        t2.start();
        System.out.println("End of main thread");
    }
}