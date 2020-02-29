package com.example.players;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "PlayerServlet",
        urlPatterns = {"/player"}
)
public class PlayerServlet extends HttpServlet {

    PlayerService playerService = new PlayerService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("searchAction");
        if (action!=null){
            switch (action) {           
                case "searchById":
                    searchPlayerById(req, resp);
                    break;
                 case "search":
                     searchPlayer(req, resp);
                     break;
            }
        }else{
            List<Player> result = playerService.getAllPlayers();
            forwardListPlayers(req, resp, result);
        }
    }

    private void searchPlayerById(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        long idPlayer = Integer.valueOf(req.getParameter("idPlayer"));
        Player player = null;
        try {
            player = playerService.getPlayer(idPlayer);
        } catch (Exception ex) {
            Logger.getLogger(PlayerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        req.setAttribute("player", player);
        req.setAttribute("action", "edit");
        String nextJSP = "/jsp/new-player.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(req, resp);
    }
    
    private void searchPlayer(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String playerName = req.getParameter("playerName");
        List<Player> result = playerService.getAllPlayers();
        if(!playerName.isEmpty()) {result = playerService.searchPlayers(playerName);}
        forwardListPlayers(req, resp, result);
    }

    private void forwardListPlayers(HttpServletRequest req, HttpServletResponse resp, List playerList)
            throws ServletException, IOException {
        String nextJSP = "/jsp/list-players.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        req.setAttribute("playerList", playerList);
        dispatcher.forward(req, resp);
    }   
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String action = req.getParameter("action");
        switch (action) {
            case "add":
                addPlayerAction(req, resp);
                break;
            case "edit":
                editPlayerAction(req, resp);
                break;            
            case "remove":
                removePlayerByName(req, resp);
                break;            
        }

    }

    private void addPlayerAction(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String name = req.getParameter("name");
        String lastName = req.getParameter("lastName");
        String age = req.getParameter("age");
        String pseudo = req.getParameter("pseudo");
        String nationality = req.getParameter("nationality");
        String team = req.getParameter("team");
        Player player = new Player(name, lastName, age, pseudo, nationality, team);
        long idPlayer = playerService.addPlayer(player);
        List<Player> playerList = playerService.getAllPlayers();
        req.setAttribute("idPlayer", idPlayer);
        String message = "The new player has been successfully created.";
        req.setAttribute("message", message);
        forwardListPlayers(req, resp, playerList);
    }

    private void editPlayerAction(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String name = req.getParameter("name");
        String lastName = req.getParameter("lastName");
        String age = req.getParameter("age");
        String pseudo = req.getParameter("pseudo");
        String nationality = req.getParameter("nationality");
        String team = req.getParameter("team");
        long idPlayer = Integer.valueOf(req.getParameter("idPlayer"));
        Player player = new Player(name, lastName, age, pseudo, nationality, team, idPlayer);
        player.setId(idPlayer);
        boolean success = playerService.updatePlayer(player);
        String message = null;
        if (success) {
            message = "The player has been successfully updated.";
        }
        List<Player> playerList = playerService.getAllPlayers();
        req.setAttribute("idPlayer", idPlayer);
        req.setAttribute("message", message);
        forwardListPlayers(req, resp, playerList);
    }  

    private void removePlayerByName(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        long idPlayer = Integer.valueOf(req.getParameter("idPlayer"));
        boolean confirm = playerService.deletePlayer(idPlayer);
        if (confirm){
            String message = "The player has been successfully removed.";
            req.setAttribute("message", message);
        }
        List<Player> playerList = playerService.getAllPlayers();
        forwardListPlayers(req, resp, playerList);
    }

}
