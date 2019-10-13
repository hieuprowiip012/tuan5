/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhpm11.tuan5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Hieu
 */
public class DAO1 {
    private Connection conn;
    
    public DAO1(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:jtds:sqlserver://localhost:1433/sqlbook"
                    + "username=sa;password=123");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public boolean addEmployee(Employee s){
        
        String sql = "insert into Book values(?,?,?,?,?,?,)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(0, s.getName());
            ps.setString(1, s.getType());
            ps.setString(2, s.getAddress());
            ps.setString(3, s.getContact());
            ps.setString(4, s.getEmail());
            ps.setString(5, s.getRemarks());
         
            
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
    public ArrayList<Employee> getListEmployees(){
        ArrayList<Employee> list = new ArrayList<>();
        String sql = "SELECT * FROM dbo.tblBook";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Employee s = new Employee();
                s.setName(rs.getString("name"));
                s.setType(rs.getString("type"));
                s.setAddress(rs.getString("address"));
                s.setContact(rs.getString("contract"));
                s.setEmail(rs.getString("email"));
                s.setRemarks(rs.getString("remarks"));
                
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    public static void main(String[] args) {
        new DAO1();
    }
}
