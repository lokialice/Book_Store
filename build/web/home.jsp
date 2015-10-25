<%-- 
    Document   : index
    Created on : Oct 10, 2013, 6:02:41 PM
    Author     : hai.bt
--%>

<%@page import="model.Book"%>
<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <c:if test="${empty requestScope.listB}">
            <h3 style="color: red">Database is empty!!!</h3>
        </c:if>
        <c:if test="${not empty requestScope.listB}">
            <table border="1" style="text-align: left">
                <caption><h1>WELCOME BOOK STORE!</h1></caption>
                <tr>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Detail</th>
                    <th>Delete</th>
                </tr>             
                <c:forEach items="${requestScope.listB}" var="bb">
                    <tr>
                        <td>${bb.bookName}</td>
                        <td>${bb.price}</td>
                        <td>
                            <a href="DetailProcess?isbn=${bb.isbn}">${bb.isbn}</a>
                        </td>
                        <td>
                            <a href="DeleteProcess?isbn=${bb.isbn}">${bb.isbn}</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
    </center>
</body>
</html>
