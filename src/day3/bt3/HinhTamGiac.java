package day3.bt3;

public class HinhTamGiac {
    // Các thuộc tính ma, mb, mc (private)
    private int ma;
    private int mb;
    private int mc;

    // Constructor mặc định
    public HinhTamGiac() {
        this.ma = 0;
        this.mb = 0;
        this.mc = 0;
    }

    // Constructor có tham số
    public HinhTamGiac(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0 && checkTamGiac(a, b, c)) {
            this.ma = a;
            this.mb = b;
            this.mc = c;
        } else {
            System.out.println("Không phải hình tam giác hoặc giá trị không hợp lệ");
            this.ma = 0;
            this.mb = 0;
            this.mc = 0;
        }
    }

    // Getter và Setter cho từng cạnh
    public int getCanhA() {
        return ma;
    }

    public void setCanhA(int canh) {
        if (canh > 0 && checkTamGiac(canh, this.mb, this.mc)) {
            this.ma = canh;
        } else {
            System.out.println("Không thể gán, không lập thành tam giác hợp lệ");
        }
    }

    public int getCanhB() {
        return mb;
    }

    public void setCanhB(int canh) {
        if (canh > 0 && checkTamGiac(this.ma, canh, this.mc)) {
            this.mb = canh;
        } else {
            System.out.println("Không thể gán, không lập thành tam giác hợp lệ");
        }
    }

    public int getCanhC() {
        return mc;
    }

    public void setCanhC(int canh) {
        if (canh > 0 && checkTamGiac(this.ma, this.mb, canh)) {
            this.mc = canh;
        } else {
            System.out.println("Không thể gán, không lập thành tam giác hợp lệ");
        }
    }

    // Kiểm tra 3 cạnh có lập thành tam giác không
    private boolean checkTamGiac(int a, int b, int c) {
        return (a + b > c && a + c > b && b + c > a);
    }

    // Kiểm tra xem tam giác có hợp lệ không (dựa trên giá trị hiện tại)
    public boolean checkTamGiac() {
        return checkTamGiac(ma, mb, mc);
    }

    // Tính chu vi
    public int getChuVi() {
        if (checkTamGiac()) {
            return ma + mb + mc;
        } else {
            System.out.println("Không phải là tam giác hợp lệ");
            return 0;
        }
    }

    // Tính diện tích
    public double getDienTich() {
        if (checkTamGiac()) {
            double p = getChuVi() / 2.0;
            return Math.sqrt(p * (p - ma) * (p - mb) * (p - mc));
        } else {
            System.out.println("Không phải là tam giác hợp lệ");
            return 0;
        }
    }
}
