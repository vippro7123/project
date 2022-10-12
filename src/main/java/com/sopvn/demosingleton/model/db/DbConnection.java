/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sopvn.demosingleton.model.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author khiemle
 */
public final class DbConnection {

    private static DbConnection instance = null;

    //lock constructor
    private DbConnection() {
    }

    public static DbConnection INSTANCE() {
        if (instance == null) {
            instance = new DbConnection();
        }
        return instance;
    }

    public Connection Connect() {
        try {
            class MyConnection {

                private MyConnection Con = null;
                private String strConnection = "";
                public Connection conn = null;

                private MyConnection() {
                    try {
                        Class.forName("com.microsoft.sqlserver.Jdbc.SQLServerDriver");
                        conn = DriverManager.getConnection(strConnection, "sa", "123");
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            }
            return new MyConnection().conn;
        } catch (Exception e) {
        }
        return null;
    }

}
