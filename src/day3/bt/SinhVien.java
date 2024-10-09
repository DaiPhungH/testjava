package day3.bt;

import java.util.Scanner;

public class SinhVien {
    int id;
    String hoTen;
    float diemToan;
    float diemVan;
    float diemAnh;

    public SinhVien() {
    }

    public SinhVien(int id, String hoTen, float diemToan, float diemVan, float diemAnh) {
        this.id = id;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
    }

    void nhapSinhVien() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID: ");
        id = sc.nextInt();

        System.out.print("Nhập họ tên: ");
        hoTen = sc.next();

        System.out.print("Nhập điểm Toán: ");
        diemToan = sc.nextFloat();

        System.out.print("Nhập điểm Văn: ");
        diemVan = sc.nextFloat();

        System.out.print("Nhập điểm Anh: ");
        diemAnh = sc.nextFloat();
    }

    float tinhDiemTB() {
        return (diemToan + diemVan + diemAnh) / 3;
    }

    void xuatSinhVien() {
        System.out.println("ID: " + id);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Điểm Toán: " + diemToan);
        System.out.println("Điểm Văn: " + diemVan);
        System.out.println("Điểm Anh: " + diemAnh);
        System.out.println("Điểm trung bình: " + tinhDiemTB());
    }
}



