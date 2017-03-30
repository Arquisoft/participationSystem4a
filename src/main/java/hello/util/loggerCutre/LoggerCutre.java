package hello.util.loggerCutre;

import java.lang.reflect.Method;

/**
 * Logger de consola muy cutre
 * 
 * @author uo240327
 *
 */
public class LoggerCutre {

	/**
	 * Loggea clase, metodo y la lista de parametros que quieras. 
	 * @param className Clase en la que se esta ejecutando el log
	 * @param metodo metodo en el que esta el log
	 * @param data datos separados por comas que se van a ir imprimiendo como mensajes
	 */
	public void log(Class className, Method metodo, String... data) {
		StringBuilder mensaje = new StringBuilder();
		mensaje.append("-------------------INICIO LOGGERCUTRE------------------------------\n\n");
		mensaje.append("Estoy en la clase " + className.getName() + " - metodo - " + metodo.getName() + "\n");
		for (String s : data) {
			mensaje.append("\t-MENSAJE: " + s + "\n");
		}
		mensaje.append("-------------------FIN LOGGERCUTRE------------------------------\n\n");
		System.out.println(mensaje.toString());
	}

	/**
	 * Loggea clase y la lista de parametros que quieras. 
	 * @param className Clase en la que se esta ejecutando el log
	 * @param data datos separados por comas que se van a ir imprimiendo como mensajes
	 */
	public void log(Class className, String... data) {
		StringBuilder mensaje = new StringBuilder();
		mensaje.append("-------------------INICIO LOGGERCUTRE------------------------------\n\n");
		mensaje.append("Estoy en la clase " + className.getName() + "\n");
		for (String s : data) {
			mensaje.append("\t-MENSAJE: " + s + "\n");
		}
		mensaje.append("-------------------FIN LOGGERCUTRE------------------------------\n\n");
		System.out.println(mensaje.toString());
	}
}
