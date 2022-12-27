package ManageLibrary;

public class Paper extends Document {
    private int releaseDay;

    public Paper(String docID, String publisher, int edition, int releaseDay) {
        super(docID, publisher, edition);
        this.releaseDay = releaseDay;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "docID=" + super.getDocID() + '\'' +
                ", publisher='" + super.getPublisher() + '\'' +
                ", edition=" + super.getEdition() +
                ", releaseDay=" + releaseDay +
                '}';
    }

    public int getReleaseDay() {
        return releaseDay;
    }

    public void setReleaseDay(int releaseDay) {
        this.releaseDay = releaseDay;
    }
}
