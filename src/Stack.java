
import java.util.HashMap;


public class Stack {

    HashMap<Integer,Object> hashMap ;

    private int top = -1;


    public Stack() {
       hashMap =new HashMap<>();

    }


    public void push(Object data){
        hashMap.put(++top,data);

    }

    public Object pop(){

        Object result = hashMap.get(top);
        System.out.print("this data remove from stack [  ("+top +")-->"+result+"  ]  \n");
       return hashMap.remove(top--);
    }

    public int getSize() {
        return top + 1;
    }

}
