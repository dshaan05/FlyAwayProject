package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookFlightServlet
 */

public class BookFlightServlet extends HttpServlet {
	private static final long serialVersionUID = 102831973239L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookFlightServlet() {
        super();
     
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.sendRedirect("flightinfo.html");

	}

}