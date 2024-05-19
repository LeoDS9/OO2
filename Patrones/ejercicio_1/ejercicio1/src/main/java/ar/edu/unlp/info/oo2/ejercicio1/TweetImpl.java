package ar.edu.unlp.info.oo2.ejercicio1;

public class TweetImpl implements Tweet {
	private String texto;
	
	public TweetImpl(String t) {
		texto = t;
	}
	
	public String getTexto() {
		return texto;
	}
	
	@Override
	public void eliminar() {
		texto = "No Disponible";
	}
}
