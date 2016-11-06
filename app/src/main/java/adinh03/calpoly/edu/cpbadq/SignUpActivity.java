package adinh03.calpoly.edu.cpbadq;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class SignUpActivity extends AppCompatActivity
{
   private Button mSignUpButton;
   private EditText mEmail;
   private EditText mPassword, mConfirmPass, mFirstName, mLastName;
   private DatabaseReference mRef;
   private User mUser;
   private RadioGroup mRadioGrup;
   private RadioButton mBeginner, mAdvance;
   private int mSkillLevel;

   private FirebaseAuth mFirebaseAuth;

   @Override
   protected void onCreate(@Nullable Bundle savedInstanceState)
   {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_sign_up);

      // Initialize FirebaseAuth
      mFirebaseAuth = FirebaseAuth.getInstance();
      mRef = FirebaseDatabase.getInstance().getReference("users");
      mSignUpButton = (Button) findViewById(R.id.signUpButton);

      mEmail = (EditText) findViewById(R.id.email);
      mPassword = (EditText) findViewById(R.id.password);
      mConfirmPass = (EditText) findViewById(R.id.confirmPassword);
      mFirstName = (EditText) findViewById(R.id.firstName);
      mLastName = (EditText) findViewById(R.id.lastName);
      mRadioGrup = (RadioGroup) findViewById(R.id.skillLevel);
      mBeginner = (RadioButton) findViewById(R.id.beginner);
      mAdvance = (RadioButton) findViewById(R.id.advance);

      mRadioGrup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
      {
         @Override
         public void onCheckedChanged(RadioGroup radioGroup, int i)
         {
            if (i == R.id.beginner)
            {
               mSkillLevel = 1;
            }
            else if (i == R.id.advance)
            {
               mSkillLevel = 2;
            }
         }
      });


      mSignUpButton.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View view)
         {
            String getEmail = mEmail.getText().toString();
            String getPassword = mPassword.getText().toString();
            String getConfirm = mConfirmPass.getText().toString();
            getEmail = getEmail.trim();
            getPassword = getPassword.trim();
            getConfirm = getConfirm.trim();
            if (getEmail.isEmpty() || getPassword.isEmpty() || getEmail == null
                  || getPassword == null || !getConfirm.equals(getPassword))
            {
               AlertDialog.Builder builder = new AlertDialog.Builder(SignUpActivity.this);
               builder.setMessage("Please enter a valid email and password")
                     .setTitle("Error")
                     .setPositiveButton("Okay", null);
               AlertDialog dialog = builder.create();
               dialog.show();
            }
            else
            {
               mFirebaseAuth.createUserWithEmailAndPassword(getEmail, getPassword)
                     .addOnCompleteListener(SignUpActivity.this, new
                           OnCompleteListener<AuthResult>()
                           {
                              @Override
                              public void onComplete(@NonNull Task<AuthResult> task)
                              {
                                 if (task.isSuccessful())
                                 {
                                    String userId = task.getResult().getUser().getUid();
                                    mUser = new User(mEmail.getText().toString().trim(), mFirstName
                                          .getText().toString().trim(),
                                          mLastName.getText().toString().trim(), mSkillLevel);

                                    Log.d("DEUBG", userId);
                                    mRef.child(userId).child("First " +
                                          "Name").setValue(mFirstName.getText().toString().trim());
                                    mRef.child(userId).child("Last " +
                                          "Name").setValue(mLastName.getText().toString().trim());
                                    mRef.child(userId).child("Skill " +
                                          "Level").setValue(mSkillLevel);
                                    Intent i = new Intent(SignUpActivity.this, LogInActivity.class);
                                    startActivity(i);
                                 }
                                 else
                                 {
                                    android.app.AlertDialog.Builder builder = new android.app
                                          .AlertDialog.Builder(SignUpActivity.this);
                                    builder.setMessage(task.getException().getMessage())
                                          .setTitle("Login Failed")
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