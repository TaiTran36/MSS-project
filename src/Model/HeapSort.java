package Model;

import java.util.LinkedList;

import Model.MinHeapPriorityQueue.ArrayEntry;
import Object.Course;
import Object.Student;

public class HeapSort extends MinHeapPriorityQueue {

    public static SortedArrayPriorityQueue heapSort(HeapSort hs){
        SortedArrayPriorityQueue a = new SortedArrayPriorityQueue();
        for (int i=1;i<5;i++){
            a.insert(hs.get(i).getKey(), hs.get(i).getValue());
            System.out.println("z");
        }
        return a;
    }
    public static void main(String[] args) {
       HeapSort hs = new HeapSort();
       	Course c = new Course(2, 3, 3, 3, 3);
       	LinkedList<Course> cou = new LinkedList<Course>();
		cou.add(c);
		Student st = new Student("a","123", "13", "12345", cou);
        ArrayEntry<String,Student> heapRoot = new ArrayEntry<>("Trang",st);
        hs.setRoot(heapRoot);
        ArrayEntry<String,Student> heap1 = new ArrayEntry<>("Liên",st);
        hs.upHead(heap1);
        ArrayEntry<String,Student> heap2 = new ArrayEntry<>("Nam",st);
        hs.upHead(heap2);
        ArrayEntry<String,Student> heap3 = new ArrayEntry<>("Bình",st);
        hs.upHead(heap3);
//        ArrayEntry<String,Student> heap4 = new ArrayEntry<>("e",st);
//        hs.upHead(heap4);
//        ArrayEntry<String,Student> heap5 = new ArrayEntry<>("f",st);
//        hs.upHead(heap5);
//        ArrayEntry<String,Student> heap6 = new ArrayEntry<>(52,"X");
//        hs.upHead(heap6);
//        ArrayEntry<String,Student> heap7 = new ArrayEntry<>(28,"Q");
//        hs.upHead(heap7);
//        ArrayEntry<String,Student> heap8 = new ArrayEntry<>(18,"G");
//        hs.upHead(heap8);
        
        for (int i=1;i<hs.size();i++){
        	Student s = (Student)hs.get(i).getValue();
            System.out.println("Key: "+hs.get(i).getKey()+" "+"Value: "+s.getName());
        }
        System.out.println("***********************************");
        System.out.println(hs.size());
        SortedArrayPriorityQueue a = heapSort(hs);
        
        for (int i=0;i<a.size();i++){
            System.out.println("Key: "+a.get(i).getKey()+" "+"Value: "+a.get(i).getValue());
        }
    }
}
