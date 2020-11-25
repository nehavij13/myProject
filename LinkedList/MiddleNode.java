package LinkedList;

public class MiddleNode {

    Node head;  // head of list

    /* Linked list Node*/
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    public int getCount()
    {
        Node temp = head;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public int middleCount(){
        int middleCount = 0;
        int fcount = getCount();
        int s = 0;
        int l = fcount;
        getCount();
        if(fcount % 2 == 0){
            middleCount =  s+l/2 + 1;
        }else{
            middleCount = l/2 + 1;
        }
        return middleCount;
    }
    public Node middleNode() {
        int mcount = middleCount();
        Node middleNode = new Node(mcount);
        while(middleNode != null){
            middleNode = middleNode.next;
        }
        return middleNode;
    }
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }
    public static void main(String[] args) {
        /* Start with the empty list */
        MiddleNode list = new MiddleNode();

        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);

        System.out.println("\nCreated Linked list is: ");
        list.printList();

        System.out.println("Count of nodes is " + list.getCount());
        System.out.println("Count of middle node is " + list.middleCount());
        list.middleNode();
        System.out.println("\nNew Linked list is: ");
        list.printList();
    }
}
