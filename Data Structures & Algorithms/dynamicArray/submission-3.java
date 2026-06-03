class DynamicArray {

    int[] array;
    int length;
    int capacity;

    public DynamicArray(int capacity) {
        array = new int[capacity];
        length = 0;
        this.capacity = capacity;
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }

    public void pushback(int n) {

        if(length == capacity){
            resize();
        }

        array[length] = n;
        length++;
    }

    public int popback() {
        if(length > 0){
            length--;
        }
       return array[length];
    }

    private void resize() {
        capacity = capacity *2;
        int[] newArray = new int[capacity];

        for(int i = 0; i < length; i++){
            newArray[i] = array[i];
        }

        this.array = newArray;
    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return capacity;
    }
}
