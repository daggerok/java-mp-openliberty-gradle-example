package com.github.daggerok;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/servlet")
public class HelloServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    try (final PrintWriter writer = resp.getWriter()) {
      writer.append("Hello! Is Gradle working for you?\n");
    }
  }
}
