package ManageExam;

import ManageLibrary.Book;
import ManageLibrary.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageStudent {
    List<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void menu(){
        while (true){
            System.out.println("Menu:\n" +
                    "1. Add Student \n" +
                    "2. Show Document \n" +
                    "3. Search Student \n" +
                    "4. Exit"
            );
            System.out.println("Choosing...:");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1: {
                    System.out.println("You choose add student");
                    addStudent();
                    break;
                }
                case 2: {
                    System.out.println("You choose show student");
                    showStudent();
                    break;
                }
                case 3: {
                    System.out.println("You choose search student");
                    int key = Integer.parseInt(scanner.nextLine());
                    searchStudent(key, students);
                    break;
                }

            }
        }
    }

    private void searchStudent(int key, List<Student> students) {
        for (Student student: students){
            if(student.getStuID() == key){
                System.out.println(student);
            }
        }
    }

    private void addStudent() {
        System.out.print("Enter Student ID: ");
        int stuID = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Student Name: ");
        String stuName = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.println("Choose area: \n" +
                "1. Area 1 \n" +
                "2. Area 2 \n" +
                "3. Area 3 \n" +
                "4. Next \n");
        System.out.print("Enter Priority Point: ");
        int chooseArea = Integer.parseInt(scanner.nextLine());
        int priorityPoint = 0;
        switch (chooseArea) {
            case 1: {
                priorityPoint = 1;
                System.out.println("Priority of Area 1 is: " + priorityPoint);
            }
            case 2: {
                priorityPoint = 2;
                System.out.println("Priority of Area 2 is: " + priorityPoint);
            }
            case 3: {
                priorityPoint = 3;
                System.out.println("Priority of Area 3 is: " + priorityPoint);
            }
            case 4: {
                priorityPoint = 0;
                System.out.println("Priority is: " +priorityPoint);
            }
            default:{
                System.out.println("Invalid!");
            }
        }

        System.out.println("Choose block: \n" +
                "1. Block A \n" +
                "2. Block B \n" +
                "3. Block C \n");
        int block = Integer.parseInt(scanner.nextLine());
        switch (block) {
            case 1: {
                System.out.println("Enter Math Point: ");
                int mathPoint = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter Physical Point: ");
                int physicalPoint = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter Chemistry Point: ");
                int chemistryPoint = Integer.parseInt(scanner.nextLine());
                Student student = new BlockA(stuID, stuName, address, priorityPoint, mathPoint, physicalPoint, chemistryPoint);
                students.add(student);
                break;
            }
            case 2: {
                System.out.println("Enter Math Point: ");
                int mathPoint = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter Chemistry Point: ");
                int chemistryPoint = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter Biological Point: ");
                int biologicalPoint = Integer.parseInt(scanner.nextLine());
                Student student = new BlockA(stuID, stuName, address, priorityPoint, mathPoint, biologicalPoint, chemistryPoint);
                students.add(student);
                break;
            }
            case 3: {
                System.out.println("Enter Literature Point: ");
                int literaturePoint = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter History Point: ");
                int historyPoint = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter Geography Point: ");
                int geographyPoint = Integer.parseInt(scanner.nextLine());
                Student student = new BlockA(stuID, stuName, address, priorityPoint, literaturePoint, historyPoint, geographyPoint);
                students.add(student);
                break;
            }
            default:{
                System.out.println("Choosing again, please!");
                break;
            }
        }
        System.out.println("Add successfully!");
        showStudent();
    }

    private void showStudent() {
        for (Student student: students){
            System.out.println(student.toString());
        }
    }
}
