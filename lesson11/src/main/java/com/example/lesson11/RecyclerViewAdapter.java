package com.example.lesson11;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.PersonViewHolder> {

    ArrayList<Person> personArrayList;
    EditText newContactName;
    EditText newContactPhone;
    EditText type;
    Button finishButton;


    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return personArrayList.size();
    }

    public class PersonViewHolder extends RecyclerView.ViewHolder {




        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);
            newContactName = itemView.findViewById(R.id.new_contact_name);
            newContactPhone = itemView.findViewById(R.id.new_contact_phone);
            type = itemView.findViewById(R.id.new_contact_type);
        }
    }

    private ArrayList<Person> getPeople(){
        ArrayList<Person> personArrayList = new ArrayList<Person>();
        Person newPerson = new Person(" ", " ", ' ');
        newPerson.setName();

    return personArrayList;
    }

}


