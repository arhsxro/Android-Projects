package com.arhsxro.arhsxro_androidprojects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycler_view_projects);

        Project[] projects = {
                new Project("Getting Started app", "The default 'Hello world app'",R.drawable.getting_started),
                new Project("Arhsxro Quotes","Making a simple change to the layout,with my own personal motivational quote for software developers", R.drawable.quote),
                new Project("BMI Calculator", "A real life working BMI calculator", R.drawable.bmi_calc),
                new Project("Arhsxro Burger House", "A menu app for a fictional restaurant", R.drawable.burger),
                new Project("My Bucket List", "A bucket list with my top 5 places to go and things to do", R.drawable.machu_picchu)
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);
        list.setAdapter(adapter);
    }
}