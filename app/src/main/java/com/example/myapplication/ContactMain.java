package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class ContactMain extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);

        final Button submit = findViewById(R.id.Submit);
        final EditText fNameField = findViewById(R.id.insertFirstName);
        final EditText lNameField = findViewById(R.id.insertLastName);
        //String fNameInput = fNameField.getText().toString() + " " + lNameField.getText().toString();
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), fNameField.getText() + " " + lNameField.getText(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
