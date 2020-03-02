package com.example.players;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "MatchServlet",
        urlPatterns = {"/matches"}
)
public class MatchServlet extends HttpServlet {


    MatchService matchService = new MatchService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Match> matchList = matchService.getAllMatches();

        String nextJSP = "/jsp/list-matches.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        req.setAttribute("matchList", matchList);
        dispatcher.forward(req, resp);
    }
}



