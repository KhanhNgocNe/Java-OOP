package ManageExam;

public class Student {
    private int stuID;
    private String stuName;
    private String address;
    private int priorityPoint;

    public Student(int stuID, String stuName, String address, int priorityPoint) {
        this.stuID = stuID;
        this.stuName = stuName;
        this.address = address;
        this.priorityPoint = priorityPoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuID=" + stuID +
                ", stuName='" + stuName + '\'' +
                ", address='" + address + '\'' +
                ", priorityPoint=" + priorityPoint +
                '}';
    }

    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPriorityPoint() {
        return priorityPoint;
    }

    public void setPriorityPoint(int priorityPoint) {
        this.priorityPoint = priorityPoint;
    }
}
