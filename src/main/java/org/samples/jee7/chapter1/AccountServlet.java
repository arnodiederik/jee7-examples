package org.samples.jee7.chapter1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Arno Diederik on 11-7-14.
 */

@WebServlet("/account")
public class AccountServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    try (PrintWriter out = resp.getWriter()) {
      out.println("<html><head>");
      out.println("<title>MyServlet</title>");
      out.println("</head><body>");
      out.println("<h1>My First Servlet</h1>");
      //. . .
      out.println("</body></html>");
    }
    finally {
      //. . .
    }
  }
}
