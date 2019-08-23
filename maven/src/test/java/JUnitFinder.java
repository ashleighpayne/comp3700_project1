//Author: Ashleigh Payne
//aap0035
//COMP3700

import org.junit.Test;
import static org.junit.Assert.*;

public class JUnitFinder {
    @Test    
    public void test_minArrayEmpty() {
        Finder newFinder = new Finder();
        int[] intArray = null;
        assertEquals(newFinder.findMin(intArray), null);    
    }    

    @Test    
    public void test_minArrayZero() {
        Finder newFinder = new Finder();
        int[] intArray = new int[0];
        assertEquals(newFinder.findMin(intArray), null);    
    }   

    @Test    
    public void test_minArrayPlain() {
        Finder newFinder = new Finder();
        int[] intArray = {1, 2, 3, 4, 5};
        assertEquals(newFinder.findMin(intArray).intValue(), 1);    
    }   

    @Test    
    public void test_minArrayNegatives() {
        Finder newFinder = new Finder();
        int[] intArray = {10, 25, 13, 68, -5};
        assertEquals(newFinder.findMin(intArray).intValue(), -5);    
    }
    
    @Test    
    public void test_maxArrayEmpty() {
        Finder newFinder = new Finder();
        int[] intArray = null;
        assertEquals(newFinder.findMax(intArray), null);    
    }

    @Test    
    public void test_maxArrayZero() {
        Finder newFinder = new Finder();
        int[] intArray = new int[0];
        assertEquals(newFinder.findMax(intArray), null);    
    }   

    @Test    
    public void test_maxArrayPlain() {
        Finder newFinder = new Finder();
        int[] intArray = {1, 2, 3, 4, 5};
        assertEquals(newFinder.findMax(intArray).intValue(), 5);    
    }   

    @Test    
    public void test_maxArrayNegatives() {
        Finder newFinder = new Finder();
        int[] intArray = {10, 25, 13, 68, -5};
        assertEquals(newFinder.findMax(intArray).intValue(), 68);    
    }
}