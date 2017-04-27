/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakash.mvccrudapp.DAO;

import com.aakash.mvccrudapp.Entity.Admin;
import java.sql.SQLException;

/**
 *
 * @author aakashm
 */
public interface AdminDAO {
    
    Admin login(String admin_username, String admin_password)throws SQLException, ClassNotFoundException;
    
}
