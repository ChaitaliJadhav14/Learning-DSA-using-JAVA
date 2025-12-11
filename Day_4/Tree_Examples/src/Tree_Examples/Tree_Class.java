package Tree_Examples;

import java.util.Scanner;

public class Tree_Class
{
    Node root;

    void insert(Node r,Node n)//r is root/parent  n is new node
    {
        if(root==null)//first node
            root=n;
        else
        {
            if(n.data<r.data)//left
            {
                if(r.left==null)
                    r.left=n;
                else
                    insert(r.left,n);//go to left and explore
            }
            else
            {
                if(r.right==null)
                    r.right=n;
                else
                    insert(r.right,n);//go to right and explore
            }

        }
    }
    void inorder(Node r)
    {
        if(r!=null)//LPR
        {
            inorder(r.left);//L
            System.out.print(r.data+",");//P
            inorder(r.right);//R
        }
    }
    void preorder(Node r) {
    	if(r!=null) {
    		System.out.print(r.data+",");//P
    		preorder(r.left);//L
    		preorder(r.right);//R
    		
    	}
    }
    void postorder(Node r) {
    	if(r!=null) {
    		postorder(r.left);//L
    		postorder(r.right);//R
    		System.out.print(r.data+",");//P	
    	}
    }
    int count_node(Node r)
    {
        if(r==null)
            return 0;
        else
            return 1+count_node(r.left)+count_node(r.right);
    }
    int count_leaf_node(Node r) {
    	if(r==null)
    		return 0;
    	else if(r.left==null && r.right==null)
    		return 1;
    	return count_leaf_node(r.left)+count_leaf_node(r.right);
    }
    
    //Write a function to return tree value
    int tree_value(Node r)
    {
        if(r==null)
            return 0;
        else
            return r.data+tree_value(r.left)+tree_value(r.right);
    }

    //return depth of a tree:length of longest running branch(Max of length)
    int count_depth(Node r)
    {
        if(r==null)
            return 0;
        else
        {
            int length_left=count_depth(r.left);
            int length_right=count_depth(r.right);
            return 1+Math.max(length_left,length_right);
        }
    }
    
    public static void main(String[] args) {
    	//Scanner sc = new Scanner(System.in);
        Tree_Class t=new Tree_Class();
      
        
        t.insert(t.root,new Node(10));
        t.insert(t.root,new Node(20));
        t.insert(t.root,new Node(5));
        t.insert(t.root,new Node(15));
        t.insert(t.root,new Node(30));
        System.out.print("\nInorder:");
        t.inorder(t.root);//5,10,15,20,30
        System.out.print("\nTotal nodes:"+t.count_node(t.root));
        System.out.print("\nTotal leaf nodes:"+t.count_leaf_node(t.root));
        System.out.print("\nTree value:"+t.tree_value(t.root));
        System.out.print("\nlength of longest running branch:"+t.count_depth(t.root));
       
    }
    
}
