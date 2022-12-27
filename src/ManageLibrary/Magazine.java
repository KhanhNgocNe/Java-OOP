package ManageLibrary;

public class Magazine extends Document {
    private int issueNumber;
    private int releaseMonth;

    public Magazine(String docID, String publisher, int edition, int issueNumber, int releaseMonth) {
        super(docID, publisher, issueNumber);
        this.issueNumber = issueNumber;
        this.releaseMonth = releaseMonth;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "docID=" + super.getDocID() + '\'' +
                ", publisher='" + super.getPublisher() + '\'' +
                ", edition=" + super.getEdition() +
                ", issueNumber=" + issueNumber +
                ", releaseMonth=" + releaseMonth +
                '}';
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(int releaseMonth) {
        this.releaseMonth = releaseMonth;
    }
}
