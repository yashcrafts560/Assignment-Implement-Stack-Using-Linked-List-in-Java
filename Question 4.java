
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class Stack {
    Node top;

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    int pop() {
        int value = top.data;
        top = top.next;
        return value;
    }

    boolean isEmpty() {
        return top == null;
    }

    void display() {
        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Stack s1 = new Stack();
        Stack s2 = new Stack();

        s1.push(10);
        s1.push(20);
        s1.push(30);

        System.out.println("Original Stack:");
        s1.display();

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        System.out.println("Reversed Stack:");
        s2.display();
    }
}
