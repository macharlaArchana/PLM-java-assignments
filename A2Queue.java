package StackAssignments;
public class A2Queue {
    private int[] queue;
    private int front, rear, size, capacity;

    public A2Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int item) {
        if (size == capacity) {
            System.out.println("Queue is full");
        } else {
            rear = (rear + 1) % capacity;
            queue[rear] = item;
            size++;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // Returning -1 to indicate empty queue
        } else {
            int item = queue[front];
            front = (front + 1) % capacity;
            size--;
            return item;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        A2Queue queue = new A2Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());
    }
}
