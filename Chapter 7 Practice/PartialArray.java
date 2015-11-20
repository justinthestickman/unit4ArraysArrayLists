public class PartialArray
{
    private int[] values;
    private int currentSize;
    public PartialArray()
    {
        this.values = new int[100];
        for ( this.currentSize = 0; this.currentSize < values.length; this.currentSize++ )
        {
            this.values[this.currentSize] = this.currentSize * this.currentSize;
        }
    }
    
    public void remove( int pos )
    {
        for ( int i = pos + 1; i < this.currentSize; i++ )
        {
            this.values[ i - 1 ] = this.values[ i ];
        }
        this.currentSize--;
    }
}