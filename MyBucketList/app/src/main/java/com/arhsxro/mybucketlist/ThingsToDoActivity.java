package com.arhsxro.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);

        setupList();
    }

    private void setupList() {

        BucketListEntry[] thingsToDo = {
                new BucketListEntry("Safari","Meet all these wild animals and nature",R.drawable.safari,5),
                new BucketListEntry("Scuba Diving","Scuba diving in tropical waters like Thailand",R.drawable.scubadiving_thailand,3.5f),
                new BucketListEntry("Snowboard","Snowboarding at a great mountain like laax on Finland",R.drawable.snowboard_alpes,4),
                new BucketListEntry("Bangee Jumping","As an adrenaline junkie bangee jumping is something is for sure something im gonna try",R.drawable.banjee_jumping,4.5f),
                new BucketListEntry("Route 666","Hire a custom chopper motorbike and ride this incredible route",R.drawable.route666,4.5f)
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_things_to_do);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(thingsToDo);
        recyclerView.setAdapter(adapter);
    }
}