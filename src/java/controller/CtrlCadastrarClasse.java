package controller;

import model.application.AplCadastrarClasse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/CtrlCadastrarClasse"})
public class CtrlCadastrarClasse extends HttpServlet {

    AplCadastrarClasse classe = new AplCadastrarClasse();

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

                String nome = request.getParameter("nomeClasse");

                Float valorclasse = Float.parseFloat(request.getParameter("valorClasse"));

                String prazoDevolucao = request.getParameter("devolucao");

                classe.incluirClasse(nome, valorclasse, prazoDevolucao);

                response.sendRedirect("./administrador/formCadastrarClasse.jsp");

            } else if (valor.equals("excluir")) {

                int idClasse = Integer.valueOf(request.getParameter("id"));
                System.out.println("açsknoiasdoiahdoiaoidhaoishdioashdoia");
                System.out.println(idClasse);
                classe.excluirClasse(idClasse);
                response.sendRedirect("./administrador/formCadastrarClasse.jsp");

            }

            //response.sendRedirect("administrador/formCadastrarClasse.jsp?valor="+Float.valueOf(valor));
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
