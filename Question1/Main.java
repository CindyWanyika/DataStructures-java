package Question1;

public class Main {
    public static void main(String[] args){
        Book book1=new Book("1","Emma","Noah",true);
        Book book2=new Book("bk2","Pride and Prejudice","Gustav",true);
        Book book3=new Book("bk3","Us","Lupita",true);
        Book book4=new Book("bk4","Crime and Punishment","Dostoevsky",true);
        Book book5=new Book("bk5","Stones bounce on water","Barbara",true);
        myArrayList<Book> library=new myArrayList<>();

        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        library.insert(2,book5);
        library.insert(0,book3);
        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        library.insert(2,book1);
        library.insert(0,book5);

        library.remove(4);

        System.out.println("Position 2 item:\n"+library.get(2));

        System.out.println("ALL BOOKS");

        library.print();
    }
}
