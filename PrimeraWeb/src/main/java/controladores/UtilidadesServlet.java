package controladores;

import java.io.PrintWriter;

public class UtilidadesServlet {

	public static void imprimirCabecera(String titulo, PrintWriter out) {
		out.println("<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>"+titulo+"</title>\r\n"
				+ "<link rel=\"stylesheet\" type=\"text/css\" href=\"estilo.css\">"
				+ "</head>\r\n"
				+ "<body>"
				+ " <header>\r\n"
				+ " <h1>UF2405-Modelo de programación web y bases de datos\r\n"
				+ " </h1>\r\n"
				+ " </header>\r\n"
				+ " \r\n"
				+ " <main>");
	}
	
	public static void imprimirPie(PrintWriter out) {
		out.println("</main>\r\n"
				+ " <footer>\r\n"
				+ " <h4>UF2405-Modelo de programación web y bases de\r\n"
				+ " datos</h4>\r\n"
				+ " </footer>"
				+ "</body>\r\n"
				+ "</html>");
	}
}
