<!--
Copyright (c) 2016 Christy Smith
Campus Box 7915, Elon University, Elon, NC 27244

Copyright (c) 2016 Evan Elkin
Campus Box 7947, Elon University, Elon, NC 27244
-->
<%@ include file="/includes/header.html" %>
<%@ taglib prefix="elon" uri="/WEB-INF/tlds/elon.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <div class="wrapper"> <!--Wrapper for border-->
    <!-- Displays collected info and calculation after going through Homework
    Servlet-->
    <h1 id="thanksTitle">Future Value Calculator</h1>
    <div class="inputField">
      <label>Investment Amount:</label>
      <span><elon:currencyFormat value="${calculator.investmentAmount}"/></span><br>
    </div>
    <div class="inputField">
      <label>Yearly Interest Rate:</label>
      <span>${calculator.yearlyInterestRate}
        </span><br>
    </div>
    <div class="inputField">
      <label>Number of Years:</label>
      <span>${calculator.numberOfYears}</span><br>
    </div>
    <div class="inputField">
      <label>Future Value:</label>
      <span><elon:currencyFormat value="${calculator.futureValue}" /></span><br>
      <tr>
          <td><strong>Year</strong></td>
          <td><strong>Value</strong></td>
      <tr> 
        
      <c:forEach var="value" items="${calculator.futureValues}" >
      
      ${value}<br>
      ${year}<br>
          
      </c:forEach>
      
    </div>
    
    <nav><a href ="index.jsp">Return to Calculator</nav>
    </div>
<%@ include file="/includes/footer.html" %>