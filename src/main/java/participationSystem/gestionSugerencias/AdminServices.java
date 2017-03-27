package participationSystem.gestionSugerencias;

import participationSystem.model.Configuration;

public interface AdminServices extends SuperService{

	Configuration getConfiguracion();
	void setConfiguracion(Configuration config);
}
