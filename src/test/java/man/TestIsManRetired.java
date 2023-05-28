package man;

import com.rd.person.Man;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestIsManRetired {
    private Man man;
    private Man manAnother;
    //create a new man person
    @BeforeClass
    public void addNewMenObject(){
        man = new Man("Alex", "Kolomiets", 68, "Tatiana Vesela", true);
        manAnother = new Man("Alex", "Kolomiets", 35, "Tatiana Vesela", true);
    }
    //test retired
    @Test
    public void testIsRetired(){
        Assert.assertTrue(man.isRetired(), "Wrong result of retiring check");
    }
    //test not retired
    @Test
    public void testIsNotRetired(){
        Assert.assertFalse(manAnother.isRetired(), "Wrong result of retiring check");
    }
}
