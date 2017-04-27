/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakash.mvccrudapp.DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author aakashm
 */
public class DBConnection {
    
    private Connection con = null;
    private PreparedStatement ps = null;
    
    public void connect() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3308/MVC_Crud_App", "root", null);
    }
    
    public PreparedStatement initStatement(String sql)throws SQLException{
        ps=con.prepareStatement(sql);
        return ps;
    }
    
    public int executeUpdate() throws SQLException{
        return ps.executeUpdate();
    }
    
    public ResultSet executeQuery()throws SQLException{
        return ps.executeQuery();
    }
    
    public void close()throws SQLException{
        if(con!=null){
            con.close();
            con=null;
        }
    }
    
}
