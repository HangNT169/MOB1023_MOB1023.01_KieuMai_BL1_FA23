/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B5_6_BaiMauCRUDListFixCung;

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

    public void add(SinhVien sv) {
        lists.add(sv);
    }

    public void remove(int viTri) {
        lists.remove(viTri);
    }

    public void update(int viTri, SinhVien sv) {
        lists.set(viTri, sv);
    }
    
    public void sapXep(){
        // Doi vs String => compareTo
        lists.sort((o1, o2) -> {
            return o1.getTen().compareTo(o2.getTen()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/LambdaBody
        });
//        // Doi vs kieu so => dung dau -
//        lists.sort((o1, o2) -> {
//            return o1.getTuoi() - o2.getTuoi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/LambdaBody
//        });
    }
    
    public List<SinhVien>searchTheoTen(String tenSearch){
        List<SinhVien>listSearch = new ArrayList<>();
        // code : Nho for trong list ban dau 
        for (SinhVien sv : lists) {
            // neu tim thay
            if(sv.getTen().equalsIgnoreCase(tenSearch)){
                // them du lieu vao list search
                listSearch.add(sv);
            }
        }
        return listSearch;
    }
}
