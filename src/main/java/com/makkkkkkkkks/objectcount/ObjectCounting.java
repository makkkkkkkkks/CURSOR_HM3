package main.java.com.makkkkkkkkks.objectcount;

public class ObjectCounting {
    private static int count;

    public ObjectCounting() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
