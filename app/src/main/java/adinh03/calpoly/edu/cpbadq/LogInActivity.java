package adinh03.calpoly.edu.cpbadq;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;



public class LogInActivity extends AppCompatActivity {
   Button loginButton;
   Button signupButton;
   EditText email;
   EditText password;

   private FirebaseAuth mFirebaseAuth;

   @Override
   protected void onCreate(@Nullable Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_log_in);

      // Initialize FirebaseAuth
      mFirebaseAuth = FirebaseAuth.getInstance();

      loginButton = (Button) findViewById(R.id.loginButton);
      signupButton = (Button) findViewById(R.id.signUpButton);

      email = (EditText) findViewById(R.id.email);
      password = (EditText) findViewById(R.id.password);


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
            String getEmail = email.getText().toString();
            String getPassword = password.getText().toString();
            getEmail = getEmail.trim();
            getPassword = getPassword.trim();
            if (getEmail.isEmpty() || getPassword.isEmpty() || getEmail == null || getPassword == null) {
               AlertDialog.Builder builder = new AlertDialog.Builder(LogInActivity.this);
               builder.setMessage("Please enter your valid email and password")
                       .setTitle("Error")
                       .setPositiveButton("Okay", null);
               AlertDialog dialog = builder.create();
               dialog.show();

            } else {
               mFirebaseAuth.signInWithEmailAndPassword(getEmail, getPassword)
                       .addOnCompleteListener(LogInActivity.this, new OnCompleteListener<AuthResult>() {
                          @Override
                          public void onComplete(@NonNull Task<AuthResult> task) {
                             if (task.isSuccessful()) {
                                Intent i = new Intent(LogInActivity.this, MainActivity.class);
                                startActivity(i);
                             } else {
                                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(LogInActivity.this);
                                builder.setMessage(task.getException().getMessage())
                                        .setTitle("Incorrect Login")
                                        .setPositiveButton(android.R.string.ok, null);
                                android.app.AlertDialog dialog = builder.create();
                                dialog.show();
                             }
                          }
                       });
            }
         }
      });

   }
}



