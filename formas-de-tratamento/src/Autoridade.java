
public  class Autoridade implements FormatadorNome{
	private String nome;
	private String sobrenome;
	private FormatadorNome fn;
	
	public Autoridade( String nome, String sobrenome, FormatadorNome fn ) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.fn = fn;
	}
	
	public String getTratamento() {
		return fn.formatarNome(nome, sobrenome);
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
