Feature: Que el usuario pueda ordenar las sugerencias por sus Votos
		
Scenario: Ordenar las sugerencias

	Given Inicio sesion en la aplicacion
	And Existen al menos dos sugerencia para ordenar
	When Le doy a ordenar por Votos
	Then Se ordena por votos