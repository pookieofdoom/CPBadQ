package adinh03.calpoly.edu.cpbadq;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Anthony on 11/5/16.
 */

public class CourtActivity extends AppCompatActivity
{
   private TextView mOnCourt;


   private FloatingActionButton mFAB;
   private User mCurrentUser;
   private Fragment mFrag;

   @Override
   protected void onCreate(Bundle savedInstanceState)
   {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_court);
      mCurrentUser = (User) getIntent().getSerializableExtra("currentUser");
      mOnCourt = (TextView) findViewById(R.id.onCourtList);

      mFAB = (FloatingActionButton) findViewById(R.id.addButton);


      FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
      mFrag = new WaitingListFragment();
      ft.replace(R.id.joinFragment, mFrag);
      ft.commit();

      mFAB.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View view)
         {
            //mQueue.AddToQ(new User());
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            Bundle bundle = new Bundle();
            bundle.putSerializable("currentUser", mCurrentUser);
            mFrag = new JoinQueueFragment();
            mFrag.setArguments(bundle);
            ft.replace(R.id.joinFragment, mFrag);
            ft.commit();

         }
      });

   }


}
