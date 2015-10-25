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
        <c:if test="${empty requestScope.Book}">
            <h3 style="color: red">Database is empty!!!</h3>
        </c:if>
        <c:if test="${not empty requestScope.Book}">       
            <div style="color: red">${requestScope.xoaLoi}</div><br/>
            <table border="1" style="text-align: left">
                <caption><h1>DETAIL OF BOOK!</h1></caption>                
                <tr>
                    <td>
                        <!-- image -->
                        <img src="${requestScope.Book.imgSrc}"/>
                    </td>
                    <td style="vertical-align: middle;margin-left: 20px">
                        <!-- detail -->
                        Name:${requestScope.Book.bookName}<br/>
                        Author:${requestScope.Book.author}<br/>
                        Price:${requestScope.Book.price}<br/>
                        ${requestScope.Book.inOut?"In stock":"Out of stock"}
                        <br/><br/>
                        <a href="index.jsp">back</a>
                    </td>
                </tr>               
            </table>
        </c:if>
    </center>
</body>
</html>
