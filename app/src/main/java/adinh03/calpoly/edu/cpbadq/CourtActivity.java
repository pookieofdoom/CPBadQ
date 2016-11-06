package adinh03.calpoly.edu.cpbadq;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Anthony on 11/5/16.
 */

public class CourtActivity extends AppCompatActivity
{
   private TextView mOnCourt;
   private RecyclerView mRecylerView;
   private MyAdapter adapter;
   private WaitingQueue mQueue;
   private FloatingActionButton mFAB;

   @Override
   protected void onCreate(Bundle savedInstanceState)
   {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_court);

      mOnCourt = (TextView) findViewById(R.id.onCourtList);
      mRecylerView = (RecyclerView) findViewById(R.id.waitingList);
      mFAB = (FloatingActionButton) findViewById(R.id.addButton);
      mRecylerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
      adapter = new MyAdapter(mQueue);

      mFAB.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            mQueue.AddToQ(new User());
         }
      });

   }





}
