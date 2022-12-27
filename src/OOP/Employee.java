package OOP;

public class Employee extends department {
    private String working;

    public Employee(String name, int age, String gender, String address, String working) {
        super(name, age, gender, address);
        this.working = working;
    }

    public String getWorking() {
        return working;
    }

    public void setWorking(String working) {
        this.working = working;
    }

    public String toString() {
        return "Employee{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", gender=" + super.getGender() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", working='" + working + '\'' +
                '}';
    }
}
