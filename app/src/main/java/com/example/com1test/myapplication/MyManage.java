package com.example.com1test.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by com1test on 22/3/2559.
 */
public class MyManage {

    // Explicit

    private MyopenHelper myopenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public MyManage(Context context) {

        // Create & Connected SQLite
        myopenHelper = new MyopenHelper(context);
        writeSqLiteDatabase = myopenHelper.getWritableDatabase();
        readSqLiteDatabase = myopenHelper.getReadableDatabase();

    }// Constructor
} // Main Class
