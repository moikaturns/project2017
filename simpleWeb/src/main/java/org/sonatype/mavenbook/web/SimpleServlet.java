package org.sonatype.mavenbook.web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.tutorial.project.Count;

public class SimpleServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws ServletException, IOException {

	String[] urlParts = request.getRequestURL().toString().split("/");
        String urlLast = urlParts[urlParts.length-1];

	int count = (new Count(urlLast)).getCount();

        PrintWriter out = response.getWriter();
        out.println( String.format("SimpleServlet Executed [%s] [%s]", urlLast, count ));
        out.flush();
        out.close();
    }
}
