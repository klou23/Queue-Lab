public class QueueNode <T>{

    T data;
    QueueNode <T> next;

    public QueueNode(T data) {
        this.data = data;
    }

    public QueueNode(T data, QueueNode<T> next) {
        this.data = data;
        this.next = next;
    }
}
