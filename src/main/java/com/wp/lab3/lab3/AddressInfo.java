package com.wp.lab3.lab3;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/AddressInfo.do")
public class AddressInfo extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String golemina = request.getSession().getAttribute("PizzaSize").toString();
        String ime = request.getParameter("name");
        String adresa = request.getParameter("address");

        response.getWriter().println(request.getHeader("User-Agent"));
        response.getWriter().println();
        response.getWriter().println("Golemina: " + golemina);
        response.getWriter().println("Ime: " + ime);
        response.getWriter().println("Adresa: " + adresa);



    }
}
