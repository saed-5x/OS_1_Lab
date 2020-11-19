
import java.util.Vector;

public class Stack {

    Vector<Object> Vector ;
    private int size = 0;


    public Stack() {
       Vector =new Vector<>();


    }


    public void push(Object data){

       Vector.add(size,data);
        size++;
    }

    public Object pop(){


        Object rest = Vector.firstElement();

            Vector.removeElementAt(0);
            size--;



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
