package controller;

import model.application.AplCadastrarItem;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/CtrlCadastrarItem"})
public class CtrlCadastrarItem extends HttpServlet {

    AplCadastrarItem item = new AplCadastrarItem();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //Inicia Controladora    

            String numSerie = request.getParameter("numeroSerieItem");

            String dtAquisicao = request.getParameter("dtAquisicao");

            String tipoItem = request.getParameter("tipo");
            
            item.incluirItem(numSerie, dtAquisicao, tipoItem);
            
            response.sendRedirect("./administrador/formCadastrarItem.jsp");


            /*if(operacao.equals("incluirItem")){

            String numSerie = request.getParameter("numSerie");
            Date dtAquisicao = request.getParameter(dtAquisicao);
            String tipoItem = request.getParameter("tipoItem");

            int ret = item.incluirItem(numSerie, dtAquisicao, tipoItem);

            switch(ret){
                case 0:
                    response.sendRedirect("../Erro.html");
                case 1:
                case 2:
            }
        }*/
            //Fecha Controladora
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
