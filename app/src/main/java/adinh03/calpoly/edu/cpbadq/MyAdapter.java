package adinh03.calpoly.edu.cpbadq;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/**
 * Created by Anthony on 11/5/16.
 */

public class MyAdapter extends RecyclerView.Adapter<QueueViewHolder>
{
   private WaitingQueue mQueue;

   public MyAdapter(WaitingQueue q)
   {
      mQueue = q;
   }

   @Override
   public QueueViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
   {
      return new QueueViewHolder(LayoutInflater.from(parent.getContext()).inflate(viewType,
            parent, false));
   }

   @Override
   public void onBindViewHolder(QueueViewHolder holder, int position)
   {


   }

   @Override
   public int getItemCount()
   {
      return 0;
   }
}
