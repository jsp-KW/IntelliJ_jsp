package com.example._724_practice;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="CreateServlet", value = "/memberServlet")
public class CreateServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        // 사용자 정보를 request 속성에 저장
        request.setAttribute("name", name);
        request.setAttribute("email", email);

        // display.jsp로 포워딩
        request.getRequestDispatcher("/printInfo.jsp").forward(request, response);
    }
}
