import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class idValidateTest {
    private IdValidate idValidate;


    @Before
    public void setIdValidate() {
        idValidate = new IdValidate();
    }

    @Test
    public void nullNumberOfDocumentTest() {
        try {
            idValidate.setDocument(null);
            fail();
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong number of document");
        }
    }

    @Test
    public void documentNumberBasedOnLetters() {
        try {
            idValidate.validation("qwertyuio");
            fail();
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong number of document");
        }
    }

    @Test
    public void wrongNumberOfDocument() {
        try {
            idValidate.validation("#44d2f!cw");
            fail();
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong number of document");
        }
    }

    @Test
    public void wrongLengthNumberOfDocument() {
        try {
            idValidate.validation("qwe123456789");
            fail();
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong number of document");
        }
    }

    @Test
    public void goodNumberOfDocument() {
      boolean isGoodNumber = idValidate.validation("QWE123456");
       assertEquals(true, isGoodNumber);
    }



}
