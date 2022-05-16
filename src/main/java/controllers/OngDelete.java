package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;

@WebServlet("/OngDelete")
public class OngDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public OngDelete() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int userId = Integer.parseInt(request.getParameter("userId"));
		
		UserDao.delete(userId);
		
		CreateOng createOng = new CreateOng();
		
		createOng.doGet(request, response);
	}

}
