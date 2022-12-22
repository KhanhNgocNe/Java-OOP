package OOP;

import java.util.*;
import java.util.stream.Collectors;

public class ManageDepartment {
    Scanner scanner = new Scanner(System.in);
    List<department> departments = new ArrayList<>();

    public void menu(){
        while (true) {
            System.out.println("Menu:\n" +
                    "1. Add department \n" +
                    "2. Search \n" +
                    "3. Show department \n" +
                    "4. Exit"
            );
            System.out.println("Choosing...:");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1 -> {
                    System.out.println("You choose add department");
                    addDepartment();
                }

                //function add
                case 2 ->{
                    System.out.println("You choose search");
                    System.out.println("Enter your keyword:");
                    String key = scanner.nextLine();
                    search(key, departments);
                }

                //function add
                case 3 ->{
                    System.out.println("You choose show department");

                    showListDepartment();
                }

                //function add
                case 4 -> System.exit(1);


                //function add
                default -> System.out.println("Invalid! Choosing again");

                //function add
            }

        }
    }

    public void addDepartment(){
        System.out.println("Enter your name!");
        String fullName = scanner.nextLine();
        System.out.println("Enter your age!");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter your gender!");
        String gender = scanner.nextLine();
        System.out.println("Enter your address!");
        String address = scanner.nextLine();
        System.out.println("Enter role: \n" +
                "1. Worker \n" +
                "2. Engineer \n" +
                "3. Employee");
        int role = Integer.parseInt(scanner.nextLine());
        switch (role){
            case 1 -> {
                System.out.println("Enter position!");
                int position = Integer.parseInt(scanner.nextLine());
                department department = new Worker(fullName, age, gender, address, position);
                departments.add(department);

            }
            case 2 -> {
                System.out.println("Enter Training Major!");
                String trainingMajor = scanner.nextLine();
                department department = new Engineer(fullName, age, gender, address, trainingMajor);
                departments.add(department);
            }
            case 3 -> {
                System.out.println("Enter working!");
                String working = scanner.nextLine();
                department department = new Employee(fullName, age, gender, address, working);
                departments.add(department);
            }
            default -> {
                System.out.println("Choosing again, please!");
            }
        }
        System.out.println("Add successfully!");
    }
    public void search(String key, List <department> departments){
        for (department department : departments) {
            if (department.getName().equals(key)) {
                System.out.println(department);
            }
        }
        System.out.println("no search");
    }
    public void showListDepartment(){
        for (department department : departments)
            System.out.println(department.toString());
//        Collections.sort();
    }

}
