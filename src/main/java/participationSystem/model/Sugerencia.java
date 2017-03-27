package participationSystem.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SUGERENCIA")
public class Sugerencia {
	@Id
	@GeneratedValue
	Long id;
	int votos;
	String nombre;
	String contenido;
	@OneToMany(mappedBy="sugerencia")
	protected Set<Comentario> comentarios = new HashSet<Comentario>();
	@ManyToOne 
	Categoria categoria;

	
	public Sugerencia(String nombre, String contenido, Categoria categoria) {
		super();
		this.nombre = nombre;
		this.contenido = contenido;
		this.categoria = categoria;
		Association.PoseerSugerencia.link(categoria, this);
		
	}

	public String getNombre() {
		return nombre;
	}

	public Long getId() {
		return id;
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

	public Set<Comentario> getComentarios() {
		return new HashSet<Comentario>(comentarios);
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
	
	public void removeComentario(Comentario comentario){
		Association.PoseerComentario.unlink(this, comentario);
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

	Set<Comentario> _getComentarios() {
		return comentarios;
	}

	void _setCategoria(Categoria categoria2) {
		this.categoria=categoria2;
	}
	
	
}
