/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sopvn.demosingleton.model.business;

import com.sopvn.demosingleton.model.db.DbConnection;
import com.sopvn.demosingleton.model.entities.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author khiemle
 */
public class Students extends HashSet<Student> {

    @Override
    public boolean add(Student e) {
        //code developer target database -table student
        Connection conn=DbConnection.INSTANCE().Connect();
        String strSQL="insert into Student(id,name) values(??)";
        PreparedStatement ps;
 
        try {
            ps = conn.prepareStatement(strSQL);
            ps.setInt(1, e.getId());
            ps.setString(2, e.getName()==null?"no name":e.getName());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return super.add(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
