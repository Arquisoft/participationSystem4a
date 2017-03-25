package participationSystem.model;

import java.util.Set;

public class Categoria {
	Long id;
	String nombre;
	protected Set<Sugerencia> sugerencias;

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
		return sugerencias;
	}

	public void addSugerencia(Sugerencia sug) {
		this.sugerencias.add(sug);
	}

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

}
