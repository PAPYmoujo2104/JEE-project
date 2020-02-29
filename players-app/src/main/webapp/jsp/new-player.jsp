<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <link rel="stylesheet" href="../css/bootstrap.min.css">   		
        <script src="../js/bootstrap.min.js"></script>     
    </head>
    <body>
        <div class="container">
            <form action="/player" method="post"  role="form" data-toggle="validator" >
                <c:if test ="${empty action}">                        	
                    <c:set var="action" value="add"/>
                </c:if>
                <input type="hidden" id="action" name="action" value="${action}">
                <input type="hidden" id="idPlayer" name="idPlayer" value="${player.id}">
                <h2>Player</h2>
                <div class="form-group col-xs-4">
                    <label for="name" class="control-label col-xs-4">Name:</label>
                    <input required type="text" name="name" id="name" class="form-control" value="${player.name}" placeholder="Martin" />

                    <label for="pseudo" class="control-label col-xs-4">Pseudo:</label>
                    <input required type="text" name="pseudo" id="pseudo" class="form-control" value="${player.pseudo}" placeholder="Rekkles" />

                    <label for="lastName" class="control-label col-xs-4">Last name:</label>                   
                    <input required type="text" name="lastName" id="lastName" class="form-control" value="${player.lastName}" placeholder="Larssen" />

                    <label for="age" class="control-label col-xs-4">Age:</label>
                    <input required type="text"  pattern="^\d{2}" name="age" id="age" class="form-control" value="${player.age}" maxlength="10" placeholder="23" />

                    <label for="nationality" class="control-label col-xs-4">Nationality:</label>
                    <input required type="text" name="nationality" id="nationality" class="form-control" value="${player.nationality}" placeholder="Swedish" />

                    <label for="team" class="control-label col-xs-4">Team:</label>
                    <input required type="text" name="team" id="team" class="form-control" value="${player.team}" placeholder="Fnatic" />

                    <br></br>
                    <button type="submit" class="btn btn-primary  btn-md">Accept</button> 
                </div>                                                      
            </form>
        </div>
    </body>
</html>