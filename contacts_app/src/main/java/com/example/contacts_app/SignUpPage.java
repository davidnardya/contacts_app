package com.example.contacts_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpPage extends AppCompatActivity {

    Button finishButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);

        finishButton = findViewById(R.id.finish_button);
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //save info
                boolean successful = saveUserInfo();
                //if successful -> move
                if(successful){
                    moveToContacts();
                } else { //if not -> show toast
                    Toast.makeText(SignUpPage.this, "Something went wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean saveUserInfo(){
        //get info from user
        EditText firstName = findViewById(R.id.sign_up_first_name);
        EditText lastName = findViewById(R.id.sign_up_last_name);
        EditText email = findViewById(R.id.sign_up_email);

        //save info
        SharedPreferences sharedPreferences = getSharedPreferences(Constants.LOGIN_PREF_NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        EditText editText = findViewById(R.id.sign_up_first_name);
        editor.putString(Constants.LOGIN_FIRST_NAME, editText.getText().toString());
        editText = findViewById(R.id.sign_up_last_name);
        editor.putString(Constants.LOGIN_LAST_NAME, editText.getText().toString());
        editText = findViewById(R.id.sign_up_email);
        editor.putString(Constants.LOGIN_EMAIL, editText.getText().toString());
        return editor.commit();

    }

    private void moveToContacts(){
        Intent intent = new Intent(SignUpPage.this, Constants.class);
        startActivity(intent);
        finish();
    }
}
