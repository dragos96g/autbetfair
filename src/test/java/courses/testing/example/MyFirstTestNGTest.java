package courses.testing.example;

import courses.calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

@Test
public class MyFirstTestNGTest {
    static Calculator c;
    int count;

    @BeforeClass
    public void setUp(){
        c= new Calculator();
        System.out.println("Set up run before run");
    }

    @BeforeMethod
    public void setupBeforeMethod(){
        System.out.println("Run before method");
        count = 0;
    }

    @BeforeTest
    public void setupBeforeTest(){
        System.out.println("Run before test");
        count = 0;
    }

    @Test(description = "This is first test from class")
    public void test1(){
        System.out.println("Run test1");
    }

    public void test2(){
        System.out.println("Run test2");
    }

    protected void help(){
        System.out.println("This is a help method");
    }

    @DataProvider
    public Object[][] calculatorDataProvider(){
        return new Object[][] {
                {5,2,3, "+", 0},
                {10,-2,-5, "*", 0},
                {1.4142,2,0, "SQRT", 0.001}
        };
    }

    @Test(dataProvider = "calculatorDataProvider")
    public void verifyCalculatorTest(double expectedResults, double a, double b, String op, double delta){
        System.out.println("Compute calculator assert with delta:" +delta+" for:" +a+ " " +op+ " " +b+ "=" +expectedResults);
        Assert.assertEquals(expectedResults, c.compute(a,b,op), delta);

    }

    @DataProvider
    public Object[][] exceptionCalculatorDataProvider(){
        return new Object[][]{
                {1,2,3,"test"},
                {1,4,0,"/"}
        };
    }

    @Test(dataProvider = "exceptionCalculatorDataProvider", expectedExceptions = IllegalArgumentException.class)
    public  void testException(double a, double b, String op){
        c.compute(a,b,op);
    }
}
