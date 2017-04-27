/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakash.mvccrudapp.Entity;

import java.util.Date;

/**
 *
 * @author aakashm
 */
public class Student {
    
    private int std_id;
    private String std_fname, std_lname, std_address, std_email, std_phone;
    private Date std_edate;
    private boolean std_status;

    public Student() {
    }

    public Student(int std_id, String std_fname, String std_lname, String std_address, String std_email, String std_phone, Date std_edate, boolean std_status) {
        this.std_id = std_id;
        this.std_fname = std_fname;
        this.std_lname = std_lname;
        this.std_address = std_address;
        this.std_email = std_email;
        this.std_phone = std_phone;
        this.std_edate = std_edate;
        this.std_status = std_status;
    }

    public int getStd_id() {
        return std_id;
    }

    public void setStd_id(int std_id) {
        this.std_id = std_id;
    }

    public String getStd_fname() {
        return std_fname;
    }

    public void setStd_fname(String std_fname) {
        this.std_fname = std_fname;
    }

    public String getStd_lname() {
        return std_lname;
    }

    public void setStd_lname(String std_lname) {
        this.std_lname = std_lname;
    }

    public String getStd_address() {
        return std_address;
    }

    public void setStd_address(String std_address) {
        this.std_address = std_address;
    }

    public String getStd_email() {
        return std_email;
    }

    public void setStd_email(String std_email) {
        this.std_email = std_email;
    }

    public String getStd_phone() {
        return std_phone;
    }

    public void setStd_phone(String std_phone) {
        this.std_phone = std_phone;
    }

    public Date getStd_edate() {
        return std_edate;
    }

    public void setStd_edate(Date std_edate) {
        this.std_edate = std_edate;
    }

    public boolean isStd_status() {
        return std_status;
    }

    public void setStd_status(boolean std_status) {
        this.std_status = std_status;
    }
    
    
    
}
