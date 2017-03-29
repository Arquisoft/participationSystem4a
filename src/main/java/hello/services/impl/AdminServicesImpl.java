package hello.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello.domain.Configuration;
import hello.repository.ConfigurationRepository;
import hello.services.AdminServices;

@Service
public class AdminServicesImpl implements AdminServices{

	private ConfigurationRepository configurationRepository;
	@Override
	public Configuration getConfiguracion() {
		// ANA Obtener configuracion
		return null;
	}

	@Autowired
	public void setConfigurationRepository(ConfigurationRepository configRepository) {
		this.configurationRepository = configRepository;
	}
	
	@Override
	public void setConfiguracion(Configuration config) {
		//ANA Establece la configuracion par ala base de datos
	}

}
