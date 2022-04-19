package Baithuchanh1904;

import java.util.Scanner;

public class Customer extends Person {
    public String diachi;
    public String ID;
    Scanner sc = new Scanner(System.in);

    public void NhapThongTin(){
        System.out.println("Moi nhap dia chi:");
        diachi = sc.nextLine();
        System.out.println(" Moi nhap ID");
        ID = sc.nextLine();
    }

    public void InThongTin(){
        System.out.println("Địa chỉ là: +diachi");
        System.out.println("ID khach hang la: +ID");
    }
}
