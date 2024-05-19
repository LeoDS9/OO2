package ar.edu.unlp.info.oo2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
   private List<Usuario> usuarios;
   
   public Twitter() {
	   usuarios = new ArrayList<>();
   }
   
   public Usuario agregarUsuario(String screenName){
	   Usuario u = null;
	   if(!existeNombre(screenName)) {
		   u = new Usuario(screenName);
		   usuarios.add(u);
	   }
	   return u;
   }
   
   private boolean existeNombre(String nombre) {
	   return this.usuarios.stream()
			   .anyMatch(u -> u.getName().equals(nombre));
   }
   
   public void eliminarUsuario(Usuario u) {
	   u.eliminarPublicaciones();
	   usuarios.remove(u);
   }
}
