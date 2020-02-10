
import java.beans.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un=request.getParameter("username");
		String pw=request.getParameter("password");
		
		
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//
//	
//        Connection con;
//	
//			con = DriverManager.getConnection(
//			        "jdbc:mysql://localhost:3306/sys","root","Root$Usr");
//		
// 
//        Statement stmt=(Statement) con.createStatement();
//
//        //String sql = "INSERT INTO Student " +"VALUES (200, 'Sam')";
//
//        String sql2 = "INSERT INTO Student " +
//                "VALUES (900, 'Tom')";
//        ((java.sql.Statement) stmt).executeUpdate(sql2);
//        
//        
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
        
		if(un.equals("A") && pw.equals("A"))
		{
			response.sendRedirect("success.html");
			//RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
			//request.setAttribute("Name",un);
			//dispatcher.forward( request, response );
			return;
		}
       else
		{
			response.sendRedirect("error.html");
			return;
		}
	}
}