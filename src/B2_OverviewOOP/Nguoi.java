/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_OverviewOOP;

/**
 *
 * @author hangnt
 */
public class Nguoi {

    private String ten;
    private String diaChi;
    private int tuoi;

    public Nguoi() {
    }

    public Nguoi(String ten, String diaChi, int tuoi) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void display() {
        System.out.println("ten:" + ten);
        System.out.println("dia chi: " + diaChi);
        System.out.println("tuoi" + tuoi);
    }
}
