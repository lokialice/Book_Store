/*
     * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Book;
import utility.DBUtility;

/**
 *
 * @author hai.bt
 */
public class BookDAO {
    public List<Book> getAllBooks(){
        List<Book> listB = new ArrayList<Book>();
        Connection conn;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        
        conn = DBUtility.getConnect();
        try {
            pstmt = conn.prepareStatement("select * from BookStore");
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                Book b = new Book();
                b.setIsbn(rs.getString("isbn"));
                b.setBookName(rs.getString("bookName"));
                b.setAuthor(rs.getString("author"));
                b.setDescription(rs.getString("description"));
                b.setPrice(rs.getFloat("price"));
                b.setImgSrc(rs.getString("imageURL"));
                b.setInOut(rs.getBoolean("inOutStock"));
                
                listB.add(b);
            }
            
//            System.out.println(listB.size());
        } catch (SQLException ex) {
            Logger.getLogger(BookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, pstmt, rs);
        }
        return listB;
    }
    public Book getBookByIsbn(String isbn){        
        Connection conn;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        Book b = null;
        conn = DBUtility.getConnect();
        try {
            pstmt = conn.prepareStatement("select * from BookStore where isbn=?");
            pstmt.setString(1, isbn);
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                b = new Book();
                b.setIsbn(rs.getString("isbn"));
                b.setBookName(rs.getString("bookName"));
                b.setAuthor(rs.getString("author"));
                b.setDescription(rs.getString("description"));
                b.setPrice(rs.getFloat("price"));
                b.setImgSrc(rs.getString("imageURL"));
                b.setInOut(rs.getBoolean("inOutStock"));                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(BookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, pstmt, rs);
        }
        return b;
    }
    
//    public static void main(String[] args) {
//        new BookDAO().getAllBooks();
//    }
    
    public boolean deleteBookByIsbn(String isbn){
        boolean bl = false;
        Connection conn;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        conn = DBUtility.getConnect();
        try {
            pstmt = conn.prepareStatement("delete from BookStore where isbn=?");
            pstmt.setString(1, isbn);
            
            int i = pstmt.executeUpdate();
            if(i>0)
                bl = true;            
        } catch (SQLException ex) {
            Logger.getLogger(BookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, pstmt, rs);
        }
        return  bl;
    }
}
