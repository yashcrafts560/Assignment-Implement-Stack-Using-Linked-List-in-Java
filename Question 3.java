
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

        String str = "madam";

        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        String reverse = "";

        while (!s.isEmpty()) {
            reverse += s.pop();
        }

        if (str.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
