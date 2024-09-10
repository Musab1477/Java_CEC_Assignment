package cars.com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class updatedetails
 */
public class updatedetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updatedetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = res.getWriter();
		String cID = req.getParameter("cid");
		String cName = req.getParameter("cname");
		String cPrice = req.getParameter("cprice");
        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("    <meta charset='UTF-8'>");
        out.println("    <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("    <title>Add a New Car</title>");
        out.println("    <style>");
        out.println("        body { font-family: Arial, sans-serif; background-color: #f4f4f4; margin: 0; padding: 0; }");
        out.println("        .container { max-width: 600px; margin: 100px auto; background-color: #fff; padding: 40px;");
        out.println("                    border-radius: 10px; box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.1); }");
        out.println("        h2 { text-align: center; color: #333; margin-bottom: 30px; }");
        out.println("        label { display: block; margin-bottom: 10px; font-weight: bold; color: #555; }");
        out.println("        input[type='text'], input[type='number'] { width: 100%; padding: 10px; margin-bottom: 20px;");
        out.println("                    border: 1px solid #ccc; border-radius: 5px; box-sizing: border-box; }");
        out.println("        input[readonly] { background-color: #e9ecef; }");
        out.println("        .btn-submit { background-color: #4CAF50; color: white; padding: 15px; border: none;");
        out.println("                      width: 100%; font-size: 16px; border-radius: 5px; cursor: pointer;");
        out.println("                      transition: background-color 0.3s ease; }");
        out.println("        .btn-submit:hover { background-color: #45a049; }");
        out.println("    </style>");
        out.println("</head>");
        out.println("<body>");

        out.println("<div class='container'>");
        out.println("    <h2>Add a New Car</h2>");
        out.println("    <form action='updated' method='POST'>");

        // Car ID - read-only
        out.println("        <label for='car-id'>Car ID:</label>");
        out.println("        <input type='text' id='car-id' name='cid' value='" + cID + "' readonly>");

        // Car Name
        out.println("        <label for='car-name'>Car Name:</label>");
        out.println("        <input type='text' id='car-name' name='cname' value='" + cName + "'  required>");

        // Car Price
        out.println("        <label for='car-price'>Car Price:</label>");
        out.println("        <input type='text' id='car-price' name='cprice' value='" + cPrice + "'  required>");

        // Submit button
        out.println("        <input type='submit' class='btn-submit' value='UpdateDetails'>");

        out.println("    </form>");
        out.println("</div>");

        out.println("</body>");
        out.println("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
