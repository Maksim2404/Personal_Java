import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {
    
    @Test
    public void testMatchArraytoValue_HappyPath() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int [] expectedResult = {1,2,3,4,5};
        int [] actualResult = new CreateArray().createIntArray(a,b,c,d,e);
        Assert.assertEquals(actualResult,expectedResult);

    }
    
}
