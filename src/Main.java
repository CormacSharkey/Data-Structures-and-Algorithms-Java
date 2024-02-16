import data.structures.MyLinkedList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        MyLinkedList<Integer> listy = new MyLinkedList<>();

        listy.addLinkEnd(1);
        listy.addLinkEnd(2);
        listy.addLinkEnd(3);

        listy.addLinkStart(0);
        listy.addLinkStart(-1);

        listy.deleteLinkStart();

        listy.deleteLinkEnd();

        listy.showList();

        listy.searchList(1);
        listy.searchList(-1);
    }
}