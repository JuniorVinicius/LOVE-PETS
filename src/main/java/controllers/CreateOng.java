package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.User;

@WebServlet("/signup")
public class CreateOng extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CreateOng() {
        super();
     
    }

//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		//response.getWriter().append("Served at: ").append(request.getContextPath());
//		List<User> users = UserDao.listAll();
//		
//		request.setAttribute("users", users);
//		
//		RequestDispatcher requestDispatcher = request.getRequestDispatcher("all-ongs.jsp");
//		requestDispatcher.forward(request, response);
//	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User user = new User();
		
		user.setOngName(request.getParameter("ongName"));
		user.setTypePets(request.getParameter("typePets"));
		user.setEmail(request.getParameter("email"));
		user.setPhone(request.getParameter("phone"));
		user.setCity(request.getParameter("city"));
		user.setZipCode(request.getParameter("zipCode"));
		user.setAddress(request.getParameter("address"));
		user.setAddressNumber(request.getParameter("addressNumber"));
		user.setDescription(request.getParameter("description"));
		
		UserDao.create(user);
		
		ListOngs listOngs = new ListOngs();
		
		listOngs.doGet(request, response);
	}

}
