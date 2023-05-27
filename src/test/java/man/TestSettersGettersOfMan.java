package man;
import com.rd.person.Man;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSettersGettersOfMan {
    private Man man;
    //create a new man person
    @BeforeClass
    public void addNewMenObject(){
        man = new Man("Firstname", "Lastname", 45, "Partner", false);
    }
    //test firstname
    @Test
    public void testFirstname(){
        man.setFirstName("Peter");
        Assert.assertEquals(man.getFirstName(), "Peter", "The firstname is not the same");
    }
    //test lastname
    @Test
    public void testLastname(){
        man.setFirstName("Polishchuk");
        Assert.assertEquals(man.getFirstName(), "Polishchuk", "The lastname is not the same");
    }
    //test age
    @Test
    public void testAge(){
        man.setAge(87);
        Assert.assertEquals(man.getAge(), 87, "The age is not the same");
    }
    //test partner
    @Test
    public void testPartner(){
        man.setPartner("Valentina Polishchuk");
        Assert.assertEquals(man.getPartner(), "Valentina Polishchuk", "The partner is not the same");
    }
    //test has children
    @Test
    public void testHasChildren(){
        man.setHasChild(true);
        Assert.assertTrue(man.isHasChild(), "Not the same result");
    }
    //test count of children
    @Test
    public void testChildrenCount(){
        man.setChildrenCount(5);
        Assert.assertEquals(man.getChildrenCount(), 5, "The count of children is not the same");
    }
}
