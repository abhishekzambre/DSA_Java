import C09PriorityQueues.HeapPriorityQueue;

public class PriorityQueueDemo {
    public static void main(String args[]){
        HeapPriorityQueue<Integer, String> hpq = new HeapPriorityQueue<>();

        System.out.println("Heap Priority Queue size: " + hpq.size());

        hpq.insert(5, "Five");
        hpq.insert(7, "Seven");
        hpq.insert(2, "Two");
        hpq.insert(2, "TwoAgain");

        System.out.println("Heap Priority Queue size: " + hpq.size());

        System.out.println("Min: <" + hpq.min().getKey() + ", " + hpq.min().getValue() + ">");

        System.out.println("Removing min: <" + hpq.removeMin().getValue() + ">");

        System.out.println("Min: <" + hpq.min().getKey() + ", " + hpq.min().getValue() + ">");

    }
}
