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
public class NguoiServiceImpl implements NguoiService{

    @Override
    public void nhapThongTin(ArrayList<Nguoi> lists) {
        // B1: Nhap thong tin cua doi tuong nguoi 
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String ten = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        Integer tuoi = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap dia chi: ");
        String diaChi = sc.nextLine();
        Nguoi ng1 = new Nguoi(ten, tuoi, diaChi);
        
        // B2: Add doi tuong vao list
        lists.add(ng1);
    }

    @Override
    public void inThongTin(ArrayList<Nguoi> lists) {
        for (Nguoi n : lists) {
            n.display();
        }
    }

    
}
