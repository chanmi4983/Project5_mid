<%@ page language="java" contentType="text/html; charset=UTF-8"
        isELIgnored="false" pageEncoding="UTF-8"%>
<%@page import="com.board.BoardDAO, com.board.BoardVO, java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Board</title>
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
    #list {
      font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
      /*border-collapse: collapse;*/

      width: 100%;
    }
    #list td, #list th {
      border: 1px solid #ddd;

      padding: 8px;
      text-align:center;
    }
    #list tr:nth-child(even){background-color: #f2f2f2;}
    #list tr:hover {
      /*background-color: #ddd;*/
      /*background-color: deepskyblue;*/
      background-color: steelblue;
      color:white;
    }
    #list th {
      padding-top: 12px;
      padding-bottom: 12px;
      text-align: center;
      background-color: #006bb3;
      color: white;
    }
    a1{

      font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;

    }
  </style>
  <script>
    //  //여긴 맞게 동작하는듯
    // function delete_ok(id){
    //   var a = confirm("정말로 삭제하겠습니까?");
    //   if(a) location.href='deletepost.jsp?id=' + id;
    // }

    function delete_ok(id){
      var a = confirm("정말로 삭제하겠습니까?");
      if(a) location.href='delete/' + id;
    }
  </script>
</head>
<body>
<h1>BOARD</h1>

<table id="list" width="90%">
  <tr>
    <th>Id</th>
    <th>Name</th>
    <th>Birthday</th>
    <th>Email</th>
    <th>Phone</th>
    <th>View</th>
    <th>Edit</th>
    <th>Delete</th>

<%--    // email;--%>
<%--    // phonenum;--%>
<%--    // studentid;--%>
<%--    // major;--%>
<%--    //  rc;--%>
  </tr>

  <c:forEach items="${list}" var="u">
    <tr>
      <td>${u.getSeq()}</td>
      <td>${u.getName()}</td>
      <td>${u.getBirthday()}</td>
<%--      <td>${u.getMbti()}</td>--%>
      <td>${u.getEmail()}</td>
      <td>${u.getPhonenum()}</td>

<%--      <td>${u.getMbti()}</td>--%>
<%--      <td>${u.getMbti()}</td>--%>
<%--      <td>${u.getMbti()}</td>--%>

      <td><a href="view/${u.getSeq()}">View</a></td>
  <td><a href="editform/${u.getSeq()}">Edit</a></td>
  <td><a href="javascript:delete_ok('${u.getSeq()}')">Delete</a></td>

    </tr>
  </c:forEach>
</table>
<br/>
<%--<button type="button" onclick="location.href='addpostform'">Add new post</button>--%>
<a1><a href="./add">Add New Post</a></a1>
</body>
</html>













