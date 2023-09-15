/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3_OverviewOOPTiep.P1_OnTap;

/**
 *
 * @author hangnt
 */
public class Nguoi {
    private String ten;
    private int tuoi;
    private String diaChi;

    public Nguoi() {
    }

    public Nguoi(String ten, int tuoi, String diaChi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public void display(){
        System.out.println("ten"+ten);
        System.out.println("tuoi"+tuoi);
        System.out.println("dia chi"+diaChi);
    }
}
