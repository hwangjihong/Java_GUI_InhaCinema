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
    
    public Connection connect;
    public PreparedStatement stmt;
    public ResultSet rs;
    
    public void open(){
        try{
            Class.forName(strDriver);           
            connect = DriverManager.getConnection(strURL, strUser, strPWD);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("open SQLException or ClassNotFoundException : " + e.getMessage());
        }
    }
    
    public void close(){
        if(rs != null) try {rs.close();} catch (SQLException e) {System.out.println("ResultSet Close SQLException : " + e.getMessage());}
        if(stmt != null) try {stmt.close();} catch (SQLException e) {System.out.println("PreparedStatement Close SQLException : " + e.getMessage());}
        if(connect != null) try {connect.close();} catch (SQLException e) {System.out.println("Connection Close SQLException : " + e.getMessage());}
          System.out.println("DB Close Success");
    }
}
