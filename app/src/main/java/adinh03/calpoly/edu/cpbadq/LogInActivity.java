package adinh03.calpoly.edu.cpbadq;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;



public class LogInActivity extends AppCompatActivity {
   Button loginButton;
   Button signupButton;
   EditText Email;
   EditText Password;

   private FirebaseAuth mFirebaseAuth;

   @Override
   protected void onCreate(@Nullable Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      // Initialize FirebaseAuth
      mFirebaseAuth = FirebaseAuth.getInstance();

      loginButton = (Button) findViewById(R.id.loginButton);
      signupButton = (Button) findViewById(R.id.signupButton);

      Email = (EditText) findViewById(R.id.email);
      Password = (EditText) findViewById(R.id.password);


      signupButton.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            Intent i = new Intent(LogInActivity.this, SignUpActivity.class);
            startActivity(i);
         }
      });
      loginButton.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            Intent i = new Intent(LogInActivity.this, MainActivity.class);
            startActivity(i);
         }
      });

   }
}

