package Question5;

public class Main {
    public static void main(String[] args) throws Exception {
        Order order1=new Order("ak891/05","Cindy2027","Waakye","12:01");
        Order order2=new Order("ak892/05","LecJanelle2020","Rice","12:03");
        Order order3=new Order("ak893/05","David2027","Fufu","12:03");
        Order order4=new Order("ak894/05","Aisha2026","Plantain","12:04");
        Order order5=new Order("ak895/05","LecAnne","Chapati","12:07");

        CircularQueue orders=new CircularQueue();
        orders.enqueue(order1);
        orders.enqueue(order2);
        orders.enqueue(order3);
        orders.enqueue(order4);
        orders.enqueue(order5);


        orders.dequeue();
        orders.dequeue();
        orders.dequeue();

    }
}
