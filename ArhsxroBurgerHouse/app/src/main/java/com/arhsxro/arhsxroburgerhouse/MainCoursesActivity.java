package com.arhsxro.arhsxroburgerhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainCoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);

        ListView mainCoursesList = findViewById(R.id.list_view_main_courses);

        Dish[] mainCourses = { new Dish("Hangover Burger", "Beaf burger with cheddar bacon onion rings and fried egg",999),
        new Dish("New Yorker Burger", "Chicken burger with cheddar iceberg tomato and qreole sauce",999),
                new Dish("Classic Burger", "Classic chicken burger with cheddar iceberg tomato bacon", 999),
                new Dish("The Ramones Burger", "Beef burger with cheddar bacon onion rings and homemade bbq sauce", 999),
                new Dish("Paranoid Burger", "Beef burger with cheddar bacon tomato and chilli sauce", 999)

        };

        ArrayAdapter<Dish> dishAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,mainCourses);
        mainCoursesList.setAdapter(dishAdapter);
    }
}