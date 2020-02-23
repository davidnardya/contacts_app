package com.example.contacts_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.LinearLayout;

import java.util.Random;

public class LoadingScreen extends AppCompatActivity {

    Random random = new Random();
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_screen);

        final Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                counter++;
                if(counter <= 4){
                    LinearLayout layout1 = findViewById(R.id.layout_1);
                    layout1.setBackgroundColor(Color.parseColor(randomColor()));

                    LinearLayout layout2 = findViewById(R.id.layout_2);
                    layout2.setBackgroundColor(Color.parseColor(randomColor()));

                    LinearLayout layout3 = findViewById(R.id.layout_3);
                    layout3.setBackgroundColor(Color.parseColor(randomColor()));

                    LinearLayout layout4 = findViewById(R.id.layout_4);
                    layout4.setBackgroundColor(Color.parseColor(randomColor()));
                    handler.postDelayed(this, 1000);
                } else {
                    if (checkLoggedIn()) {
                    sendToContacts();
                } else {
                    sendToSignUp();
                }
                }

            }

        }, 1000);
        
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

    private String randomColor(){
        int red = random.nextInt(89)+10;
        int green = random.nextInt(89)+10;
        int blue = random.nextInt(89)+10;

        String color = "#" + red + green + blue;
        return color;
    }
}
