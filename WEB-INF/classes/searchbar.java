import java.io.IOException;  
import jakarta.servlet.*;  
import jakarta.servlet.http.*;  

  
public class searchbar extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
        String name=request.getParameter("search");  
        response.sendRedirect("https://duckduckgo.com/?q="+name);  
    }  
}  