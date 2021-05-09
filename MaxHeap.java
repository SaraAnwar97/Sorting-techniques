public class MaxHeap {
    private int[] Heap;
    private int size;
    private int maxsize;

    public MaxHeap(int maxsize) {
        this.maxsize = maxsize;
        this.size = 0;
        this.Heap = new int[this.maxsize + 1];
        this.Heap[0] = 2147483647;
    }

    private int parent(int pos) {
        return pos / 2;
    }

    private int leftChild(int pos) {
        return 2 * pos;
    }

    private int rightChild(int pos) {
        return 2 * pos + 1;
    }

    private boolean isLeaf(int pos) {
        return pos >= this.size / 2 && pos <= this.size;
    }

    private void swap(int fpos, int spos) {
        int tmp = this.Heap[fpos];
        this.Heap[fpos] = this.Heap[spos];
        this.Heap[spos] = tmp;
    }

    private void maxHeapify(int pos) {
        if (!this.isLeaf(pos)) {
            if (this.Heap[pos] < this.Heap[this.leftChild(pos)] || this.Heap[pos] < this.Heap[this.rightChild(pos)]) {
                if (this.Heap[this.leftChild(pos)] > this.Heap[this.rightChild(pos)]) {
                    this.swap(pos, this.leftChild(pos));
                    this.maxHeapify(this.leftChild(pos));
                } else {
                    this.swap(pos, this.rightChild(pos));
                    this.maxHeapify(this.rightChild(pos));
                }
            }

        }
    }

    private void insert(int element) {
        this.Heap[++this.size] = element;

        for(int current = this.size; this.Heap[current] > this.Heap[this.parent(current)]; current = this.parent(current)) {
            this.swap(current, this.parent(current));
        }

    }

    public void print() {
        for(int i = 1; i <= this.size / 2; ++i) {
            System.out.print(" PARENT : " + this.Heap[i] + " LEFT CHILD : " + this.Heap[2 * i] + " RIGHT CHILD :" + this.Heap[2 * i + 1]);
            System.out.println();
        }

    }

    public int extractMax() {
        int popped = this.Heap[1];
        this.Heap[1] = this.Heap[this.size--];
        this.maxHeapify(1);
        return popped;
    }

    public MaxHeap buildMaxHeap(int[] unsorted) {
        MaxHeap maxHeap = new MaxHeap(unsorted.length);

        for(int i = 0; i < unsorted.length; ++i) {
            maxHeap.insert(unsorted[i]);
        }

        return maxHeap;
    }
}
