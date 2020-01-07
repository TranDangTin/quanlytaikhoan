/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynganhang;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duonghuuthanh
 */
public class QuanLyTaiKhoan {
    private List<TaiKhoan> ds;

    public QuanLyTaiKhoan() {
        this.ds = new ArrayList<>();
    }
    
    public void xemThongTin() {
        
    }
    
    public QuanLyTaiKhoan traCuu(String kw) {
        QuanLyTaiKhoan k = new QuanLyTaiKhoan();
        // ...
        return k;
    }

    /**
     * @return the ds
     */
    public List<TaiKhoan> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<TaiKhoan> ds) {
        this.ds = ds;
    }
}
