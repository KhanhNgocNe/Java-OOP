package ManageExam;

public class BlockB extends Student {
    private int mathPoint;
    private int chemistryPoint;
    private int biologicalPoint;

    public BlockB(int stuID, String stuName, String address, int priorityPoint, int mathPoint, int chemistryPoint, int biologicalPoint) {
        super(stuID, stuName, address, priorityPoint);
        this.mathPoint = mathPoint;
        this.chemistryPoint = chemistryPoint;
        this.biologicalPoint = biologicalPoint;
    }

    @Override
    public String toString() {
        return "BlockB{" +
                "stuID=" + super.getStuID() +
                ", stuName='" + super.getStuName() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", priorityPoint=" + super.getPriorityPoint() +
                ", mathPoint=" + mathPoint +
                ", chemistryPoint=" + chemistryPoint +
                ", biologicalPoint=" + biologicalPoint +
                '}';
    }
}
