public class Arquivo {
	
	private String separador;
	
	public Arquivo () {
		separador = ";";
	}
	
	public void setSeparador ( String separador ) {
		if ( separador == null || separador.isEmpty() )
			throw new IllegalArgumentException("Separador nao pode ser nulo e deve ter pelo menos um caracter.");
		this.separador = separador;
	}
	
	public String getSeparedor () {
		return separador;
	}
}