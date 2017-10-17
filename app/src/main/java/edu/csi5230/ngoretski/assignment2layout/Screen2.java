package edu.csi5230.ngoretski.assignment2layout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Screen2 extends AppCompatActivity {
    ImageButton menuButton;
    ImageButton newsButton;
    ImageButton moviesButton;
    ImageButton feedbackButton;
    ImageButton bookingButton;
    ImageButton contactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);

        menuButton = (ImageButton) findViewById(R.id.menu_button);
        newsButton = (ImageButton) findViewById(R.id.news_button);
        moviesButton = (ImageButton) findViewById(R.id.movie_button);
        feedbackButton = (ImageButton) findViewById(R.id.feedback_button);
        bookingButton = (ImageButton) findViewById(R.id.booking_button);
        contactButton = (ImageButton) findViewById(R.id.contact_button);

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent("edu.csi5230.ngoretski.SCREEN_3");
                i.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(i);
            }
        });

        newsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent("edu.csi5230.ngoretski.SCREEN_6");
                i.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(i);
            }
        });

        bookingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent("edu.csi5230.ngoretski.SCREEN_10");
                i.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(i);
            }
        });

        feedbackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent("edu.csi5230.ngoretski.SCREEN_11");
                i.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(i);
            }
        });

        contactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent("edu.csi5230.ngoretski.SCREEN_12");
                i.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(i);
            }
        });

    }

}
