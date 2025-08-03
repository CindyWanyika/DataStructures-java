package Question9;

public class Main {
    public static void main(String[] args){
        Book book1=new Book("eab3425","The river and the source","Mary Ogola",59.99);
        Book book2=new Book("esb3677","Hidden Bodies","Caroline Kepnes",109.99);
        Book book3=new Book("est8765","Harry Potter and the deathly hallows","JK.Rowling",45.00);
        Book book4=new Book("eat45642","The Brothers karamazov","Fyodor Dostoyevsky",99.00);
        Book book5=new Book("eth3425","A doll's house","Henrick Ibsen",109.99);

        Book[] library={book1,book2,book3,book4,book5};

        Quicksort.Quicksort(library);

        for(Book book:library){
            System.out.println(book.toString());
        }

    }
}
