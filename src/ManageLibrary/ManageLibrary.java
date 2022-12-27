package ManageLibrary;

import java.util.*;

public class ManageLibrary {

    List<Document> documents = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
        public void menu () {
            while (true) {
                System.out.println("Menu:\n" +
                        "1. Add Document \n" +
                        "2. Delete Document by ID \n" +
                        "3. Show Document by Type \n" +
                        "4. Exit"
                );
                System.out.println("Choosing...:");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1: {
                        System.out.println("You choose add document");
                        addDocument();
                        break;
                    }
                    case 2: {
                        System.out.println("You choose delete document by ID");
                        System.out.println("Enter ID:");
                        String id = scanner.nextLine();
                        deleteDocument(id);
                        break;
                    }
                    case 3: {
                        System.out.println("You choose show document by type");
                        System.out.println("Choose type: \n" +
                                "1. Book \n" +
                                "2. Magazine \n" +
                                "3. Paper \n");
                        String type = scanner.nextLine();
                        switch (type){
                            case "1":{
                                SeachbyBook();
                                break;
                            }
                            case "2":{
                                SeachbyMagazine();
                                break;
                            }
                            case "3":{
                                SeachbyPaper();
                                break;
                            }
                            default:{
                                System.out.println("Invalid! Choosing again");
                                break;
                            }
                        }
                        break;
                    }
                    case 4: {
                        System.exit(1);
                        break;
                    }
                    default: {
                        System.out.println("Invalid! Choosing again");
                        break;
                    }
                }
            }
        }
        public void addDocument () {
            System.out.print("Enter Document ID: ");
            String id = scanner.nextLine();
            checkID(id, documents);
            System.out.print("Enter Publisher: ");
            String publisher = scanner.nextLine();
            System.out.println("Enter Edition");
            int edition = Integer.parseInt(scanner.nextLine());
            System.out.println("Choose type: \n" +
                    "1. Book \n" +
                    "2. Magazine \n" +
                    "3. Paper \n");
            int type = Integer.parseInt(scanner.nextLine());
            switch (type) {
                case 1: {
                    System.out.println("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.println("Enter author: ");
                    int page = Integer.parseInt(scanner.nextLine());
                    Document document = new Book(id, publisher, edition, author, page);
                    documents.add(document);
                    break;
                }
                case 2: {
                    System.out.println("Enter Issue Number: ");
                    int issueNumber = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter Release Month: ");
                    int releaseMonth = Integer.parseInt(scanner.nextLine());
                    Document document = new Magazine(id, publisher, edition, issueNumber, releaseMonth);
                    documents.add(document);
                    break;
                }
                case 3: {
                    System.out.println("Enter Release Month: ");
                    int releaseDay = Integer.parseInt(scanner.nextLine());
                    Document document = new Paper(id, publisher, edition, releaseDay);
                    documents.add(document);
                    break;
                }
                default: {
                    System.out.println("Choosing again, please!");
                    break;

                }
            }
            System.out.println("Add successfully!");
            showDocument();
        }
    public void checkID(String id, List<Document> documents) {
        for (Document document: documents){
            if(document.getDocID().contains(id)){
                System.out.println("Enter again");
                addDocument();
            }
        }
    }
    private void deleteDocument(String id) {
        for (Document document : documents) {
            if (document.getDocID().contains(id)) {
                documents.remove(document);
            }
        }
        showDocument();
    }
    private void showDocument(){
        for (Document document: documents){
            System.out.println(document.toString());
        }
    }

    private void SeachbyBook(){
        this.documents.stream().filter(document -> document instanceof Book).forEach(System.out::println);
    }
    private void SeachbyMagazine(){
        this.documents.stream().filter(document -> document instanceof Magazine).forEach(System.out::println);
    }
    private void SeachbyPaper(){
        this.documents.stream().filter(document -> document instanceof Paper).forEach(System.out::println);
    }


}
