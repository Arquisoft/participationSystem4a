package hello.services;

import hello.domain.Configuration;

public interface AdminService extends SuperService{
	
	/**
	 * Obtiene la configuracion actual del sistema. 
	 * @return Devuelve un objeto configuracion del modelo de dominio.
	 */
	Configuration getConfiguracion();
	
	/**
	 * Establece una nueva configuracion en el sistema. 
	 * @param config
	 */
	void setConfiguracion(Configuration config);
}
