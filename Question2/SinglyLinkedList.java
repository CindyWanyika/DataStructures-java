package Question2;

public class SinglyLinkedList {
    private Node head;
    private int size;

    public SinglyLinkedList(){
        this.head=null;
        this.size=0;
    }

    public void add(Record rec){
        Node node=new Node(rec);
        if(size==0){
            head=node;
            size++;
        }
        else{
            Node h=head;
            while (h.getNext()!=null){
                h=h.getNext();
            }
            h.setNext(node);
            size++;
        }

    }
    public void addFront(Record rec){
        Node node=new Node(rec);
        if(size==0){
            head=node;
            size++;
        }
        else{
            node.setNext(head);
            head=node;
            size++;
        }
    }
    public void addAt(int pos,Record rec){

        Node node=new Node(rec);
        if(size==0){
            head=node;
            size++;
        }
        else if(pos==0){
            node.setNext(head);
            head=node;
            size++;
        }
        else{
           Node h=head;
           for(int i=0;i<pos-1;i++){
               h=h.getNext();
           }
           node.setNext(h.getNext());
           h.setNext(node);
           size++;

        }
    }
    public void remove(String id){
        Node h=head;
        if(h.getData().getStudentId().equals(id))h=null;
        while(h.getNext()!=null){
            if(h.getNext().getData().getStudentId().equals(id)){
                h.setNext(h.getNext().getNext());
            }
            h=h.getNext();
        }
        size--;

    }
    public void find(String id){
        Node h=head;
        int pos=0;
        while(h!=null){
            if(h.getData().getStudentId().equals(id)){
                System.out.println("Record found at position "+pos);
                System.out.println(h.getData());
            }
            pos++;
            h=h.getNext();
        }
        System.out.println("Student with that ID not found");
    }
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }

        head = prev; // New head is the previous tail
    }


    public void display(){
        Node h=head;
        if(h==null) System.out.println("list is empty");
        while (h!=null){
            System.out.println(h.getData());
            h=h.getNext();
        }
    }
}
