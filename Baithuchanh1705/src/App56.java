import java.util.HashSet;
import java.util.Scanner;

public class App56 {
    public static void main(String[] srgs) {
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        hashSetString.add("Wilson");
        hashSetString.add("Nike");
        hashSetString.add("Volvo");
        hashSetString.add("Lenovo");
        hashSetString.add("Lenovo");

        System.out.println("Các phần tử trong hashSetString:");
        System.out.println(hashSetString);
        System.out.println("Nhập phần tử cần xóa:");
        name = scanner.nextLine();
        scanner.close();

        if (!hashSetString.contains(name)) {
            hashSetString.add(name);
            System.out.println("Xóa thành công!");
            System.out.println("Các phần tử còn lại trong hashSetString:");
            System.out.println(hashSetString);
        } else {
            System.out.println("Xóa không thành công");
        }
    }

}
