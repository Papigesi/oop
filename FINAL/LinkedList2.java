
package Final;

public class LinkedList2 {
    private class Node
    {
        private String item;
        private Node link;

        public Node() {
            item = null;
            link = null;
        }

        public Node(String newItem, Node linkValue) {
            item = newItem;
            link = linkValue;
        }
    }

    private Node head;

    public LinkedList2() {
        head = null;
    }

    public void addToStart(String itemName) {
        head = new Node(itemName, head);
    }

    public boolean deleteHeadNode() {
        if (head != null)
        {
            head = head.link;
            return true;
        }
        else
            return false;
    }

    public int size() {
        int count = 0;
        Node position = head;
        while (position != null)
        {
            count++;
            position = position.link;
        }
        return count;
    }

    public boolean contains(String item) {
        return (find(item) != null);
    }

    private Node find(String target) {
        Node position = head;
        String itemAtPosition;
        while (position != null)
        {
            itemAtPosition = position.item;
            if (itemAtPosition.equals(target))
                return position;
            position = position.link;
        }
        return null; 
    }

    public void outputList() {
        Node position = head;
        
        while (position != null) {
            System.out.println(position.item);
            position = position.link;
        }
        System.out.println() ;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void clear() {
        head = null;
    }

    public boolean equals(Object otherObject) {
        if (otherObject == null)
            return false;
        else if (getClass( ) != otherObject.getClass( ))
            return false;
        else
        {
            LinkedList2 otherList = (LinkedList2)otherObject;
            if (size( ) != otherList.size( ))
                return false;
            Node position = head;
            Node otherPosition = otherList.head;
            while (position != null)
            {
                if ( (!(position.item.equals(otherPosition.item))))
                    return false;
                position = position.link;
                otherPosition = otherPosition.link;
            }
            return true; 
        }
    }
    
     public boolean remove(String item) {
        if (head == null) {
            return false; 
        }

        if (head.item.equals(item)) {
            head = head.link;
            return true; 
        }

        Node previous = head;
        Node current = head.link;
        while (current != null) {
            if (current.item.equals(item)) {
                previous.link = current.link;
                return true; 
            }
            previous = current;
            current = current.link;
        }
        return false; 
    }
}
