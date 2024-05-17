public class pregunta33 {
    private int ISBN;
    private String title, author;
    private int pageCount;

    public int hashCode() {
        return ISBN;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof pregunta33)) {
            return false;
        }
        pregunta33 other = (pregunta33) obj;
        return this.ISBN == other.ISBN;
    }
}
