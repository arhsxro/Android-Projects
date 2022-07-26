package com.arhsxro.arhsxroburgerhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StarterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);

        ListView startersList = findViewById(R.id.list_view_starters);

        Dish[] dishes =  {
                new Dish("BBQ Chicken wings","chicken wings cooked with homemade bbq sauce",999),
                new Dish("Spicy Chicken wings","chicken wings cooked with homemade spicy sauce",999),
                new Dish("Tacos","traditional mexican tacos",999),
                new Dish("Arhsxro salad","green salad with bacon,chicken and honey mustard sauce",999),
                new Dish("Greek salad","traditional greek salad",999),
                new Dish("French fries with bacon and cheddar","French fries with bacon and cheddar",999),
                new Dish("Cheesee garlic bread","cbreak with garlic and olive oil",999),
                new Dish("Mozzarella sticks","classic mozzarella sticks",999)
        };



        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);

        startersList.setAdapter(dishesAdapter);

    }


}