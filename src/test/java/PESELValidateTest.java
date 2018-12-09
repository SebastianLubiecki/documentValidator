import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PESELValidateTest {

    private PESELValidate peselValidate;

    @Before
    public void setPeselValidate() {
        peselValidate = new PESELValidate();
    }

    @Test
    public void nullNumberOfDocumentTest() {
        try {
            peselValidate.validation(null);
            fail();
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong number of document");
        }
    }

    @Test
    public void documentNumberBasedOnLetters() {
        try {
            peselValidate.validation("qwertyuio");
            fail();
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong number of document");
        }
    }

    @Test
    public void wrongNumberOfDocument() {
        try {
            peselValidate.validation("#44d2f!cw");
            fail();
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong number of document");
        }
    }

    @Test
    public void wrongLengthNumberOfDocument() {
        try {
            peselValidate.validation("4563123456789");
            fail();
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong number of document");
        }
    }

    @Test
    public void goodNumberOfDocument() {
        boolean isGoodNumber = peselValidate.validation("72092681773");
        assertEquals(true, isGoodNumber);
    }


}
