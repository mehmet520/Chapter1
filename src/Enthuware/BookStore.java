package Enthuware;

import java.util.HashMap;
import java.util.Map;

class BookStore {
    Map<Book, Integer> map = new HashMap<Book, Integer>();

    public BookStore() {
        Book b = new Book("A111");
        map.put(b, 10);
        System.out.println(b.getIsbn());
        b = new Book("B222");
        map.put(b, 5);
    }

    public static void main(String[] args) {
        BookStore bs = new BookStore();
        Book b = new Book("A111");
        System.out.println(bs.getNumberOfCopies(b));  //1
    }

    Integer getNumberOfCopies(Book b) {
        return map.get(b);
    }
}
