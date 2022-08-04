public class Main {
    public static void main(String[] args) {
        MagicBox<String> box1 = new MagicBox<>(3);
        box1.add("First");
        box1.add("Second");
        box1.add("Third");
        //System.out.println(box1);
        System.out.println(box1.pick());

        MagicBox<Integer> box2 = new MagicBox<>(6);
        box2.add(10);
        box2.add(20);
        box2.add(30);
        box2.add(40);

        System.out.println(box2.pick());
    }
}
