package com.arhsxro.arhsxroburgerhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DesertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desert);

        ListView desertsList = findViewById(R.id.list_view_deserts);

        Dish[] deserts = { new Dish("Banofee", "classic banofee recipe with caramel and chocolate",999),
                new Dish("Lemon tart", "Crunchy tart with lemon and vanilla",999),
                new Dish("Brownies", "Brownies with extra chocolate and icecream", 999),
                new Dish("Cheesecake", "Orange cheesecake with pineapple pieces", 999)

        };

        ArrayAdapter<Dish> dishAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,deserts);
        desertsList.setAdapter(dishAdapter);
    }
}