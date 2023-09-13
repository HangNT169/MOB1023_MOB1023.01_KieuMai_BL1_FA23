package B2_OverviewOOP;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author hangnt
 */
public class SinhVien extends Nguoi {

    private String maSV;
    private Double diem;

    public SinhVien() {
    }

    public SinhVien(String maSV, Double diem, String ten, String diaChi, int tuoi) {
        super(ten, diaChi, tuoi);
        this.maSV = maSV;
        this.diem = diem;
    }

//    public SinhVien(String maSV, Double diem, String ten, String diaChi, int tuoi) {
//        super(ten, diaChi, tuoi);
//        this.maSV = maSV;
//        this.diem = diem;
//    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public Double getDiem() {
        return diem;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }

    public void display() {
        System.out.println("ma sinh vien: " + maSV);
        System.out.println("diem: " + diem);
//        System.out.println("ten: "+super.getTen());
//        System.out.println("tuoi: "+super.getTuoi());
//        System.out.println("dia chi: "+super.getDiaChi());
        // supper: lay cac ham/thuoc tinh tu class Cha 
        super.display();
    }
}
