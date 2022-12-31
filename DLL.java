import java.util.Scanner;

class doublyLinked {
    Node head = null;

    void addtoList(int val) {
        Node pos = head;
        Node n = new Node(val);
        if (pos == null) {
            head = new Node(val);
            return;
        } else {
            while (pos.next != null) {
                pos = pos.next;
            }
            pos.next = n;
            n.before = pos;
        }
    }

    void addtoFirst(int val) {
        Node pos = head;
        Node n = new Node(val);
        if (pos == null) {
            head = new Node(val);
            return;
        } else {
            n.next = head;
            head.before = n;
            head = n;
        }
    }

    void addatPos(int val, int index) {
        Node pos = head;
        Node n = new Node(val);
        int current = 2;
        if (pos == null) {
            head = new Node(val);
            return;
        } else if (index == 1) {
            n.next = head;
            head.before = n;
            head = n;
        } else {
            while (pos != null && current != index) {
                pos = pos.next;
                current++;
            }
            if (pos == null) {
                System.out.println("Enter the position to insert");
                return;
            }
            n.next = pos.next;
            n.before = pos;
            pos.next = n;
            if (n.next != null) {
                n.next.before = n;
            }
        }
    }

    void remove(int index) {
        Node pos = head;
        // Node temp = null;
        int current = 2;
        if (index == 1) {
            head = head.next;
            return;
        }
        if (pos == null) {
            System.out.println("  List Empty");
            return;
        } else {
            while (pos != null && current != index) {
                pos = pos.next;
                current++;
            }
            if (pos == null || pos.next == null) {
                System.out.println("Position not found");
                return;
            }
            if (pos.next.next != null) {
                pos.next.next.before = pos.next.before;
            }
            pos.next = pos.next.next;
        }
    }

    void display() {
        Node pos = head;
        if (pos == null) {
            System.out.println("List Empty");
            return;
        } else {
            System.out.print("List elements \n\n ------------\n\n : ");
            while (pos != null) {
                System.out.print(pos.data + " ");
                pos = pos.next;
            }
            System.out.println("\n");
        }
    }

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        doublyLinked dll = new doublyLinked();
        int option, val, index;
        do {
            System.out
                    .println(
                            "Choose from the list :\n1.Add at first\n2.Add at end\n3.Add at any position\n4.Delete an element\n5.Display List\n6.Exit");
            option = read.nextInt();
            switch (option) {
                case 2:
                    System.out.println("Enter the element to insert: ");
                    val = read.nextInt();
                    dll.addtoList(val);
                    break;
                case 1:
                    System.out.println("Enter the element to insert: ");
                    val = read.nextInt();
                    dll.addtoFirst(val);
                    break;
                case 3:
                    System.out.println("Enter position to insert: ");
                    index = read.nextInt();
                    System.out.println("Enter the element to insert: ");
                    val = read.nextInt();
                    dll.addatPos(val, index);
                    break;
                case 4:
                    System.out.println("Enter position from where u wanna delete: ");
                    val = read.nextInt();
                    dll.remove(val);
                    break;
                case 5:
                    dll.display();
                    break;
                case 6:
                    read.close();
                    System.exit(0);
                default:
                    System.out.println("Error Encountered .Pls try again !!!!!!!");
            }
        } while (true);
    }

}

class Node {
    int data;
    Node before = null;
    Node next = null;

    Node(int data) {
        this.data = data;
    }
}