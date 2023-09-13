/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B1_OverviewJava;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * Java 2 loai kieu du lieu: - Kieu nguyen thuy: la kieu hoc C: int,float..
     * - Kieu Object: Integer, Float, Double ... Dấu hiệu nhận biết kiểu Object:
     * - Chữ cái đầu viết hoa - Được khởi tạo bằng từ khoá new - Khi chấm sổ ra
     * gợi ý BT: Nhap ten,tuoi,dia chi tu ban phim roi in ra man hinh
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ten:");
        String ten = sc.nextLine();
        System.out.println("Moi nhap tuoi:");
        int tuoi = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap dia chi:");
        String diaChi = sc.nextLine();

        System.out.println("Ten = " + ten);
        System.out.println("Tuoi = " + tuoi);
        System.out.println("Dia chi = " + diaChi);
//        sc.
//        Integer a = 5;
//        a.
        // Convention:
        // 2 quy tac dat ten:
        // Ran :_: number_first
        // Lac da: numberFirst
        // ten bien/ham => chu cai dau viet thuong
        // ten class: chu cai dau viet hoa
        // ten package : viet thuong 100%
    }
}
