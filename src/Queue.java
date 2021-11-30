public class Queue <T>{

    QueueNode<T> first;
    QueueNode<T> last;
    int size;

    /**
     * Creates a new Queue
     */
    public Queue() {
        size = 0;
    }

    /**
     * Adds an element to the queue
     */
    void Enqueue(T element){
        QueueNode<T> node = new QueueNode<>(element);
        if(size == 0) first = node;
        else last.setNext(node);
        last = node;
    }

    /**
     * Removes an element from the queue
     * @return the element removed
     */
    T dequeue(){
        T returnVal = first.getData();
        first = first.getNext();
        return returnVal;
    }

    /**
     * @return if the queue is empty
     */
    boolean isEmpty(){
        return size == 0;
    }

    /**
     * @return size of the queue
     */
    int size(){
        return size;
    }

    /**
     * @return first element from the queue
     */
    T peek(){
        return first.getData();
    }

}
