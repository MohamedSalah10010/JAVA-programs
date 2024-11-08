package DATA_STRUCTURE_MOHAMED_SALAH;
public class Linked_List {
        // create an object of Node class represent the head of the linked list
        Node head;
      
        // static inner class
        static class Node {
          double value;      
        // connect each node to next node
          Node next;
      
          Node(double d) {
            value = d;
            next = null;
          }
        }
}
