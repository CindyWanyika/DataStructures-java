package Question11;

public class BinarySearchtree {
    private Node root;
    private int size;

    public BinarySearchtree(){
        root=null;
        size=0;
    }

    public void insert(String name,String phone){
        Node node=new Node(name,phone);
        if(root==null){
            root=node;
            size++;
        }
        else{
            Node h=root;
            Node parent=null;
            while (h!=null){
                parent=h;
                int comparison=h.getName().compareToIgnoreCase(name);
                if(comparison>=0){//if the current name is greater than the name tobe added
                    h=h.getLeft();}
                else{
                    h=h.getRight();
                }
            }
            int comparison=parent.getName().compareToIgnoreCase(name);
            if(comparison>=0)parent.setLeft(node);
            else parent.setRight(node);
            size++;

        }
    }
    public void search(String name){
        Node node=root;
        while (node!=null){
            int comparison=node.getName().compareToIgnoreCase(name);
            if(comparison>0)node=node.getLeft();
            else if(comparison<0)node=node.getRight();
            else{
                System.out.println("Found: "+node.getName()+" "+node.getPhoneNumber());
                return;
            }
        }
        System.out.println("Not Found");
    }
    public void display(){
        Node node=root;
        inorder(root);
    }

    public void inorder(Node node){
        if(node!=null){
            inorder(node.getLeft());
            System.out.println(node.getName()+" "+node.getPhoneNumber());
            inorder(node.getRight());
        }
    }
    Node findMin(Node node){
        Node h=node;
        while(h.getLeft()!=null){
            h=h.getLeft();
        }
        return h;
    }
    public void delete(String name){
        //find the node to be deleted
        Node node=root;
        Node parent=null;
        while (node!=null){
            int comparison=node.getName().compareToIgnoreCase(name);
            if(comparison>0){
                parent=node;
                node=node.getLeft();
            }
            else if(comparison<0){
                parent=node;
                node=node.getRight();
            }
            else{
                break;
            }
        }
        if(node==null){
            System.out.println("Not Found");
        }
        else{
            //if node is on the right of the parent
            if (parent.getRight().equals(node)){
                if(node.getRight()==null&&node.getLeft()==null){
                    parent.setRight(null);
                } else if (node.getRight()==null) {
                    parent.setRight(node.getLeft());
                }else if (node.getLeft()==null) {
                    parent.setRight(node.getRight());
                }
                else{
                    Node min=findMin(node.getRight());
                    delete(min.getName());
                    node.setName(min.getName());
                    node.setPhoneNumber(min.getPhoneNumber());
                }
            }

            else if(parent.getLeft().equals(node)){
                if(node.getRight()==null&&node.getLeft()==null){
                    parent.setLeft(null);
                } else if (node.getRight()==null) {
                    parent.setLeft(node.getLeft());
                }else if (node.getLeft()==null) {
                    parent.setLeft(node.getRight());
                }
                else{
                    Node min=findMin(node.getRight());
                    delete(min.getName());
                    node.setName(min.getName());
                    node.setPhoneNumber(min.getPhoneNumber());
                }
            }

            System.out.println("Deleted: "+name);
        }

    }

}
