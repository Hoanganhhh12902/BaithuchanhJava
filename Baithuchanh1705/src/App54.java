import java.util.HashSet;
import java.util.Scanner;

public class App54 {
    public static void main(String[] srgs) {
        int number;
        HashSet<Integer> hashSetInteger = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        hashSetInteger.add(0);
        hashSetInteger.add(3);
        hashSetInteger.add(1);
        hashSetInteger.add(4);
        hashSetInteger.add(2);
        hashSetInteger.add(8);
        hashSetInteger.remove(4);

        System.out.println("Các phần tử trong hashSetInteger:");
        System.out.println(hashSetInteger);
        System.out.println("Nhập phần tử cần thêm:");
        number = scanner.nextInt();
        scanner.close();

        if (!hashSetInteger.contains(number)) {
            hashSetInteger.add(number);
            System.out.println("Thêm thành công!");
            System.out.println("Các phần tử trong hashSetInteger sau khi thêm:");
            System.out.println(hashSetInteger);
        } else {
            System.out.println("Phần tử" + number + "Đã tồn tại ");
        }
    }

}
