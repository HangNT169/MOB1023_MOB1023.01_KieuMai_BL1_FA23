/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_Expection;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so:");
        // C1: try..catch
        // C2: nem loi (throw)
        try {
            // chua cac dong nghi ngo xay ra loi
            int number = sc.nextInt();
            System.out.println("Number = " + number);
        } catch (Exception e) {
            // Khi xay ra loi => xu ly ntn 
            System.out.println("Nhap sai loai kieu du lieu r");
        }

    }
}
