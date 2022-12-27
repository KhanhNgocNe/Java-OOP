package OPP_P2.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListExist {
    public static void main(String[] args) {
        ArrayList<Integer> arrayNum = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = scanner.nextInt();
        int number = 0;
        for (int i = 0; i < n ; i++) {
            System.out.println("Enter number" + (number+1));
            number = scanner.nextInt();
            arrayNum.add(number);
        }
        ArrayList<Integer> newArrayNum = new ArrayList<>();

        for (int str: arrayNum){
            if(!newArrayNum.contains(str)){
                newArrayNum.add(str);
            }
        }
        System.out.println("List number: " + arrayNum);
        System.out.println("New list number: " + newArrayNum);

    }
}
