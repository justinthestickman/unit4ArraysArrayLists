import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author Huang, Justin
 * @version 15 December 2015
 */
public class RadarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private Radar radar;

    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
        this.radar = new Radar(100,100);
    }
    
    @Test
    /**
     * 
     */
    public void test1()
    {
        this.radar.setMonsterLocation(32,25);
        this.radar.setNoiseFraction(0.05);
        for (int i = 0; i < 100; i++)
        {
            this.radar.scan();
        }
        int largest = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i < 100; i++)
        {
            for (int j = 0; j < 100; j++)
            {
                int n = this.radar.getAccumulatedDetection(i,j);
                if (x > largest)
                {
                    largest = n;
                    x = i;
                    y = j;
                }
            }
        }
        assertEquals(x,32);
        assertEquals(y,25);
    }
    
    @Test
    /**
     * 
     */
    public void test2()
    {
        this.radar.setMonsterLocation(64,36);
        this.radar.setNoiseFraction(0.05);
        for (int i = 0; i < 100; i++)
        {
            this.radar.scan();
        }
        int largest = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i < 100; i++)
        {
            for (int j = 0; j < 100; j++)
            {
                int n = this.radar.getAccumulatedDetection(i,j);
                if (x > largest)
                {
                    largest = n;
                    x = i;
                    y = j;
                }
            }
        }
        assertEquals(x,32);
        assertEquals(y,25);
    }
}
