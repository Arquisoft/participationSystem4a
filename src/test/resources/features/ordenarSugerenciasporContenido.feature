Feature: Que el usuario pueda ordenar las sugerencias por Contenido
		
Scenario: Ordenar las sugerencias

	Given Inicion sesion en la aplicacion
	And Existen al menos dos sugerencia para ordenar
	When Le doy a ordenar por Contenido
	Then Se ordena por contenido