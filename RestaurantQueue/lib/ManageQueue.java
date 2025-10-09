package lib;

import java.util.*;

public class ManageQueue {
    DatafileQueue queue=new DatafileQueue();
    public void addQueue()
    { queue.addqueue();

    }
    public void deleteQueue(int q)
    {
      queue.delete(q);
    }
    public void clearQueue()
    {
      queue.clear();
    }
    public List<String> findQueue(int q)
    {
       return queue.findQueue(q);
    }
    public List<String> showQueue()
    {
    return queue.Showallqueue();
    }
}
