package Model;

import java.util.Iterator;

public class SortedArrayPriorityQueue<K extends Comparable, E> implements PriorityQueueInterface {

    protected static class ArrEntry<K,E> implements Entry<K,E> {

        K key;
        E element;

        public ArrEntry(K k, E e) {
            this.key = k;
            this.element = e;
        }

        public ArrEntry() {
        }
        @Override
        public E getValue() {
            return this.element;
        }

        @Override
        public K getKey() {
            return this.key;
        }

    }

    ArrEntry<K, E> [] array;
    int n =0;
    int defaultSize = 1000;

    public SortedArrayPriorityQueue(){
        this.array = new ArrEntry[defaultSize];
        this.n = 0;
    }

    public Entry get(int i){
        if(i>=0 && i < n){
            ArrEntry<K,E> entry = array[i];
            return entry;
        }
        return null;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public void insert(Entry entry) throws IllegalArgumentException{
        if(entry instanceof ArrEntry) {
            if(n == 0){
                array[0] = (ArrEntry) entry;
                n++;
            }
            else if(n > 0 && n < defaultSize){
                if(array[n-1].getKey().compareTo(entry.getKey()) == -1){
                    array[n] = (ArrEntry) entry;
                    n++;
                }else if(array[0].getKey().compareTo(entry.getKey()) == 1){
                    for(int i=n;i>=1;i--){
                        array[i] = array[i-1];
                    }
                    array[0] = (ArrEntry<K, E>) entry;
                    n++;
                }else{

                }
            }else{
                throw new IllegalStateException("Priority Queue is full");
            }
        }
    }

    @Override
    public void insert(Object o, Object o2)  throws IllegalArgumentException{
        K k = (K) o;
        E e = (E) o2;
        ArrEntry<K,E> entry = new ArrEntry<>(k,e);
       
        if(n == 0){
            array[0] = entry;
            n++;
        }
        else if(n > 0 && n < defaultSize){
        	
            if(array[0].getKey().compareTo(entry.getKey()) >= 1){
                for(int i=n;i>=1;i--){
                    array[i] = array[i-1];
                }
                array[0] = entry;
            }else if(array[n-1].getKey().compareTo(entry.getKey()) <= -1){
            	 
                array[n] = entry;
            }
            else{
                for (int i=0;i<n-1;i++){
                    if(array[i].getKey().compareTo(entry.getKey()) <= -1 && array[i+1].getKey().compareTo(entry.getKey()) >= 1){
                        int j = n;
                        while(j > i+1){
                            array[j] = array[j-1];
                            j--;
                        }
                        array[i+1] = entry;
                    }
                }
            }
            n++;
        }else{
            throw new IllegalStateException("Priority Queue is full");
        }
    }

    @Override
    public Entry removeMin() {
        ArrEntry<K,E> entryMin = (ArrEntry<K, E>) min();
        for(int i =0;i<n;i++){
            array[i] = array[i+1];
        }
        n--;
        return entryMin;
    }

    @Override
    public Entry min() {
        return array[0];
    }
//    public static void main(String[] args) {
//        SortedArrayPriorityQueue<Integer, String> test = new SortedArrayPriorityQueue<>();
////        ArrEntry  entry = new ArrEntry<>(3,"C");
////        ArrEntry  entry1 = new ArrEntry<>(5,"D");
////        ArrEntry  entry2 = new ArrEntry<>(1,"A");
//        test.insert(1,"C");
//        System.out.println(test.size());
//        test.insert(5,"D");
//        System.out.println(test.size());
//        test.insert(3,"A");
//        test.insert(4,"E");
//        System.out.println(test.size());
//
//        for(int i =0; i<test.size();i++){
//            System.out.println("Key: "+test.get(i).getKey()+" "+"Value: "+test.get(i).getValue());
//        }
//        int a =1;
//        System.out.println();
////        System.out.println("*****************************");
////        System.out.println("Key: "+test.min().getKey()+" "+"Value: "+test.min().getValue());
////
////        System.out.println("*****************************");
////        Entry<Integer,String> entryMin = test.removeMin();
////        System.out.println("Key: "+entryMin.getKey()+" "+"Value: "+entryMin.getValue());
////        System.out.println("*****************************");
////        for(int i =0; i<test.size();i++){
////            System.out.println("Key: "+test.get(i).getKey()+" "+"Value: "+test.get(i).getValue());
////        }
////
////        System.out.println(test.size());
////        System.out.println("*****************************"+"\nremoveMin: ");
////        Entry<Integer,String> entryMin2 = test.removeMin();
////        System.out.println("Key: "+entryMin2.getKey()+" "+"Value: "+entryMin2.getValue());
////
////        System.out.println("*****************************");
////        for(int i =0; i<test.size();i++){
////            System.out.println("Key: "+test.get(i).getKey()+" "+"Value: "+test.get(i).getValue());
////        }
////
////        System.out.println(test.size());
////        System.out.println("*****************************"+"\nremoveMin: ");
////        Entry<Integer,String> entryMin3= test.removeMin();
////        System.out.println("Key: "+entryMin3.getKey()+" "+"Value: "+entryMin3.getValue());
////
////        System.out.println("*****************************");
////        System.out.println(test.size());
////        for(int i =0; i<test.size();i++){
////            System.out.println("Key: "+test.get(i).getKey()+" "+"Value: "+test.get(i).getValue());
////        }
//    }

}
