public class SinglyLinkedListDemo {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.print();
        list.remove(4);
        list.print();
        list.add(60);
        list.print();

//        list.print();
//        System.out.println("Is empty: " + list.empty());
//        System.out.println("Size: " + list.size());
//        System.out.println("10 inside? : " + list.contains(10));
//        System.out.println("30 inside? : " + list.contains(30));
//        System.out.println("50 inside? : " + list.contains(50));
//        System.out.println("70 inside? : " + list.contains(70));
//        list.clear();
//        System.out.println("Is empty: " + list.empty());
//        list.print();
//
//
//        list.remove(2);
//        list.print();
//
//        list.add(1, 25);
//        list.print();
    }
}
