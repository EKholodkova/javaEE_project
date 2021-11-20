package ru.gb.servlet;

import ru.gb.service.CatService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CatHttpServlet", urlPatterns = "/cat")
public class CatHttpServlet extends HttpServlet {
    private final CatService catService = new CatService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        req.setAttribute("cat", catService.createNewCat()); //sets an attribute that can be obtained in jsp.
        getServletContext().getRequestDispatcher("/cat.jsp").forward(req, resp);
    }
}
