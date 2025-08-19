public class DashboardDataProjectedUtil {
    public static void main(String[] args) {
       Node node=new Node(1);
       Node node1=new Node(2);
       Node node2=new Node(3);
       Node node3=new Node(4);
       Node node4=new Node(5);
       node.next=node1;
       node1.next=node2;
       node2.next=node3;
       node3.next=node4;

      // printLinkedList(node);
       // Node node5 = reverseALinkedList(node);
        Node node6 = returnNthFromLast(node, 3);
        System.out.println(node6.data);
       // printLinkedList(node6);
    }

    public static Node returnNthFromLast(Node head,int n){
        Node cur=head;
        Node nthNode=head;
        int i=0;
        while(i<n){
            nthNode=nthNode.next;
            i++;
        }
        while(nthNode!=null){
            nthNode=nthNode.next;
            cur=cur.next;
        }
        return cur;
    }

    public static void printLinkedList(Node head){
        while (head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static Node reverseALinkedList(Node head){
        Node next=null;
        Node cur=head;
        Node temp=null;
        while(cur!=null){
            temp=cur.next;
            cur.next=next;
            next=cur;
            cur=temp;

        }
        return next;
    }

}