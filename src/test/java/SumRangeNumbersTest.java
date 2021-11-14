import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumRangeNumbersTest {
    @Test
    public void test01 (){
        assertEquals(-1, SumRangeNumbers.getSumRangeNumbers(-1,0));
    }
    @Test
    public void test02 (){
        assertEquals(1, SumRangeNumbers.getSumRangeNumbers(1,0));
    }
    @Test
    public void test03 (){
        assertEquals(3, SumRangeNumbers.getSumRangeNumbers(1,2));
    }
    @Test
    public void test04 (){
        assertEquals(1, SumRangeNumbers.getSumRangeNumbers(0,1));
    }
    @Test
    public void test05 (){
        assertEquals(1, SumRangeNumbers.getSumRangeNumbers(1,1));
    }
    @Test
    public void test06 (){
        assertEquals(2, SumRangeNumbers.getSumRangeNumbers(-1,2));
    }
    @Test
    public void test07 (){
        assertEquals(0, SumRangeNumbers.getSumRangeNumbers(-2,2));
    }
}