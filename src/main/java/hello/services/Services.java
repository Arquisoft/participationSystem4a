package hello.services;

import hello.services.impl.AdminServiceImpl;
import hello.services.impl.CitizenServiceImpl;
import hello.services.impl.SystemServicesImpl;


//SOBRA
public class Services {

	public static CitizenService getCitizenServices() {
		return new CitizenServiceImpl();
	}

	public static AdminService getAdminServices() {
		return new AdminServiceImpl();
	}

	public static SystemServices getSystemServices() {
		return new SystemServicesImpl();
	}
	
	
}
