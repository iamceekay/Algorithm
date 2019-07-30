package BST;

class Node{
    int data;
    Node leftNode;
    Node rightNode;
}
class BinarySearch{
    public Node insert(Node node,int val)
    {
        if(node==null)
        {
            return createNewNode(val);
        }
        if(val<node.data){
            node.leftNode=insert(node.leftNode,val);
        }
        else if(val>node.data)
        {
            node.rightNode=insert(node.rightNode,val);
        }
        return node;
    }

    private Node createNewNode(int k) {
        Node a=new Node();
        a.data=k;
        a.leftNode=null;
        a.rightNode=null;
        return a;
    }

}
public class BSTApp {
    public static void main(String[] args) {
        BinarySearch bn = new BinarySearch();
        Node root=null;
        root=bn.insert(root,8);
        root=bn.insert(root,3);
        root=bn.insert(root,5);
        root=bn.insert(root,12);
        System.out.println(root.leftNode.data);
        // 8 3 6 5 4 8 9 0


    }
}
