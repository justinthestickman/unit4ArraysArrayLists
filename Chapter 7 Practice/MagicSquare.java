import java.util.Scanner;
public class MagicSquare
{
    private int[][] square = new int[4][4];
    public MagicSquare()
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
    
    public boolean testRows()
    {
        boolean magic = false;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                sum1 += this.square[i][j];
            }
            
        }
        return magic;
    }
    
    public boolean testCols()
    {
        boolean magic = false;
        int sum = 0;
        for (int j = 0; j < 4; j++)
        {
            for (int i = 0; i < 4; i++)
            {
                
            }
        }
        return magic;
    }
}