package com.example._724_practice;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name ="pracServlet", value = "/practice-servlet")
public class pracServlet extends HttpServlet {

    private String m;

    public void init() {m = "Hello, jsp";}
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/practice.jsp").forward(request,response);
    }
}
