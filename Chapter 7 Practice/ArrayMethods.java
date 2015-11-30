public class ArrayMethods
{
    private int[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private int currentSize = values.length;
    private int largestIndex = values.length-1;
    public ArrayMethods(int[] initialValues)
    {
        //this.values = initialValues;
    }
    public void reset()
    {
        this.currentSize = 11;
        for (int i = 0; i < this.values.length; i++)
        {
            this.values[i] = i;
        }
    }
    public void printValues()
    {
        for (int i = 0; i < this.values.length; i++)
        {
            System.out.println(this.values[i]);
        }
    }
    public void swapFirstAndLast()
    {
        int temp = this.values[0];
        this.values[0] = this.values[this.largestIndex];
        this.values[this.largestIndex] = temp;
        for (int i = 0; i < this.values.length; i++)
        {
            System.out.println(this.values[i]);
        }
    }
    public void shiftRight()
    {
        int temp = this.values[this.largestIndex];
        for (int i = this.largestIndex; i > 0; i--)
        {
            this.values[i] = this.values[i-1];
        }
        this.values[0] = temp;
        for (int i = 0; i < this.values.length; i++)
        {
            System.out.println(this.values[i]);
        }
    }
    public void replaceEvens()
    {
        for (int i = 0; i < this.values.length; i++)
        {
            if (this.values[i] % 2 == 0)
            {
                this.values[i] = 0;
            }
        }
        for (int i = 0; i < this.values.length; i++)
        {
            System.out.println(this.values[i]);
        }
    }
    public void replaceWithLargerNeighbor()
    {
        for (int i = 1; i < this.largestIndex - 1; i++)
        {
            
        }
        for (int i = 0; i < this.values.length; i++)
        {
            System.out.println(this.values[i]);
        }
    }
    public void removeMiddle()
    {
        if (this.values.length % 2 == 0)
        {
            for (int i = this.values.length / 2; i < this.values.length; i++)
            {
                this.values[i-1] = this.values[i];
            }
        }
        else
        {
            for (int i = this.largestIndex / 2 + 1; i < this.values.length; i++)
            {
                this.values[i-1] = this.values[i];
            }
        }
        for (int i = 0; i < this.values.length; i++)
        {
            System.out.println(this.values[i]);
        }
    }
    public void moveEvens()
    {
        
        for (int i = 0; i < this.values.length; i++)
        {
            System.out.println(this.values[i]);
        }
    }
}