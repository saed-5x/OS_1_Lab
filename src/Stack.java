
import java.util.Vector;

public class Stack {

    Vector<Object> Vector ;
    private int size = 0;
    private int top;


    public Stack() {
       Vector =new Vector<>();
       top = -1;
    }


    public void push(Object data){
       Vector.add(size,data);

       size++;

    }

    public Object pop(){
        Object result = Vector.firstElement();
        Vector.removeElement(Vector.firstElement());
        System.out.print("this data remove from stack [  ("+size +")-->"+result+"  ]  \n");

        size--;
        return result;
    }

    public int getSize() {
        return size;
    }

}
