import org.junit.*;


public class test {
    @Test
    public void testSameFunction() {
        function fun = new function();
        int res = fun.getSum(2, 8);
        System.out.println("MESSAGE  " + res);
        Assert.assertEquals(res, 10);
    }
}