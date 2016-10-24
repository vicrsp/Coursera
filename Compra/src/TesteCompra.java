import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCompra {

	@Test
	public void testAVista() {
		Compra c = new Compra(500);
		assertEquals(1,  c.getNumeroParcelas());
		assertEquals(500, c.getValorTotal());
		assertEquals(500, c.getValorParcela());
	}

	@Test
	public void testPrazo() {
		Compra c = new Compra(2,500);
		assertEquals(2,  c.getNumeroParcelas());
		assertEquals(1000, c.getValorTotal());
		assertEquals(500, c.getValorParcela());
	}
}
