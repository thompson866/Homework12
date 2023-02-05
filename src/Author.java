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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Author author = (Author) obj;
        return nameFirst.equals(author.getNameFirst()) && nameSecond.equals(author.getNameSecond());
    }
    @Override
    public int hashCode(){
        return 3;
    }
}
