package Question11;

public class Node {
    private String name;
    private String phoneNumber;
    private Node left;
    private Node right;

    public Node(String name,String phoneNumber){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.left=null;
        this.right=null;
    }




    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
