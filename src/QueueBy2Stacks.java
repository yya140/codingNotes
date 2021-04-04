import java.sql.SQLOutput;
import java.util.LinkedList;

public class QueueBy2Stacks {
    private LinkedList<Integer> in;
    private LinkedList<Integer> out;

    public QueueBy2Stacks() {
        in = new LinkedList<>();
        out = new LinkedList<>();
    }

    public Integer poll() {
        move();
        return out.isEmpty() ? null : out.pollFirst();
    }

    public void offer(int element) {
        in.offerFirst(element);
    }

    public Integer peek() {
        move();
        return out.isEmpty()? null : out.peekFirst();
    }

    public int size() {
        return in.size()+out.size();
    }

    // im.size()
    public boolean isEmpty() {
        if (in.isEmpty() && out.isEmpty()){
            return true;
        }
        return false;
    }

    private void move(){
        if (out.isEmpty()){
            while(!in.isEmpty()){
                out.offerFirst(in.pollFirst());
            }
        }
    }

    public static void main(String[] arg){
        QueueBy2Stacks a = new QueueBy2Stacks();
        a.offer(1);
        a.offer(2);
        a.offer(3);
        a.offer(4);
        System.out.println(a.size());
        System.out.println(a.peek());
        System.out.println(a.isEmpty());
        System.out.println(a.poll());
    }
}