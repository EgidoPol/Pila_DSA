public interface Stack<E> {
    public void push(E e) throws PilaLLenaException;
    public E pop() throws PilaVaciaException;
    public int size();
}
