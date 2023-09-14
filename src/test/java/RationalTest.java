import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testSubtract() throws Rational.Illegal {
        Rational x = new Rational(4,8);
        Rational y = new Rational(1,6);
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(3, x.denominator);
    }

    @Test
    public void testMultiply() throws Rational.Illegal{
        Rational x = new Rational(4,17);
        Rational y = new Rational(17,4);
        x.multiply(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(1, x.denominator);
    }

    @Test
    public void testDivide() throws Rational.Illegal{
        Rational x = new Rational(3,5);
        Rational y = new Rational(3,8);
        x.divide(y);
        Assert.assertEquals(8, x.numerator);
        Assert.assertEquals(5, x.denominator);
    }
}