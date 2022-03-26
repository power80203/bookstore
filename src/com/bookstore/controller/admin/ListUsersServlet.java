package com.bookstore.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.entity.Users;
import com.bookstore.service.UserServices;


/**
 * Servlet implementation class AdminHomeServlet
 */
@WebServlet("/admin/list_users")
public class ListUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListUsersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserServices userServices = new UserServices();
		 List<Users> listusers = userServices.listUser();
		 request.setAttribute("listusers", listusers);
		
		
		String page = "user_list.jsp";
		RequestDispatcher  requestDispatcher  = request.getRequestDispatcher(page);
		requestDispatcher.forward(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());	
		}



}
