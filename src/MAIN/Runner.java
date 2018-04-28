/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MAIN;

import DAO.tblmusteriDAO;
import MODELS.tblmusteri;
import UTIL.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author vektorel
 */
public class Runner {
    
    public static void main(String[] args) throws SQLException {
       
        tblmusteriDAO db = new tblmusteriDAO();
        tblmusteri mst = new tblmusteri();
        
        mst.setAd("Muhammet");
        mst.setSoyad("HOCA");
        mst.setTckimlik("1122222221");
        
        db.kaydet(mst);
        
    }
    
    
}
