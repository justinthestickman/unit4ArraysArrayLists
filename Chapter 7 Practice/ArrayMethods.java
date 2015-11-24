public class ArrayMethods
{
    private int[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private int largestIndex = values.length-1;
    public ArrayMethods(int[] initialValues)
    {
        this.values = initialValues;
    }
    public void swapFirstAndLast()
    {
        int temp = this.values[0];
        this.values[0] = this.values[this.largestIndex];
        this.values[this.largestIndex] = temp;
    }
    public void shiftRight()
    {
        int temp = this.values[this.largestIndex];
        for (int i = this.largestIndex; i > 0; i--)
        {
            this.values[i] = this.values[i-1];
        }
        this.values[0] = temp;
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
    }
    public void replaceWithLargerNeighbor()
    {
        
    }
    public void removeMiddle()
    {
        if (this.values.length % 2 == 0)
        {
            for (int i = this.values[this.values.length / 2]; i < this.values[this.largestIndex]; i++)
            {
                this.values[i-1] = this.values[i];
            }
        }
        else
        {
            for (int i = this.values[this.largestIndex / 2 + 1]; i < this.values[this.largestIndex]; i++)
            {
                this.values[i-1] = this.values[i];
            }
        }
    }
    public void moveEvens()
    {
        
    }
}