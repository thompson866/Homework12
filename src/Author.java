import java.util.Objects;

public class Author {
    private String nameFirst;
    private String nameSecond;

    public Author(String nameFirst, String nameSecond) {
        this.nameFirst = nameFirst;
        this.nameSecond = nameSecond;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getNameSecond() {
        return nameSecond;
    }


    public void setNameSecond(String nameSecond) {
        this.nameSecond = nameSecond;
    }

    @Override
    public String toString() {
        return nameFirst + " " + nameSecond;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nameFirst, author.nameFirst) && Objects.equals(nameSecond, author.nameSecond);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameFirst, nameSecond);
    }
}
