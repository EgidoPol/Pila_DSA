
    public class Stack_Test {

        public static void main(String[] args)
        {
            StackImple<Integer> s = new StackImple(1);
            try {
                s.push(5);
                System.out.println("El elemento ha sido añadido correctamente.");
            }
            catch (PilaLLenaException e)
            {
                System.out.println("ERROR: La pila está llena.");
            }
            try {
                int Valor = s.pop();
                System.out.println("El elemento: " + Valor + " ha sido retirado con éxito.");
            }
            catch (PilaVaciaException e)
            {
                System.out.println("ERROR: La pila está vacia.");
            }
            System.out.println("El tamaño de la pila es de " + s.size() + " elemento.");
        }
    }
