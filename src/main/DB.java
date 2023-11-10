package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB {
    String strDriver = "com.mysql.cj.jdbc.Driver";
    String strURL = BaseEnv.DBURL; //DB서버

    //String strURL = "jdbc:mysql://localhost:3306/mydb?characterEncoding=UTF-8&serverTimezone=UTC";
    String strUser = BaseEnv.DBUSER;
    String strPWD = BaseEnv.DBPWD;
    
    Connection connect;
    PreparedStatement stmt;
    ResultSet rs;
    
    public void open(String sql){
        try{
            Class.forName(strDriver);           
            connect = DriverManager.getConnection(strURL, strUser, strPWD);
            stmt = connect.prepareStatement(sql);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("open SQLException or ClassNotFoundException : " + e.getMessage());
        }
    }
    
    public void close(){
        try{
            stmt.close();
            connect.close();
        }catch(SQLException e){
            System.out.println("close SQLException : " + e.getMessage());
        }
    }
    
    public void query(String sql, String... str){
        try{
            stmt = connect.prepareStatement(sql);
        }catch(SQLException e){
            System.out.println("query SQLExceiption : " +e.getMessage());
        }
    }
}
