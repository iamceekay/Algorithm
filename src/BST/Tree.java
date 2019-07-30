package BST;

public class Tree {
    private TreeNode root;
    public void insert(int value)
    {
        if(root==null)
        {
            root=new TreeNode(value);
        }
        else
        {
            root.insert(value);
        }
    }

}

class BST{
    public static  void main(String args[])
    {
        Tree treeVal = new Tree();
        treeVal.insert(12);
        treeVal.insert(23);
        treeVal.insert(10);
        treeVal.insert(6);
        treeVal.insert(78);
        treeVal.insert(43);
        treeVal.insert(12);
        treeVal.insert(33);
        treeVal.insert(2);



    }
}
