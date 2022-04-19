package Baithuchanh1904;

import java.util.Scanner;

public class Employee extends Person {
    public String luong;
    public String tuoi;
    Scanner sc = new Scanner(System.in);

    public void NhapThongTin() {
        System.out.println("Moi nhap tuoi: ");
        tuoi = sc.nextLine();
        System.out.println("Nhap luong:");
        luong = sc.nextLine();
    }
     public void InThongTin() {
        System.out.println("Tuoi la: +tuoi ");
        System.out.println ("Luong : +luong ");
     }
    }

