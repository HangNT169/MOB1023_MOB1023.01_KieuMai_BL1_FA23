/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3_OverviewOOPTiep.P1_OnTap;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        NguoiService se = new NguoiServiceImpl();
        // interface = new class 
//        NguoiServiceImpl ns = new NguoiServiceImpl();
        ArrayList<Nguoi>lists = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("menu");
            System.out.println("1.nhap thong tin");
            System.out.println("2.in thong tin ");
            System.out.println("3.thoat");
            int index = sc.nextInt();
            switch (index) {
                case 1:
                    se.nhapThongTin(lists);
                    break;
                case 2:
                    se.inThongTin(lists);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chuc nang khong ton tai");
                    break;
            }
        }
    }
}
