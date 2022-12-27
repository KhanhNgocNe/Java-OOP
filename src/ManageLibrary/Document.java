package ManageLibrary;

public class Document {
    private String docID;
    private String publisher;
    private int edition;

    public Document(String docID, String publisher, int edition) {
        this.docID = docID;
        this.publisher = publisher;
        this.edition = edition;
    }


    @Override
    public String toString() {
        return "Document{" +
                "docID=" + docID + '\'' +
                ", publisher='" + publisher + '\'' +
                ", edition=" + edition +
                '}';
    }

    public String getDocID() {
        return docID;
    }

    public void setDocID(String docID) {
        this.docID = docID;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }
}
