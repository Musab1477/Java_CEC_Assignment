package cars.com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class updated
 */
public class updated extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updated() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String cid=req.getParameter("cid");
		String cname = req.getParameter("cname");
		String cprice= req.getParameter("cprice");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/musab", "root", "Mus@b1477");
            PreparedStatement pst = con.prepareStatement("update cars set carname=?,carprice=?  where carid= ? ");			
			pst.setString(1, cname);
			pst.setString(2, cprice);
			pst.setString(3, cid);
			
			int rowupdate = pst.executeUpdate();
			if(rowupdate>0) {
				out.println("Details Successfully Updated");
				out.println("<a href=\"displaycars\">Diaplay</a>");
			}
			else {
				res.sendRedirect("updatedetails");

			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
