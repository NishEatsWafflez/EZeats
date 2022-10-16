package com.example.recipefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> ingredients = new ArrayList<String>(); // Create an ArrayList object


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i = 0; i <=11; i++){
            ingredients.add(null);
        }
        Button btnNext = (Button) findViewById(R.id.nextButton);

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Budget.class);
                Bundle args = new Bundle();
                args.putSerializable("ARRAYLIST",(Serializable) ingredients);
                myIntent.putExtra("BUNDLE",args);
                startActivity(myIntent);
            }

        });
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBoxBread:
                if (checked) {
                    ingredients.set(0, "Bread");
                }else {
                    // Remove the meat
                    ingredients.set(0, null);
                }
                break;
            case R.id.checkBoxEgg:
                if (checked) {
                    ingredients.set(1, "Eggs");
                }else {
                    ingredients.set(1, null);
                }
                break;
            case R.id.checkBoxMilk:
                if (checked) {
                    ingredients.set(2, "Milk");
                }else {
                    ingredients.set(2, null);
                }
                break;
            case R.id.checkBoxCheese:
                if (checked) {
                    ingredients.set(3, "Cheese");
                }else {
                    ingredients.set(3, null);
                }
                break;
            case R.id.checkBoxTomato:
                if (checked) {
                    ingredients.set(4, "Tomato");
                }else {
                    ingredients.set(4, null);
                }
                break;
            case R.id.checkBoxOnions:
                if (checked) {
                    ingredients.set(5, "Onions");
                }else {
                    ingredients.set(5, null);
                }
                break;
            case R.id.checkBoxChicken:
                if (checked) {
                    ingredients.set(6, "Chicken");
                }else {
                    ingredients.set(6, null);
                }
                break;
            case R.id.checkBoxBeef:
                if (checked) {
                    ingredients.set(7, "Beef");
                }else {
                    ingredients.set(7, null);
                }
                break;
            case R.id.checkBoxPork:
                if (checked) {
                    ingredients.set(8, "Pork");
                }else {
                    ingredients.set(8, null);
                }
                break;
            case R.id.checkBoxButter:
                if (checked) {
                    ingredients.set(9, "Butter");
                }else {
                    ingredients.set(9, null);
                }
                break;
            case R.id.checkBoxFlour:
                if (checked) {
                    ingredients.set(10, "Flour");
                }else {
                    ingredients.set(10, null);
                }
                break;
            // TODO: Veggie sandwich
        }
        System.out.println(ingredients);
    }

}