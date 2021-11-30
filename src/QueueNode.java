public class QueueNode <T>{

    private T data;
    private QueueNode <T> next;

    /**
     * Constructor
     */
    public QueueNode(T data) {
        this.data = data;
    }

    /**
     * Constructor
     */
    public QueueNode(T data, QueueNode<T> next) {
        this.data = data;
        this.next = next;
    }

    /**
     * Getter for data
     */
    public T getData() {
        return data;
    }

    /**
     * Setter for data
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Getter for next
     */
    public QueueNode<T> getNext() {
        return next;
    }

    /**
     * Setter for next
     */
    public void setNext(QueueNode<T> next) {
        this.next = next;
    }
}
