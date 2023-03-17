
public class List {
    private Node head;
    private Node tail;

    public List(){
        head = null;
        tail = null;
    }
    private boolean isEmpty(){
        return head == null;
    }
    public void addEnd(int data){
        Node temp = new Node(data);
        if(isEmpty()){
            head = temp;
        }
        else {
            tail.next = temp;
            temp.prev = tail;
        }
        tail = temp;


    } public static void swap(Node node){
        Node prev = node.prev;
        node.prev = node.next;
        node.next = prev;
    }
    public  void reverse()
    {
        Node prev = null;
        Node curr = head;

        while (curr != null)
        {
            swap(curr);
            prev = curr;
            curr = curr.prev;
        }

        if (prev != null) {
            head = prev;
        }


    }

    public void addFirst(int data){
        Node temp = new Node(data);

        if(isEmpty()){
            tail = temp;

        }
        else {
            head.prev = temp;

        temp.next = head;
        head = temp; }
    }
    public void removeEnd(){

        if(head.next == null){
            tail = null;
        }
        else {
            tail.prev.next = null;
            tail = tail.prev;
        }
    }
    public void removeFirst(){

        if(head.next == null){
            tail = null;
        }
        else {
            head.next.prev = null;
            head = head.next;
        }
    }
    public void addByIndox (int data, int index){
        Node cur = head;
        int c = 0 ;

        while (cur != null && c != index){
            cur = cur.next;
            c++;
        }

        Node temp = new Node(data);

        cur.prev.next = temp;
        temp.prev = cur.prev;
        cur.prev = temp;
        temp.next = cur;


    }

    public void print(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data);
            System.out.print( " -> ");
            temp = temp.next;
        }
    }




}
