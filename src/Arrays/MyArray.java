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

    public int indexOf(int value){
        // Linear Search
        for(int i=0; i < this.currentIndex; i++){
            if(this.items[i] == value)
                return i;
        }
        return -1;
    }

    public void removeAt(int index){
        if(index >= this.currentIndex) throw new IllegalArgumentException();
        for(int i = index; i <= this.currentIndex-2; i++){
            this.items[i] = this.items[i+1];

            currentIndex--;
            this.items[currentIndex] = 0;
        }
    }

    public int max(){
        int result = this.items[0];
        for(int i=0; i<this.currentIndex; i++){
            if(items[i] > result)
                result = items[i];
        }
        return result;
    }

    public int min(){
        int result = this.items[0];
        for(int i=0; i<this.currentIndex; i++){
            if(items[i] < result)
                result=items[i];
        }
        return result;
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("[");
        for(int i=0; i<this.currentIndex; i++){
            str.append(this.items[i]).append(", ");
        }
        str.append("\b").append("\b").append("]");
        return str.toString();
    }
}
