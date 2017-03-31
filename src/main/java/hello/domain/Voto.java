package hello.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@IdClass(VotoKey.class)
@Table(name="VOTO")
public class Voto implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@ManyToOne
	@JoinColumn(name="sugerencia_id")
	protected Sugerencia sugerencia;
	@Id
	@ManyToOne
	@JoinColumn(name="ciudadano_id")	
	protected Citizen ciudadano;
	
	Voto(){
	}

	public Voto(Sugerencia sugerencia, Citizen ciudadano) {
		super();
		this.sugerencia = sugerencia;
		this.ciudadano = ciudadano;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ciudadano == null) ? 0 : ciudadano.hashCode());
		result = prime * result + ((sugerencia == null) ? 0 : sugerencia.hashCode());
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
		Voto other = (Voto) obj;
		if (ciudadano == null) {
			if (other.ciudadano != null)
				return false;
		} else if (!ciudadano.equals(other.ciudadano))
			return false;
		if (sugerencia == null) {
			if (other.sugerencia != null)
				return false;
		} else if (!sugerencia.equals(other.sugerencia))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Voto [sugerencia=" + sugerencia + ", ciudadano=" + ciudadano + "]";
	}
	
	
}
