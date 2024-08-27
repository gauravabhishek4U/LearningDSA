package Arrays;

public class MyArray {

    private int[] items;
    private int currentIndex;

    public MyArray(int initialSize) {
        this.items = new int[initialSize];
        this.currentIndex=0;
    }

    public void insert(int value){
        this.items[currentIndex]=value;
        currentIndex++;
    }
}
