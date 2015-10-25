/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hai.bt
 */
public class DBUtility {
    public static Connection getConnect(){
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1129;databaseName=T2_BookStore","sa","1234567");
//            System.out.println("Ok");
        } catch (Exception ex) {
            Logger.getLogger(DBUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
//    public static void main(String[] args) {
//        getConnect();
//    }
    public static void closeAll(Connection conn, PreparedStatement pstmt, ResultSet rs){
        if(conn!=null)
            try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(pstmt!=null)
            try {
            pstmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(rs!=null)
            try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
