package base;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.bbsDAO;
import beans.Bbs_threadbean;

/**
 * Servlet implementation class Bbs_main
 */
@WebServlet("/Bbs_main")
public class Bbs_main extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bbs_main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		bbsDAO bdao = new bbsDAO();
		String id = request.getParameter("id");
		System.out.println(id);
		Bbs_threadbean dataub = bdao.findByBbs(id);
		request.setAttribute("tub", dataub);

		RequestDispatcher dispatcher =
		request.getRequestDispatcher("/WEB-INF/jsp/bbs_main.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
