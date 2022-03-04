import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import spring.classes.BuddyInfo;

public class BuddyInfoTest extends TestCase {

    BuddyInfo b1 = null;

    @Before
    public void setUp() throws Exception {
        b1 = new BuddyInfo("Test", "Test", "Test");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetName() {
        assertEquals("b1 name should be Test", "Test", b1.getName());
    }

    @Test
    public void testSetName() {
        b1.setName("Changed");
        assertEquals("b1 name should be Changed", "Changed", b1.getName());
    }

    @Test
    public void testGetAddress() {
        assertEquals("b1 address should be Test", "Test", b1.getAddress());
    }

    @Test
    public void testSetAddress() {
        b1.setAddress("Changed");
        assertEquals("b1 address should be Changed", "Changed", b1.getAddress());
    }

    @Test
    public void testGetPhoneNumber() {
        assertEquals("b1 phone number should be Test", "Test", b1.getPhoneNumber());
    }

    @Test
    public void testSetPhoneNumber() {
        b1.setPhoneNumber("Changed");
        assertEquals("b1 phone number should be Changed", "Changed", b1.getPhoneNumber());
    }

    @Test
    public void testToString() {
        assertEquals("b1 toString should be correct", "Name: " + b1.getName() + ", Address: " + b1.getAddress() + ", Phone: " + b1.getPhoneNumber(), b1.toString());
    }



}

