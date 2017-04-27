/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakash.mvccrudapp.Controller;

import com.aakash.mvccrudapp.DAO.AdminDAO;
import com.aakash.mvccrudapp.DAO.Impl.AdminDAOImpl;
import com.aakash.mvccrudapp.Entity.Admin;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aakashm
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/Views/Login.jsp").forward(request, response);
    }
    
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String admin_username=request.getParameter("username");
        String admin_password=request.getParameter("password");
        AdminDAO adminDAO = new AdminDAOImpl();
        try {
            Admin admin=adminDAO.login(admin_username, admin_password);
            if(admin==null){
                response.sendRedirect("login?errormessage");
            }else{
                request.getRequestDispatcher("WEB-INF/Views/Home.jsp").forward(request, response);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    } 
}
