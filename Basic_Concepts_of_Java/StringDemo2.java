class StringDemo2
{
    public static void main(String A[])
    {
        String str1 = "Hello";
        String str2 = new String("Hello");

        if(str1 == str2)
        {
            System.out.println("Strings are equal");
        }
        else
        {
            System.out.println("Strings are not equal");
        }
        
        if(str1.equals(str2))
        {
            System.out.println("Strings are equal");
        }
        else
        {
            System.out.println("Strings are not equal");
        }
    }
}