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
public abstract class TaiKhoan {
    private static int dem = 0;
    private String soTk;
    private String tenTk;
    private String dienThoai;
    private String email;
    private double soTien;
    private byte trangThai;
    private Date ngayTao;
    
    {
        soTk = String.format("%06d", ++dem);
        trangThai = 1;
        ngayTao = new Date();
    }
    
    public TaiKhoan(String ten, double soTien) {
        this.tenTk = ten;
        this.soTien = soTien;
    }
    
    public abstract double tinhTienLai();
    public abstract boolean ktDaoHan();
    
    public void nopTien(double st) {
        if (this.ktDaoHan() == true) {
            this.soTien += st;
        }
    }
    
    public void rutTien(double st) {
        if (this.ktDaoHan() && st <= this.soTien) {
            this.soTien -= st;
        }
    }

    /**
     * @return the soTk
     */
    public String getSoTk() {
        return soTk;
    }

    /**
     * @param soTk the soTk to set
     */
    public void setSoTk(String soTk) {
        this.soTk = soTk;
    }

    /**
     * @return the tenTk
     */
    public String getTenTk() {
        return tenTk;
    }

    /**
     * @param tenTk the tenTk to set
     */
    public void setTenTk(String tenTk) {
        this.tenTk = tenTk;
    }

    /**
     * @return the soTien
     */
    public double getSoTien() {
        return soTien;
    }

    /**
     * @param soTien the soTien to set
     */
    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    /**
     * @return the trangThai
     */
    public byte getTrangThai() {
        return trangThai;
    }

    /**
     * @param trangThai the trangThai to set
     */
    public void setTrangThai(byte trangThai) {
        this.trangThai = trangThai;
    }

    /**
     * @return the ngayTao
     */
    public Date getNgayTao() {
        return ngayTao;
    }

    /**
     * @param ngayTao the ngayTao to set
     */
    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }
    
    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
