package com.arhsxro.arhsxroburgerhouse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView startersCard;
    CardView mainsCard;
    CardView desertsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startersCard = findViewById(R.id.card_view_starters);
        mainsCard = findViewById(R.id.card_view_mains);
        desertsCard = findViewById(R.id.card_view_desert);

        startersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent startersActivityIntent = new Intent(MainActivity.this,StarterActivity.class);

                startActivity(startersActivityIntent);

            }
        });

        mainsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainActivityIntent = new Intent(MainActivity.this,MainCoursesActivity.class);

                startActivity(mainActivityIntent);
            }
        });

        desertsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent desertsActivityIntent = new Intent(MainActivity.this,DesertActivity.class);

                startActivity(desertsActivityIntent);
            }
        });

        TextView emailTextView = findViewById(R.id.text_view_email_adress);
        emailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);
                launchEmailAppIntent.setData(Uri.parse("mailto:arhsxroburgerhouse@gmail.com"));
                startActivity(launchEmailAppIntent);
            }
        });
    }
}