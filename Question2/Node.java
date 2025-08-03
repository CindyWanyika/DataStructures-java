package Question2;

public class Node {
    private Record data;
    private Node next;

    public Node(Record data){
        this.data=data;
        this.next=null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Record getData() {
        return data;
    }

    public void setData(Record data) {
        this.data = data;
    }
}
