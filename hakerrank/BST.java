package hakerrank;

public class BST {
    Node root;
    class Node{
        Node right,left;
        int data;
        
    
    public Node(int val)
    {
       data=val;
        left=null;
        right=null;
    }
    }
    
   public void add(int val)
{
	root= insert(root,val);
}

public Node insert(Node root, int val)
{
	if(root==null)
	{
	root= new Node(val);
	return root;
	}
	if(val<root.data)
	{
	root.left=insert(root.left,val);
	//return root.left;
	}
	else{
	root.right=insert(root.right,val);
	//return root.right;
	}
	return root;
}

public void print( )
{
    inorder(root);
}
public void inorder(Node root)
{
   if (root != null){
       inorder(root.left);
       System.out.println(" "+ root.data);
       inorder(root.right);
   }
}

public void del(int val)
{
	root=delete(root,val);
}

public Node delete(Node root, int value)
{
	if(root==null)
	{
		return root;
	}
	
	if(value<root.data)
		root.left=delete(root.left,value);
	else if(value>root.data)
		root.right=delete(root.right,value);

	else{
		//single node and no node
			if(root.left==null)
				return root.right;
			else if (root.right==null) 
				return root.left;	

		//3rd case
			root.data=min(root.right);
                        root.right=delete(root.right,value);
		}
return root;
}
int min(Node root)
{
	int minval=root.data;
	while(root.left!=null)
	{
		minval=root.left.data;
		root=root.left;
	}
	return minval;
}
    
//    public void insert(int data)
//    {
//        Node a = new Node();
//        a.data=data;
//        a.left=null;
//        a.right=null;
//        if(root==null)
//        {
//           root=a; 
//        }
//        Node p= root;
//        Node c =root;
//        while(c!=null)
//        {
//            p=c;
//            if(data<=c.data)
//            {
//                c=c.left;
//            }
//            else
//            {
//                c=c.right;
//            }
//        }
//        
//        if(data<=p.data)
//        {
//            p.left=a;
//        }
//        else{
//            p.right=a;
//        }
//        
//    }
    
//    public void show()
//    {
//        printAll(root);
//    }
//    
//    
//    public void printAll(Node root)
//    {
//       
//        if(root!=null)
//        {
//            printAll(root.left);
//            System.out.println( root.data);
//            printAll(root.right);
//            
//        }
//        
//    }
    
}
