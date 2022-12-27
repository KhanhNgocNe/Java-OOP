package OPP_P2.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class HashSet2 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String str;

        for (int i = 0; i < n; i++) {
            str = scanner.nextLine();
            stringList.add(str);

        }
        HashSet<String> hashSet = new HashSet<>(stringList);
        System.out.println(stringList);
    }
}
