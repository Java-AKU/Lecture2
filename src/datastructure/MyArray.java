package datastructure;

public class MyArray {
    // variables
    private int[] array;

    // constructor
    public MyArray() {
        array = new int[0];
    }

    // methods
    // add an element to the end of the array
    public void add(int e) {
        // create a new temporary array of size 1 larger than the current array
        int[] temp = new int[array.length + 1];

        // copy the current array into the temporary array
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }

        // add the new element to the end of the temporary array
        temp[temp.length - 1] = e;

        // copy the temporary array into the current array
        array = temp;
    }

    // print the array
    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
}
