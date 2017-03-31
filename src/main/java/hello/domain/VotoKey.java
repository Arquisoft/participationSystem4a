package hello.domain;

import java.io.Serializable;

public class VotoKey implements Serializable{
	private static final long serialVersionUID = 1L;
	Long sugerencia;
	Long ciudadano;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sugerencia == null) ? 0 : sugerencia.hashCode());
		result = prime * result + ((ciudadano == null) ? 0 : ciudadano.hashCode());
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
		VotoKey other = (VotoKey) obj;
		if (sugerencia == null) {
			if (other.sugerencia != null)
				return false;
		} else if (!sugerencia.equals(other.sugerencia))
			return false;
		if (ciudadano == null) {
			if (other.ciudadano != null)
				return false;
		} else if (!ciudadano.equals(other.ciudadano))
			return false;
		return true;
	}
	
	
}
