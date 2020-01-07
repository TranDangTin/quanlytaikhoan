/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynganhang;

import java.util.Date;

/**
 *
 * @author duonghuuthanh
 */
public class TaiKhoanKhongKyHan extends TaiKhoan {
    private KyHan kyHan;
    private Date ngayDaoHan;
    
    public TaiKhoanKhongKyHan(String ten, double soTien) {
        super(ten, soTien);
    }

    @Override
    public double tinhTienLai() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ktDaoHan() {
        return true;
    }

    public KyHan getKyHan() {
        return kyHan;
    }

    public void setKyHan(KyHan kyHan) {
        this.kyHan = kyHan;
    }

    public Date getNgayDaoHan() {
        return ngayDaoHan;
    }

    public void setNgayDaoHan(Date ngayDaoHan) {
        this.ngayDaoHan = ngayDaoHan;
    }
}
