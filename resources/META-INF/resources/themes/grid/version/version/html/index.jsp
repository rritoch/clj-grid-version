<%@ page language="java" import="java.util.*,clojure.lang.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%

 PersistentArrayMap view = (PersistentArrayMap)request.getAttribute("viewdata");

%>
<html>
<head>
<title>Grid Platform - Version</title>
<link rel="stylesheet" href="themes/grid/version/version.css" />
</head>
<body>
<h2>Grid Platform - Version</h2>
<p>Language jsp</p>
<p>Version <%=  (String)view.get("version") %></p>
</body>
</html>

