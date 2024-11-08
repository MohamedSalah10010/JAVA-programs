package DATA_STRUCTURE_MOHAMED_SALAH;
import DATA_STRUCTURE_MOHAMED_SALAH.Linked_List.*;
public class LLstack {
        private Node head; // the first node
        public LLstack() {
            head = null;
        }
     
        // Remove value from the beginning of the list for demonstrating behaviour of stack
        public double pop(){
            if (head == null) {
                return 0;
            }
            double value = head.value;
            head = head.next;
            return value;
        }
     
        // Add value to the beginning of the list for demonstrating behaviour of stack
        public void push(double value) {
            Node oldHead = head;
            head = new Node(value);
            head.value = value;
            head.next = oldHead;
        }
        public static void printList(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.format("%.2f ", temp.value);
                temp = temp.next;
            }
            System.out.println();
        }
     /*
        public static void main(String args[])
        {
            LLstack lls=new LLstack();
            lls.push(20);
            lls.push(50);
            lls.push(80);
            lls.push(40);
            lls.push(60);
            lls.push(75);
            System.out.println("Element removed from LinkedList: "+lls.pop());
            System.out.println("Element removed from LinkedList: "+lls.pop());
            lls.push(10);
            System.out.println("Element removed from LinkedList: "+lls.pop());
            System.out.println();
            printList(lls.head);
        }
        
    }
         

*/