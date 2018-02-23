package base;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.bbsDAO;
import beans.Bbs_postbean;
import beans.Bbs_threadbean;
import beans.Userbean;

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

//		String tid = request.getParameter("threadid");
		Bbs_postbean expost = bdao.Bbs_postExtract(id);
		request.setAttribute("pub", expost);


		RequestDispatcher dispatcher =
		request.getRequestDispatcher("/WEB-INF/jsp/bbs_main.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");

		HttpSession session = request.getSession();
		Userbean u = (Userbean)session.getAttribute("ub");

		String posttext = request.getParameter("posttext");
		String postfile = request.getParameter("postfile");
		int userid = u.getUser_id();
		String profilephoto = u.getProfile_photo();
		String pthread_id = request.getParameter("threadid");

		if  ( u == null || posttext.equals("") ) {

					request.setAttribute("errMsg", "すっごーい！カキコミできないよ！");
					RequestDispatcher dispatcher =
							request.getRequestDispatcher("/WEB-INF/jsp/bbs_main.jsp");
							dispatcher.forward(request, response);

			} else  {
				bbsDAO dao = new bbsDAO();
				dao.BbsPost(posttext, postfile, userid, profilephoto, pthread_id );
				response.sendRedirect("Bbs_main?id="+ pthread_id);
			}
		}

}
