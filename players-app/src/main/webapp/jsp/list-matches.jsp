<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <script src="../js/bootstrap.min.js"></script>
    <title>Matches Estimations</title>
</head>
<body>
<h1><div style="text-align: center;">Matches Scores Estimation</div></h1>
<br>
<br>

<ul class="list-group">

    <c:forEach var="player" items="${matchList}">
        <c:set var="classSucess" value=""/>
        <tr class="${classSucess}">
            <li class="list-group-item"><h3><div style="text-align: center;">${player.team1.name} VS ${player.team2.name}</div>   <div style="text-align:right; font-size:150%" ><b>${player.scoreEstimation}</b></div></h3></li>

        </tr>
    </c:forEach>


</ul>
</body>
</html>
