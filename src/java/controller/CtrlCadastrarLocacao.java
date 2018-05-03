/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.application.AplCadastrarLocacao;
import model.domain.Cliente;
import model.domain.Item;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author Wellington
 */
@WebServlet(name = "CtrlCadastrarLocacao", urlPatterns = {"/CtrlCadastrarLocacao"})
public class CtrlCadastrarLocacao extends HttpServlet {

    AplCadastrarLocacao aplLocacao = new AplCadastrarLocacao();
    
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
            String valor = request.getParameter("operacao");
            Session s = (Session) request.getAttribute("sessaoBD");
            
                 if(valor.equals("inserirLocacao")){
                     
                   String dtAtualLocacao = request.getParameter("dtAtualLocacao");
                   String dtDevolucaoPrevistaLocacao = request.getParameter("dtDevolucaoPrevistaLocacao");
                   int valorLocacao = Integer.parseInt(request.getParameter("valorLocacao"));
                   int varIdItem = Integer.parseInt(request.getParameter("item"));
                   int varIdCliente = Integer.parseInt(request.getParameter("cliente"));

                    
                    Item item = null;
                    Criteria c  = s.createCriteria(Item.class);
                    List l = c.list();
                    Iterator i = l.iterator();

                    while(i.hasNext()){
                        Item t1 = (Item) i.next();
                        int id = t1.getId();

                        if((id == varIdItem))
                            item = t1;                   
                    }    
                    
                    Cliente cliente = null;                 
                    c  = s.createCriteria(Cliente.class);
                    l = c.list();
                    i = l.iterator();

                    while(i.hasNext()){
                        Cliente c1 = (Cliente) i.next();
                        int id = c1.getNumIncricao();

                        if((id == varIdCliente))
                            cliente = c1;                   
                    }           
                    
                    aplLocacao.incluirLocacao(dtAtualLocacao, dtDevolucaoPrevistaLocacao, "", valorLocacao, 0, item, cliente);
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
