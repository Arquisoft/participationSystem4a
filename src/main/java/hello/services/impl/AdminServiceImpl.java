package hello.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello.domain.Configuration;
import hello.repository.ConfigurationRepository;
import hello.services.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

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
		configurationRepository.save(new Configuration("mierda"));
		configurationRepository.save(new Configuration("puta"));
		configurationRepository.save(new Configuration("polla"));
		configurationRepository.save(new Configuration("gilipollas"));
		configurationRepository.save(new Configuration("hostia"));
		configurationRepository.save(new Configuration("cabrón"));
		configurationRepository.save(new Configuration("subnormal"));
		configurationRepository.save(new Configuration("coño"));
		configurationRepository.save(new Configuration("joder"));
		//ANA Establece la configuracion par ala base de datos
	}

}
