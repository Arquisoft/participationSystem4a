package participationSystem.gestionSugerencias;

import participationSystem.gestionSugerencias.servicesImpl.AdminServicesImpl;
import participationSystem.gestionSugerencias.servicesImpl.CitizenServiceImpl;
import participationSystem.gestionSugerencias.servicesImpl.SystemServicesImpl;

public class Services {

	public static CitizenServices getCitizenServices() {
		return new CitizenServiceImpl();
	}

	public static AdminServices getAdminServices() {
		return new AdminServicesImpl();
	}

	public static SystemServices getSystemServices() {
		return new SystemServicesImpl();
	}
	
	
}
