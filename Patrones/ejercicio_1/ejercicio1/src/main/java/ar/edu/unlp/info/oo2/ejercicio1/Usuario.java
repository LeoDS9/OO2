package ar.edu.unlp.info.oo2.ejercicio1;

import java.util.*;
public class Usuario {
	private String screenName;
	private List<Tweet> tweets;
	
	public Usuario(String screenName) {
		this.screenName = screenName;
		this.tweets = new ArrayList<>();
	}


	public String getName() { return screenName; }
	
	public List<Tweet> getTweets(){ return tweets; }
	
	
	public Tweet postear(String texto){
		Tweet t = null;
		if (verificarLongitud(texto)) {
			t = new TweetImpl(texto);
			agregarPublicacion(t);
		}
		return t;
	}
	
	public Tweet retweetear(TweetImpl t) {
		Tweet rt = new ReTweet(t);
		agregarPublicacion(rt);
		return rt;
	}
	
	public void agregarPublicacion(Tweet tweet){
		tweets.add(tweet);
	}
	private boolean verificarLongitud(String texto) {
		return (texto.length() >= 1 && texto.length() <= 280);
	}
	
	public void eliminarPublicaciones() {
		this.tweets.stream().forEach(t -> t.eliminar());
		this.tweets.clear();
	}
}
