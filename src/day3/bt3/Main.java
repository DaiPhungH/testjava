package day3.bt3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập 3 cạnh của tam giác
        System.out.print("Nhập cạnh a: ");
        int a = sc.nextInt();
        System.out.print("Nhập cạnh b: ");
        int b = sc.nextInt();
        System.out.print("Nhập cạnh c: ");
        int c = sc.nextInt();

        // Khởi tạo đối tượng tam giác
        HinhTamGiac tamGiac = new HinhTamGiac(a, b, c);

        // Kiểm tra xem có phải tam giác hợp lệ không
        if (tamGiac.checkTamGiac()) {
            System.out.println("Chu vi của tam giác: " + tamGiac.getChuVi());
            System.out.println("Diện tích của tam giác: " + tamGiac.getDienTich());
        } else {
            System.out.println("Ba cạnh vừa nhập không lập thành tam giác.");
        }
    }
}
