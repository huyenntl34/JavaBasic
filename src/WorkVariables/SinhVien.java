package WorkVariables;

public class SinhVien {
    String name = "huyen nguyen"; //global variables
    static int age = 20; //static variables


    public static void main(String[] args) {
        int mssv = 1976210071; //local variables

        SinhVien sv = new SinhVien();
        System.out.println("Ten: " + sv.name);
        System.out.println("mssv: " + mssv);
        System.out.println("Tuoi: " + age);

        ThongTin information = new ThongTin();
        System.out.println("Chuyen nganh: " + information.major);
        System.out.println("Ngay sinh: " + information.dob);
        System.out.println("Que quan: " + information.province);
        System.out.println("Gioi tinh: " + information.sex);


    }
}
