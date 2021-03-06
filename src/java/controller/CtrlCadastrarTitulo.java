package controller;

import model.application.AplCadastrarTitulo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.application.AplCadastrarAtor;
import model.application.AplCadastrarClasse;
import model.application.AplCadastrarDiretor;

@WebServlet(urlPatterns = {"/CtrlCadastrarTitulo"})
public class CtrlCadastrarTitulo extends HttpServlet {

    AplCadastrarTitulo aplTitulo = new AplCadastrarTitulo();
    AplCadastrarAtor aplAtor = new AplCadastrarAtor();
    AplCadastrarDiretor aplDiretor = new AplCadastrarDiretor();
    AplCadastrarClasse aplClasse = new AplCadastrarClasse();

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
            String valor = request.getParameter("operacao");

            if (valor.equals("inserir")) {
                String nome = request.getParameter("nomeTitulo");
                String ano = request.getParameter("anoTitulo");
                String sinopse = request.getParameter("nomeSinopse");
                String categoria = request.getParameter("cmbCategoria");
                String[] idAtores = request.getParameterValues("cmbAtor");

                aplTitulo.incluirTitulo(nome, idAtores, aplDiretor.get(request.getParameter("cmbDiretor")),
                        ano, sinopse, categoria, aplClasse.get(request.getParameter("cmbClasse")));

                response.sendRedirect("./administrador/formCadastrarTitulo.jsp");
                
            } else if (valor.equals("excluir")) {

                int idTitulo = Integer.valueOf(request.getParameter("id"));
                aplTitulo.excluirTitulo(idTitulo);
                response.sendRedirect("./administrador/formCadastrarTitulo.jsp");

            }

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
