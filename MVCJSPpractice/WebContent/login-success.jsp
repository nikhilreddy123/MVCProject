<%@page import="Nikhil.LoginBean"%>  
  
<p>You are successfully logged in!</p>  
<%  
LoginBean bean=(LoginBean)request.getAttribute("bean");  
out.println("Welcome, "+bean.getName());  
%>
<br/>
<% 
String user=request.getParameter("name"); 
if(user != null)
	 out.println("good user name"+"    "+ user);  	
 %>