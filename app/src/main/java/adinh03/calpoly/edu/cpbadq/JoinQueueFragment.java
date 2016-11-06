package adinh03.calpoly.edu.cpbadq;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by pooki on 11/6/2016.
 */

public class JoinQueueFragment extends Fragment
{
   @Nullable
   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
   {
      View view = inflater.inflate(R.layout.fragment_join_queue, container, false);
      return view;
   }

   @Override
   public void onActivityCreated(Bundle savedInstanceState)
   {
      super.onActivityCreated(savedInstanceState);
      Bundle bundle = getArguments();
      if (bundle != null)
      {

      }
//      User currentUser = bundle.get("currentUser");
//      TextView text = (TextView) getView().findViewById(R.id.currentUser);
//      text.setText(currentUser.getFirstName() + " " + currentUser.getLastName());
   }
}
