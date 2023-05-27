package man;

import com.rd.person.Man;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestDoesManHaveManyChildren {
    private Man man;
    private Man manAnother;
    //create a new man person
    @BeforeClass
    public void addNewMenObject(){
        man = new Man("Alex", "Kolomiets", 50, "Tatiana Vesela", true);
        man.setChildrenCount(4);
        manAnother= new Man("Alex", "Kolomiets", 50, "Tatiana Vesela", true);
        manAnother.setChildrenCount(2);
    }
    //test many children
    @Test
    public void testDoesHaveManyChildren(){
        Assert.assertTrue(man.doesHaveManyChildren(), "Wrong result of children counting check");
    }
    //test not many children
    @Test
    public void testDoesNotHaveManyChildren(){
        Assert.assertFalse(manAnother.doesHaveManyChildren(), "Wrong result of children counting check");
    }
}
