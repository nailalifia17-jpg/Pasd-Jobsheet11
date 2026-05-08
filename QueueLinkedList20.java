public class QueueLinkedList20 {
    Node20 front, rear;
    int size;

    boolean isEmpty() {
        return front == null;
    }

    boolean isFull() {
        return false;
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    void enqueue(MahasiswaAntrian20 data) {
        Node20 newNode = new Node20(data, null);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(data.nama + " masuk antrian");
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Memanggil:");
            front.data.tampil();
            front = front.next;
            size--;

            if (front == null) {
                rear = null;
            }
        }
    }

    void peekFront() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan:");
            front.data.tampil();
        }
    }

    void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian terakhir:");
            rear.data.tampil();
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            Node20 temp = front;
            System.out.println("Isi antrian:");
            while (temp != null) {
                temp.data.tampil();
                temp = temp.next;
            }
        }
    }

    void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa mengantre: " + size);
    }
}
