package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    EditText name,email,password;
    Button sub;
    DatabaseReference data;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        sub = findViewById(R.id.btnSub);
        password= findViewById(R.id.password);
        data = FirebaseDatabase.getInstance().getReference().child("user");

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n, e,p;

                e= email.getText().toString();
                n= name.getText().toString();
                p = password.getText().toString();
                model m = new model(n,e,p);
                data.child(p).setValue(m);
            }
        });

    }
}