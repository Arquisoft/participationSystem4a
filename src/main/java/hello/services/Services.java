package hello.services;

import hello.services.impl.AdminServicesImpl;
import hello.services.impl.CitizenServiceImpl;
import hello.services.impl.SystemServicesImpl;

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
