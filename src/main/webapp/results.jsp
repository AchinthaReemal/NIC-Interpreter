<%-- 
    G.H.Achintha Reemal
    110478F
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@page import="NICInterpreterPack.NIC_Interpreter"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align="center"><u>Descriptive Information of the NIC</u></h1>
        
        <%  try{ 
             String number =  request.getParameter("nicNumber");
             NIC_Interpreter nic = new NIC_Interpreter(number);
        %>
        <br>
        <h2> Birthday Information</h2>
        <% out.println("Year : "+nic.getYear()); %>
        <br>
        <% out.println("Month : "+nic.getMonth()); %>
        <br>
        <% out.println("Date : "+nic.getDate()); %>
        <br>
        <h2> Gender Information</h2>
        <% out.println(nic.getGender()); %>
        <br>
        <h2>Voting information</h2>
        <% out.println("Is a voter: "+nic.isVoter());
            }
             catch(Exception ex){
                    out.println("Invalid NIC number.Re-enter NIC number correctly");
                }
        %>
           
            
    </body>
</html>
