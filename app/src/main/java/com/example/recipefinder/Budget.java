package com.example.recipefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;
import java.util.ArrayList;

public class Budget extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget);
        Intent receivedIntent = getIntent();
        Bundle args = receivedIntent.getBundleExtra("BUNDLE");
        ArrayList<String> ingredients = (ArrayList<String>) args.getSerializable("ARRAYLIST");
        System.out.println("NEWWWWW");
        System.out.println(ingredients);

        EditText budgetTextBox = (EditText) findViewById(R.id.budgetText);
        String budget = budgetTextBox.getText().toString();
        Button btnNext = (Button) findViewById(R.id.nextButton2);

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent2 = new Intent(view.getContext(), Recipes.class);
                Bundle args = new Bundle();
                args.putSerializable("ARRAYLIST",(Serializable) ingredients);
                myIntent2.putExtra("BUNDLE",args);
                myIntent2.putExtra("budget", budget);
                startActivity(myIntent2);
            }

        });

    }
}