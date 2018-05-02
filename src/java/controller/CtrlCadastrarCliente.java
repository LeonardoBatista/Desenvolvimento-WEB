package controller;

import model.application.AplCadastrarCliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.domain.Socio;

@WebServlet(name = "CtrlCadastrarCliente", urlPatterns = {"/CtrlCadastrarCliente"})
public class CtrlCadastrarCliente extends HttpServlet {
    
    AplCadastrarCliente aplCliente = new AplCadastrarCliente();

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
            //Session s = (Session) request.getAttribute("sessaoBD");
            
                 if(valor.equals("inserirDependente")){
                                           
                     String nomeDependente = request.getParameter("nomeDependente");
                     String dtDependente = request.getParameter("dtDependente");
                     String sexoDependente = request.getParameter("cmbSexo");
                     String ativoDependente = request.getParameter("ativoDependente");
                     int varIdSocio = Integer.parseInt(request.getParameter("socio"));
                     Socio socio = null;
                    
                    
                    /*Criteria c  = s.createCriteria(Socio.class);
                    List l = c.list();
                    Iterator i = l.iterator();

                    while(i.hasNext()){
                        Socio so = (Socio) i.next();
                        int id = so.getNumIncricao();

                        if(id == varIdSocio)
                            socio = so;
                    }*/   
                
                   aplCliente.incluirDependente(nomeDependente, dtDependente, sexoDependente, ativoDependente, socio);
            
                    response.sendRedirect("./administrador/formCadastrarDependente.jsp");
      
                }else if (valor.equals("inserirSocio")){                
                               
                     String nomeCliente = request.getParameter("nomeCliente");
                     String dtNascimento = request.getParameter("dtNascimento");
                     String sexoSocio = request.getParameter("cmbSexoSocio");
                     String ativoSocio = request.getParameter("ativoSocio");
                     String cpfSocio = request.getParameter("cpfSocio");
                     String enderecoSocio = request.getParameter("enderecoSocio");
                     String telefoneSocio = request.getParameter("telefoneSocio");
                    
                    aplCliente.incluirSocio(nomeCliente, dtNascimento, sexoSocio, ativoSocio, cpfSocio, enderecoSocio, telefoneSocio);
                    
                    response.sendRedirect("./administrador/formCadastrarSocio.jsp");
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
