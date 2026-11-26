
// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack class
class Stack {

    Node top;
    int count;

    // Push operation
    void push(int data) {
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;

        count++;
        System.out.println(data + " inserted");
    }

    // Pop operation
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int removed = top.data;
        top = top.next;

        count--;

        System.out.println(removed + " removed");
        return removed;
    }

    // Peek operation
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return top.data;
    }

    // Check whether stack is empty
    boolean isEmpty() {
        return top == null;
    }

    // Return stack size
    int size() {
        return count;
    }

    // Display stack elements
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.print("Stack: ");
        s.display();

        System.out.println("Peek: " + s.peek());

        s.pop();

        System.out.print("Stack: ");
        s.display();

        System.out.println("Size: " + s.size());

        System.out.println("Is Empty: " + s.isEmpty());

        s.pop();
        s.pop();

        System.out.println("Is Empty: " + s.isEmpty());

        s.pop();
    }
}
