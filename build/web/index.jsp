<!--
Copyright (c) 2016 Christy Smith
Campus Box 7915, Elon University, Elon, NC 27244

Copyright (c) 2016 Evan Elkin
Campus Box 7947, Elon University, Elon, NC 27244
-->
<%@ include file="/includes/header.html" %>
<div class="wrapper"> <!--Wrapper for border-->
  <h1>Future Value Calculator</h1>
  <!--Form to retrieve all data for calculation and it is being sent to Homework
  Servlet-->
  <form action="calculate" method="post">
    <input type="hidden" name="action" value="add"> 
    <div class="inputField">
      <label class="entry">Investment Amount</label>
      <input class="retrieve" type="number" min="0" name="amount" required><br>
    </div>
    <div class="inputField">
      <label class="entry">Yearly Interest Rate</label>
      <input class="retrieve" type="number" min="0" name="rate" required><br>
    </div>
    <div class="inputField">
      <label class="entry">Number of Years</label>
      <input class="retrieve" type="number" min="0" step="1" name="years" 
           placeholder="Integer number of years" required><br> 
    </div>
    <div class="inputField">
    <input class= "button" type="submit" value="Calculate">
    </div>
    </form>
</div>
<%@ include file="/includes/footer.html" %>
