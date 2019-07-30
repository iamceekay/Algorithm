package BST;

public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
    public void traverseinOrder()
    {
        if(leftChild!=null) {
            leftChild.traverseinOrder();
        }
        System.out.print("data--->"+data);
        if(rightChild!=null){
            rightChild.traverseinOrder();
        }
    }

    public TreeNode(int data) {

        this.data = data;
    }

    public void insert(int value)
    {
        if(value==data)
        {
            return;
        }
        else if(value < data)
        {
            if(leftChild==null)
            {
                leftChild=new TreeNode(value);
            }
            else{
                leftChild.insert(value);
            }
        }
        else if(value > data)
        {
            if (rightChild==null)
            {
                rightChild=new TreeNode(value);
            }
            else{
                rightChild.insert(value);
            }
        }
    }

}
