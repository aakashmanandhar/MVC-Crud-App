/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakash.mvccrudapp.DAO;

import com.aakash.mvccrudapp.Entity.Course;
import java.sql.SQLException;

/**
 *
 * @author aakashm
 */
public interface CourseDAO {
    
    int insert(Course c)throws SQLException, ClassNotFoundException;
    
}
