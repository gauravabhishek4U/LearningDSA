package Arrays;

public class Main {

   public static void main(String[] args) {
        MyArray arr = new MyArray(9);

        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.insert(4);
        arr.insert(5);

      //  arr. removeAt(2);

        System.out.println(arr.min());
    }
}
