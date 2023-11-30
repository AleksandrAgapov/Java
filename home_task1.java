
import java.util.LinkedList;

// import javax.imageio.plugins.tiff.TIFFTag;



class MyQueue {

private LinkedList<Integer> elements = new LinkedList<>();
    
public MyQueue() {
}

public MyQueue(LinkedList<Integer> elements) {
    this.elements = elements;
}

public void enqueue(Integer element){
    elements.add(element);
}

public Integer dequeue(){
    Integer first = elements.getFirst();
    elements.removeFirst();
    return first;
}

public Integer first(){
    return elements.getFirst();
}

public LinkedList<Integer> getElements() {
    return elements;
}

public void setElements(LinkedList<Integer> elements) {
    this.elements = elements;
}
}




public class home_task1 {
    public static void main(String[] args) {
        MyQueue  queue; 
        queue = new MyQueue();

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}




