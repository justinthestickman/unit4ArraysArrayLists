public class ArrayOperations
{
    public static void main(String[] args)
    {
        double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
        System.out.println("Number of Array Items: " + x.length + "\n");
        System.out.println("First Array Item: " + x[0] + "\n");
        System.out.println("Last Array Item: " + x[x.length-1]);
        System.out.println(x[x.length-1] + "\n");
        for (int i = 0; i < x.length; i++)
        {
            System.out.println(x[i]);
        }
        System.out.println();
        for (int i = 0; i < x.length; i++)
        {
            System.out.println();
        }
    }
}