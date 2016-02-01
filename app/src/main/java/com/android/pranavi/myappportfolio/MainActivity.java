package com.android.pranavi.myappportfolio;

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

    public void buttonClickEvent(View view)
    {
        switch(view.getId()) {
            case R.id.button_spotify:
                Toast.makeText(this,"This would open Spotify App",Toast.LENGTH_LONG).show();
                break;
            case R.id.button_scores:
                Toast.makeText(this, "This would open Scores App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_library:
                Toast.makeText(this, "This would open Library App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_build:
                Toast.makeText(this, "This would open Build it Bigger App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_xyz:
                Toast.makeText(this, "This would open XYZ reader App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_capstone:
                Toast.makeText(this, "This would open Capstone App", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this,"Work in progress",Toast.LENGTH_SHORT).show();
        }
    }
}
