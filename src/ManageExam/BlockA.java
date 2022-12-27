package ManageExam;

public class BlockA extends Student {
    private int mathPoint;
    private int physicalPoint;
    private int chemistryPoint;

    public BlockA(int stuID, String stuName, String address, int priorityPoint, int mathPoint, int physicalPoint, int chemistryPoint) {
        super(stuID, stuName, address, priorityPoint);
        this.mathPoint = mathPoint;
        this.physicalPoint = physicalPoint;
        this.chemistryPoint = chemistryPoint;
    }

    @Override
    public String toString() {
        return "BlockA{" +
                "stuID=" + super.getStuID() +
                ", stuName='" + super.getStuName() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", priorityPoint=" + super.getPriorityPoint() +
                ", mathPoint=" + mathPoint +
                ", physicalPoint=" + physicalPoint +
                ", chemistryPoint=" + chemistryPoint +
                '}';
    }

    public int getMathPoint() {
        return mathPoint;
    }

    public void setMathPoint(int mathPoint) {
        this.mathPoint = mathPoint;
    }

    public int getPhysicalPoint() {
        return physicalPoint;
    }

    public void setPhysicalPoint(int physicalPoint) {
        this.physicalPoint = physicalPoint;
    }

    public int getChemistryPoint() {
        return chemistryPoint;
    }

    public void setChemistryPoint(int chemistryPoint) {
        this.chemistryPoint = chemistryPoint;
    }
}
