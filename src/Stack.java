
import java.util.Vector;

public class Stack {

    Vector<Object> Vector ;
    private int size = 0;

    public Stack() {
       Vector =new Vector<Object>(4);
    }

    public void push(Object data){
        Object add = Vector.add(data);
        size++;
    }

    public Object pop(){


            Object rest = Vector.firstElement();
        if(!Vector.isEmpty()){
            Vector.remove(0);
            size--;

        }

        return rest;

    }

    public int getSize() {
        return size;
    }
    public boolean isEmpty(){
        Vector.isEmpty();
        return true;

    }

}
