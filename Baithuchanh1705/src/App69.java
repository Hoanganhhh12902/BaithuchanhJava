import java.util.TreeSet;
import java.util.Set;
import java.util.Scanner;

public class App69 {
    public static void main(String[] srgs) {
        int number;
        TreeSet<Integer> treeSetInteger = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        treeSetInteger.add(0);
        treeSetInteger.add(3);
        treeSetInteger.add(1);
        treeSetInteger.add(4);
        treeSetInteger.add(2);
        treeSetInteger.add(8);

        System.out.println("Các phần tử trong TreeSetIntege:");
        System.out.println(treeSetInteger);
        System.out.println("Nhập phần tử cần thêm:");
        number = scanner.nextInt();
        scanner.close();

        if (!treeSetInteger.contains(number)) {
            treeSetInteger.add(number);
            System.out.println("Thêm thành công!");
            System.out.println("Các phần tử trong treeSetInteger sau khi thêm:");
            System.out.println(treeSetInteger);
        } else {
            System.out.println("Phần tử" + number + "Đã tồn tại ");
        }
    }

}
