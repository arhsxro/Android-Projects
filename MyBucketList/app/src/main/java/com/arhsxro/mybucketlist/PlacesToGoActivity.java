package com.arhsxro.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);

        setupList();
    }

    private void setupList() {

        BucketListEntry[] placesToGo = {
                new BucketListEntry("Machu picchu ","Meet the place where the incas used to live.Also an amazing view",R.drawable.machu_picchu,5),
                new BucketListEntry("Northern lights","Capture the northern lights while drinking a coffee in a hot iglu ",R.drawable.northern_lights,4),
                new BucketListEntry("Tokyo","See the city of technology and the different lifestyle that japan may has",R.drawable.tokyo,3.5f),
                new BucketListEntry("Hawaii","Feel the freedom of hawaii and just stay on a beach and surf all day long(drinking cocktails)",R.drawable.hawai,4f),
                new BucketListEntry("Angkor wat","Holidays in Cambodia(Like the song of the Dead Kennedys).",R.drawable.angor_wat_cambodia,3.5f)
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_places_to_go);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(placesToGo);
        recyclerView.setAdapter(adapter);
    }
}