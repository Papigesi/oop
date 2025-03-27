
package Final;

import Final.MyLinkedList.Node;
import java.util.Stack;

public class Main {
        public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addtoStart("1");
        list.addtoStart("2");
        list.addtoStart("3");
        list.addtoStart("4");
        list.addtoStart("5");

        list.remove(2);

        list.printOut();

        Stack<String> stack = new Stack<>();
        Node current = list.head;

        while (current != null) {
            stack.push(current.item);
            current = current.next;
        }

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
