<%-- 
    Document   : formCadastrarItem
    Created on : 17/04/2018, 22:06:41
    Author     : Wellington
--%>

<%@page import="model.domain.Titulo"%>
<%@page import="model.application.AplCadastrarTitulo"%>
<%@page import="model.application.AplCadastrarTitulo"%>
<%@page import="model.application.AplCadastrarItem"%>
<%@page import="model.domain.Item"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Locadora de Filmes</title>
        <link href="vendor/bootstrap/css/leoCss.css" rel="stylesheet">
        <!-- Bootstrap core CSS-->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <!-- Custom fonts for this template-->
        <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <!-- Custom styles for this template-->
        <link href="css/sb-admin.css" rel="stylesheet">

        <!-- Calendario -->
        <link rel="stylesheet" href="http://code.jquery.com/ui/1.9.0/themes/base/jquery-ui.css" />
        <script src="http://code.jquery.com/jquery-1.8.2.js"></script>
        <script src="http://code.jquery.com/ui/1.9.0/jquery-ui.js"></script>

        <script>
            $(function () {
                $("#dtAquisicao").datepicker({
                    dateFormat: 'dd/mm/yy',
                    dayNames: ['Domingo', 'Segunda', 'Ter�a', 'Quarta', 'Quinta', 'Sexta', 'S�bado', 'Domingo'],
                    dayNamesMin: ['D', 'S', 'T', 'Q', 'Q', 'S', 'S', 'D'],
                    dayNamesShort: ['Dom', 'Seg', 'Ter', 'Qua', 'Qui', 'Sex', 'S�b', 'Dom'],
                    monthNames: ['Janeiro', 'Fevereiro', 'Mar�o', 'Abril', 'Maio', 'Junho', 'Julho', 'Agosto', 'Setembro', 'Outubro', 'Novembro', 'Dezembro'],
                    monthNamesShort: ['Jan', 'Fev', 'Mar', 'Abr', 'Mai', 'Jun', 'Jul', 'Ago', 'Set', 'Out', 'Nov', 'Dez']
                });
            });
        </script>

        <style>
            #search-box {
                position: relative;
                width: 100%;
                margin: 0;
            }
            #search-form {
                height: 40px;
                border: 1px solid #999;
                -webkit-border-radius: 5px;
                -moz-border-radius: 5px;
                border-radius: 5px;
                background-color: #fff;
                overflow: hidden;
            }
            #search-text {
                font-size: 14px;
                color: #ddd;
                border-width: 0;
                background: transparent;
            }
            #search-box input[type="text"] {
                width: 90%;
                padding: 11px 0 12px 1em;
                color: #333;
                outline: none;
            }
            #search-button {
                position: absolute;
                top: 0;
                right: 0;
                height: 42px;
                width: 80px;
                font-size: 14px;
                color: #fff;
                text-align: center;
                line-height: 42px;
                border-width: 0;
                background-color: #4d90fe; /*--define a cor do botão Buscar--*/
                -webkit-border-radius: 0px 5px 5px 0px;
                -moz-border-radius: 0px 5px 5px 0px;
                border-radius: 0px 5px 5px 0px;
                cursor: pointer;
            }
        </style>        

    </head>

    <body class="bg-dark">
        <!-- Navigation-->
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark static-top" id="mainNav">
            <a class="navbar-brand" href="index.html">Locadora de Vídeo</a>
            <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarResponsive">
                <ul class="navbar-nav navbar-sidenav" id="exampleAccordion">
                    <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Dashboard">
                        <a class="nav-link" href="index.html">
                            <i class="fa fa-fw fa-dashboard"></i>
                            <span class="nav-link-text">Página Inicial</span>
                        </a>
                        <a class="nav-link" href="../cliente/index.html">
                            <i class="fa fa-fw fa-dashboard"></i>
                            <span class="nav-link-text">Página Cliente</span>
                        </a>
                    <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Example Pages">
                        <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseExamplePages" data-parent="#exampleAccordion">
                            <i class="fa fa-fw fa-file"></i>
                            <span class="nav-link-text">Gerenciar Locadora</span>
                        </a>
                        <ul class="sidenav-second-level collapse" id="collapseExamplePages">
                            <li>
                                <a href="formCadastrarAtor.html">Gerenciar Ator</a>
                            </li>
                            <li>
                                <a href="formCadastrarClasse.html">Gerenciar Classe</a>
                            </li>
                            <li>
                                <a href="formCadastrarCliente.html">Gerenciar Cliente</a>
                            </li>
                            <li>
                                <a href="formCadastrarDependente.html">Gerenciar Dependente</a>
                            </li>
                            <li>
                                <a href="formCadastrarDevolucao.html">Gerenciar Devolucao</a>
                            </li>
                            <li>
                                <a href="formCadastrarDiretor.html">Gerenciar Diretor</a>
                            </li>  
                            <li>
                                <a href="formCadastrarItem.html">Gerenciar Item</a>
                            </li> 
                            <li>
                                <a href="formCadastrarLocacao.html">Gerenciar Locacao</a>
                            </li>                 
                            <li>
                                <a href="formCadastrarTitulo.html">Gerenciar Titulo</a>
                            </li>
                        </ul>
                    </li>
                </ul>
                <ul class="navbar-nav sidenav-toggler">
                    <li class="nav-item">
                        <a class="nav-link text-center" id="sidenavToggler">
                            <i class="fa fa-fw fa-angle-left"></i>
                        </a>
                    </li>
                </ul> <!-- Bota de esconder o menu lateral-->
                <ul class="navbar-nav ml-auto">      
                    <li class="nav-item">
                        <a class="nav-link" data-toggle="modal" data-target="#exampleModal">
                            <i class="fa fa-fw fa-sign-out"></i>Logout</a>
                    </li><!-- Menu de logout -->
                </ul>
            </div>
        </nav>
        <!-- Final navBar -->
        <div class="content-wrapper">
            <div class="container-fluid">
                <div class="container">
                    <div class="card-header">Gerenciar Item</div>
                    <div class="card-body">
                        <form name="teste"  method="POST"  action="../CtrlCadastrarItem">    
                            <div class="form-group">
                                <div class="form-row">
                                    <div class="col-md-4 col-sm-4 col-xs-12">
                                        <label for="numeroSerieItem">N° de série <span class="required">*</span></label>
                                        <input class="form-control" id="numeroSerieItem" name="numeroSerieItem" maxlength="18" type="text" aria-describedby="nameHelp">
                                    </div>
                                </div>

                            </div>                            
                            <div class="form-group">
                                <div class="form-row">
                                    <div class="col-md-3 col-sm-3 col-xs-12">
                                        <label for="dtAquisicao">Data de aquisição </label>
                                        <input class="form-control" id="dtAquisicao" name="dtAquisicao" type="text" aria-describedby="nameHelp">
                                    </div>
                                </div>

                            </div>
                            <div class="form-group">
                                <div class="form-row">
                                    <div class="col-md-8 col-sm-8 col-xs-12">
                                        <label for="tipoItem">Tipo <span class="required">*</span></label>
                                        <input class="form-control" id="tipoItem" name="tipo" maxlength="50" type="text" aria-describedby="nameHelp">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12" for="cmbTitulo">Titulo <span class="required">*</span></label>
                                    <div class="col-md-6 col-sm-6 col-xs-12">
                                        <select id="cmbTitulo" name="cmbTitulo" class="form-control col-md-7 col-xs-12">
                                            <%
                                                List<Titulo> Titulos = new AplCadastrarTitulo().listar();
                                                for (int i = 0; i < Titulos.size(); i++) {
                                                    out.println("<option value =" + Titulos.get(i).getId() + ">" + Titulos.get(i).getNome());
                                                }
                                            %>        
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="form-center">
                                    <center><button id="btCadastrar" type="submit" class="btn btn-primary">Cadastrar</button> 
                                        <input type="hidden" name="operacao" value="inserir">  
                                        <button id="btCancelar" type="reset" class="btn btn-danger">Cancelar</button></center> 
                                </div>
                            </div>
                        </form>
                        <div id='search-box'>   
                            <div class="form-row">
                                <div class="col-md-10 col-sm-1 col-xs-2">
                                    <form action='/search' id='search-form' method='get' target='_top'>
                                        <input id='search-text' name='q' placeholder='Digite sua pesquisa' type='text'/>
                                        <button id='search-button' type='submit'><span>Buscar</span></button>
                                    </form>
                                </div>
                            </div>   
                        </div>   
                        <%
                            List<Item> Itens = new AplCadastrarItem().listar();

                            out.println("<div class='table-responsive'>");
                            out.println("<table class='table table-bordered table-striped table-hover'>");
                            out.println("<tr>");
                            out.println("<th class='col-xs-1'>Número série</th>");
                            out.println("<th class='col-xs-1'>Data aquisição</th>");
                            out.println("<th class='col-xs-1'>Tipo item</th>");
                            out.println("<th class='col-xs-1'>Titulo</th>");
                            out.println("<th class='col-xs-1'>Ações</th>");
                            out.println("</tr>");

                            for (int i = 0; i < Itens.size(); i++) {
                                out.println("<form  method='POST'  action='../CtrlCadastrarItem'");
                                out.println("<tr>");
                                out.println("<td>" + Itens.get(i).getNumSerie() + "</td>");
                                out.println("<td>" + Itens.get(i).getDtAquisicao() + "</td>");
                                out.println("<td>" + Itens.get(i).getTipoItem() + "</td>");
                                out.println("<td>" + Itens.get(i).getTitulo().getNome() + "</td>");
                                out.println("<td>");
                                out.println("<div class='dropdown'>");
                                out.println("<button class='btn btn-primary' type='button' data-toggle='dropdown'>Operações");
                                out.println("<span class='caret'></span></button>");
                                out.println("<ul class='dropdown-menu' role='menu' aria-labelledby='menu1'>");
                                out.println("<li role='presentation'><a role='menuitem' href='#'>");
                                out.println("<button type='button' class='btn btn-warning btn-xs'>Alterar</button> ");
                                out.println("<button type='submit' name='operacao' value='excluir' class='btn btn-danger btn-xs'>Excluir</button>");
                                out.println("<input type='hidden' name='id' value='" + Itens.get(i).getId() + "'>");
                                out.println("</li>");
                                out.println("</ul>");
                                out.println("</div>");
                                out.println("</td>");
                                out.println("</tr>");
                                out.println("</form>");

                            }

                            out.println("</table>");
                            out.println("</div>");
                        %>                                                                  
                    </div>
                </div>
            </div>
        </div>
        <!-- Bootstrap core JavaScript-->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <!-- Core plugin JavaScript-->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
    </body>

</html>

