/*
Copyright (c) 2016 Christy Smith
Campus Box 7915, Elon University, Elon, NC 27244

Copyright (c) 2016 Evan Elkin
Campus Box 7947, Elon University, Elon, NC 27244
*/
package controller;

import model.Calculator;
import model.FutureValueCalculator;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HomeworkServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, 
      HttpServletResponse response)
        throws ServletException, IOException {
        
      String url = "/index.jsp";
        
      String action = request.getParameter("action");
        
      if (action == null) {
        action = "join";
      }
        
      if (action.equals("join")) {
        url = "/index.jsp";
      }
      else if (action.equals("add")) {
        String amount = request.getParameter("amount");
        String rate = request.getParameter("rate");
        String years = request.getParameter("years");
        double investmentAmount = Integer.parseInt(amount);
        double yearlyInterestRate = Integer.parseInt(rate);
        int numberOfYears = Integer.parseInt(years);
        double futureValue = 
          FutureValueCalculator.findFutureValue(investmentAmount, 
            yearlyInterestRate, numberOfYears);
            
        Calculator calculator = new Calculator(investmentAmount,
          yearlyInterestRate, numberOfYears, futureValue);
            
        request.setAttribute("calculator", calculator);
        url = "/thanks.jsp";
        }
        
      getServletContext().getRequestDispatcher(url)
        .forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, 
      HttpServletResponse response)
        throws ServletException, IOException {
        doPost(request, response);
    }

}

