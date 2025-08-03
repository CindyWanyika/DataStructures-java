package Question3;

public class DoublyLinkedList {
    private Node<Song> head;
    private Node<Song> tail;
    private int size;

    public DoublyLinkedList(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }
    public void addLast(Song data){
        Node<Song> newNode=new Node<>(data);
        if(size==0){
            head=newNode;
            tail=newNode;
            size++;
        }
        else{
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail=newNode;
            size++;
        }
    }
    public void addFirst(Song data){
        Node<Song> newNode=new Node<>(data);
        if(size==0){
            head=newNode;
            tail=newNode;
            size++;
        }
        else{
            newNode.setNext(head);
            head.setPrev(newNode);
            head=newNode;
            size++;
        }
    }
    public void addAfter(String prevId,Song song){
        Node<Song> newNode=new Node<>(song);
        Node<Song> h=head;
        while(!h.getData().getId().equals(prevId)&& h.getNext()!=null){
            h=h.getNext();
        }
        if(!h.getData().getId().equals(prevId)){
            System.out.println("Song not found");
        }
        else {
            newNode.setNext(h.getNext());
            newNode.setPrev(h);
            h.getNext().setPrev(newNode);
            h.setNext(newNode);
            size++;
        }

    }
    public void find(String id){
        Node<Song> h=head;
        while(!h.getData().getId().equals(id)&& h.getNext()!=null){
            h=h.getNext();
        }
        if(!h.getData().getId().equals(id)){
            System.out.println("Song not found");
        }
        else {
            System.out.println(h.getData());
        }

    }
    public void remove(String id){
        Node<Song> h=head;
        Node<Song> t=tail;
        //when there's one item
        if(h.getNext()==null){
            head=null;
            tail=null;
            size--;
        } else if(h.getData().getId().equals(id)) {
            h=h.getNext();
            h.setPrev(null);
            head=h;
            size--;
        } else if (t.getData().getId().equals(id)) {
            t=t.getPrev();
            t.setNext(null);
            tail=t;
            size--;
        }
        else {
            while (!h.getData().getId().equals(id)&& h.getNext()!=null) {
                h = h.getNext();
            }
            if (!h.getData().getId().equals(id)) {
                System.out.println("Song not found");
            } else {
                h.getPrev().setNext(h.getNext());
                h.getNext().setPrev(h.getPrev());
                size--;
            }
        }

    }

    public void displayForward(){
        Node<Song> h=head;
        while(h.getNext()!=null){
            System.out.println(h.getData());
            h=h.getNext();
        }
        System.out.println(h.getData());
    }

    public void displayBackward(){
        Node<Song> t=tail;
        while(t.getPrev()!=null){
            System.out.println(t.getData());
            t=t.getPrev();
        }
        System.out.println(t.getData());
    }


}
