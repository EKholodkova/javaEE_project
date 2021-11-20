package ru.gb.servlet;

import ru.gb.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductHttpServlet", urlPatterns = "/product")
public class ProductHttpServlet extends HttpServlet {
    private ProductService service = new ProductService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        req.setAttribute("products", service.createListOfProducts());
        getServletContext().getRequestDispatcher("/products.jsp").forward(req, resp);
    }
}
