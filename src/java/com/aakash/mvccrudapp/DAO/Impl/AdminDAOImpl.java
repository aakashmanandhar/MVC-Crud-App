/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakash.mvccrudapp.DAO.Impl;

import com.aakash.mvccrudapp.DAO.AdminDAO;
import com.aakash.mvccrudapp.DatabaseConnection.DBConnection;
import com.aakash.mvccrudapp.Entity.Admin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author aakashm
 */
public class AdminDAOImpl implements AdminDAO {

    DBConnection db = new DBConnection();

    @Override
    public Admin login(String admin_username, String admin_password) throws SQLException, ClassNotFoundException {
        Admin admin = null;

        String sql = "SELECT * FROM admin WHERE admin_username=? AND admin_password=?";
        db.connect();
        PreparedStatement ps = db.initStatement(sql);
        ps.setString(1, admin_username);
        ps.setString(2, admin_password);
        ResultSet rs = db.executeQuery();
        if (rs.next()) {
            admin = new Admin();
            admin.setAdmin_id(rs.getInt("admin_id"));
            admin.setAdmin_username(rs.getString("admin_username"));
            admin.setAdmin_password(rs.getString("admin_password"));
        }

        db.close();
        return admin;
    }

}
