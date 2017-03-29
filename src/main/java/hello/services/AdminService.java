package hello.services;

import hello.domain.Configuration;

public interface AdminService extends SuperService{

	Configuration getConfiguracion();
	void setConfiguracion(Configuration config);
}
