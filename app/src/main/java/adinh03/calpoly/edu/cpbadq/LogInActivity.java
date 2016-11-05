package adinh03.calpoly.edu.cpbadq;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by Anthony on 11/5/16.
 */

public class LogInActivity extends AppCompatActivity {

   private FirebaseAuth mFirebaseAuth;

   @Override
   protected void onCreate(@Nullable Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      // Initialize FirebaseAuth
      mFirebaseAuth = FirebaseAuth.getInstance();


   }
}


