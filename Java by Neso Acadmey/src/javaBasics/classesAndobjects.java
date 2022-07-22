class User {
    String name, id_no, dept;
}

class Book {
    String name, auth_name, pages;
}

class Card {
    String name, id_no, dept;
}

class Rem_Mgs {
    String name, due_date, mgs;
}

public class classesAndobjects {
    public static void main(String[] args) {
        User user = new User();
        Book book = new Book();
        Card card = new Card();
        Rem_Mgs mgs = new Rem_Mgs();

        user.name = "Yuvaraj";
        user.id_no = "205114663";
        user.dept = "2 B.SC CS";

        book.name = "Java";
        book.auth_name = "RajKumar";
        book.pages = "2501";

        card.name = "Yuvaraj";
        card.id_no = "205114663";
        card.dept = "2 B.SC CS";

        mgs.name = "Yuvaraj";
        mgs.due_date = "04-01-2022";
        mgs.mgs = "Please submit the book on or before due date";

        System.out.println(book.auth_name);
    }
}
