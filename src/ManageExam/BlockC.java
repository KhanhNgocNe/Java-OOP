package ManageExam;

public class BlockC extends Student {
    private int literaturePoint;
    private int historyPoint;
    private int geographyPoint;

    public BlockC(int stuID, String stuName, String address, int priorityPoint, int literaturePoint, int historyPoint, int geographyPoint) {
        super(stuID, stuName, address, priorityPoint);
        this.literaturePoint = literaturePoint;
        this.historyPoint = historyPoint;
        this.geographyPoint = geographyPoint;
    }

    @Override
    public String toString() {
        return "BlockC{" +
                "stuID=" + super.getStuID() +
                ", stuName='" + super.getStuName() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", priorityPoint=" + super.getPriorityPoint() +
                ", literaturePoint=" + literaturePoint +
                ", historyPoint=" + historyPoint +
                ", geographyPoint=" + geographyPoint +
                '}';
    }

    public int getLiteraturePoint() {
        return literaturePoint;
    }

    public void setLiteraturePoint(int literaturePoint) {
        this.literaturePoint = literaturePoint;
    }

    public int getHistoryPoint() {
        return historyPoint;
    }

    public void setHistoryPoint(int history) {
        historyPoint = history;
    }

    public int getGeographyPoint() {
        return geographyPoint;
    }

    public void setGeographyPoint(int geographyPoint) {
        this.geographyPoint = geographyPoint;
    }
}
