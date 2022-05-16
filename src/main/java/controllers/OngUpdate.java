package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.User;

@WebServlet("/OngUpdate")
public class OngUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public OngUpdate() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int userId = Integer.parseInt(request.getParameter("userId"));
		
		User user = UserDao.findByPk(userId);
		
		request.setAttribute("user", user);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("formUpdate.jsp");
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		User user = new User();
		
		user.setId(Integer.parseInt(request.getParameter("id")));
		user.setOngName(request.getParameter("ongName"));
		user.setTypePets(request.getParameter("typePets"));
		user.setEmail(request.getParameter("email"));
		user.setPhone(request.getParameter("phone"));
		user.setCity(request.getParameter("city"));
		user.setZipCode(request.getParameter("zipCode"));
		user.setAddress(request.getParameter("address"));
		user.setAddressNumber(request.getParameter("addressNumber"));
		user.setDescription(request.getParameter("description"));
		UserDao.update(user);
		
		ListOngs listOngs = new ListOngs();
		listOngs.doGet(request, response);
	}

}
