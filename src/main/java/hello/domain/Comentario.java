package hello.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="COMENTARIO")
public class Comentario {
	@Id
	@GeneratedValue
	Long id;
	int votos;
	String contenido;
	@ManyToOne 
	private Sugerencia sugerencia;

	public Comentario(String comentario, Sugerencia sugerencia) {
		super();
		this.contenido = comentario;
		this.sugerencia=sugerencia;
//		Association.PoseerComentario.link(sugerencia, this);
	}

	public int getVotos() {
		return votos;
	}
	public Long getId() {
		return id;
	}
	
	public Sugerencia getSugerencia(){
		return sugerencia;
	}

	void setVotos(int votosPositivos) {
		this.votos = votosPositivos;
	}

	public String getContenido() {
		return contenido;
	}

	void setContenido(String comentario) {
		this.contenido = comentario;
	}

	public void incrementarVoto() {
		this.votos++;
	}

	public void decrementarVoto() {
		this.votos--;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((contenido == null) ? 0 : contenido.hashCode());
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
		Comentario other = (Comentario) obj;
		if (contenido == null) {
			if (other.contenido != null)
				return false;
		} else if (!contenido.equals(other.contenido))
			return false;
		if (votos != other.votos)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Comentario [votos=" + votos + ", comentario=" + contenido
				+ "]";
	}

	public void _setSugerencia(Sugerencia sugerencia2) {
		this.sugerencia=sugerencia2;
		
	}

}