public class Book {
    private boolean isScanned;

    private int id;

    private int score;

    public Book(int id, int score) {
        this.id = id;
        this.score = score;
        this.isScanned = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isScanned() {
        return isScanned;
    }

    public void setScanned(boolean scanned) {
        isScanned = scanned;
    }
}
