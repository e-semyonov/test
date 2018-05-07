public class LinkedList {


    public LinkedList() {
    }

    public static void main(String[] args) {

        Node h = new Node("1");
        h.next = new Node("7");
        h.next.next = new Node("80");
        h.next.next.next = new Node("17");
        
        printLinkedList(h);
        
    }

    private static void printLinkedList(Node h) {
        while (h != null){
            System.out.println(h.value);
            h = h.next;
        }
    }

}
