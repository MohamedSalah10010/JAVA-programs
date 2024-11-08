package DATA_STRUCTURE_MOHAMED_SALAH;
import DATA_STRUCTURE_MOHAMED_SALAH.LLqueue.Queue;

public class linked_test {/*/
    public static void main(String[] args)
	{
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.dequeue();
		q.dequeue();
		q.enqueue(30.20);
		q.enqueue(65.3);
		q.enqueue(10.20);
		q.enqueue(50.99);
		q.dequeue();
		System.out.println("Queue Front : " + q.front.value);
		System.out.println("Queue Rear : " + q.rear.value);
	}
}
 */

    public static void main(String[] args) {
        Linked_List linkedList = new Linked_List();

        // assign values to each linked list node
        linkedList.head = new Node(20);
        Node second = new Node(30);
        Node third = new Node(50.30);
    
        // connect each node of linked list to next node
        linkedList.head.next = second;
        second.next = third;
    
        // printing node-value
        System.out.print("\n \nLinkedList: ");
        while (linkedList.head != null) {
          System.out.print(linkedList.head.value + " ");
          linkedList.head = linkedList.head.next;
          System.out.println();
        }
    }
  }

