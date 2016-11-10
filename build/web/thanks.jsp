<!--
Copyright (c) 2016 Christy Smith
Campus Box 7915, Elon University, Elon, NC 27244

Copyright (c) 2016 Evan Elkin
Campus Box 7947, Elon University, Elon, NC 27244
-->
<%@ include file="/includes/header.html" %>
<jsp:useBean id="calculator" class="model.Calculator" scope="request"/>
    <div class="wrapper"> <!--Wrapper for border-->
    <!-- Displays collected info and calculation after going through Homework
    Servlet-->
    <h1 id="thanksTitle">Future Value Calculator</h1>
    <div class="inputField">
      <label>Investment Amount:</label>
      <span><jsp:getProperty name="calculator" property="investmentAmount"/>
        </span><br>
    </div>
    <div class="inputField">
      <label>Yearly Interest Rate:</label>
      <span><jsp:getProperty name="calculator" property="yearlyInterestRate"/>
        </span><br>
    </div>
    <div class="inputField">
      <label>Number of Years:</label>
      <span><jsp:getProperty name="calculator" property="numberOfYears"/>
        </span><br>
    </div>
    <div class="inputField">
      <label>Future Value:</label>
      <span><jsp:getProperty name="calculator" property="futureValue"/>
        </span><br>
    </div>
    </div>
<%@ include file="/includes/footer.html" %>