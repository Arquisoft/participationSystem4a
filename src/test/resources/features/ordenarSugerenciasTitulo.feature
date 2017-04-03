Feature: Que el usuario pueda ordenar las sugerencias por sus titulos
		
Scenario: Ordenar las sugerencias

	Given Inicio sesion en la aplicacion2
	And Existen al menos dos sugerencia para ordenar2
	When Le doy a ordenar por Titulo
	Then Se ordena por Titulo