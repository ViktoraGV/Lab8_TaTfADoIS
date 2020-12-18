package net.codejava;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/result")
public class ResultServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RestDomBuilder restDomBuilder = new RestDomBuilder("po.xml");

        List<Restaurant> rests= restDomBuilder.getData();
        System.out.println(rests.get(0).toString());
        request.setAttribute("first",rests.get(0).toString());
        request.setAttribute("second",rests.get(1).toString());
        request.setAttribute("thrid",rests.get(2).toString());
        request.getRequestDispatcher("result.jsp").forward(request,response);

    }

}
