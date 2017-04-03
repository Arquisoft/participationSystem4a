package hello.services.impl;

import hello.domain.Configuration;
import hello.domain.Sugerencia;
import hello.repository.ConfigurationRepository;
import hello.repository.SuggestionRepository;
import hello.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 
 * Servicios que necesia el adminsitrador del sistema. 
 *
 */
@Service
public class AdminServiceImpl implements AdminService {
	private SuggestionRepository suggestionRepository;
	private ConfigurationRepository configurationRepository;
	@Override
	public Configuration getConfiguracion() {
//		// ANA Obtener configuracion
//		return null;
		List<Configuration> listado = this.configurationRepository.findAll();
		if(listado.size() == 0){
			Configuration newC =  new Configuration();
			this.configurationRepository.save(newC);
			return newC;
		}
		return listado.get(0);
	}

	@Autowired
	public void setConfigurationRepository(ConfigurationRepository configRepository) {
		this.configurationRepository = configRepository;
	}

	@Autowired
	public void setSuggestionRepository(SuggestionRepository suggestionRepository) {
		this.suggestionRepository=suggestionRepository;
	}
	
	@Override
	public void setConfiguracion(Configuration config) {
//		configurationRepository.save(new Configuration("mierda"));
//		configurationRepository.save(new Configuration("puta"));
//		configurationRepository.save(new Configuration("polla"));
//		configurationRepository.save(new Configuration("gilipollas"));
//		configurationRepository.save(new Configuration("hostia"));
//		configurationRepository.save(new Configuration("cabrón"));
//		configurationRepository.save(new Configuration("subnormal"));
//		configurationRepository.save(new Configuration("coño"));
//		configurationRepository.save(new Configuration("joder"));
		//ANA Establece la configuracion par ala base de datos
		//Configuration antigua = getConfiguracion();
		//this.configurationRepository.delete(antigua);
		this.configurationRepository.deleteAll();
		this.configurationRepository.save(config);
	}

	@Override
	public void addPalabraProhibida(String word) {
		Configuration antigua = getConfiguracion();
		antigua.addPalabraNoPermitida(word);
		setConfiguracion(antigua);
	}

	@Override
	public Sugerencia editarSugerencia(Sugerencia antigua, String nuevoNombre, String nuevoContenido) {
		if(!"".equals(nuevoNombre) || nuevoNombre != null){
			antigua.setNombre(nuevoNombre);
		}
		if(!"".equals(nuevoContenido) || nuevoContenido != null){
			antigua.setContenido(nuevoContenido);
		}
		suggestionRepository.save(antigua);
		
		return antigua;
	}

}
