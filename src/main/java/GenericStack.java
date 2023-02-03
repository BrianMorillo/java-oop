import java.util.ArrayList;

/**
 * @author Brian Morillo
 * Represents a generic stack that inherits the ArrayList class
 * Date: 7/13/2022
 * @param <E> Generic data type
 */
public class GenericStack<E> extends ArrayList<E> {
    /**
     * Returns the size of the Stack
     * @return size(integer)
     */
    public int getSize(){
        return size();
    }

    /**
     * Returns peeks the stack
     * @return last added object(E)
     */
    public E peek(){
        return get(getSize()-1);
    }

    /**
     * Pushes a new object into the stack
     * @param o object(E) to be added
     */
    public void push(E o){
        add(o);
    }

    /**
     * Removes the stack's last added object(E)
     * @return stack's last added object(E)
     */
    public E pop(){
        E o = get(getSize()-1);
        remove(getSize()-1);
        return o;
    }

    /**
     * Returns the stack's description
     * @return stack's description(String)
     */
    @Override
    public String toString(){
        return "Stack: " + super.toString();
    }
}
