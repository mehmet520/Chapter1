package Enthuware;

class Book {
    private String isbn;

    public Book(String isbn) {
        this.isbn = isbn;
    }

    public boolean equals(Object o) {
        return (o instanceof Book && ((Book) o).isbn.equals(this.isbn));
    }

    @Override
    public int hashCode() {
        return 100;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}