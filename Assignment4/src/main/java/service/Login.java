package service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAO;
import dao.UserDAO;
import model.MessageError;
import model.NewsModel;
import model.UserModel;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			HttpSession session = request.getSession();
			String username = request.getParameter("user");
			String password = request.getParameter("pwd");
			UserDAO userDao = new UserDAO();
			DAO dao = new DAO();

			if (username == null && password == null) {
				request.setAttribute("error", MessageError.LOGIN_FORMAT);
				request.getRequestDispatcher("./view/login.jsp").forward(request, response);
			}
			boolean existedUser = userDao.checkExistedUser(username);
			System.out.println(existedUser);
			if (existedUser) {
				boolean checkPass = userDao.checkPassword(username, password);
				if (checkPass) {
					List<NewsModel> listNews = dao.getAllNewsModels();
					for (NewsModel news : listNews) {
						System.out.println(news.getId());
					}
					request.setAttribute("listNews", listNews);
					request.setAttribute("user", new UserModel(username, password));
					session.setAttribute("user", new UserModel(username, password));
					request.getRequestDispatcher("./Home").forward(request, response);
				} else {
					request.setAttribute("error", MessageError.LOGIN_USER_WRONG_PASS);
					request.getRequestDispatcher("./view/login.jsp").forward(request, response);
				}
			} else {
				request.setAttribute("error", MessageError.LOGIN_USER_NOT_FOUND);
				request.getRequestDispatcher("./view/login.jsp").forward(request, response);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
