package com.example.peeps;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



import com.google.firebase.auth.FirebaseAuth;



public class RegisterActivity extends AppCompatActivity {

    EditText full_name, email, password;
    Button sign_up;
    TextView txt_log_in;

    FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        full_name =  findViewById(R.id.full_name);
        email =  findViewById(R.id.email);
        password =  findViewById(R.id.password);
        sign_up=  findViewById(R.id.sign_up);
        txt_log_in = findViewById(R.id.txt_login);

        auth = FirebaseAuth.getInstance();



    }
}