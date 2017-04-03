Feature: Que el usuario pueda ordenar las sugerencias por Contenido
		
Scenario: Ordenar las sugerencias

	Given Inicio sesion en la aplicacion1
	And Existen al menos dos sugerencia para ordenar1
	When Le doy a ordenar por Contenido
	Then Se ordena por contenido