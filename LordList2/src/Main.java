public class Main {
    public static void main(String[] args) {
        List list =new List();

        list.addFirst(1);
        for (int i = 2; i < 8; i++) {
            list.addEnd(i);
        }
        list.addEnd(60000);

        list.print();

        System.out.println();
        list.reverse();

        list.print();

    }
}