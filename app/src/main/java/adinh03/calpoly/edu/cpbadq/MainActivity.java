package adinh03.calpoly.edu.cpbadq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



   /* life cycles for activitis


      onCreate

      onStart - visible (onRestart starts here)

      onResume -foreground

      onPause - background

      onStop - not visible

      on Destroy



    */

   Button court1Button;
   Button court2Button;
   Button court3Button;
   TextView count1;
   TextView count2;
   TextView count3;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

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
}
