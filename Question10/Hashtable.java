package Question10;

import java.util.LinkedList;

public class Hashtable {
    private LinkedList<Node>[] arr;
    private int size;
    private int capacity;
    private int rehashes;


    public Hashtable(){
        this.capacity=16;
        this.arr=new LinkedList[capacity];
        for(int i=0;i<capacity;i++){
            arr[i]=new LinkedList<>();
        }
        this.size=0;
        this.rehashes=0;
    }

    public int hashCode(int val){
        return val%capacity;
    }

    public void put(int id,String name,String email){
        int hash=this.hashCode(id);
        Student student=new Student(id,name,email);
        Node<Integer,Student> node=new Node<>(id,student);
        if(this.getLoadFactor()>0.75){
            System.out.println("rehashing");
            rehashes++;
            capacity*=2;
            LinkedList<Node>[] temp_arr=new LinkedList[capacity];
            for(int i=0;i<capacity;i++){
                temp_arr[i]=new LinkedList<>();
            }
            for (LinkedList<Node> bucket : arr) {
                for (Node n : bucket) {
                    int h=this.hashCode((int)n.getKey());
                    temp_arr[h].add(n);
                }
            }
            arr=temp_arr;
        }
        LinkedList<Node> current=arr[hash];
        current.add(node);
        size++;
        //System.out.println("record for "+name+" added at position "+hash);
    }

    public void search(int id){
        int hash=this.hashCode(id);
        int traversals=0;
        LinkedList<Node> current=arr[hash];
        for(Node node:current){
            traversals++;
            if((int)node.getKey()==id){
                System.out.println("Traversals: "+traversals);
                System.out.println(node.getValue().toString());
                return;
            }
        }
        System.out.println("Traversals: "+traversals);
        System.out.println("Record not found");
    }

    public void remove(int id){
        int hash=this.hashCode(id);
        LinkedList<Node> current=arr[hash];
        for(Node node:current){
            if((int)node.getKey()==id){
                current.remove(node);
                size--;
                System.out.println("Record removed: "+id);
                return;
            }
        }
        System.out.println("Record not found");
    }

    void display() {
        for (LinkedList<Node> bucket : arr) {
            for (Node student : bucket) {
                System.out.println(student.getValue());
            }
        }
        System.out.println("Load factor "+this.getLoadFactor()+" capacity: "+capacity);
    }

    public void size(){
        System.out.println("Size:"+this.size);
    }
    public double getLoadFactor(){
        return (double)size/(double) capacity;
    }
}
