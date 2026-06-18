import org.junit.jupiter.api.Test;

import static org.junit. jupiter.api.Assertions.*;

public class ArraysMethodTest{


    @Test
    public void testThatTheArrayGetsTheFirstIndexIsCorrect(){
    
        int [] numbers =  {10,20,30,40,50};
        int actual = ArraysMethods.getFirstNumber(numbers);
        int expeted = 10;
        assertEquals(actual, expeted);
    }
    
        @Test
    public void testThatTheArrayGetTheLastIsCorrect(){
    
        int [] numbers =  {10,20,30,40,50,70,80};
        int actual = ArraysMethods.getLastNumber(numbers);
        int expeted = 50;
        assertEquals(actual, expeted);
    }
    
       @Test
    public void testThatTheArrayGetTheLengthOfAnArrayIsCorrect(){
    
        int [] arrays =  {10,20,30,40,50,70,80};
        int actual = ArraysMethods.getLength(arrays);
        int expeted = 7;
        assertEquals(actual, expeted);
    }
    
      @Test
    public void testThatTheArrayGetTheElementInAtIndexArrayIsCorrect(){
    
        int [] arrays =  {10,20,30,40,50,70,80};
        int actual = ArraysMethods.getElement(arrays);
        int expeted = 30;
        assertEquals(actual, expeted);
    }
    
      @Test
    public void testThatTheArrayGetTheUpdatedNewElementInAtInTheArrayIsCorrect(){
    
        int [] arrays =  {10,20,30,40,50,70,80};
        int index = 2;
        int newValue = 99;
        int []actual = ArraysMethods.updateElement(arrays, index , newValue );
        int[] expeted = {10,20,99,40,50,70,80};
        assertArrayEquals(actual, expeted);
    }
    
        @Test
    public void testThatTheArrayGetTheSwappedElementInTheArrayIsCorrect(){
    
        int [] arrays =  {10,20,30,40,50,70,80};
        int []actual = ArraysMethods.swapFirstAndLast(arrays );
        int[] expeted = {80,20,30,40,50,70,10};
        assertArrayEquals(actual, expeted);
    }


        @Test
    public void testThatTheAverageOfTheElementInTheArrayIsCorrect(){
    
        int [] arrays = {10,20,30,40,50};
        double actual = ArraysMethods.averageArray(arrays);
        double expeted = 30.0;
        assertEquals(actual, expeted);
    }
}
