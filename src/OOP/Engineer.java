package OOP;

public class Engineer extends department{
    private String trainingMajor;

    public Engineer(String name, int age, String gender, String address, String trainingMajor) {
        super(name, age, gender, address);
        this.trainingMajor = trainingMajor;
    }


    public String getTrainingMajor() {
        return trainingMajor;
    }

    public void setTrainingMajor(String trainingMajor) {
        this.trainingMajor = trainingMajor;
    }

    public String toString() {
        return "department{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", gender=" + super.getGender() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", trainingMajor='" + trainingMajor + '\'' +
                '}';
    }
}
