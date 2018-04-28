/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODELS.tblmusteri;
import UTIL.DBConnection;
import UTIL.ICRUD;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author vektorel
 */
public class tblmusteriDAO implements ICRUD<tblmusteri>{

    DBConnection con = new DBConnection();
    
    @Override
    public boolean kaydet(tblmusteri t) {
        try{
        PreparedStatement pr = con.baglan().prepareCall(""
                + "insert into tblmusteri(ad,soyad,tckimlik,silid) values(?,?,?,1)");
        pr.setString(1, t.getAd());
        pr.setString(2, t.getSoyad());
        pr.setString(3, t.getTckimlik());
        pr.executeUpdate();
        return true;
        }catch(Exception ex){
            System.out.println("Hata(Kaydet)...:"+ex.toString());
            return false;
        }finally{
        con.kapat();
        }
        
    }

    @Override
    public boolean duzenle(tblmusteri t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean sil(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<tblmusteri> listele() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public tblmusteri bul(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
