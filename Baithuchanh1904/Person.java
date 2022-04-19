package Baithuchanh1904;

import java.util.Scanner;

public class Person {
  
    public static void main(String[] args) throws Exception {
        Person ps = new Person ();
        ps.NhapThongTin();
        ps.InThongTin();
}
    String HoTen;
    Boolean GioiTinh;
    Scanner sc = new Scanner(System.in);
    public void NhapThongTin() {
        System.out.println("Moi nhap ho ten: ");
        HoTen = sc.nextLine();
        System.out.println("Moi nhap gioi tinh : ");
        GioiTinh = sc.nextBoolean();
    }
    public void InThongTin() {
        System.out.println("Ho ten: " + HoTen);
        System.out.println("Gioi tinh : ");
        if(GioiTinh == true) {
            System.out.println("Nam");
       } else {
           System.out.println("Nu");
       }
       
} 
}
    
