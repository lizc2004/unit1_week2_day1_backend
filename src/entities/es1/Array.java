package entities.es1;

public class Array {
    private int[] array;

    public Array(int size) {
        this.array = new int[size];
    }

    public void fillRandom() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10) + 1;
        }
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public void set(int posizione, int valore) {
        array[posizione] = valore;  // Java lancia ArrayIndexOutOfBoundsException se fuori range
    }
}



