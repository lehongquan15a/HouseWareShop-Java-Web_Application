package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class subCategory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/admin/../component/navbarAdmin.jsp");
    _jspx_dependants.add("/admin/../component/dropdownAdmin.jsp");
    _jspx_dependants.add("/admin/../component/../component/ModalAddProduct.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>SB Admin - Tables</title>\n");
      out.write("\n");
      out.write("    <!-- Custom fonts for this template-->\n");
      out.write("    <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    <!-- Page level plugin CSS-->\n");
      out.write("    <link href=\"vendor/datatables/dataTables.bootstrap4.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template-->\n");
      out.write("    <link href=\"css/sb-admin.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"page-top\">\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand navbar-dark bg-dark static-top\">\n");
      out.write("\n");
      out.write("    <a class=\"navbar-brand mr-1\" href=\"admin-manager\">Start Bootstrap</a>\n");
      out.write("\n");
      out.write("    <button class=\"btn btn-link btn-sm text-white order-1 order-sm-0\" id=\"sidebarToggle\" href=\"#\">\n");
      out.write("        <i class=\"fas fa-bars\"></i>\n");
      out.write("    </button>\n");
      out.write("\n");
      out.write("    <!-- Navbar Search -->\n");
      out.write("    <form class=\"d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0\">\n");
      out.write("        <div class=\"input-group\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Search for...\" aria-label=\"Search\" aria-describedby=\"basic-addon2\">\n");
      out.write("            <div class=\"input-group-append\">\n");
      out.write("                <button class=\"btn btn-primary\" type=\"button\">\n");
      out.write("                    <i class=\"fas fa-search\"></i>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <!-- Navbar -->\n");
      out.write("    <ul class=\"navbar-nav ml-auto ml-md-0\">\n");
      out.write("        <li class=\"nav-item dropdown no-arrow mx-1\">\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"alertsDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                <i class=\"fas fa-bell fa-fw\"></i>\n");
      out.write("                <span class=\"badge badge-danger\">9+</span>\n");
      out.write("            </a>\n");
      out.write("            <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"alertsDropdown\">\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("                <div class=\"dropdown-divider\"></div>\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("            </div>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item dropdown no-arrow mx-1\">\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"messagesDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                <i class=\"fas fa-envelope fa-fw\"></i>\n");
      out.write("                <span class=\"badge badge-danger\">7</span>\n");
      out.write("            </a>\n");
      out.write("            <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"messagesDropdown\">\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("                <div class=\"dropdown-divider\"></div>\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("            </div>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item dropdown no-arrow\">\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                <i class=\"fas fa-user-circle fa-fw\"></i>\n");
      out.write("            </a>\n");
      out.write("            <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"userDropdown\">\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">Settings</a>\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">Activity Log</a>\n");
      out.write("                <div class=\"dropdown-divider\"></div>\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\" data-target=\"#logoutModal\">Logout</a>\n");
      out.write("            </div>\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("        <!-- Sidebar -->\n");
      out.write("        <ul class=\"sidebar navbar-nav\">\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"admin-manager\">\n");
      out.write("                    <i class=\"fas fa-fw fa-tachometer-alt\"></i>\n");
      out.write("                    <span>Dashboard</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"get-products\">\n");
      out.write("                    <i class=\"fas fa-fw fa-chart-area\"></i>\n");
      out.write("                    <span>Product</span></a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"get-categories\">\n");
      out.write("                    <i class=\"fas fa-fw fa-chart-area\"></i>\n");
      out.write("                    <span>Category</span></a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link\" href=\"get-sub-category\">\n");
      out.write("                    <i class=\"fas fa-fw fa-chart-area\"></i>\n");
      out.write("                    <span>Subcategory</span></a>\n");
      out.write("            </li>\n");
      out.write("            <!--dropdown-->\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<li class=\"nav-item dropdown\">\n");
      out.write("    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"pagesDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("        <i class=\"fas fa-fw fa-folder\"></i>\n");
      out.write("        <span>Add New Something</span>\n");
      out.write("    </a>\n");
      out.write("    <div class=\"dropdown-menu\" aria-labelledby=\"pagesDropdown\">\n");
      out.write("        <h6 class=\"dropdown-header\">Add Screens:</h6>\n");
      out.write("        <a onclick=\"addProduct();\" class=\"dropdown-item\">Product</a>\n");
      out.write("        <a class=\"dropdown-item\">Category</a>\n");
      out.write("        <a class=\"dropdown-item\" href=\"add-sub-category\">SubCategory</a>\n");
      out.write("        <a class=\"dropdown-item\" href=\"add-account\">Account</a>\n");
      out.write("        <div class=\"dropdown-divider\"></div>\n");
      out.write("        <h6 class=\"dropdown-header\">Other Pages:</h6>\n");
      out.write("        <a class=\"dropdown-item\" href=\"404.html\">404 Page</a>\n");
      out.write("        <a class=\"dropdown-item\" href=\"blank.html\">Blank Page</a>\n");
      out.write("    </div>\n");
      out.write("</li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalCenterTitle\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog modal-dialog-centered modal-xl\" role=\"document\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <h5 class=\"modal-title\" id=\"exampleModalCenterTitle\">Information of Product</h5>\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                    <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <form class=\"modal-content animate\" action=\"add-product\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <label for=\"code\"><b>Code of product</b></label><br>\n");
      out.write("                        <input class=\"text\" type=\"text\" placeholder=\"Enter code of product\" name=\"code\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.code}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required><br>\n");
      out.write("\n");
      out.write("                        <label for=\"name\"><b>Name of Product</b></label><br>\n");
      out.write("                        <input class=\"text\" type=\"text\" placeholder=\"Enter name of product\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <label for=\"image\" ><b>Images Product</b></label><br>\n");
      out.write("                        \n");
      out.write("                        <input type=\"file\" name=\"fileName\" class=\"form-control-file\" multiple><br>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"exampleFormControlSelect1\"><b>Category</b></label>\n");
      out.write("                            <select class=\"form-control\" name=\"subCategory\"id=\"exampleFormControlSelect1\">\n");
      out.write("                                <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listSubCategory}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"subCategory\">\n");
      out.write("                                    <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subCategory.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subCategory.subCategoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                                </c:forEach>\n");
      out.write("                            </select>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"quantity\"><b>Quantity of product</b></label>\n");
      out.write("                            <input class=\"text\" class=\"form-control\" type=\"number\" placeholder=\"Enter quantity of product\" name=\"quantity\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"price\"><b>Price of Product</b></label>\n");
      out.write("                            <input class=\"text\" class=\"form-control\" type=\"number\" placeholder=\"Enter price of product\" name=\"price\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"status\"><b>status of Product</b></label>\n");
      out.write("                            <select class=\"form-control\" name=\"status\"id=\"exampleFormControlSelect1\">\n");
      out.write("                                <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listStatusProduct}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"statusProduct\">\n");
      out.write("                                    <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${statusProduct.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${statusProduct.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                                </c:forEach>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"exampleFormControlTextarea1\"><b>Description of Product</b></label>\n");
      out.write("                            <textarea class=\"form-control\" id=\"exampleFormControlTextarea1\" rows=\"3\" name=\"description\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <button class=\"btn btn-outline-info\" style=\"width: 55%\" type=\"submit\" ><i class=\"fas fa-sync-alt mr-2\"></i>Update</button>\n");
      out.write("                        <a data-dismiss=\"modal\" class=\"btn btn-outline-danger\" style=\"width: 44%\" ><i class=\"fas fa-trash mr-2\"></i>Cancel</a>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\">Save changes</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function addProduct(){\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            $('#myModal').modal('show');\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"charts.html\">\n");
      out.write("                    <i class=\"fas fa-fw fa-chart-area\"></i>\n");
      out.write("                    <span>Charts</span></a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"tables.html\">\n");
      out.write("                    <i class=\"fas fa-fw fa-table\"></i>\n");
      out.write("                    <span>Tables</span></a>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("        <div id=\"content-wrapper\">\n");
      out.write("\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                <!-- Breadcrumbs-->\n");
      out.write("                <ol class=\"breadcrumb\">\n");
      out.write("                    <li class=\"breadcrumb-item\">\n");
      out.write("                        <a href=\"#\">Dashboard</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"breadcrumb-item active\">Tables</li>\n");
      out.write("                </ol>\n");
      out.write("\n");
      out.write("                <!-- DataTables Example -->\n");
      out.write("                <div class=\"card mb-3\">\n");
      out.write("                    <div class=\"card-header\">\n");
      out.write("                        <i class=\"fas fa-table\"></i>\n");
      out.write("                        Data Table Example</div>\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <div class=\"table-responsive\">\n");
      out.write("                            <table class=\"table table-bordered\" id=\"dataTable\" width=\"100%\" cellspacing=\"0\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>SubId</th>\n");
      out.write("                                        <th>SubCategory</th>\n");
      out.write("                                        <th>Category</th>\n");
      out.write("                                        <th>Status</th>\n");
      out.write("                                        <th>DELETE</th>\n");
      out.write("                                        <th>EDIT</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tfoot>\n");
      out.write("                                <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listSubCategory}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"subCategory\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>SubId</th>\n");
      out.write("                                        <th>SubCategory</th>\n");
      out.write("                                        <th>Category</th>\n");
      out.write("                                        <th>Status</th>\n");
      out.write("                                        <th>DELETE</th>\n");
      out.write("                                        <th>EDIT</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                    </foreach>\n");
      out.write("                                    </tfoot>\n");
      out.write("                                    <tbody>\n");
      out.write("                                    <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listSubCategory}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"subCategory\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subCategory.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</th>\n");
      out.write("                                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subCategory.subCategoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subCategory.getCategory(subCategory.categoryId).category}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subCategory.getStatus(subCategory.status).status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                            <td><a href=\"edit-sub-category?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"btn btn-outline-warning\">Edit</a></td>\n");
      out.write("                                            <td><a  href=\"delete-sub-category?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" onclick=\"return confirm('Are you sure you want to delete this item?');\" class=\"btn btn-outline-danger\"><i class=\"fas fa-trash mr-2\"></i>Delete</a></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </c:foreach>\n");
      out.write("                                    </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-footer small text-muted\">Updated yesterday at 11:59 PM</div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <p class=\"small text-center text-muted my-5\">\n");
      out.write("                    <em>More table examples coming soon...</em>\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("            <!-- Sticky Footer -->\n");
      out.write("            <footer class=\"sticky-footer\">\n");
      out.write("                <div class=\"container my-auto\">\n");
      out.write("                    <div class=\"copyright text-center my-auto\">\n");
      out.write("                        <span>Copyright © Your Website 2019</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /.content-wrapper -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- /#wrapper -->\n");
      out.write("\n");
      out.write("    <!-- Scroll to Top Button-->\n");
      out.write("    <a class=\"scroll-to-top rounded\" href=\"#page-top\">\n");
      out.write("        <i class=\"fas fa-angle-up\"></i>\n");
      out.write("    </a>\n");
      out.write("\n");
      out.write("    <!-- Logout Modal-->\n");
      out.write("    <div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\n");
      out.write("                    <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                        <span aria-hidden=\"true\">×</span>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\n");
      out.write("                <div class=\"modal-footer\">\n");
      out.write("                    <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("                    <a class=\"btn btn-primary\" href=\"login.html\">Logout</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript-->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Core plugin JavaScript-->\n");
      out.write("    <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Page level plugin JavaScript-->\n");
      out.write("    <script src=\"vendor/datatables/jquery.dataTables.js\"></script>\n");
      out.write("    <script src=\"vendor/datatables/dataTables.bootstrap4.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom scripts for all pages-->\n");
      out.write("    <script src=\"js/sb-admin.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Demo scripts for this page-->\n");
      out.write("    <script src=\"js/demo/datatables-demo.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
