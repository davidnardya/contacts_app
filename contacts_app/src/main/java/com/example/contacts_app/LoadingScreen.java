package com.example.contacts_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class LoadingScreen extends AppCompatActivity {

    int counter = 0;
    Runnable runnable2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_screen);

        final Handler handler = new Handler();


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                if (checkLoggedIn()){
                    sendToContacts();
                } else {
                    sendToSignUp();
                }
            }
        };

        handler.postDelayed(runnable,3000); //delays launch by 3 seconds
    }



    private boolean checkLoggedIn (){

        //check shared preferences if log in information exists
        SharedPreferences preferences = getSharedPreferences(Constants.LOGIN_PREF_NAME, MODE_PRIVATE);
        String firstName = preferences.getString(Constants.LOGIN_FIRST_NAME, Constants.NOT_FOUND);
        String lastName = preferences.getString(Constants.LOGIN_LAST_NAME, Constants.NOT_FOUND);
        String email = preferences.getString(Constants.LOGIN_EMAIL, Constants.NOT_FOUND);
        boolean loggedIn;
        if(firstName.equals(Constants.NOT_FOUND) || lastName.equals(Constants.NOT_FOUND) || email.equals(Constants.NOT_FOUND)) {
            loggedIn = false;
        } else {
            loggedIn = true;
        }
        return loggedIn;
    }

    private void sendToSignUp(){
        Intent intent = new Intent(LoadingScreen.this, SignUpPage.class);
        startActivity(intent); //sends user to intent activity
        finish(); //deletes from activity stack
    }

    private void sendToContacts(){
        Intent intent = new Intent(LoadingScreen.this, Contacts.class);
        startActivity(intent); //sends user to intent activity
        finish(); //deletes from activity stack
    }
}
