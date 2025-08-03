package Question5;

public class Order {
    private String orderId;
    private String customerId;
    private String meal;
    private String timestamp;

    public Order(String id,String customer,String name,String time){
        this.orderId=id;
        this.customerId=customer;
        this.meal=name;
        this.timestamp=time;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    public String toString(){
        return this.orderId+" "+this.customerId+ " "+ this.meal+" "+this.timestamp;
    }
}
