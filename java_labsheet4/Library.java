class Library {
    int booksAvailable;
    static String libraryName = "City Library";

    void issueBook() {
        int books = booksAvailable;

        if (books > 0) {
            books--;
            booksAvailable = books;
            System.out.println("Book Issued");
        } else {
            System.out.println("No Books Available");
        }
    }

    void returnBook() {
        int books = booksAvailable;
        books++;
        booksAvailable = books;
        System.out.println("Book Returned");
    }

    void display() {
        System.out.println("Library: " + libraryName);
        System.out.println("Books Available: " + booksAvailable);
    }

    public static void main(String[] args) {
        Library l = new Library();
        l.booksAvailable = 5;

        l.issueBook();
        l.returnBook();
        l.display();
    }
}