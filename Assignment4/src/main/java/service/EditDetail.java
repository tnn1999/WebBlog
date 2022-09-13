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
 * Servlet implementation class EditDetail
 */
@WebServlet("/EditDetail")
public class EditDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditDetail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DAO dao = new DAO();
	    long id = Long.parseLong(request.getParameter("id"));
	    NewsModel thisNews = dao.getNewsByID(id);
	    try {
			HttpSession session = request.getSession();
			

			if (session.getAttribute("user") == null) {
				request.setAttribute("error", MessageError.LOGIN_REQUEST);
				request.getRequestDispatcher("./view/login.jsp").forward(request, response);
			}
			else {
				request.setAttribute("thisNews", thisNews);
			    request.getRequestDispatcher("./view/Edit.jsp").forward(request, response);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
