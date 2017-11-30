package com.wp.lab3.lab3;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/PizzaOrder.do")
public class PizzaOrder extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String value = request.getParameter("size");
        request.getSession().setAttribute("PizzaSize", value);
        response.sendRedirect("/DeliveryInfo.html");
    }
}

