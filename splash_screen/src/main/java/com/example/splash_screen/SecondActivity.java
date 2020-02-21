package com.example.splash_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        TextView presentName = findViewById(R.id.helloName);
        TextView presentPhone = findViewById(R.id.helloPhone);


        Bundle bundle = getIntent().getBundleExtra("bundle");

        User user = new User();
        user.name = getIntent().getBundleExtra("bundle").getString("name");
        user.phone = getIntent().getBundleExtra("bundle").getInt("phone");

        presentName.setText(user.name);
        presentPhone.setText(user.phone);


    }

    int counter = 0;
    public void onBackPressed(){
        Toast.makeText(this, "Click again to exit", Toast.LENGTH_SHORT).show();
        counter++;
        if (counter == 2){
            super.onBackPressed();
        }
    }
}
