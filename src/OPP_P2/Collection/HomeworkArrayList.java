package OPP_P2.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HomeworkArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(22.9);
        doubleList.add(77.2);
        doubleList.add(76.8);
        doubleList.add(54.2);
        doubleList.add(67.8);
        doubleList.add(12.8);
        doubleList.add(65.8);

        int n = scanner.nextInt();
        double arr[] = new double[n];

        System.out.println(doubleList);

        sumArray(doubleList);
        existAray(doubleList);

    }

    private static void existAray(List<Double> doubleList) {

    }

    private static void sumArray(List<Double> doubleList) {

        double temp = 0;
        for(double dblist: doubleList){
            temp+=dblist;
        }

        System.out.println(temp);
    }
}
