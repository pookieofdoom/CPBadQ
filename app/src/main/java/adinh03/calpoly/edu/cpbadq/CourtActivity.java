package adinh03.calpoly.edu.cpbadq;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by Anthony on 11/5/16.
 */

public class CourtActivity extends AppCompatActivity
{

   private int numWaiting = 0;
   //private ArrayList<User> onCourt;
   //private ArrayList<User> waitingList;
   private RecyclerView waitingList;
   @Override
   protected void onCreate(@Nullable Bundle savedInstanceState)
   {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_court);
   }





}
