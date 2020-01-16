import static org.junit.Assert.*;

import org.junit.Test;

public class MasinaTest2 {

    @Test
    public void setModelTest() {
        Masina masina = new Masina();
        masina.setModel("Modified Test Model");
        String expectedModel = "Modified Test Model";
        assertEquals("Model assert error", expectedModel, masina.getModel());
    }

    @Test
    public void setPretWithExceptionTest() {
        try {
            Masina masina = new Masina("Test Model", 7999.99);
            masina.setPret(-45.50);
            fail("Should not allow negative numbers!");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

}
