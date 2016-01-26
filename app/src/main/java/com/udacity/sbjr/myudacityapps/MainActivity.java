package com.udacity.sbjr.myudacityapps;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        final String launch="This Button will launch ";

        Button spotifyapp = (Button) findViewById(R.id.spotifyapp);
        spotifyapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),launch+"Spotify Streamer App",Toast.LENGTH_SHORT).show();
            }
        });

        Button scoresapp = (Button) findViewById(R.id.scoresapp);
        scoresapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),launch+"Scores App",Toast.LENGTH_SHORT).show();
            }
        });



        Button libraryapp = (Button) findViewById(R.id.libraryapp);
        libraryapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),launch+"Library App",Toast.LENGTH_SHORT).show();
            }
        });



        Button buildapp = (Button) findViewById(R.id.buildapp);
        buildapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),launch+"Build It Bigger",Toast.LENGTH_SHORT).show();
            }
        });



        Button xyzreaderapp = (Button) findViewById(R.id.xyzreaderapp);
        xyzreaderapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),launch+"XYZReader App",Toast.LENGTH_SHORT).show();
            }
        });



        Button capstoneapp = (Button) findViewById(R.id.capstoneapp);
        capstoneapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),launch+"My Capstone App",Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
