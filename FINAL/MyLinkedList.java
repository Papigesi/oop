
package Final;

public class MyLinkedList {
    
    public MyLinkedList() {
    head = tail = null;
    }
 
    Node head; 
    Node tail;

    class Node {
    String item; 
    Node next; 
    Node prev;
    }
    
    public void addtoStart(String addItem) {
        Node theNode = new Node();
        theNode.item = addItem;
        theNode.next = head;
        theNode.prev = null;

        if (head != null) {
            head.prev = theNode;
        } else {
            tail = theNode;
        }
        head = theNode;
    }

    public String getElement(int number) {
        Node current = head;
        int index = 0;

        while (current != null) {
            if (index == number) {
                return current.item;
            }
            current = current.next;
            index++;
        }
        return null;
    }

    public Node removeHead() {
        if (head == null) {
            System.out.println("List is empty!") ;
        }

        Node removedNode = head;
        head = head.next;

        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        return removedNode;
    }

    public Node removeLast() {
        if (tail == null) {
            System.out.println("List is empty!") ;
        }

        Node removedNode = tail;
        tail = tail.prev;

        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        return removedNode;
    }

    public Node remove(int number2) {
        if (number2 < 0) {
            System.out.println("Index cannot be negative!!") ;
        }

        if (number2 == 0) {
            return removeHead();
        }

        Node current = head;
        int index = 0;

        while (current != null) {
            if (index == number2) {
                Node prevNode = current.prev;
                Node nextNode = current.next;

                if (prevNode != null) {
                    prevNode.next = nextNode;
                }

                if (nextNode != null) {
                    nextNode.prev = prevNode;
                }
                return current;
            }
            current = current.next;
            index++;
        }
        return null;
    }

    public void printOut() {
        Node current = head;

        while (current != null) {
            System.out.println(current.item);
            current = current.next;
        }
    }
}


