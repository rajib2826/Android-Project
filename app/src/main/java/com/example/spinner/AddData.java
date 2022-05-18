package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class AddData extends AppCompatActivity {
    EditText nameEditText, emailEditText, ageEditText;
    Button saveButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data);


    nameEditText = findViewById(R.id.nameId);
    emailEditText = findViewById(R.id.emailId);
    ageEditText = findViewById(R.id.ageId);
    saveButton = findViewById(R.id.saveId);

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference root = database.getReference().child("Database");
        saveButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String name = nameEditText.getText().toString();
            String email = emailEditText.getText().toString();
            String age = ageEditText.getText().toString();
            HashMap<String, String> userMap = new HashMap<>();
            userMap.put("name", name);
            userMap.put("email", email);
            userMap.put("age", age);
            root.push().setValue(userMap);
            nameEditText.getText().clear();
            emailEditText.getText().clear();
            ageEditText.getText().clear();
            Toast.makeText(getApplicationContext(), "Save Successful", Toast.LENGTH_SHORT).show();

        }
    });

}}