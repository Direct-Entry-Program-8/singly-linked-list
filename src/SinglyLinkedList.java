public class SinglyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public void add(int value){
        if (head == null){
            head = new Node(value, null);
            tail = head;
        }else{
            tail.next = new Node(value, null);
            tail = tail.next;
//            Node temp = head;
//            while (temp.next != null){
//                temp = temp.next;
//            }
//            temp.next = new Node(value, null);;
        }
        size++;
    }

    public void add(int index, int value){}

    public void remove(int index){}

    public int get(int index){
        if (index < 0 || index >= size) throw new ArrayIndexOutOfBoundsException("Invalid index");

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.value;
    }

    public void clear(){}

    public boolean contains(int value){return true;}

    public boolean empty(){return true;}

    public int size(){return size;}

    public void print(){
        StringBuilder sb = new StringBuilder("[");
        Node temp = head;

        while (temp != null){
            sb.append(temp.value);
            sb.append(",");
            temp = temp.next;
        }

        sb.replace(sb.length()-1, sb.length(), "]");
        System.out.println(sb.toString());
    }

    class Node{
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
