<%-- 
    Document   : index
    Created on : Oct 10, 2013, 6:02:41 PM
    Author     : hai.bt
--%>

<%@page import="model.Book"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <%
            List<Book> list = (List<Book>) request.getAttribute("listB");
            if (list == null) {
        %>
        <h3 style="color: red">Database is empty!!!</h3>
        <%        } else {
        %>
        <table border="1" style="text-align: left">
            <caption><h1>WELCOME BOOK STORE!</h1></caption>
            <tr>
                <th>Name</th>
                <th>Price</th>
            </tr>
            <%
                for(int i=0;i<list.size();i++){
            %>
            <tr>
                <td><%=list.get(i).getBookName()%></td>
                <td><%=list.get(i).getPrice()%></td>
            </tr>
            <%
                }
            %>
        </table>
        <%            }
        %>
    </center>
</body>
</html>
