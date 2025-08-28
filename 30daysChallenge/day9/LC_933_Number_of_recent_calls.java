import java.util.LinkedList;
import java.util.Queue;

public class LC_933_Number_of_recent_calls {
static class RecentCounter {
        private Queue<Integer> q;

        public RecentCounter() {
            q = new LinkedList<>();
        }

        public int ping(int t) {
            
            q.offer(t);

         
            while (q.peek() < t - 3000) {
                q.poll();
            }

           
            return q.size();
        }
    }

    public static void main(String[] args) {
        RecentCounter counter = new RecentCounter();
        
        System.out.println(counter.ping(1));   
        System.out.println(counter.ping(100));   
        System.out.println(counter.ping(3001));  
        System.out.println(counter.ping(3002));  
    }
}
