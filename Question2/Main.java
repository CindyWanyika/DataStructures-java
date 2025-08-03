package Question2;

public class Main {
    public static void main(String[] args){
        Record rec1=new Record("40712027","Cindy Wanyika","CS222A","19:01");
        Record rec2=new Record("67542027","Anna Sullivan","CS252C","16:01");
        Record rec3=new Record("11312027","Wendy Merlin","SOAN233A","21:13");
        Record rec4=new Record("87652027","Abigael Wanjala","CS122B","18:41");
        Record rec5=new Record("46752026","Neema Oduor","MATH221","19:01");
        Record rec6=new Record("51302025","Cindy S","MATH222A","19:21");

        SinglyLinkedList records2025=new SinglyLinkedList();
        records2025.add(rec1);
        records2025.add(rec2);
        records2025.add(rec3);
        records2025.add(rec4);
        records2025.add(rec5);
        records2025.add(rec6);
        records2025.addFront(rec4);
        records2025.addAt(4,rec6);

        records2025.remove("40712027");
        records2025.remove("67542027");
        records2025.remove("46752026");


        records2025.display();

        records2025.find("40712025");
    }
}
