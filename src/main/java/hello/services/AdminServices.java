package hello.services;

import hello.domain.Configuration;

public interface AdminServices extends SuperService{

	Configuration getConfiguracion();
	void setConfiguracion(Configuration config);
}
