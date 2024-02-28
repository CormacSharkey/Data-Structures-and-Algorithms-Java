import data.structures.MyLinkedList;
import data.structures.MyQueue;

public class Main {
  public static void main(String[] args) {

    System.out.println("Hello world!");

    MyLinkedList<Integer> listy = new MyLinkedList<>();

    listy.addLinkEnd(1);
    listy.addLinkEnd(2);
    listy.addLinkEnd(3);
    listy.addLinkEnd(4);

    listy.addLinkStart(0);
    listy.addLinkStart(-1);

    listy.deleteLinkStart();

    listy.deleteLinkEnd();

    listy.showList();

    listy.searchList(1);
    listy.searchList(-1);

    MyQueue<Integer> queuey = new MyQueue<>();

    queuey.enqueue(1);
    queuey.enqueue(2);
    queuey.enqueue(3);

    queuey.dequeue();

    queuey.peek();
  }
}