package day3.bttamgiac;

public class HinhTamGiac {
    private int ma;
    private int mb;
    private int mc;

    public HinhTamGiac() {
    }

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
        if (canh > 0 && checkTamGiac(this.ma ,canh , this.mc)) {
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
    private boolean checkTamGiac(int a, int b, int c) {
        return (a + b > c && a + c > b && b + c > a);
    }
    public boolean checkTamGiac() {
        return checkTamGiac(ma, mb, mc);
    }
    public int getChuVi() {
        if (checkTamGiac()) {
            return ma + mb + mc;
        } else {
            System.out.println("Không phải là tam giác hợp lệ");
            return 0;
        }
    }public double getDienTich() {
        if (checkTamGiac()) {
            double p = getChuVi() / 2.0;
            return Math.sqrt(p * (p - ma) * (p - mb) * (p - mc));
        } else {
            System.out.println("Không phải là tam giác hợp lệ");
            return 0;
        }
    }
}
