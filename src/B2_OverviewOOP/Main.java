/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_OverviewOOP;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {
    public static void main(String[] args) {
        // Tao doi tuong SV va in ra man hinh 
        // B1: Khoi tao doi tuong => contructor 
        // C1: Contructor khong tham so
        //  SinhVien sv = new SinhVien();
        // => Bat buoc phai su dung set
        // SV => ten, tuoi, diaChi, mssv, diem 
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ten: ");
        String ten1 = sc.nextLine();
        System.out.println("Moi nhap tuoi: ");
        Integer tuoi = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap dia chi: ");
        String diaChi = sc.nextLine();
        System.out.println("Nhap ma sv: ");
        String maSv = sc.nextLine();
        System.out.println("Nhap diem: ");
        Double diem = Double.valueOf(sc.nextLine());
        
        // B3: Thay doi gia tri cho doi tuong
//        sv.setTen(ten1);
//        sv.setTuoi(tuoi);
//        sv.setDiaChi(diaChi);
//        sv.setMaSV(maSv);
//        sv.setDiem(diem);
//        sv.display();
        // C2: Su dung contructor full tham so
        SinhVien sv1 = new SinhVien(maSv,diem, ten1, diaChi, tuoi);
        sv1.display();
    }
}
