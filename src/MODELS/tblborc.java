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
public class tblborc {
    
    private int id;
    private int musteriid;
    private double borc;
    private double odenen;
    private double kalan;
    private LocalDate tarih;
    private int silid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMusteriid() {
        return musteriid;
    }

    public void setMusteriid(int musteriid) {
        this.musteriid = musteriid;
    }

    public double getBorc() {
        return borc;
    }

    public void setBorc(double borc) {
        this.borc = borc;
    }

    public double getOdenen() {
        return odenen;
    }

    public void setOdenen(double odenen) {
        this.odenen = odenen;
    }

    public double getKalan() {
        return kalan;
    }

    public void setKalan(double kalan) {
        this.kalan = kalan;
    }

    public LocalDate getTarih() {
        return tarih;
    }

    public void setTarih(LocalDate tarih) {
        this.tarih = tarih;
    }

    public int getSilid() {
        return silid;
    }

    public void setSilid(int silid) {
        this.silid = silid;
    }
    
    
    
}
