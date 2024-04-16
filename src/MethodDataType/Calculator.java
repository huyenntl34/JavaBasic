package MethodDataType;

public class Calculator {

    public static long TinhTong2SoNguyen(int a, int b) {
        return a + b;
    }
    public static double TinhTich2SoThuc(double a, double b){
        return a * b;
    }


    public static void main(String[] args) {
        System.out.println(TinhTong2SoNguyen(10, 20));
        System.out.println(TinhTich2SoThuc(10.5,20.22));
    }

}
