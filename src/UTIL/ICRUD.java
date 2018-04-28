/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTIL;

import java.util.List;

/**
 *
 * @author vektorel
 */
public interface ICRUD<T> {
    
    public boolean kaydet(T t);
    
    public boolean duzenle(T t);
    
    public boolean sil(int id);
    
    public List<T> listele();
    
    public T bul(int id);
    
}
