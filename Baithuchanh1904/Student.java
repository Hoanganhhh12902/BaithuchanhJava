package Baithuchanh1904;

import java.util.Scanner;

public class Student extends Person {
    public String tuoi;
    public String diachi;
    Scanner sc = new Scanner(System.in);
    
    public void NhapThongTin() {
        System.out.println("Moi nhap tuoi: ");
        tuoi = sc.nextLine();
        System.out.println("Moi nhap dia chi:");
        diachi = sc.nextLine();
} 
    public void InThongTin() {
        System.out.println("Tuoi la: +tuoi ");
        System.out.println ("Dia chi la :+diachi");

    }
}

