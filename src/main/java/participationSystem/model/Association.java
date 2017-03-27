package participationSystem.model;

public class Association {
	
	public static class PoseerComentario {

		public static void link(Sugerencia sugerencia, Comentario comentario) {
			comentario._setSugerencia(sugerencia);
			sugerencia._getComentarios().add(comentario);
		}

		public static void unlink(Sugerencia sugerencia, Comentario comentario) {
			sugerencia._getComentarios().remove(comentario);
			comentario._setSugerencia(null);
		}
	}

	
	public static class PoseerSugerencia {

		public static void link(Categoria categoria, Sugerencia sugerencia) {
			sugerencia._setCategoria(categoria);
			categoria._getSugerencias().add(sugerencia);
		}

		public static void unlink(Categoria categoria, Sugerencia sugerencia) {
			categoria._getSugerencias().remove(sugerencia);
			sugerencia._setCategoria(null);
		}
	}
}
