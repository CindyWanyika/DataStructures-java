package Question11;

public class Main {
    public static void main(String[] args){
        BinarySearchtree contacts=new BinarySearchtree();
        contacts.insert("Kingsley","0724283718");
        contacts.insert("Cindy","0564583718");
        contacts.insert("Abel","0234012367");
        contacts.insert("Mike","0456121344");
        contacts.insert("Dennis","0555435512");
        contacts.insert("Larry","0286116118");
        contacts.insert("Peter","0722890891");

        //contacts.display();
        contacts.search("cindy");
        contacts.delete("Mike");

        contacts.display();
    }
}
