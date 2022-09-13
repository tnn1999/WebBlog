package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;
import model.MessageError;
import model.NewsModel;

/**
 * Servlet implementation class PreEdit
 */
@WebServlet("/PreEdit")
public class PreEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PreEdit() {
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
		Long id = Long.parseLong(request.getParameter("id"));
		String title = request.getParameter("title");
		String shortdescription = request.getParameter("shortdescription");
		String contents = request.getParameter("contents");
		String author = request.getParameter("author");
		int status = -1;
		String[] isPublic = request.getParameterValues("status");
		if (isPublic == null) {
			status = 0;
		} else {
			status = 1;
		}

		if (title == null || title.isEmpty()) {
			request.setAttribute("error", MessageError.NEWS_NULL_TITLE);
			request.getRequestDispatcher("/EditDetail?id=" + id).forward(request, response);
		}

		if (author == null || author.isEmpty()) {
			request.setAttribute("error", MessageError.NEWS_NULL_AUTHOR);
			request.getRequestDispatcher("/EditDetail?id=" + id).forward(request, response);
		}

		if (shortdescription == null || shortdescription.isEmpty()) {
			request.setAttribute("error", MessageError.NEWS_NULL_SHORTDESCRIPTION);
			request.getRequestDispatcher("/EditDetail?id=" + id).forward(request, response);
		}
		if (contents == null || contents.isEmpty()) {
			request.setAttribute("error", MessageError.NEWS_NULL_CONTENTS);
			request.getRequestDispatcher("/EditDetail?id=" + id).forward(request, response);
		}
		NewsModel thisNews = new NewsModel(id, title, shortdescription, contents, author, status);
		DAO dao = new DAO();
		dao.updateNewsModel(thisNews);
		request.getRequestDispatcher("./NewsDetail?id=" + id).forward(request, response);
	}

}
