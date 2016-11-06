package adinh03.calpoly.edu.cpbadq;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Anthony on 11/5/16.
 */

public class QueueViewHolder extends RecyclerView.ViewHolder {

   private TextView mPlayerOneName;
   private TextView mPLayerTwoName;

   public QueueViewHolder(View itemView) {
      super(itemView);
      mPlayerOneName = (TextView) itemView.findViewById(R.id.player1);
      mPLayerTwoName = (TextView) itemView.findViewById(R.id.player2);

   }

   public void bind(final User user) {

   }


}

