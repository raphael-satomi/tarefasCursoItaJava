import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testeFormatadorComTitulo {

	@Test
	void formatadorComTitulo() {
		FormatadorNome fn = new ComTitulo("Sagrado");
		Autoridade a = new Autoridade("Roger", "Guedes", fn);
		
		assertEquals("Sagrado Roger Guedes", a.getTratamento());
	}

}
