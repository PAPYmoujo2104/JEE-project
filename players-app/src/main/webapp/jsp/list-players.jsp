<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <link rel="stylesheet" href="../css/bootstrap.min.css">
        <script src="../js/bootstrap.min.js"></script>
        <title>List of Players</title>

    </head>

    <body>          
        <div class="container">
            <h2>Players</h2>
            <!--Search Form -->
            <form action="/player" method="get" id="seachPlayerForm" role="form">
                <input type="hidden" id="searchAction" name="searchAction" value="search">
                <div class="form-group col-xs-5">
                    <input type="text" name="playerName" id="playerName" class="form-control" placeholder="Name OR Lastname OR Nationality OR Team..."/>
                </div>
                <button type="submit" class="btn btn-info">
                    <span class="glyphicon glyphicon-search"></span> Search
                </button>
                <br>
                <br>
            </form>

            <!--Players List-->
            <c:if test="${not empty message}">                
                <div class="alert alert-success">
                    ${message}
                </div>
            </c:if> 
            <form action="/player" method="post" id="playerForm" role="form" >
                <input type="hidden" id="idPlayer" name="idPlayer">
                <input type="hidden" id="action" name="action">Player
                <c:choose>
                    <c:when test="${not empty playerList}">
                        <table  class="table table-striped">
                            <thead>
                                <tr>
                                    <td>#</td>
                                    <td>Name</td>
                                    <td>Pseudo</td>
                                    <td>Last name</td>
                                    <td>Age</td>
                                    <td>Nationality</td>
                                    <td>Team</td>
                                    <td></td>
                                </tr>
                            </thead>
                            <c:forEach var="player" items="${playerList}">
                                <c:set var="classSucess" value=""/>
                                <c:if test ="${idPlayer == player.id}">
                                    <c:set var="classSucess" value="info"/>
                                </c:if>
                                <tr class="${classSucess}">
                                    <td>
                                        <a href="/player?idPlayer=${player.id}&searchAction=searchById">${player.id}</a>
                                    </td>                                    
                                    <td>${player.name}</td>
                                    <td>"${player.pseudo}"</td>
                                    <td>${player.lastName}</td>
                                    <td>${player.age}</td>
                                    <td>${player.nationality}</td>
                                    <td>${player.team}</td>
                                    <td><a href="#" id="remove" 
                                           onclick="document.getElementById('action').value = 'remove';document.getElementById('idPlayer').value = '${player.id}';
                                                    
                                                    document.getElementById('playerForm').submit();">
                                            <span class="glyphicon glyphicon-trash"/>
                                        </a>
                                                   
                                    </td>
                                </tr>
                            </c:forEach>               
                        </table>  
                    </c:when>                    
                    <c:otherwise>
                        <br>           
                        <div class="alert alert-info">
                            No people found matching your search criteria
                        </div>
                    </c:otherwise>
                </c:choose>                        
            </form>
            <form action ="jsp/new-player.jsp">
                <br>
                <button type="submit" class="btn btn-primary  btn-md">New player</button>
            </form>
        </div>
    </body>
</html>