package Model;
import java.util.Comparator;

import Object.Student;
class BinarySearchTree <Student> implements Comparator<Student>
{ 
   class Node <Student>
   { 
	   Student key; 
       Node<Student> left, right; 
 
       public Node(Student item) 
       { 
           key = item; 
           left = right = null; 
       } 
   } 
 
   // Root của cây 
   Node root; 
 
   // Hàm dựng 
   BinarySearchTree() 
   { 
       root = null; 
   } 
 
   Student minValue(Node<Student> root) 
   { 
       Student minv = root.key; 
       while (root.left != null) 
       { 
           minv = root.left.key; 
           root = root.left; 
       } 
       return minv; 
   } 
   
   @Override
   public int compare(Student o1, Student o2) {
   	// TODO Auto-generated method stub
	   
   	return 0;
   }

   void insert(Student key) 
   { 
       root = insertRec(root, key); 
   } 
 

   Node insertRec(Node<Student> root, Student key) 
   { 
 
       /* nếu cây rỗng trả về node mới */
       if (root == null) 
       { 
           root = new Node(key); 
           return root; 
       } 
 
       /* ngược lại sẽ thực hiện duyệt dọc cây */
       if ( compare(key, root.key) == 1) 
           root.left = insertRec(root.left, key); 
       else if (key > root.key) 
           root.right = insertRec(root.right, key); 
 
       /* trả về cây nhị phân đã được thêm phần tử mới */
       return root; 
   } 
 
   // Phương thức gọi hàm sắp xếp 
   void inorder() 
   { 
       inorderRec(root); 
   } 
 
   // hàm thực hiện việc sắp xếp và in ra cây nhị phân đã được sắp xếp 
   void inorderRec(Node root) 
   { 
       if (root != null) 
       { 
           inorderRec(root.left); 
           System.out.print(root.key + " "); 
           inorderRec(root.right); 
       } 
   } 
   
   public static Node search(Node root, int key) { 
		// Trường hợp gốc : nếu node null hoặc là node root
		if (root==null || root.key==key) 
		    return root; 
		
		// gia trị lớn hơn giá trị code node root 
		if (root.key > key) 
		    return search(root.left, key); 
		
		// giá trị bé hơn giá trị của node root 
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
       tree.insert(50); 
       tree.insert(30); 
       tree.insert(20); 
       tree.insert(40); 
       tree.insert(70); 
       tree.insert(60); 
       tree.insert(80); 
 
       System.out.println("Inorder traversal of the given tree"); 
       tree.inorder(); 
 
       System.out.println("\nDelete 20"); 
       tree.deleteKey(20); 
       System.out.println("Inorder traversal of the modified tree"); 
       tree.inorder(); 
 
       System.out.println("\nDelete 30"); 
       tree.deleteKey(30); 
       System.out.println("Inorder traversal of the modified tree"); 
       tree.inorder(); 
 
       System.out.println("\nDelete 50"); 
       tree.deleteKey(50); 
       System.out.println("Inorder traversal of the modified tree"); 
       tree.inorder(); 
       
       System.out.println(search(tree.root,40)); 
   }



}
