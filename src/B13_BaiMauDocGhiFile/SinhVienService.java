/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B13_BaiMauDocGhiFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class SinhVienService {

//    private ArrayList<SinhVien>lists = new ArrayList<>();
    private List<SinhVien> lists = new ArrayList<>();

    public SinhVienService() {
        // fake data
        // => Them phan tu vao lists
        lists.add(new SinhVien("hangnt169", "Hang", 10, "ha noi", false));
        lists.add(new SinhVien("nguyenvv4", "Nguyen", 11, "ha noi1", true));
        lists.add(new SinhVien("khanhpg", "Hang1", 103, "ha noi2", true));
        lists.add(new SinhVien("dungna29", "Hang2", 104, "ha noi3", true));
        lists.add(new SinhVien("tiennh21", "Hang3", 105, "ha noi4", true));
    }

    public List<SinhVien> getAll() {
        return lists;
    }

    public String add(SinhVien sv) {
        if (sv == null) {
            return "Add that bai";
        }
        lists.add(sv);
        return "Add thanh cong";
    }

    public void remove(int viTri) {
        lists.remove(viTri);
    }

    public void update(int viTri, SinhVien sv) {
        lists.set(viTri, sv);
    }

    public void sapXep() {
        // Doi vs String => compareTo
        lists.sort((o1, o2) -> {
            return o1.getTen().compareTo(o2.getTen()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/LambdaBody
        });
//        // Doi vs kieu so => dung dau -
//        lists.sort((o1, o2) -> {
//            return o1.getTuoi() - o2.getTuoi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/LambdaBody
//        });
    }

    public List<SinhVien> searchTheoTen(String tenSearch) {
        List<SinhVien> listSearch = new ArrayList<>();
        // code : Nho for trong list ban dau 
        for (SinhVien sv : lists) {
            // neu tim thay
            if (sv.getTen().equalsIgnoreCase(tenSearch)) {
                // them du lieu vao list search
                listSearch.add(sv);
            }
        }
        return listSearch;
    }

    // Ghi File => OutputStream 
    public String ghiFile(String path) {
        // Tao file moi
        File file = new File(path);
        // Kiem tra su ton tai cua file 
        if (file.exists() == false) {
            try {
                // tao file moi
                file.createNewFile();
                // Ghi du lieu vao file 
                try (FileOutputStream fos = new FileOutputStream(file);
                        ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                    for (SinhVien sv : lists) {
                        // viet vao file
                        oos.writeObject(sv);
                    }
                }
            } catch (IOException ex) {
                ex.printStackTrace(System.out);
                return "Ghi file that bai";
            }
        }
        return "Ghi file thanh cong";
    }

    public String docFile(String path) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                return "Không tìm thấy file!";
            }
            try (FileInputStream fis = new FileInputStream(file);
                    ObjectInputStream ois = new ObjectInputStream(fis)) {
                while (fis.available() > 0) {
                    lists.add((SinhVien) ois.readObject());
                }
            }
        } catch (Exception e) {
            return "Đọc file thất bại";
        }
        return "Đọc file thành công!";
    }
}
