/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELS;

import java.time.LocalDate;

/**
 *
 * @author vektorel
 */
public class tblmusteri {
    
    private int id;
    private String ad;
    private String soyad;
    private LocalDate dtarihi;
    private String tckimlik;
    private int silid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public LocalDate getDtarihi() {
        return dtarihi;
    }

    public void setDtarihi(LocalDate dtarihi) {
        this.dtarihi = dtarihi;
    }

    public String getTckimlik() {
        return tckimlik;
    }

    public void setTckimlik(String tckimlik) {
        this.tckimlik = tckimlik;
    }

    public int getSilid() {
        return silid;
    }

    public void setSilid(int silid) {
        this.silid = silid;
    }
    
    
    
    
}
