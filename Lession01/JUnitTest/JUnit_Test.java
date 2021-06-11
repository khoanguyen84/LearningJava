import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;

public class JUnit_Test {
    private MyMath myMath;

    public JUnit_Test() {
        myMath = new MyMath();
    }

    @Test
    public  void total_Test_001(){
        org.junit.Assert.assertEquals(10, myMath.total(7,3));
    }
    @Test
    public  void total_Test_002(){
        org.junit.Assert.assertNotEquals(10, myMath.total(7,4));
    }
}
