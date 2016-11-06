package adinh03.calpoly.edu.cpbadq;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

   Button court1Button;
   Button court2Button;
   Button court3Button;
   TextView count1;
   TextView count2;
   TextView count3;
   private FirebaseAuth mFirebaseAuth;
   private FirebaseUser mFirebaseUser;
   private User mUser;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      // Initialize Firebase Auth
      mFirebaseAuth = FirebaseAuth.getInstance();
      mFirebaseUser = mFirebaseAuth.getCurrentUser();

      if (mFirebaseUser == null) {
         // Not logged in, launch the Log In activity
         LoadLogInView();
      }


      court1Button = (Button) findViewById(R.id.court1Button);
      court2Button = (Button) findViewById(R.id.court2Button);
      court3Button = (Button) findViewById(R.id.court3Button);

      count1 = (TextView) findViewById(R.id.count1);
      count2 = (TextView) findViewById(R.id.count2);
      count3 = (TextView) findViewById(R.id.count3);


      court1Button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            Intent i = new Intent(MainActivity.this, CourtActivity.class);
            startActivity(i);
         }
      });

      court2Button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            Intent i = new Intent(MainActivity.this, CourtActivity.class);
            i.putExtra("CurrentUser", mFirebaseUser.getEmail());
            startActivity(i);
         }
      });

      court3Button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            Intent i = new Intent(MainActivity.this, CourtActivity.class);
            startActivity(i);
         }
      });


   }

   private void LoadLogInView() {
      Intent intent = new Intent(this, LogInActivity.class);
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
      startActivity(intent);
   }
}
