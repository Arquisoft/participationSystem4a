package participationSystem.model;

import java.util.List;

public class Sugerencia {
	int votos;
	String nombre;
	String contenido;
	List<Comentario> comentarios;
	Categoria categoria;

	
	public Sugerencia(String nombre, String contenido, Categoria categoria) {
		super();
		this.nombre = nombre;
		this.contenido = contenido;
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getVotos() {
		return votos;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void incrementarVotos() {
		this.votos++;
	}

	public void decrementarVotos() {
		this.votos--;
	}

	public void addComentario(Comentario comentario) {
		this.comentarios.add(comentario);
	}

	@Override
	public String toString() {
		return "Sugerencia [votos=" + votos + ", comentarios=" + comentarios
				+ ", categoria=" + categoria + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result
				+ ((comentarios == null) ? 0 : comentarios.hashCode());
		result = prime * result + votos;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sugerencia other = (Sugerencia) obj;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (comentarios == null) {
			if (other.comentarios != null)
				return false;
		} else if (!comentarios.equals(other.comentarios))
			return false;
		if (votos != other.votos)
			return false;
		return true;
	}
	
	
}
