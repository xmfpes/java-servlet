package net.kyunam;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.kyunam.db.DataBase;
import net.kyunam.domain.User;

public class CreateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		User user = new User(req.getParameter("name"), req.getParameter("password"), req.getParameter("name"),
				req.getParameter("email"));
		System.out.println("User : " + user);

		DataBase.addUser(user);

		req.setAttribute("users", DataBase.findAll());
		RequestDispatcher rd = req.getRequestDispatcher("/user/list.jsp");
		rd.forward(req, resp);
		super.doPost(req, resp);
	}
}
