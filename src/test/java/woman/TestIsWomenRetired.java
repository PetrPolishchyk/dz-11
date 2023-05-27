package woman;

import com.rd.person.Women;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestIsWomenRetired {
    private Women women;
    private Women womenAnother;
    //create a new woman person
    @BeforeClass
    public void addNewWomenObject(){
        women = new Women("Oksana", "Vaks", 64, "Serhiy Ovodov", true);
        womenAnother = new Women("Viktoria", "Box", 30, "Oleh Robert", true);
    }
    //test retired
    @Test
    public void testIsRetired(){
        Assert.assertTrue(women.isRetired(), "Wrong result of retiring check");
    }
    //test not retired
    @Test
    public void testIsNotRetired(){
        Assert.assertFalse(womenAnother.isRetired(), "Wrong result of retiring check");
    }
}
