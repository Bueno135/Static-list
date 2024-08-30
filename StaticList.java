public class StaticList {
    private int[] data;
    private int size;
    private int capacity;

    public StaticList(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.data = new int[capacity];
    }

    public void clear() {
        size = 0;
    }

    public void add(int data) {
        if (!isFull()) {
            this.data[size++] = data;
        } else {
            System.out.println("Lista cheia");
        }
    }

    public void add(int data, int pos) {
        if (!isFull() && pos >= 0 && pos <= size) {
            for (int i = size; i > pos; i--) {
                this.data[i] = this.data[i - 1];
            }
            this.data[pos] = data;
            size++;
        } else {
            System.out.println("Posição inválida ou lista cheia");
        }
    }

    public int remove(int pos) {
        if (!isEmpty() && pos >= 0 && pos < size) {
            int removedData = this.data[pos];
            for (int i = pos; i < size - 1; i++) {
                this.data[i] = this.data[i + 1];
            }
            size--;
            return removedData;
        } else {
            System.out.println("Posição inválida ou lista vazia");
            return -1; 
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void setData(int data, int pos) {
        if (pos >= 0 && pos < size) {
            this.data[pos] = data;
        } else {
            System.out.println("Posição inválida");
        }
    }

    public int getData(int pos) {
        if (pos >= 0 && pos < size) {
            return this.data[pos];
        } else {
            System.out.println("Posição inválida");
            return -1; 
        }
    }

    public int getSize() {
        return size;
    }

    public int find(int data) {
        for (int i = 0; i < size; i++) {
            if (this.data[i] == data) {
                return i;
            }
        }
        return -1; 
    }
}
