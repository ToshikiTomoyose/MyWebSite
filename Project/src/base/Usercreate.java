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
		String id = request.getParameter("cid");
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

//		int gid = Integer.parseInt(id);
//		int gbirthdate = Integer.parseInt(birthdate);
//		int greport_flag = Integer.parseInt(report_flag);
//		int gcreatedate = Integer.parseInt(createdate);
//		int gupdatedate = Integer.parseInt(updatedate);


			if (pass.equals(conpass)) {
//					Userbean ub = new Userbean(id,logid, name, birthdate, profile_picture, createdate, updatedate, pass, usertweet, report_flag);
//					request.setAttribute("ub",ub);
					userDAO dao = new userDAO();
					dao.Usercreate(logid, name, birthdate, profile_picture, createdate, updatedate, pass, usertweet, report_flag);
					RequestDispatcher dispatcher =
					request.getRequestDispatcher("/WEB-INF/jsp/index.jsp");
					dispatcher.forward(request, response);

				} else if (pass != conpass) {
					String nullmsg = "パスワード！";
					request.setAttribute("Errmsg", nullmsg);
					RequestDispatcher dispatcher =
					request.getRequestDispatcher("/WEB-INF/jsp/usercreate.jsp");
					response.sendRedirect("Usercreate");

			} else if (logid.equals(null) || name.equals(null)  || birthdate == null  || pass.equals(null) || conpass.equals(null) || createdate == null || updatedate == null ||  report_flag == null) {
				String msg = "入力された内容は正しくありません";
				request.setAttribute("errMsg", msg);
				RequestDispatcher dispatcher =
				request.getRequestDispatcher("/WEB-INF/jsp/usercreate.jsp");
				dispatcher.forward(request, response);
	}
	}
}
