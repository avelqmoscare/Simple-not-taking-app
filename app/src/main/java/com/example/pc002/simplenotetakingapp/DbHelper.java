package com.example.pc002.simplenotetakingapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DbHelper extends SQLiteOpenHelper {
    public static final String TAG = "tag";
    public static final String DB_NAME = "app_note.db";
    public static final  int DB_VERSION = 1;

    public static final String TABLE_NOTES = "note";
    public static final String COL_ID = "id";
    public static final String COL_TITLE ="table";
    public static final String COL_BODY = "body";
    public static final String CREATED_AT ="create_at";
    public static final String UPDATED_AT = "udated_at";
    public DbHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String createNotesTable = "CREATE TABLE" +TABLE_NOTES+"(" +
                COL_ID + "INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, " +
                COL_TITLE + "TEXT, " +
                COL_BODY + "TEXT, " +
                CREATED_AT + "TEXT, " +
                UPDATED_AT + "TEXT" + ")";


        sqLiteDatabase.execSQL(createNotesTable);
        Log.d(TAG,createNotesTable)
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
