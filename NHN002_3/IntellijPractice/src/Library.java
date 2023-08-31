import java.util.Arrays;

public class Library {
    private int size;
    private int bookCount;
    private String[] books;

    public int getBookCount() {
        return bookCount;
    }

    public int getSize() {
        return size;
    }

    public Library(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("도서관 크기는 1보다 작을 수 없습니다.");
        }
        books = new String[size];
        bookCount = 0;
        for (int i = 0; i < size; i++) {
            books[i] = "";
        }
        this.size = size;

        System.out.println("도서관 생성 완료");
    }

    public void add(String bookName) {
        if (bookCount == size) {
            throw new IllegalArgumentException("도서관이 초과입니다. 비워주시고 시도해주세요.");
        }
        for (String book : books) {
            if (bookName.equals(book)) {
                throw new IllegalArgumentException("이미 존재하는 책입니다.");
            }
        }
        books[bookCount++] = bookName;
        System.out.println("책 추가 완료 : " + bookName);
    }

    public void delete(String bookName) {
        if (bookCount == 0) {
            throw new IllegalArgumentException("아무 책도 존재하지 않습니다.");
        }
        for (int i = 0; i < size; i++) {
            if (books[i].equals(bookName)) {
                books[i] = "";
                bookCount--;
                Arrays.sort(books);
                System.out.println("책 삭제 성공 : " + bookName);
                return;
            }
        }

        throw new IllegalArgumentException(bookName + "은 존재 하지않는 책");
    }

    public void find(String bookName) {
        for (String book : books) {
            if (bookName.equals(book)) {
                System.out.println("책이 존재 : " + bookName);
                return;
            }
        }
        System.out.println(bookName + "는 존재 하지 않는 책입니다.");
    }

    public void findAll() {
        System.out.println("\n모든 책 출력");
        System.out.println("==========================");
        for (String book : books) {

            if (book != "") {
                System.out.println(book);
            }
        }
        System.out.println("==========================");
    }


}
