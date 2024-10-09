package day3.bttamgiac;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Nhập cạnh a: ");
            int a = sc.nextInt();
            System.out.print("Nhập cạnh b: ");
            int b = sc.nextInt();
            System.out.print("Nhập cạnh c: ");
            int c = sc.nextInt();


            HinhTamGiac tamGiac = new HinhTamGiac(a, b, c);


            if (tamGiac.checkTamGiac()) {
                System.out.println("Chu vi của tam giác: " + tamGiac.getChuVi());
                System.out.println("Diện tích của tam giác: " + tamGiac.getDienTich());
            } else {
                System.out.println("Ba cạnh vừa nhập không lập thành tam giác.");
            }
        }
    }


