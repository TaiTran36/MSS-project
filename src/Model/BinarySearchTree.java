package Model;
import java.util.Comparator;
import java.util.LinkedList;

import Object.Course;
import Object.Student;
class BinarySearchTree <T extends Comparable<T>>
{ 
   class Node <T>
   { 
	   T key; 
       Node<T> left, right; 
 
       public Node(T item) 
       { 
           key = item; 
           left = right = null; 
       } 
   } 
 
   Node<T> root; 
 
   BinarySearchTree() 
   { 
       root = null; 
   } 
 
   T minValue(Node<T> root) 
   { 
       T minv = root.key; 
       while (root.left != null) 
       { 
           minv = root.left.key; 
           root = root.left; 
       } 
       return minv; 
   } 
   

   void insert(T key) 
   { 
       root = insertRec(root, key); 
   } 
 

   Node insertRec(Node<T> root, T key) 
   { 
 
       if (root == null) 
       { 
           root = new Node(key); 
           return root; 
       } 
       if (key.compareTo(root.key) == -1) 
           root.left = insertRec(root.left, key); 
       else if (key.compareTo(root.key) == 1) 
           root.right = insertRec(root.right, key); 
       return root; 
   } 
 
   void inorder() 
   { 
       inorderRec(root); 
   } 
 
   void inorderRec(Node<T> root) 
   { 
       if (root != null) 
       { 
           inorderRec(root.left); 
           System.out.print(root.key + " "); 
           inorderRec(root.right); 
       } 
   } 
   
   public T search(Node<T> root, T key) { 
	
		if (root==null ) return null; 
		if(root.key==key) {
			return key;
		}
		if (root.key.compareTo(key) == 1) 
		    return search(root.left, key); 
		return search(root.right, key); 
   } 
 
   public static void main(String[] args) 
   { 
       BinarySearchTree tree = new BinarySearchTree(); 
 
       /* Let us create following BST 
             50 
          /     \ 
         30      70 
        /  \    /  \ 
       20   40  60   80 */
       Course c = new Course(3.0, 2, 2.0, 3.0, 2.0);
       LinkedList<Course> cs = new LinkedList<Course>();
       cs.add(c);
       Student s1 = new Student("ấ", "sá", "sadsa", "dád", cs);
       tree.insert((Comparable) s1); 
       tree.insert(30); 
       tree.insert(20); 
       tree.insert(40); 
       tree.insert(70); 
       tree.insert(60); 
       tree.insert(80); 
 
       System.out.println("Inorder traversal of the given tree"); 
       tree.inorder(); 
       
       System.out.println(tree.search(tree.root, 40)); 
   }



}