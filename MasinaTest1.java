import static org.junit.Assert.*;

import org.junit.Test;

public class MasinaTest1 {

    @Test
    public void constructorWithParameterTest() {
        Masina masina = new Masina("Test Model", 7999.99);
        String expectedModel = "Test Model";
        double expectedPret = 7999.99;
        assertEquals("Model assert error", expectedModel, masina.getModel());
        assertEquals(expectedPret, masina.getPret(), 0.10);
    }

    @Test
    public void constructorWithParametersCrossCheckTest() {
        try {
            Masina masina1 = new Masina("Test Model", 7999.99);
            Masina masina2 = new Masina();
            masina2.setModel("Test Model");
            masina2.setPret(7999.99);
            assertEquals("Model assert error", masina2.getModel(), masina1.getModel());
            assertEquals(masina2.getPret(), masina1.getPret(), 0.10);
        } catch (Exception e) {
            fail();
        }
    }

}