public class ArrayOperations
{
    public static void main(String[] args)
    {
        double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
        System.out.println("Number of Array Items: " + x.length);
        System.out.println("First Array Item: " + x[0]);
        System.out.println("Last Array Item: " + x[x.length-1]);
        System.out.println(x[x.length-1]);
        for (int i = 0; i < x.length; i++)
        {
            System.out.println("x[" + i + "]: " + x[i]);
        }
        for (int i = x.length-1; i >= 0; i--)
        {
            System.out.println("x[" + i + "]: " + x[i]);
        }
        for (double value : x)
        {
            System.out.println(value);
        }
    }
}