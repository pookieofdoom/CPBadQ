package adinh03.calpoly.edu.cpbadq;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by pooki on 11/6/2016.
 */

public class WaitingListFragment extends Fragment
{
   private RecyclerView mRecylerView;
   private MyAdapter adapter;
   private WaitingQueue mQueue;
   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
   {
      View view = inflater.inflate(R.layout.fragment_waiting_list, container, false);
      return view;
   }

   @Override
   public void onActivityCreated(@Nullable Bundle savedInstanceState)
   {
      super.onActivityCreated(savedInstanceState);
      mRecylerView = (RecyclerView) getView().findViewById(R.id.waitingList);
      mRecylerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL,
            false));
      adapter = new MyAdapter(mQueue);


   }
}
