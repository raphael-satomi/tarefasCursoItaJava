import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testeFormatadorRespeitoso {

	@Test
	void formatadorRespeitosoMasculino() {
		FormatadorNome fn = new Respeitoso("masculino");
		Autoridade a = new Autoridade("Roger", "Guedes", fn);
		
		assertEquals("Sr. Guedes", a.getTratamento());
	}
	
	@Test
	void formatadorRespeitosoFeminino() {
		FormatadorNome fn = new Respeitoso("feminino");
		Autoridade a = new Autoridade("Ivete", "Sangalo", fn);
		
		assertEquals("Sra. Sangalo", a.getTratamento());
	}

}
