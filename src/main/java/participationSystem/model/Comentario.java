package participationSystem.model;

public class Comentario {
	Long id;
	int votos;
	String comentario;
	private Sugerencia sugerencia;

	public Comentario(String comentario, Sugerencia sugerencia) {
		super();
		this.comentario = comentario;
		this.sugerencia=sugerencia;
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

	public String getComentario() {
		return comentario;
	}

	void setComentario(String comentario) {
		this.comentario = comentario;
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
				+ ((comentario == null) ? 0 : comentario.hashCode());
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
		if (comentario == null) {
			if (other.comentario != null)
				return false;
		} else if (!comentario.equals(other.comentario))
			return false;
		if (votos != other.votos)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Comentario [votos=" + votos + ", comentario=" + comentario
				+ "]";
	}

}
