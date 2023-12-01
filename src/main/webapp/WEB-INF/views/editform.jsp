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

<h1>Edit Form</h1>


  <form id="boardVO" action="../editok" method="post" >
  <input id="seq" name="seq" type="hidden" value="${boardVO.getSeq()}"/>

  <table>
    <tr><th>Name</th><td><input id="name" name="name" type="text" value="${boardVO.getName()}"/></td></tr>
    <tr><th>Birthday:</th><td><input id="birthday" name="birthday" type="text" value="${boardVO.getBirthday()}"></td></tr>
    <tr><th>Email:</th><td><input id="email" name="email" type="text" value="${boardVO.getEmail()}"></td></tr>
    <tr><th>Phone:</th><td><input id="phonenum" name="phonenum" type="text" value="${boardVO.getPhonenum()}"></td></tr>
    <tr><th>StudentID:</th><td><input id="studentid" name="studentid" type="text" value="${boardVO.getStudentid()}"></td></tr>
    <tr><th>Major:</th><td><input id="major" name="major" type="text" value="${boardVO.getMajor()}"></td></tr>
    <tr><th>MBTI:</th><td><input id="mbti " name="mbti" type="text" value="${boardVO.getMbti()}"></td></tr>
    <tr><th>RC:</th><td><input id="rc " name="rc" type="text" value="${boardVO.getRc()}"></td></tr>
    <tr><td colspan="2"><input type="submit" value="Edit Post"/>
      <input type="button" value="Cancel" onclick="history.back()"/></td></tr>
  </table>

</body>
</html>


