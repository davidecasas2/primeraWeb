package controladores;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CocheServlet
 */
@WebServlet("/nuevoCoche")
public class CocheServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CocheServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		UtilidadesServlet.imprimirCabecera("Introduce coche", out);
		
		String matricula = request.getParameter("matricula");
		String marca = request.getParameter("marca");
		String modelo = request.getParameter("modelo");
		Integer potencia = Integer.parseInt(request.getParameter("potencia"));
		String tipo =request.getParameter("tipo");
		
		out.println("<h2> Datos introducios </h2>");
		out.println("<ul>");
		out.println("<li> Matrícula: "+matricula+ "</li>");
		out.println("<li> Marca: "+marca+ "</li>");
		out.println("<li> Modelo: "+modelo+ "</li>");
		out.println("<li> Potencia: "+potencia+ "</li>");
		out.println("<li> Tipo: "+tipo+ "</li>");
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
