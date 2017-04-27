/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakash.mvccrudapp.Controller;

import com.aakash.mvccrudapp.DAO.CourseDAO;
import com.aakash.mvccrudapp.DAO.Impl.CourseDAOImpl;
import com.aakash.mvccrudapp.Entity.Course;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aakashm
 */
@WebServlet(name = "addCourse", urlPatterns = "/addcourse")
public class AddCourseServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/Views/AddCourse.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Course c = new Course();
        c.setCourse_name(req.getParameter("courseName"));
        c.setCourse_duration(Integer.parseInt(req.getParameter("courseDuration")));
        c.setDuration_type(req.getParameter("duurationType"));
        c.setCourse_fees(Double.parseDouble(req.getParameter("fees")));
        
        CourseDAO cdao = new CourseDAOImpl();
        try {
            if(cdao.insert(c)>0){
                resp.sendRedirect("login?coursesuccess");
            }else{
                resp.sendRedirect("addcourse?courseerror");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AddCourseServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
}
