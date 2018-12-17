/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import DBConnect.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Userinfo {
     
    public void InsertUpdateDeleteResetUser(String userid, String username, String usertype, String creatdate )
    {
    Connection con = MyConnection.getConnection();
    PreparedStatement ps;
    
  
        try{
        ps = con.prepareStatement("INSERT INTO userinfo(User_id, Password, Creatdate, User_type) VALUES (?,?,?,?)");
        ps.setString(1, userid);
        ps.setString(2, username);
        ps.setString(3, usertype);
        ps.setString(4, creatdate);
        
        if(ps.executeUpdate() > 0){
            JOptionPane.showMessageDialog(null, "New user Added");
        }
    
        } catch (SQLException ex) {
            Logger.getLogger(Userinfo.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
