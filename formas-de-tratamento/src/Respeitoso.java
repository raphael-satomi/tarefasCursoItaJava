
public class Respeitoso implements FormatadorNome {
	private String genero;
	
	public Respeitoso(String genero) {
		this.genero = genero;
		
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		if( genero == "masculino" )
			return "Sr. "+sobrenome;
		else if( genero == "feminino" )
			return "Sra. "+sobrenome;
		else
			return sobrenome;
		
	}

}
