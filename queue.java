import java.util.LinkedList;
import java.util.Queue;
class LearnQueue{
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
//        queue.offer(5);
//        queue.offer(6);
//        queue.offer(10);
//        queue.offer(4);


        System.out.println("Original Queue: "+ queue);

        System.out.println("next in line: "+queue.peek());
        System.out.println("the head which is removed is: "+ queue.poll()); //delete and return the element
        System.out.println("now queue is: "+queue);
        //for null queue .element(), and .remove() will throw an exception
        //for unsuccessful return .add() will throw an exception

    }
}