
class Array3
{
    public static void main(String Arg[])
    {
       int Arr[][] = new int[3][];

       Arr[0] = new int[4];
       Arr[1] = new int[2];
       Arr[2] = new int[5];

        Arr[0][0] = 10;
        Arr[0][1] = 20;
        Arr[0][2] = 30;
        Arr[0][3] = 40;

        Arr[1][0] = 50;
        Arr[1][1] = 60;

        Arr[2][0] = 70;
        Arr[2][1] = 80;
        Arr[2][2] = 90;
        Arr[2][3] = 100;
        Arr[2][4] = 110;

        System.out.println(Arr.length);     // 3
        System.out.println(Arr[0].length);     // 4
        System.out.println(Arr[1].length);     // 2
        System.out.println(Arr[2].length);     // 5
    }
}