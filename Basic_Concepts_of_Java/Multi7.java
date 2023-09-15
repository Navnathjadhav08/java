class Marvellous extends Thread
{
    public void run()
    {
        Display();
    }
    synchronized public void Display()
    {
        for(int i = 1; i < 10; i++)
        {
            System.out.println(i);
        }
    }
}
class Multi7
{
    public static void main(String Arg[]) throws Exception
    {
        Marvellous mobj1 = new Marvellous();
        Marvellous mobj2 = new Marvellous();
        Thread t1 = new Thread(mobj1);
        Thread t2 = new Thread(mobj2);
        t1.start();
        t2.start();
    }
}