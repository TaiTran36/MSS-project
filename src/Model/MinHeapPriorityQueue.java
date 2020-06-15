package Model;

public class MinHeapPriorityQueue<K extends Comparable, E> extends SortedArrayPriorityQueue {

    public static class ArrayEntry<K,E> implements Entry<K,E> {

        K key;
        E element;

        public ArrayEntry(K k, E e) {
            this.key = k;
            this.element = e;
        }

        public ArrayEntry() {
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

    ArrayEntry<K,E>[] heapPQ;
    private int defaultsize = 100;
    private int n =0;

    public MinHeapPriorityQueue(){
        this.heapPQ = new ArrayEntry[defaultsize];
        this.n =0;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    public void setRoot(ArrayEntry<K,E> heapEntry) {
        heapPQ[1] = heapEntry;
        if (n == 0) {
            n = n+2;
        }
    }

    public Entry get(int i){
        if(i>=0 && i < n){
            ArrayEntry<K,E> entry = heapPQ[i];
            return entry;
        }
        return null;
    }
    protected void upHead(ArrayEntry<K,E> heapEntry){
        heapPQ[n] = heapEntry;
        int p = n;
        while(p >1 && heapPQ[p/2].getKey().compareTo(heapPQ[p].getKey()) == 1){
            ArrayEntry<K,E> temp = heapPQ[p];
            heapPQ[p] = heapPQ[p/2];
            heapPQ[p/2] = temp;
            p /= 2;
        }

        n++;
    }
    protected ArrayEntry<K,E> downHead(){
        ArrayEntry<K,E> temp = heapPQ[1];
        heapPQ[1] = heapPQ[n-2];
        n--;
        int i =1;
        while(i<n){
            if(2*i+1 < n){
                if(heapPQ[i].getKey().compareTo(heapPQ[2*i].getKey()) == -1 && heapPQ[i].getKey().compareTo(heapPQ[2*i+1].getKey()) == -1){
                    return temp;
                }
                else{
                    int j =0;
                    if(heapPQ[2*i].getKey().compareTo(heapPQ[2*i+1].getKey()) == 1){
                        j = 2*i+1;
                    }else{
                        j = 2*i;
                    }
                    ArrayEntry<K,E> temp1 = heapPQ[i];
                    heapPQ[i] = heapPQ[j];
                    heapPQ[j] = temp1;
                }
            }else{
                if(2*i < n){
                    if(heapPQ[i].getKey().compareTo(heapPQ[2*i].getKey()) == 1){
                        ArrayEntry<K,E> temp1 = heapPQ[i];
                        heapPQ[i] = heapPQ[2*i];
                        heapPQ[2*i] = temp1;
                    }
                }
                return temp;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        MinHeapPriorityQueue<Integer,String> test = new MinHeapPriorityQueue<>();
        ArrayEntry<Integer,String> heapRoot = new ArrayEntry<>(12,"B");
        test.setRoot(heapRoot);
        ArrayEntry<Integer,String> heap1 = new ArrayEntry<>(19,"A");
        test.upHead(heap1);
        ArrayEntry<Integer,String> heap2 = new ArrayEntry<>(16,"C");
        test.upHead(heap2);
        ArrayEntry<Integer,String> heap3 = new ArrayEntry<>(22,"D");
        test.upHead(heap3);
        ArrayEntry<Integer,String> heap4 = new ArrayEntry<>(29,"E");
        test.upHead(heap4);
        ArrayEntry<Integer,String> heap5 = new ArrayEntry<>(24,"F");
        test.upHead(heap5);
        ArrayEntry<Integer,String> heap6 = new ArrayEntry<>(52,"X");
        test.upHead(heap6);
        ArrayEntry<Integer,String> heap7 = new ArrayEntry<>(28,"Q");
        test.upHead(heap7);
        ArrayEntry<Integer,String> heap8 = new ArrayEntry<>(18,"G");
        for (int i=1;i<test.size();i++){
            System.out.println("Key: "+test.get(i).getKey()+" "+"Value: "+test.get(i).getValue());
        }
        System.out.println("******************************************");
//        test.upHead(heap8);

//        ArrayEntry<Integer,String> h = test.downHead();
//        h = test.downHead();
//        System.out.println("Key: "+h.getKey()+" "+"Value: "+h.getValue());
//        System.out.println(test.size());
//        for (int i=1;i<test.size();i++){
//            System.out.println("Key: "+test.get(i).getKey()+" "+"Value: "+test.get(i).getValue());
//        }
    }
}
