/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakash.mvccrudapp.DAO.Impl;

import com.aakash.mvccrudapp.DAO.CourseDAO;
import com.aakash.mvccrudapp.DatabaseConnection.DBConnection;
import com.aakash.mvccrudapp.Entity.Course;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author aakashm
 */
public class CourseDAOImpl implements CourseDAO{
    
    DBConnection db = new DBConnection();

    @Override
    public int insert(Course c) throws SQLException, ClassNotFoundException {
        db.connect();
        String sql = "INSERT INTO course (course_name, course_duration, duration_type, course_fees) VALUES (?,?,?,?)";
        PreparedStatement ps = db.initStatement(sql);
        ps.setString(1, c.getCourse_name());
        ps.setInt(2, c.getCourse_duration());
        ps.setString(3, c.getDuration_type());
        ps.setDouble(4, c.getCourse_fees());
        int result = db.executeUpdate();
        db.close();
        return result;
    }
    
}
