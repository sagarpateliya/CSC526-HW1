import org.junit.Assert;
import org.junit.Test;


/**
 * Created by Sagar on 1/17/2017.
 */
public class ShopTest {
    @Test
    public void itemGetNameTest(){

        Item abc = new Item("abc", 1.0);
        Assert.assertTrue (abc.getName().equals("abc"));

    }
    @Test

    public void itemPriceforTest() {
        Item pear = new Item("abc", 1.5);
        Assert.assertTrue("pear name should be abc",1.5 == pear.priceFor(1));
    }

    }

