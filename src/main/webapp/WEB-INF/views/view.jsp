<%@ page language="java" contentType="text/html; charset=UTF-8"
         isELIgnored="false" pageEncoding="UTF-8"%>
<%@page import="com.board.BoardVO, com.board.BoardDAO, java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Form</title>
    <style>
        h1 {
            block: display;
            width: 200px;
            text-align:center;
            border-radius: 30px;
            border: 2px solid steelblue;
            font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
            border-collapse: collapse;
            background-color: white;

        }

        td {

            font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
            width:400px;
            text-align:center;

        }
        tr:nth-child(even){background-color: #f2f2f2;}

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


    </style>
</head>
<body>

<h1>View Form</h1>

<%--이름 - varchar--%>
<%--생일 - int--%>
<%--이메일 - varchar--%>
<%--Rc: varchar--%>
<%--Mbti: varchar--%>
<%--특이사항:--%>
<%--전화번호: int--%>
<%--관계: varchar--%>
<%--학번: Int--%>
<%--전공: varchar--%>




<form id="boardVO" action="../goback" method="post" >
    <table>
        <tr><th>ID: </th><td>${boardVO.getSeq()}</td></tr>
        <tr><th>Name: </th><td>${boardVO.getName()}</td></tr>
        <tr><th>Birthday:</th><td>${boardVO.getBirthday()}</td></tr>
        <tr><th>Email:</th><td>${boardVO.getEmail()}</td></tr>
        <tr><th>Phone:</th><td>${boardVO.getPhonenum()}</td></tr>
        <tr><th>StudentID:</th><td>${boardVO.getStudentid()}</td></tr>
        <tr><th>Major:</th><td>${boardVO.getMajor()}</td></tr>
        <tr><th>MBTI:</th><td>${boardVO.getMbti()}</td></tr>
        <tr><th>RC:</th><td>${boardVO.getRc()}</td></tr>
<%--        <tr><th>RC:</th><td>${boardVO.getRc()}</td></tr>--%>



    </table>
    <input type="button" value="Back To List" onclick="history.back()"/></td></tr>
</form>
</body>
</html>


