package com.example.notekeeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.List;

public class Note_list extends AppCompatActivity {

    private ArrayAdapter<NoteInfo> madapterNotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_note_list);

   //    initializeDisplayContent();
    }


    @Override
    protected void onResume() {
        super.onResume();
        madapterNotes.notifyDataSetChanged();
    }



}

