public class LC_622_Design_Circular_Queue {

    static class MyCircularQueue {
        private int[] queue;
        private int front;
        private int rear;
        private int size;
        private int capacity;

        public MyCircularQueue(int k) {
            capacity = k;
            queue = new int[k];
            front = 0;
            rear = -1;
            size = 0;
        }

        public boolean enQueue(int value) {
            if (isFull()) return false;
            rear = (rear + 1) % capacity; 
            queue[rear] = value;
            size++;
            return true;
        }

        public boolean deQueue() {
            if (isEmpty()) return false;
            front = (front + 1) % capacity;
            size--;
            return true;
        }

        public int Front() {
            if (isEmpty()) return -1;
            return queue[front];
        }

        public int Rear() {
            if (isEmpty()) return -1;
            return queue[rear];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == capacity;
        }
    }

    public static void main(String[] args) {
        MyCircularQueue cq = new MyCircularQueue(3);

        System.out.println(cq.enQueue(1)); 
        System.out.println(cq.enQueue(2)); 
        System.out.println(cq.enQueue(3)); 
        System.out.println(cq.enQueue(4)); 

        System.out.println("Rear: " + cq.Rear());   
        System.out.println("Is Full? " + cq.isFull()); 

        System.out.println("Dequeue: " + cq.deQueue()); 
        System.out.println("Enqueue 4: " + cq.enQueue(4)); 
        System.out.println("Rear after adding 4: " + cq.Rear()); 
    }
}
