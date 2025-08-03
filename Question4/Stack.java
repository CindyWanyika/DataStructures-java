package Question4;

import java.util.Arrays;

public class Stack<T> {
    private int capacity;
    private T[] items;
    private int size;
    private int top;

    public Stack(){
        capacity=13;
        items=(T[])new Object[capacity];
        size=0;
        top=-1;
    }

    public void push(T val){
        if(size==capacity){
            capacity*=2;
            items= Arrays.copyOf(items,capacity);
        }
        top++;
        items[top]=val;
        size++;
    }
    public T pop(){
        T popped=items[top];
        top--;
        size--;
        return popped;
    }
    public T peek(){
        return items[top];
    }
    public boolean isempty(){
        return size==0;
    }
}
