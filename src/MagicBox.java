import java.util.Arrays;
import java.util.Random;

public class MagicBox<T> {
    protected int maxOfItems;
    protected T[] items;

    public MagicBox(int maxOfItems) {
        this.maxOfItems = maxOfItems;
        items = (T[]) new Object[maxOfItems];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        int count;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                count = items.length - i;
                throw new RuntimeException("Box is not full. Fill in " + count + " cells.");
            }
        }

        Random random = new Random();
        int randomInt = random.nextInt(items.length); // джава подберёт случайное число от 0 до ЧИСЛО невключительно
        return items[randomInt];
    }

    public String toString() {
        return Arrays.toString(items);
    }

}
