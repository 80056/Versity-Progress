import java.util.*;
public class QueueDqueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Karen");
        queue.offer("chad");
        queue.offer("steve");
        queue.offer("Harold");

        System.out.println(queue);

        //queue.remove();
        queue.poll();
        queue.poll();

        System.out.println(queue.isEmpty());

        System.out.println(queue.size());

        System.out.println(queue.contains("harold"));

        System.out.println(queue.peek());

        System.out.println(queue.element());


        System.out.println(queue);
    }
}
