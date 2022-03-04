import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import spring.classes.AddressBook;
import spring.classes.BuddyInfo;

public class AddressBookTest extends TestCase {

    AddressBook a = null;
    BuddyInfo b1 = null;
    BuddyInfo b2 = null;

    @Before
    public void setUp() throws Exception {
        a = new AddressBook();
        b1 = new BuddyInfo();
        b2 = new BuddyInfo();
        a.addBuddy(b1);
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void testGetSize() {
        assertEquals("Size of a one buddy address book should be 1.", 1, a.getSize());
    }

    @Test
    public void testAddBuddy() {
        a.addBuddy(b2);
        assertEquals("Size of a two buddy address book should be 2.", 2, a.getSize());
    }

}