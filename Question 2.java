
class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
    }
}

class Stack {
    Node top;

    void push(char ch) {
        Node newNode = new Node(ch);
        newNode.next = top;
        top = newNode;
    }

    char pop() {
        char ch = top.data;
        top = top.next;
        return ch;
    }

    boolean isEmpty() {
        return top == null;
    }
}

public class Main {
    public static void main(String[] args) {

        Stack s = new Stack();

        String str = "HELLO";

        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        String reverse = "";

        while (!s.isEmpty()) {
            reverse += s.pop();
        }

        System.out.println("Reverse: " + reverse);
    }
}
