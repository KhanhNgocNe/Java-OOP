package OOP;

public class Worker extends department {
    private int position;

    public Worker(String name, int age, String gender, String address, int position) {
        super(name, age, gender, address);
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    public String toString() {
        return "department{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", gender=" + super.getGender() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", position ='" + position +
                '}';
    }
}
