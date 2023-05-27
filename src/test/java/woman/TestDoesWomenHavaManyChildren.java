package woman;

import com.rd.person.Women;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestDoesWomenHavaManyChildren {
    private Women women;
    private Women womanAnother;
    //create a new woman person
    @BeforeClass
    public void addNewWomanObject(){
        women = new Women("Oksana", "Vaks", 64, "Serhiy Ovodov", true);
        women.setChildrenCount(4);
        womanAnother= new Women("Viktoria", "Box", 30, "Oleh Robert", true);
        womanAnother.setChildrenCount(2);
    }
    //test many children
    @Test
    public void testDoesHaveManyChildren(){
        Assert.assertTrue(women.doesHaveManyChildren(), "Wrong result of children counting check");
    }
    //test not many children
    @Test
    public void testDoesNotHaveManyChildren(){
        Assert.assertFalse(womanAnother.doesHaveManyChildren(), "Wrong result of children counting check");
    }
}
