package hello.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="CATEGORIA")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	@OneToMany(mappedBy="categoria", cascade = CascadeType.ALL)
	private  Set<Sugerencia> sugerencias;

	public Categoria(){

	}

	public Categoria(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	public Long getId() {
		return id;
	}

	public Set<Sugerencia> getSugerencias() {
		return new HashSet<Sugerencia>(sugerencias);
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setSugerencias(Set<Sugerencia> sugerencias) {
		this.sugerencias = sugerencias;
	}

	//	public void removeSugerencia(Sugerencia sugerencia){
//		Association.PoseerSugerencia.unlink(this, sugerencia);
//	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Categoria categoria = (Categoria) o;

		return nombre.equals(categoria.nombre);
	}

	@Override
	public int hashCode() {
		return nombre.hashCode();
	}


	@Override
	public String toString() {
		return "Categoria{" +
				"id=" + id +
				", nombre='" + nombre + '\'' +
				'}';
	}

}
