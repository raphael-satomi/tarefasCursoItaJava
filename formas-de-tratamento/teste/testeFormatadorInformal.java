import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testeFormatadorInformal {

	@Test
	void formatadorInformal() {
		FormatadorNome fn = new Informal();
		Autoridade a = new Autoridade("Roger", "Guedes", fn);
		
		assertEquals("Roger", a.getTratamento());
	}

}
