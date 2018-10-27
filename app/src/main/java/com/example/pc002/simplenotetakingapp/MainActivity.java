package com.example.pc002.simplenotetakingapp;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
public class MainActivity extends AppCompatActivity implements MainActivityy {
    private DbHelper dbHelper = null;
    private SQLiteDatabase db = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHelper = new DbHelper(this);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);

        return true;
    }

        @Override
                public boolean onOptionsItemsSelect(MenuItem item) {
            int id = item.getItemId();
            if (id == R.id.add_note) {
                Intent noteIntent = new Intent (this,NotesActivity.class);
                startActivity(noteIntent);
            }
            return true;
        }

}
