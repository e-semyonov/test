public class LinkedList {


    public LinkedList() {
    }

    public static void main(String[] args) {

        Node h = new Node("1");
        h.next = new Node("7");
        h.next.next = new Node("80");
        h.next.next.next = new Node("17");
        
        printLinkedList(h);

        h = reverseLinkedList(h);
        printLinkedList(h);
    }

    private static Node reverseLinkedList(Node node) {

        Node head = node;
        Node current = node;
        Node next = node.next;
        head.next = null;



        while (next != null){
            current = head;
            head = next;
            next = next.next;
            head.next = current;

         }

        return head;
    }

    private static void printLinkedList(Node h) {
        while (h != null){
            System.out.println(h.value);
            h = h.next;
        }
    }

}
