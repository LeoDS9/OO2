package ar.edu.unlp.info.oo2.ejercicio1;

public class ReTweet implements Tweet{
	private TweetImpl tweetOrigen;
	
	public ReTweet(TweetImpl t) {
		tweetOrigen = t;
	}

	@Override
	public void eliminar() {
		tweetOrigen = null;
	}
	
	public String getTexto() {
		return tweetOrigen.getTexto();
	}
}
