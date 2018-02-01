package base;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.userDAO;

/**
 * Servlet implementation class Userupdate
 */
@WebServlet("/Userupdate")
public class Userupdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Userupdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		RequestDispatcher dispatcher =
		request.getRequestDispatcher("/WEB-INF/jsp/userupdate.jsp");
		 dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");

		String id = request.getParameter("upd_id");
		String logid = request.getParameter("upd_logid");
		String name = request.getParameter("upd_name");
		String birthdate = request.getParameter("upd_birth");
		String pass = request.getParameter("upd_pass");
		String conpass = request.getParameter("upd_conpass");
		String usertweet = request.getParameter("upd_tweet");
		String profile_picture = request.getParameter("upd_photo");
		System.out.println(usertweet);

			if ( !pass.equals(conpass)) {
				request.setAttribute("passerr", "パスワード一致しない！");
				RequestDispatcher dispatcher =
						request.getRequestDispatcher("/WEB-INF/jsp/userupdate.jsp");
						dispatcher.forward(request, response);

				} else if  ( logid.equals("") || name.equals("")  || birthdate.equals("")  || pass.equals("") || conpass.equals("") ) {

					request.setAttribute("errMsg", "【任意】以外の空白は許しまへんで～");
					RequestDispatcher dispatcher =
							request.getRequestDispatcher("/WEB-INF/jsp/userupdate.jsp");
							dispatcher.forward(request, response);

			} else  {
				userDAO dao = new userDAO();
				dao.Userupdate(id, logid, name, birthdate, profile_picture, pass, usertweet);
				response.sendRedirect("Userguide_up");
			}
	}

}
