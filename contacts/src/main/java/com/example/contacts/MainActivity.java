package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Contact> list = getContactList(3);
        for (int i = 0; i < list.size(); i++) {
            View view = LayoutInflater.from(this).inflate(R.layout.single_contact_layout, null);
            LinearLayout container = findViewById(R.id.container);
            container.addView(view);
        }
    }

    OnClickListener listener = new OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    public void onClick (View v){

    }

    private Contact getCustomContact () {
        return new Contact("name1", "address1");
    }

    private Contact getCustomContact (String name, String address) {
        Contact customContact = new Contact((name, address));
        return customContact;
    }

    private ArrayList<Contact> getContactList (int listLength){
        ArrayList<Contact> contactList = new ArrayList<Contact>();
        for (int i = 0; i < 100; i++) {
            contactList.add(getCustomContact("Name " + i, "Address " + i);

        }
        return contactList;
    }

}
