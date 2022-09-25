/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utils.NumberUtils;

/**
 *
 * @author Vladik
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String operator = request.getParameter("operator");

        request.setAttribute("first", first);
        request.setAttribute("second", second);

        if (first == null || first.equals("") || second == null || second.equals("") || NumberUtils.isNumber(first) == false || NumberUtils.isNumber(second) == false) {
            request.setAttribute("result", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }

        BigDecimal bd1 = new BigDecimal(first);
        BigDecimal bd2 = new BigDecimal(second);
        String result;

        switch (operator) {
            case "add":
                result = bd1.add(bd2).toString();
                break;
            case "subtract":
                result = bd1.subtract(bd2).toString();
                break;
            case "multiply":
                result = bd1.multiply(bd2).toString();
                break;
            case "divide":
                result = bd1.divide(bd2, 6, RoundingMode.HALF_UP).toString();
                break;
            default:
                result = "Please use a provided operator button";
                break;
                
        }

        request.setAttribute("result", result);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
