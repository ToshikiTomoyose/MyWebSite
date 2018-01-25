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
 * Servlet implementation class Usercreate
 */
@WebServlet("/Usercreate")
public class Usercreate extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Usercreate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("/WEB-INF/jsp/usercreate.jsp");
				 dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");

		String logid = request.getParameter("clogid");
		String name = request.getParameter("cusername");
		String birthdate = request.getParameter("cbirthdate");
		String pass = request.getParameter("cpassword");
		String conpass = request.getParameter("conpass");
		String createdate = request.getParameter("ccreatedate");
		String updatedate = request.getParameter("cupdatedate");
		String usertweet = request.getParameter("ctweet");
		String profile_picture = request.getParameter("cprogpic");
		String report_flag = request.getParameter("creportfg");

		if(pass.equals(conpass)) {
			userDAO dao = new userDAO();
			dao.Usercreate(logid, name, birthdate, pass, createdate, updatedate, usertweet, profile_picture, report_flag);
		 response.sendRedirect("UserList");
//				}else if (logid == null || logid.equals("") || name == null || name.equals("")|| birthdate == null || pass == null || subpass == null || createdate == null || pass && subpass == false){
//					String msg = "入力された内容は正しくありません";
//					request.setAttribute("errMsg", msg);
				}else {
					String nullmsg = "入力された内容は正しくありません";
					request.setAttribute("errMsg", nullmsg);
					RequestDispatcher dispatcher =
							request.getRequestDispatcher("/WEB-INF/jsp/usercreate.jsp");
							dispatcher.forward(request, response);
			}
	}

}
