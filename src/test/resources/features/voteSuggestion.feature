Feature: Ser capaz de votar una sugerencia
		si s,oy un usuario registado en el sistema
		
Scenario: Votar una sugerencia

	Given Inicion sesion en la aplicacion
	And Existe al menos una sugerencia para votar
	And No he votado ya esa sugerencia
	When Voto positiva o negativamente
	Then Se contabiliza mi voto
	Then no puedo volver a votar