public class StackImple<E> implements Stack<E> {
    private E [] stck;
    int posicion = 0;

    public StackImple(int tamaño)
    {
        stck = (E[])new Object[tamaño];
    }

    @Override
    public E pop() throws PilaVaciaException{
        if(posicion > 0)
        {
            E ultima = stck[posicion];
            stck[posicion-1] = null;
            posicion--;
            return ultima;
        }
        else
        {
        throw new PilaVaciaException();
        }
    }

    @Override
    public void push(E e) throws PilaLLenaException{
        if(posicion + 1 < stck.length) {
            stck[posicion + 1] = e;
            posicion++;
        }
        else
        {
            throw new PilaLLenaException();
        }

    }

    @Override
    public int size() {
        return posicion + 1;
    }
}
