package be.vdab.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class GoedeDoelTest {
	private static final String NAAM ="CliniClowns"; 
	private GoedeDoel doel;

	@Before
	public void before() {
		doel = new GoedeDoel(NAAM);
	}
	@Test
	public void getNaam() {
		assertEquals(NAAM, doel.getNaam());
	}
    @Test
    public void eenNieuwDoelHeeftNogNietsOpgebracht() {
        assertEquals(0, doel.getOpgebracht().compareTo(BigDecimal.ZERO));
    }
}
