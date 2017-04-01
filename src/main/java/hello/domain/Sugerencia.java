package hello.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="SUGERENCIA")
public class Sugerencia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int votos;
	private String nombre;
	private String contenido;
	@OneToMany(mappedBy="sugerencia",cascade = CascadeType.ALL)
	private Set<Comentario> comentarios;
	@ManyToMany
	@JoinTable(name = "voto", joinColumns = {
			@JoinColumn(name = "SUGERENCIA_ID", nullable = false, updatable = false) },
			inverseJoinColumns = { @JoinColumn(name = "CITIZEN_ID",
					nullable = false, updatable = false) })
	private Set<Citizen> ciudadanosQueVotan;
	@ManyToOne
	@JoinColumn(name="categoria_id")
	private Categoria categoria;
	
	@ManyToOne
	@JoinColumn(name="usuario_id")
	private Citizen usuario;

	public Sugerencia(){}
	
	public Sugerencia(String nombre, String contenido, Categoria categoria) {
		super();
		this.nombre = nombre;
		this.contenido = contenido;
		this.categoria = categoria;
//		Association.PoseerSugerencia.link(categoria, this);
		
	}
	public Sugerencia(String nombre, String contenido, Categoria categoria, Citizen usuario) {
		super();
		this.nombre = nombre;
		this.contenido = contenido;
		this.categoria = categoria;
		this.usuario=usuario;	
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
	
	public Set<Citizen> getCiudadanosQueVotan() {
		return new HashSet<Citizen>(ciudadanosQueVotan);
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

	public void addCiudadanoHaVotado(Citizen ciudadano){
		ciudadanosQueVotan.add(ciudadano);
		ciudadano.addSugerenciaHaVotado(this);
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
