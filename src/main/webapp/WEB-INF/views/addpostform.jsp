<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <style>
        h1 {
            block: display;
            width: 250px;
            text-align:center;
            border-radius: 30px;
            border: 2px solid steelblue;
            font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
            border-collapse: collapse;
            background-color: white;

        }

        td {

            font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
            text-align:left;

        }
        tr{background-color: #f2f2f2;}

        th {
            font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;

            padding-top: 12px;
            width: 100px;
            padding-bottom: 12px;
            text-align: center;
            background-color: #006bb3;
            color: white;
        }
        div{
            font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
            padding: 2px;
        }

        .topnav a:hover{
            background-color: steelblue;
        }
        .topnav a {
            font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
            display: block;
            width: 100px;
            height: 20px;

            border: 1px solid #006bb3;
            color: black;
            text-align: center;

            text-decoration: none;
        }
    </style>
</head>
<body>

<h1>Add New Post</h1>


<form action="addok" method="post">
    <table id="edit">
        <tr><th>Name:</th><td><input type="text" name="name"/></td></tr>
        <tr><th>Birthday:</th><td><input type="text" name="birthday"/></td></tr>
        <tr><th>Email:</th><td><input type="text" name="email"/></td></tr>
        <tr><th>Phone:</th><td><input type="text" name="phonenum"/></td></tr>
        <tr><th>StudentID:</th><td><input type="text" name="studentid"/></td></tr>
        <tr><th>Major:</th><td><input type="text" name="major"/></td></tr>
        <tr><th>MBTI:</th><td><input type="text" name="mbti"/></td></tr>
        <tr><th>RC:</th><td><input type="text" name="rc"/></td></tr>
        <%--        <tr><th>Content:</th><td><textarea cols="50" rows="5" name="content"></textarea></td></tr>--%>

    </table>
<%--    <button type="button" onclick="location.href='/board/list'">목록보기</button>--%>
    <button type="button" onclick="history.back()">목록보기</button>
    <button type="submit">등록하기</button>
<%--    <div><a href="list">View All Records</a><td align="right"><input type="submit" value="Add Post"/></div>--%>
</form>



</body>
</html>