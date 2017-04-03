package hello.util.loggercutre;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Logger de consola muy cutre
 * 
 * @author uo240327
 *
 */
public class LoggerCutre {

	private File file;
	public final static String PATH_OF_LOGS = "src/test/resources/logs/";

	public LoggerCutre() {
		createLogFile();
	}

	/**
	 * Loggea clase, metodo y la lista de parametros que quieras.
	 * 
	 * @param className
	 *            Clase en la que se esta ejecutando el log
	 * @param metodo
	 *            metodo en el que esta el log
	 * @param data
	 *            datos separados por comas que se van a ir imprimiendo como
	 *            mensajes
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
		writeOnFile(mensaje.toString());
	}

	/**
	 * Loggea clase y la lista de parametros que quieras.
	 * 
	 * @param className
	 *            Clase en la que se esta ejecutando el log
	 * @param data
	 *            datos separados por comas que se van a ir imprimiendo como
	 *            mensajes
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

	private void createLogFile() {
		BufferedWriter writer = null;
		try {
			// create a temporary file
			String timeLog = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
			this.file = new File(PATH_OF_LOGS + "log_" + timeLog);

			// This will output the full path where the file will be written
			// to...
			System.out.println(file.getCanonicalPath());

			writer = new BufferedWriter(new FileWriter(file));
			writer.write("Hello world!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Close the writer regardless of what happens...
				writer.close();
			} catch (Exception e) {

			}
		}
	}

	private void writeOnFile(String sentence) {
		BufferedWriter writer = null;

		try {
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(sentence);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
