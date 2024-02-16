package data.structures;

public class MyQueue<T> {
    MyNode<T> head;

    public void peek() {
        System.out.println(head.data);
    }

    public void enqueue(T data) {
        MyNode<T> newLink = new MyNode<>(data);
        MyNode<T> current = head;

        if (current == null) {
            head = newLink;
            return;
        }

        while (current.next != null) {
            current = current.next;
        }

        current.next = newLink;
    }

    public void dequeue() {
        head = head.next;
    }
}
