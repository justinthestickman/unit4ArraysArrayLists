import java.util.Scanner;
public class MagicSquares
{
    private int[][] square;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                System.out.print("Enter value for [" + i + "][" + j + "]: ");
                this.square[i][j] = scanner.nextInt();
            }
        }
    }
}