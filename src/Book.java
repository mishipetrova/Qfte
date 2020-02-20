import java.util.Objects;

public class Book {

    private int id;

    private int score;

    public Book(int id, int score) {
        this.id = id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


}
