package Question1;


import java.util.Arrays;

public class myArrayList<T> {
    private T[] items;
    private int size;//initially the size of the arraylist is zero
    private int capacity=5; //set the initial capacity to 10
    private int resized=0;

    public myArrayList(){
        this.items=(T[]) new Object[capacity];
        this.size=0;
    }

    //dynamic add method
    public void add(T val){
        if(this.size==this.capacity){
            capacity*=2;
            resized++;
            items= Arrays.copyOf(items,capacity);
        }
        items[size]=val;
        size++;
    }

    public void insert(int index,T val){
        if(this.size==this.capacity){
            capacity*=2;
            resized++;
            items= Arrays.copyOf(items,capacity);
        }
        for(int i=size;i>index;i--){
            items[i]=items[i-1];
        }
        items[index]=val;
        size++;
    }

    public void remove(int index){
        for(int i=index;i<size;i++){
            items[i]=items[i+1];
        }
        size--;
    }
    public int size(){
        return this.size;
    }

    public T get(int index){
        for(int i=0;i<size;i++){
            if(i==index)return items[i];
        }
        return null;
    }

    public void print(){
        if(size==0) System.out.println("No Items in the list");
        else{
            for(int i=0;i<size;i++){
                System.out.println(items[i]);
            }
            System.out.println("Resized "+resized+" times");
        }
    }

}
