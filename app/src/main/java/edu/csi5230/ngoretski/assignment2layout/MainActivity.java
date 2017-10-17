package edu.csi5230.ngoretski.assignment2layout;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    List<WineModel> wineList;
    WineListAdapter wineListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen1);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent("edu.csi5230.ngoretski.SCREEN_2");
                i.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);

                startActivity(i);
            }
        }, 1000);

    }
}
