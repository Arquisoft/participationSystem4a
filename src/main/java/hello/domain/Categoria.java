package hello.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Categoria")
public class Categoria {
	@Id
	@GeneratedValue
	Long id;
	String nombre;
	@OneToMany(mappedBy="Categoria")
	protected Set<Sugerencia> sugerencias = new HashSet<Sugerencia>();

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

//	public void removeSugerencia(Sugerencia sugerencia){
//		Association.PoseerSugerencia.unlink(this, sugerencia);
//	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result
				+ ((sugerencias == null) ? 0 : sugerencias.hashCode());
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
		Categoria other = (Categoria) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (sugerencias == null) {
			if (other.sugerencias != null)
				return false;
		} else if (!sugerencias.equals(other.sugerencias))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Categoria [nombre=" + nombre + ", sugerencias=" + sugerencias
				+ "]";
	}

	 Set<Sugerencia> _getSugerencias() {
		return sugerencias;
	}

}
