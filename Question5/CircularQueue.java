package Question5;

public class CircularQueue {
    private Order[] items;
    private int size;
    private int front;
    private int end;
    private int capacity;

    public CircularQueue(){
        capacity=4;
        items=new Order[capacity];
        front=-1;
        end=-1;
        size=0;
    }
    public void enqueue(Order order){
        if(size==0){
            items[0]=order;
            front=0;
            end=0;
            size++;
            return;
        }
        if(size==capacity){
            //resize;
            capacity*=2;
            Order[] other=new Order[capacity];
            int first=front;
            for(int i=0;i<size;i++){
                other[i]=items[first];
                first++;
            }
            end= items.length-1;
            items=other;
            front=0;

        }
        if(end==size)end=-1;
        end++;
        items[end]=order;
        size++;
    }

    public void dequeue()throws Exception{
        if(size==0)throw new Exception("queue is empty");
        System.out.println(items[front].toString());
        items[front]=null;
        front++;
        size--;
        if(front>=capacity)front=0;
    }
}
