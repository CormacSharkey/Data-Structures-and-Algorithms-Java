package data.structures;

public class MyLinkedList<T> {
    MyNode<T> head;

    public void showList() {
        MyNode<T> current = head;

        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }

        System.out.print("null");
        System.out.println();
    }

    public void addLinkStart(T data) {
        MyNode<T> newLink = new MyNode<>(data);
        MyNode<T> current = head;

        head = newLink;
        newLink.next = current;
    }

    public void addLinkEnd(T data) {
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

    public void deleteLinkStart() {
        head = head.next;
    }

    public void deleteLinkEnd() {
        MyNode<T> current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    public void searchList(T data) {
        MyNode<T> current = head;

        while (current != null) {
            if (current.data == data) {
                System.out.println(data);
                return;
            }

            current = current.next;
        }

        System.out.println("null");
    }
}
