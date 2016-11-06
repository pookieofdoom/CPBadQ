package adinh03.calpoly.edu.cpbadq;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Anthony on 11/5/16.
 */

public class WaitingQueue {
   private Queue<User> mQueue;

   public WaitingQueue() {
      mQueue = new ArrayDeque<>();
   }

   public void AddToQ(User user) {
      mQueue.add(user);
   }



}
