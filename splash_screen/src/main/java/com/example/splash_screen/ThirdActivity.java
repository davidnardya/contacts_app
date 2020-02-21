package com.example.splash_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);

        EditText nameEditText  = findViewById(R.id.inputName);
        EditText phoneEditText  = findViewById(R.id.inputPhone);
        Intent intent = new Intent(ThirdActivity.this, SecondActivity.class);

        Bundle bundle = new Bundle();
        bundle.putString("name", nameEditText.getText().toString());
        bundle.putInt("phone", Integer.parseInt(phoneEditText.getText().toString()));

        intent.putExtra("bundle", bundle);

        Button connectButton = findViewById(R.id.connect);

        connectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(ThirdActivity.this, SecondActivity.class);
                startActivity(intent2);
                finish();
            }
        });
    }
}
