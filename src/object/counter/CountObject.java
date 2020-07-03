package object.counter;

public class CountObject {
    private static int count;

    public CountObject() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
