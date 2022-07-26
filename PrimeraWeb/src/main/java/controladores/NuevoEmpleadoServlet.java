package controladores;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class NuevoEmpleadoServlet
 */
@WebServlet("/resumenEmpleado")
public class NuevoEmpleadoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public NuevoEmpleadoServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		String codProvincia = request.getParameter("provincia");
		String[] conocimientos = request.getParameterValues("conocimientos[]");
		String fechaCadena = request.getParameter("fechanac");
		int experiencia = Integer.parseInt(request.getParameter("experiencia"));
		
		UtilidadesServlet.imprimirCabecera("Resumen del empleado", out);
		out.println("<h1>Resumen de datos enviados</h1>");
		out.println("<ul>");
		out.println("<li> Nombre: "+ nombre+ "</li>");
		out.println("<li> Apellidos: "+ apellidos+ "</li>");
		out.println("<li> Código Provincia: "+ codProvincia+ "</li>");
		out.print("<li> Conocimientos: ");
		if (conocimientos == null || conocimientos.length==0) {
			out.print("No se han registrado conocimientos </li>");
		} else {
			out.println("<ul>");
			for (String c : conocimientos) {
				out.println("<li>"+c+"</li>");
			}
			out.println("</ul>");
			out.println("</li>");
		}
		
		out.println("<li> Fecha Nacimiento: "+fechaCadena+"</li>");
		out.println("<li> Experinecia (en años): "+experiencia+"</li>");
		out.println("</ul>");
		UtilidadesServlet.imprimirPie(out);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
