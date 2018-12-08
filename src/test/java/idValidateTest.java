import org.junit.Before;
import org.junit.Test;

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
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong number of document");
        }
    }

@Test
    public void goodNumberOfDocument(){
        idValidate.validation()
}
}
